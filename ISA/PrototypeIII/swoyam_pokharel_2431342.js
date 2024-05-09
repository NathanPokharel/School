/*
 * TODO:
 * */
const DEFAULT_CITY = "Stockton-on-Tees";

async function getWeatherData(locationName){
    console.log(locationName);
    //const response = await fetch(`index.php?city=${locationName}`);
    if (navigator.onLine){
        const response = await fetch(`http://0.0.0.0:8080?city=${locationName}`);
        if (!response.ok){
            console.log(response.status);
            promptErrors(response.statusText);
        }
        const data = await response.json();
        localStorage.setItem(locationName,JSON.stringify(data));
        populateWeatherInfo(data);
    }else{
        console.log("No Internet, Accessing Cache")
        var cachedData = localStorage.getItem(locationName);
        var parsedCached = JSON.parse(cachedData);
        populateWeatherInfo(parsedCached);
    }

}

function getCurrentDate(){
    const today = new Date();
    const month = today.toLocaleString('default', { month: 'long' });
    const date = today.getDate();
    const year = today.getFullYear();
    document.querySelector('.time').innerHTML = `${date} ${month} ${year}`;
}

function populateWeatherInfo(data) {
    document.querySelector('#weather-icon').src= `https://openweathermap.org/img/wn/${data[0]["weather_icon"]}@2x.png`
    document.querySelector('.city').textContent = data[0]["city_name"];
    document.querySelector('.current-state').innerHTML=data[0]["description"];
    document.querySelector('.humidity').firstChild.textContent=data[0]["humidity"];
    document.querySelector('.pressure').firstChild.textContent=data[0]["pressure"];
    document.querySelector('.temp').firstChild.textContent=data[0]["temp"];
    document.querySelector('.wind').firstChild.textContent=data[0]["wind_speed"];
    changeGraphics(parseInt(data[0]["weather_id"]));
}


function changeGraphics(weatherID){
    /*
     * 200 - 299 Thunderstorm:
     * 300 - 399 Drizzle
     * 500 - 599 Rain 
     * 600 - 699 Snow
     * 700 - 799 Atmosphere 
     * 800 : Clear
     * 801 - 900 Clouds
     */

    const image = document.querySelector("#image");
     if (weatherID >= 200 && weatherID <= 299) {
         image.src = "https://github.com/NathanPokharel/School/blob/main/ISA/WeatherApp/images/Thunder.png?raw=true";
    } else if (weatherID >= 300 && weatherID <= 399) {
        image.src = "https://github.com/NathanPokharel/School/blob/main/ISA/WeatherApp/images/Rain.png?raw=true";
    } else if (weatherID >= 500 && weatherID <= 599) {
        image.src = "https://github.com/NathanPokharel/School/blob/main/ISA/WeatherApp/images/Rain.png?raw=true";
    } else if (weatherID >= 600 && weatherID <= 699) {
        image.src = "https://github.com/NathanPokharel/School/blob/main/ISA/WeatherApp/images/Snow.png?raw=true";
    } else if (weatherID >= 700 && weatherID <= 799) {
        image.src = "https://github.com/NathanPokharel/School/blob/main/ISA/WeatherApp/images/Atmosphere.png?raw=true";
    } else if (weatherID === 800) {
        image.src = "https://github.com/NathanPokharel/School/blob/main/ISA/WeatherApp/images/Sun.png?raw=true";
    } else if (weatherID >= 801 && weatherID < 810) {
        image.src = "https://github.com/NathanPokharel/School/blob/main/ISA/WeatherApp/images/Clouds.png?raw=true";
    }
}


function promptErrors(message){
    alert(message);
}


const input = document.getElementById('city-input');
input.addEventListener('keydown',function(event){
    if (event.key == "Enter"){
        event.preventDefault();  // Prevent the default behavour of submitting the values that was associated with the input field. this was causing the page reloads.
        getWeatherData(input.value);
    }else if (event.key=="Escape"){
        event.preventDefault();  // Prevent the default behavour of submitting the values that was associated with the input field. this was causing the page reloads.
    }

})
getCurrentDate();
getWeatherData(DEFAULT_CITY);
