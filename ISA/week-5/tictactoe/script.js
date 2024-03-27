const player1 = "X";
const player2 = "O";
let turn = player1;
let count = 0;
let win = ""
function append(event){
    if (turn == player1){
        event.target.innerHTML ="";
        event.target.innerHTML = `<h1>${player1}</h1>`;
        count ++;
        turn = player2;
        checkWinner();
    }else{
        event.target.innerHTML ="";
        event.target.innerHTML = `<h1>${player2}</h1>`;
        count ++;
        turn = player1;
        checkWinner();
    }
}

function clear(){
    location.reload();
}
function checkWinner(){
    // Check Horizontal
    let divs = document.querySelectorAll(".cube");
    board = [
        [divs[0].innerHTML,divs[3].innerHTML,divs[6].innerHTML],
        [divs[1].innerHTML,divs[4].innerHTML,divs[7].innerHTML],
        [divs[2].innerHTML,divs[5].innerHTML,divs[8].innerHTML],
    ]
    if (count == 9){
        alert("draw");
        clear();
    }
    for (let i = 0; i < 3; i++) {
        if (board[i][0] !== "." && board[i][0] === board[i][1] && board[i][0] === board[i][2]) {
            alert(board[i][0] + "wins"); 
            clear();

        }
    }
     for (let i = 0; i < 3; i++) {
        if (board[0][i] !== "." && board[0][i] === board[1][i] && board[0][i] === board[2][i]) {
            alert(board[0][i]+"wins"); 
            clear();
        }
    }
    if (board[0][0] !== "." && board[0][0] === board[1][1] && board[0][0] === board[2][2]) {
        alert(board[0][0]+"wins");
        clear();
    }
    if (board[0][2] !== "." && board[0][2] === board[1][1] && board[0][2] === board[2][0]) {
        alert(board[0][2]+"wins");
        clear();
    }

}
