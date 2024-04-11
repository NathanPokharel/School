const reference = 'https://www.omdbapi.com/?s=Avatar&plot=full&apikey=2ec8309e'
let obj={}
document.querySelector('.inputfield').addEventListener('keydown', (event) => {
    if (event.key === 'Enter') {
        retreiveData(document.querySelector(".inputfield").value);
    }
});



async function retreiveData(movieName){
    try{
        const response = await fetch(`http://www.omdbapi.com/?s=${movieName}&apikey=2ec8309e`)
        if (!response.ok){
            throw new Error("Error In Response");
        }
        parsedResponse =  await response.json();
        document.querySelectorAll(".movie-container").forEach(container=>{
            document.body.removeChild(container);
        });
        parsedResponse.Search.forEach(movies=>{
            let movieContainer = document.createElement("div")
            movieContainer.classList.add("movie-container");
            movieContainer.innerHTML = `
            <div class='title'>
                <h3>${movies.Title}</h3>
            </div>
            <div class='poster'>
                <img src="${movies.Poster.replace(/300\.jpg$/, '500.jpg')}" id="image">
            </div>
            <div class="release-date">
                <h3>${movies.Year}</h3>
            </div>
                `

            document.body.appendChild(movieContainer);
            document.querySelectorAll('#image').forEach(img=>{
                gsap.fromTo(img,{
                    scale:0.2, 
                    rotate:20,
                },{
                    scale:1,
                    duration:1,
                    rotate:0,
                })
            })

            console.log(movies)

        })
    }catch(error){
        throw new Error(error.message);
    }
}
