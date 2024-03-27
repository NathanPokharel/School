const userData = {
    name: "Hari",
    email: "hari@gmail.com",
    age: 3
}
const sampleObject = [
    {
        name: "Bishal",
        age: 26,
        city: "Salyan"
    },
    {
        name: "Shyam",
        age: 12,
        city: "Kathmandu"
    }
];
function parseInput(){
    console.log(document.getElementById("inpfield").value);
}

document.getElementById("eventListner").addEventListener('click',() => console.log("Button Clicked"));

function searchUser(){
    let age;
    sampleObject.forEach(a => (document.getElementById("namein").value == a.name)? age=`Age for ${a.name}: ${a.age}` : age="User Not Found" );
    console.log(age);
}

function changeListElements(){
    let spanArr = [];
    for(const element of document.getElementsByTagName('li')){
        element.style.backgroundColor="#e8e8e8";
    }

    Array.from(document.getElementsByTagName('li')).forEach(a=>a.style.fontWeight = "bold")
    spanArr = Array.from(document.getElementsByTagName('li')).map(a=>`<span><li>${a.innerHTML}</li></span>`);
    document.querySelector(".lists").innerHTML = "";
    spanArr.forEach(a=>document.querySelector(".lists").innerHTML += a);
}
function fetchUserData(userId, callback) {
    setTimeout(() => {
        receivedUserData = {userId: userId, userName:userData.name, userEmail:userData.email, userAge: userData.age};
        callback(receivedUserData);
    },1000);
}

function displayUserData(userData){
    for(const properties in userData){
        console.log(`${properties}: ${userData[properties]}`);
    }
}


