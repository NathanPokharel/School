function positiveOrEven(number){
    if (number % 2 == 0  && number > 0 ){
        console.log(`${number} is both positive and even`)
    }else{
        console.log(`${number} is either negative or odd`)
    }
}

function printArray(number){
    var newArray = [];
    for(var i=1;i<=number;i++){
        newArray.push(i);
    }
    return newArray;
}

function countTrue(array){
    return array.filter(value => value === true).length;
}

function returnSomething(value){
    return `something ${value}`
}

function divisibilityChecker(number){
    if (number % 4 == 0 && number % 6 == 0 && number % 8 !== 0){
        return `${number} is divisible by 4 & 6 but not by 8`
    }else{
        return `${number} doesnt meet the conditions`
    }
}

function positiveOrNegative(number){
    return (number>=0)? `${number} is positive`:`${number} is negative`
}

function getVoteCount(obj){
    return (obj.upvotes - obj.downvotes)
}

class Person{
    constructor(name,age){
        this.name = name;
        this.age = age;
    }
    compareAge(personSecond){
        if(this.age > personSecond.age){
            return `${personSecond.name} is younger then me!`
        }else if (this.age < personSecond.age){
            return `${personSecond.name} is older then me!`
        }else{
            return `${personSecond.name} is the same age as me!`

        }
    }
}

function getTotalPrice(array){
    var prices = [];
    array.forEach(element => prices.push(element.quantity * element.price));
    console.log(prices.reduce((a,b) => a+b).toFixed(2));
}

function weeklySalary(array){
    var sum = [];
    array.forEach(element => {
        if (element > 8){
            sum.push((element-8)*15 + (element-(element-8))*10);
        }else{
            sum.push(element * 10);
        }
    })
    console.log(sum.slice(0,5).reduce((a,b)=>a+b) +sum.slice(5).reduce((a,b)=>a+b)*2)
}

/* Didn't use a class approach for this cause well ._. idk */
function shitori(array){
    var used = [];
    array.forEach(element => {
        if (used.includes(element)){
            console.log(`Invalid ${element} is repeated`);
            return "Invalid";
        }else{
            used.push(element);
        }
    });
    for(let i=1;i<used.length;i++){
        if (used[i-1].charAt(used[i-1].length -1) === used[i][0]) {
            continue;
        }else{
            console.log(`Invalid ${used[i-1]} ends with ${used[i-1].charAt(used[i-1].length -1)} but ${used[i]} starts with ${used[i][0]}`);
            return "Invalid";
        }
    }
    return "Valid";
}
