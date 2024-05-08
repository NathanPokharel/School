import random
import os.path
import json
random.seed()

map = {"1":(0,0),"2":(0,1),"3":(0,2),"4":(1,0),"5":(1,1),"6":(1,2),"7":(2,0),"8":(2,1),"9":(2,2)}

def draw_board(board):
    print(f"""
        {board[0][0]} | {board[0][1]} | {board[0][2]}
        __ __ __
        {board[1][0]} | {board[1][1]} | {board[1][2]}
        __ __ __
        {board[2][0]} | {board[2][1]} | {board[2][2]}
    """)

def welcome(board):
    # prints the welcome message
    print("Welcome to the unbetable pwd")
    print("This is the layout of the game: ")
    draw_board(board)
    print("Input the number when prompted")

def initialise_board(board):
    # develop code to set all elements of the board to one space ' '
    for arrays in board:
        for index,values in enumerate(arrays):
            arrays[index] = ' '
    return board
    
def get_player_move(board):
    # develop code to ask the user for the cell to put the X in,
    # and return row and col
    print(f"""
        {"1" if board[0][0] ==" " else "_"} | {"2" if board[0][1] ==" " else "_"} | {"3" if board[0][2] ==" " else "_"}
        {"4" if board[1][0] ==" " else "_"} | {"5" if board[1][1] ==" " else "_"} | {"6" if board[1][2] ==" " else "_"}
        {"7" if board[2][0] ==" " else "_"} | {"8" if board[2][1] ==" " else "_"} | {"9" if board[2][2] ==" " else "_"}
    """)
    while True:
        try:
            userin = input("Enter your choice: ")
            r,c = map[userin][0],map[userin][1]
            if not userin.isdigit() or board[r][c] !=' ' or userin == "":
                print("Invalid Move Please Repeat. ")
                continue
            return r,c
        except:
            print("Inavlid Move Please Repeat")


def choose_computer_move(board):
    while True:
        computer_choice = str(random.randint(1,9))
        r,c = map[computer_choice][0], map[computer_choice][1]
        if board[r][c] != ' ':
            continue
        break
    return r,c


def check_for_win(board, mark):
    for i in range(3):
        if board[i][0] == board[i][1] == board[i][2] == mark:
            return True
    for i in range(3):
        if board[0][i] == board[1][i] == board[2][i] == mark:
            return True
    if board[0][0] == board[1][1] == board[2][2] == mark:
        return True
    if board[0][2] == board[1][1] == board[2][0] == mark:
        return True
    return False

def check_for_draw(board):
    if any(' ' in row for row in board):
        return False
    return True
        
def play_game(board):
    board= initialise_board(board)
    draw_board(board)
    while True:
        pr,pc = get_player_move(board) 
        board[pr][pc] = 'X'
        print("You Play: ")
        draw_board(board)
        player_win = check_for_win(board,'X')
        if player_win:
            print("You Win!!")
            return 1
        draw = check_for_draw(board) 
        if draw:
            print("Its A Draw!! ")
            return 0

        cr,cc = choose_computer_move(board) 
        board[cr][cc] = 'O'
        print("Computer Plays: ")
        draw_board(board)
        computer_win = check_for_win(board,'O')
        if computer_win:
            print("You Loose!!")
            return -1
        draw = check_for_draw(board) 
        if draw:
            return 0
    return 0
                    
                
def menu():
    print("""
        1) Play the game
        2) Save score in file 'leaderboard.txt'
        3) Load and display the scores from the 'leaderboard.txt'
        q) End the program
    """)
    while True:
        choice = input("Enter your choice: ")
        if choice not in "123q" or choice == "":
            print("Invalid Choice Please Enter again")
            continue
        break
    return choice

def load_scores():
    with open('leaderboard.txt','r') as leader_file:
        json_data = leader_file.read()
        leaders = json.loads(json_data)
    return leaders
    
def save_score(score):
    leaders = load_scores()
    user_name = input("Enter Your Name: ")
    with open('leaderboard.txt','w') as leaderboard:
        json.dump({user_name:score,**leaders},leaderboard)


def display_leaderboard(leaders):
    sorted_leaders = sorted(leaders,key=lambda x: leaders[x],reverse=True)
    for index,value in enumerate(sorted_leaders):
        print(f"{index+1}) {value}: {leaders[value]}")

