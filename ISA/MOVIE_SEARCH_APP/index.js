const reference = 'https://www.omdbapi.com/?t=Avatar&plot=full&apikey=2ec8309e'
let obj={}
document.querySelector('.search').addEventListener('click',()=>retreiveData(document.querySelector(".inputfield").value,populateThings))
async function retreiveData(title,callback){
    try{
        let response = await fetch(`https://www.omdbapi.com/?t=${title}&apikey=2ec8309e`);
        if (!response.ok){
            throw new Error("something Happened");
        }
        obj = await response.json();
        callback(obj);
    }catch(error){
        alert("There was some error"+error.message)
    }
}
function replaceImageUrl(url) {
    var lastIndex = url.lastIndexOf("300.jpg");
    if (lastIndex !== -1) {
        var newUrl = url.substring(0, lastIndex) + "900.jpg";
        return newUrl;
    } else {
        return url;
    }
}

function populatStars(rating){
    let parts = rating.split("/");
    let x = parseInt(parts[0]);
    let y = parseInt(parts[1]);
    stars = ""
    for(i=0;i<x;i++){
        stars +=  "<i class='fa-solid fa-star'></i>"
    }
    for(i=0;i<(y-x);i++){
        stars +=  "<i class='fa-regular fa-star'></i>"
    }
    document.querySelector(".stars").innerHTML = stars;
}

retreiveData("Extraction II",populateThings);

function populateThings(data){
    const {Title,Released,Runtime,Genre,Actors,Plot,Poster,Ratings} = data; 
    document.querySelector(".image").src=replaceImageUrl(Poster);
    document.querySelector(".title").innerHTML=Title;
    document.querySelector(".genre").innerHTML=Genre;
    document.querySelector(".release").innerHTML=Released;
    document.querySelector(".runtime").innerHTML=Runtime;
    document.querySelector(".plot").innerHTML=Plot;
    document.querySelector(".actors").innerHTML=Actors;
    populatStars(Ratings[0]["Value"]);

}
