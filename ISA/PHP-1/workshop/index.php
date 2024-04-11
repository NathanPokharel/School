<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP</title>
</head>
<body>
    <form action = "index.php" method = "post">
        <input type="text" name="dayOfWeek" required>
        <button type="submit">SUBMIT</button>
    </form>

<?php

    echo "Hello World";
    echo "<br>";

    function check_prime($n){
        if ($n < 1){
            return false;
        }
        for($i = 2; $i <= round(sqrt($n)) ;$i++ ){
            if ($n % $i == 0 ){
                return false;
            }

        }
        return true;
    }

    for($i = 0; $i <= 100;$i++ ){
        echo (check_prime($i))? "$i<br>":"";
    }
    $palindrome = "racecar";
    echo ($palindrome == strrev($palindrome))? "It is a plaindrome" : "It isn't a palindrome";

    echo "<br>";
    $a = array('One' => 'Cat', 'Two' => 'Dog', 'Three' =>'Elephant', 'Four' => 'fox');
    foreach ($a as $key=>$value){
        echo "$key => $value " ;
        echo "<br>";
    }
    if(isset($_POST['dayOfWeek'])){
        switch (strtolower($_POST['dayOfWeek'])){
        case "sunday":
            echo "Laugh on Saturday, joy tomorrow.";
            break;
        case "monday":
            echo "Laugh on Monday, laugh for danger.";
            break;
        case "tuesday":
            echo "Laugh on Tuesday, smile at a stranger.";
            break;
        case "wednesday":
            echo "Laugh on Wednesday, laugh for a letter.";
            break;
        case "thursday":
            echo "Laugh on Thursday, something better.";
            break;
        case "friday":
            echo "Laugh on Friday, laugh for sorrow.";
            break;
        case "saturday":
            echo "Laugh on Saturday, joy tomorrow.";
            break;
        default:
            echo "<script>alert('enter proper day')</script>";
        }
    }



    $city_names = ["Kathmandu","Tokyo","Mexico", "Mumbai" , "Seoul", "Shanghai","Shanghai", "Lagos", "Buenos", "Cairo", "London"];

    echo "<ul>";
    foreach($city_names as $city){
        echo ($city == "London")? "<li>$city.</li>":"<li>$city,</li>";
    }
    
    sort($city_names);
    
    echo "Sorted:";
    foreach($city_names as $city){
        echo ($city == "London")? "<li>$city.</li>":"<li>$city,</li>";
    }
    $city_names[] = "Los Angeles";
    $city_names[] = "Calcutta";
    $city_names[] = "Osaka";
    $city_names[] = "Beijing";

    sort($city_names);
    foreach($city_names as $city){
        echo ($city == "London")? "<li>$city.</li>":"<li>$city,</li>";
    }
    echo "</ul>";

    
    $cities_and_countries = [
        "Kathmandu, Nepal",
        "Tokyo, Japan",
        "Mexico, Mexico",
        "New-York-City, USA",
        "Mumbai, India",
        "Seoul, Korea",
        "Shanghai, China",
        "Lagos, Nigeria",
        "Buenos-Aires, Argentinal",
        "Cairo, Egypt",
        "London, England"
    ];

    $key_value = [];
    foreach($cities_and_countries as $items){
        $temp_hold = explode(", ",$items);
        $key_value[$temp_hold[0]] = $temp_hold[1];
    }
    print_r($key_value);
    echo "<br>";
    echo $_POST['city'] . " Lies in " . $key_value[$_POST['city']];
?>
<form action="" method="post">
    <label for="city">Please choose a city:</label>
    <select name="city" id="city">
        <?php
        foreach ($key_value as $city => $country) {
            echo "<option value='$city'>$city</option>";
        }
        ?>
    </select>
    <input type="submit" value="Submit">
</form>
</body>
</html>

