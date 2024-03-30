/*
 * TODO:
 * AUTOCOMPLETE City Names 
 * */
const API_KEY = "60596186c04096f98b7833273bd72049";
const DEFAULT_CITY = "Stockton-on-Tees";

async function getWeatherData(locationName){
    const api = `https://api.openweathermap.org/data/2.5/weather?q=${locationName}&appid=${API_KEY}&units=metric`;
    const response = await fetch(api);
    if (!response.ok){
        console.log(response.status);
        promptErrors(response.statusText);
    }
    const data = await response.json();
    populateWeatherInfo(data);

}

function getCurrentDate(){
    const today = new Date();
    const month = today.toLocaleString('default', { month: 'long' });
    const date = today.getDate();
    const year = today.getFullYear();
    document.querySelector('.time').innerHTML = `${date} ${month} ${year}`;
}
function populateWeatherInfo(data) {
    const { name, main, weather, wind } = data; 
    const { temp, humidity, pressure } = main; 
    const [{ description, id }] = weather; 
    const { speed } = wind; 
    console.log(name, temp, humidity, pressure, description, id, speed);
    document.querySelector('.city').textContent = name;
    document.querySelector('.current-state').innerHTML=description;
    animateTextContent('.humidity',Math.round(humidity))
    animateTextContent('.humidity',Math.round(humidity))
    animateTextContent('.pressure',Math.round(pressure))
    animateTextContent('.temp',Math.round(temp)+'')
    animateTextContent('.wind',Math.round(speed))
    changeGraphics(id,description);
}

function animateTextContent(selector,newText){
    let targetElement = document.querySelector(selector);
    let zero = {val:0};
    gsap.to(zero,{
        duration:2,
        val: newText,
        ease: "power5.out",
        onUpdate: function() {let finalValue = gsap.utils.snap(1,zero.val); targetElement.firstChild.textContent = finalValue;}
    });

}

function changeGraphics(weatherID,description){
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
        document.querySelector('.current-weather').innerHTML = `${description} ${feather.icons['cloud-lightning'].toSvg()}`;
        document.querySelector('.current-weather').innerHTML = feather.icons['cloud-lightning'].toSvg();
    } else if (weatherID >= 300 && weatherID <= 399) {
        image.src = "https://github.com/NathanPokharel/School/blob/main/ISA/WeatherApp/images/Rain.png?raw=true";
        document.querySelector('.current-weather').innerHTML = feather.icons['cloud-drizzle'].toSvg();
    } else if (weatherID >= 500 && weatherID <= 599) {
        image.src = "https://github.com/NathanPokharel/School/blob/main/ISA/WeatherApp/images/Rain.png?raw=true";
        document.querySelector('.current-weather').innerHTML = feather.icons['cloud-rain'].toSvg();
    } else if (weatherID >= 600 && weatherID <= 699) {
        // Snow
        image.src = "https://github.com/NathanPokharel/School/blob/main/ISA/WeatherApp/images/Snow.png?raw=true";
        document.querySelector('.current-weather').innerHTML = feather.icons['cloud-snow'].toSvg();
    } else if (weatherID >= 700 && weatherID <= 799) {
        // Misty, Tornado, etc.
        image.src = "https://github.com/NathanPokharel/School/blob/main/ISA/WeatherApp/images/Atmosphere.png?raw=true";
        document.querySelector('.current-weather').innerHTML = feather.icons['wind'].toSvg();
    } else if (weatherID === 800) {
        // Sunny/Clear
        image.src = "https://github.com/NathanPokharel/School/blob/main/ISA/WeatherApp/images/Sun.png?raw=true";
        document.querySelector('.current-weather').innerHTML = feather.icons['sun'].toSvg();
    } else if (weatherID >= 801 && weatherID < 810) {
        // Clouds
        image.src = "https://github.com/NathanPokharel/School/blob/main/ISA/WeatherApp/images/Clouds.png?raw=true";
        document.querySelector('.current-weather').innerHTML = feather.icons['cloud'].toSvg();
    }
    gsap.fromTo(image,{
        x:0,
        y:0,
        rotation:0,
    },{
        duration:1.5,
        y:5,
        x:5,
        rotation:5,
        repeat:-1,
        yoyo:true,
        ease: "power1.inOut" 
    });
}


function promptErrors(message){
    alert(message);
}

function showSearch(visible){
    if (visible == true){
        gsap.to(".search-form",{
            y:'100vh',
            duration:1,
        });
    }else{
        gsap.to(".search-form",{
            y:'-100vh',
            duration:1,
        });

    }
}

const input = document.getElementById('city-input');
input.addEventListener('keydown',function(event){
    if (event.key == "Enter"){
        event.preventDefault();  // Prevent the default behavour of submitting the values that was associated with the input field. this was causing the page reloads.
        getWeatherData(input.value);
        showSearch(false);
    }else if (event.key=="Escape"){
        event.preventDefault();  // Prevent the default behavour of submitting the values that was associated with the input field. this was causing the page reloads.
        showSearch(false);
    }

})

getCurrentDate();
getWeatherData(DEFAULT_CITY);
