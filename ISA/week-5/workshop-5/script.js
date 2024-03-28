function fetchData(url){
    return new Promise((resolve,reject) =>{
        fetch(url).then(response => {
            if (!response.ok) {
                reject("Error from server")
            }
            return response.json();
        })
        .then(data=>{
            resolve(data);
        })
        .catch(error => {
            reject ("Error fetching data:");
        });
    });
}

//fetchData("https://jsonplaceholder.typicode.com/posts/1") .then(returnedResponse=> console.log(returnedResponse)) .catch(returnedError => console.log(returnedError));

async function asyncedfetchedData(url){
    try{
        const response = await fetch(url);
        if (!response.ok) {
            return "ERROR"
        }
        const data = await response.json();
        return data;
    }catch(error){
        console.log("SUM ERROR",error);
    }
    
}

console.log(asyncedfetchedData("https://jsonplaceholder.typicode.com/posts/1"));
