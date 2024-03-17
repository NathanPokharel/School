function one(){
    console.log("Name: Meow")
    console.log("Interests: Meow,Meow,Meow")
}
function two(){
    var globalscoped = "z";
    // Const,Let are block scoped, var is global scoped
    if (x<2){
        let blockedscoped = "z";
    }
    //console.log(blockedscoped) <- Throws an error
    //console.log(globalscoped) <- Works

}

function three(){
    console.log("Output will be 20");

}
function four(){
    num = parseFloat(prompt("Enter a number: "))
    if (num<0){
        alert("Num Is Negative.");
    }else{
        alert("Num Is Positive.");
    }
}
function five(){
    for(i=0;i<=100;i++){
        if (i % 5 == 0 && i % 3 == 0){
            console.log("fizzbuzz");
        }else if (i % 3 == 0){
            console.log("fizz");
        }else if (i % 5 == 0){
            console.log("buzz");
        }

    }
}
function six(){
    let [x,y] = [2,4];
    const operator = prompt("Enter an operator");
    switch (operator){
        case "+":
            alert(x+y);
            break;
        case "-":
            alert(x-y);
            break;
        case "*":
            alert(x*y);
            break;
        case "/":
            alert(x/y);
            break;

    }

}
function seven(){
    for(i=11;i<=19;i++){
        console.log(i);
    }
}
function eight(){
    let i = 11;
    while(i>=1){
        console.log(i);
        --i;
    }

}
function nine(){
    do{
        console.log("Hello World");
    }while(false);
}
function ten(){
    console.log([1,2,3,4,5,6,7,8].reduce((a,b)=> a+b,0));
}
function eleven(){
    let array = [1,2,3,4,5,6];
    array.push(7);
    console.log(array);

}
function twelve(){
    let array = [1,2,3,4,5,6];
    array.shift();
    console.log(array);

}
function thirteen(){
    console.log("Output would be {a:5,b:2}");
}

function fourteen(){
    let person = {name:"John",age:30};
    for (let property in person){
        
        console.log(property + ": "+ person[property]);
    }
}

function fifteen(){
    let person = {name:"John",age:30};
    person.gender = "How Dare You Assume Someones Gender xD";
    console.log(person);
}
function sixteen(){
    let person = {name:"John",age:30};
    delete person.age;
    console.log(person);
}

function seventeen(){
    console.log("Arrays hold order, Objects Dont. Arrays are accessed off of indexes; Objects are accessed off of key-value pairs");
}

function eighteen(){
    const userin = parseInt(prompt("Input A Number: "));
    (userin % 2 === 0)? alert("Even"):alert("Odd");
}
function nineteen(){
    let arr = [];
    for(i=0;i<5;i++){
        arr[i] = parseInt(prompt("Input A Number: "));
    }
    console.log(arr.reduce((a,b)=>a+b,0));
}

function twenty(){
    let arr = [];
    for(i=0;i<5;i++){
        arr[i] = parseInt(prompt("Input A Number: "));
    }
    let sortedArr = arr.sort((a, b) => b - a); 
    console.log(sortedArr[0],sortedArr[1])

}

function twentyone(){
    const userin = prompt("Enter A String: ")
    let count = {};
    for(let character of userin){
        if (character in count){
            count[character] = count[character] + 1; 
        }else{
            count[character] = 1;
        }
        
    }
    for(let charactercount in count){
        console.log(charactercount + ":" + count[charactercount]);
    }
}















