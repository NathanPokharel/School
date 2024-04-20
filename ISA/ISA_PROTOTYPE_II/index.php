<?php
// Establish database connection
    $serverName = "localhost";
    $userName = "zed";
    $password = "password123";
    $conn = mysqli_connect($serverName, $userName, $password);
    if ($conn) {
    } else {
        die("Failed to connect to database");
    }

$createDatabase = "CREATE DATABASE IF NOT EXISTS WEATHER ";
if (mysqli_query($conn, $createDatabase)) {
    

} else {
    die("Failed to create database");
}
// Select the movies database
mysqli_select_db($conn, 'WEATHER');

$createTable = "CREATE TABLE IF NOT EXISTS weather_data(
    city_name VARCHAR(255) PRIMARY KEY,
    temp INT(255),
    humidity INT(255),
    description VARCHAR(500),
    wind_speed INT(255),
    pressure INT(255),
    weather_icon VARCHAR(10),
    weather_id INT(10),
    last_updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
)";

if (mysqli_query($conn, $createTable)) {
    error_log("weather_data table already exists / New Database has been created.");
} else {
    error_log("Failed to create table");
}


if(isset($_GET['city'])){
    error_log("Selecting City");
    $cityName = $_GET['city'];
} else {
    error_log("Selecting Default City");
    $cityName = "Sydney";
}


function fetchAndStoreData(){
    global $cityName;
    global $conn;
    $apiKey = "60596186c04096f98b7833273bd72049";
    $url = "https://api.openweathermap.org/data/2.5/weather?q=".$cityName."&appid=".$apiKey."&units=metric";
    error_log("$url");
    $response = file_get_contents($url);
    if ($response === false){
        error_log("Failed to fetch data from the API");
        exit;
    }
    $data = json_decode($response, true);
    error_log("Fetched data");
    $city_name = $data["name"];
    $temperature = $data["main"]["temp"];
    $humidity = $data["main"]["humidity"];
    $pressure = $data["main"]["pressure"];
    $wind_speed = $data["wind"]["speed"];
    $weather_icon = $data["weather"][0]["icon"];
    $weather_id= $data["weather"][0]["id"];
    $description = $data["weather"][0]["description"];

    $insertData = "INSERT INTO weather_data(city_name,temp,humidity,description,wind_speed,pressure,weather_icon,weather_id)
        VALUES ('$city_name', '$temperature', '$humidity','$description','$wind_speed','$pressure','$weather_icon','$weather_id')
        ON DUPLICATE KEY UPDATE
        temp = VALUES(temp),
        humidity = VALUES(humidity),
        description = VALUES(description),
        wind_speed = VALUES(wind_speed),
        pressure = VALUES(pressure),
        weather_icon = VALUES(weather_icon),
        weather_id = VALUES(weather_id),
        last_updated = CURRENT_TIMESTAMP";

    if (mysqli_query($conn, $insertData)) {
        error_log("Data inserted Successfully");
    } else {
        error_log("Failed to insert data");
    }
}

function check_data(){
    global $conn,$cityName;
    $rows = Array();
    $selectAllData = "SELECT * FROM weather_data where city_name = '$cityName' ";
    $result = mysqli_query($conn, $selectAllData);
    while ($row = mysqli_fetch_assoc($result)) {
        $rows[] = $row;
    }
    if (mysqli_num_rows($result) == 0) {
        error_log("Data Not Found In Database, Quering The Open Weather Map Api.");
        fetchAndStoreData();
        $result = mysqli_query($conn, $selectAllData);
        while ($row = mysqli_fetch_assoc($result)) {
            $rows[] = $row;
        return $rows;
    }
    }
    error_log("Data already Exists.");
    date_default_timezone_set('Asia/Kathmandu');
    $current_time = time(); 
    $last_updated_time = strtotime($rows[0]["last_updated"]); 
    $difference = ($current_time- $last_updated_time)/3600;

    if ($difference>2) {
        error_log("Data older then 2 hours, refreshing.");
        fetchAndStoreData();
        while ($row = mysqli_fetch_assoc($result)) {
            $rows[] = $row;
        }
    } 
return $rows;
    
}

$json_data = json_encode(check_data());
echo $json_data;
header('Content-Type: application/json');
?>
