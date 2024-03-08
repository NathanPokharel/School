
document.querySelector('.toggle').click();
var elementToHighlight = document.querySelector('.hg-1');
var annotation = RoughNotation.annotate(elementToHighlight, {
    type: 'highlight',
    color: '#00F0B5', 
    strokeWidth: 2 
});
annotation.show(); 
var elementToHighlight = document.querySelector('.hg-2');
var annotation = RoughNotation.annotate(elementToHighlight, {
    type: 'highlight',
    color: '#00F0B5', 
    strokeWidth: 2 
});
annotation.show(); 
var elementToHighlight = document.querySelector('.hg-3');
var annotation = RoughNotation.annotate(elementToHighlight, {
    type: 'highlight',
    color: '#EACBD2', 
    strokeWidth: 2 
});
annotation.show(); 

/* _____ */

function navopen(){
    document.querySelector('.hamburger-menu').style.display='flex';
    document.body.style.overflow='hidden';
}
function navclose(){
    document.querySelector('.hamburger-menu').style.display='none';
    document.body.style.overflow='scroll';
}
function switch_light() {
    const currentBackgroundColor = document.body.style.backgroundColor;
    if (currentBackgroundColor === 'rgb(255, 255, 255)') { 
        document.body.style.backgroundColor = '#000'; 
         document.getElementById('nav').style.borderBottom="1px solid white";
        const elements = document.querySelectorAll('p, h1, h2, h5, a,.inp');
        elements.forEach(element => {
            element.style.color = '#fff';
        });
        document.querySelector('.toggle').innerHTML = "<i class='fa-solid fa-sun'></i>" 
        document.querySelector('.inp').style.color= "black" 


    } else { 
        document.body.style.backgroundColor = '#fff'; 
        const elements = document.querySelectorAll('p, h1, h2, h5, a');
        elements.forEach(element => {
            element.style.color = '#000';
        });
         document.getElementById('nav').style.borderBottom="1px solid black";
        document.querySelector('.toggle').innerHTML = "<i class='fa-solid fa-moon'></i>" 
        document.querySelector('.btn').style.background= "black" 
        document.querySelector('.btn').style.color= "white" 
    }
}

