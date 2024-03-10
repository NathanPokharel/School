/*
 * TODO:
 * Change Image Based Off Weather ID
 * AUTOCOMPLETE City Names
 * 
 * */
const too_lazy_to_put_in_enviroment_variable = "b61e955c82078aac2401073ef66e1d1e";

async function getWeatherData(locationName){
    const api = `https://api.openweathermap.org/data/2.5/weather?q=${locationName}&appid=${too_lazy_to_put_in_enviroment_variable}&units=metric`;
    const response = await fetch(api);
    if (!response.ok){
        promptErrors("Couldn't Fetch Weather Data")

    }
    const data = await response.json();
    populateWeatherInfo(data);

}

function populateWeatherInfo(data) {
    const { name, main, weather, wind } = data; 
    const { temp, humidity, pressure } = main; 
    const [{ description, id }] = weather; 
    const { speed } = wind; 
    changeGraphics(id);
    console.log(name, temp, humidity, pressure, description, id, speed);
    document.querySelector('.city').textContent = name;
    document.querySelector('.current-state').textContent = description;
    animateTextContent('.humidity',Math.round(humidity))
    animateTextContent('.pressure',Math.round(pressure))
    animateTextContent('.temp',Math.round(temp))
    animateTextContent('.wind',Math.round(speed))
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
        // Thunderstorm
        image.src = "images/Thunder.png";
    } else if (weatherID >= 300 && weatherID <= 399) {
        // Drizzle/Rain
        image.src = "images/Rain.png";
    } else if (weatherID >= 500 && weatherID <= 599) {
        // Rain
        image.src = "images/Rain.png";
    } else if (weatherID >= 600 && weatherID <= 699) {
        // Snow
    } else if (weatherID >= 700 && weatherID <= 799) {
        // Misty, Tornado, etc.
    } else if (weatherID === 800) {
        // Sunny/Clear
    } else if (weatherID >= 801 && weatherID < 810) {
        // Clouds
        image.src = "images/Clouds.png";
    }

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
        event.preventDefault();
        getWeatherData(input.value);
        showSearch(false);
    }
})

getWeatherData("Kathmandu");
