import random
import os.path
import json

random.seed(69)
MAP = {
    "1": (0, 0),
    "2": (0, 1),
    "3": (0, 2),
    "4": (1, 0),
    "5": (1, 1),
    "6": (1, 2),
    "7": (2, 0),
    "8": (2, 1),
    "9": (2, 2),
}
PLAYER = "\033[92m" + "" + "\033[0m" # 'X' Glyph Nerd Font Might Not Be Supported Change to X
COMPUTER = "\033[91m" + "" + "\033[0m" # 'O' Glyph Nerd Font Might Not Be Supported Change to O


def draw_board(board):
    '''
    Function to print the current state of the board

    Parameters:
        board(list of lists): A 3x3 list representing the Tic Tac Toe Board

    Returns:
        None
    '''
    print(
        f"""
        {board[0][0]} | {board[0][1]} | {board[0][2]}
        __ __ __
        {board[1][0]} | {board[1][1]} | {board[1][2]}
        __ __ __
        {board[2][0]} | {board[2][1]} | {board[2][2]}
    """
    )


def welcome(board):
    '''
    Prints the welcome message and the layout of the Tic Tac Toe board.

    Parameters:
        board(list of lists): A 3x3 list representing the Tic Tac Toe Board
    
    Returns:
        None
    '''
    print("Welcome to the unbetable tic tac toe\nThis is the layout of the game: ")
    draw_board(board)
    print(f"You are {PLAYER} the computer is {COMPUTER} ")
    print("Input the number when prompted")


def initialise_board(board):
    '''
    Sets all the elemens of the board to a space (' ').

    Parameters:
        board(list of lists): A 3x3 list representing the Tic Tac Toe Board
    
    Returns:
        None
    '''
    for arrays in board:
        for index, values in enumerate(arrays):
            arrays[index] = " "
    return board


def get_player_move(board):
    '''
    Asks the user to play their turn and returns the row and column.

    Parameters:
        board(list of lists): A 3x3 list representing the Tic Tac Toe Board
    
    Returns:
        Tuple: The row and column selected by the player.
    '''
    print(f"""

            {"1" if board[0][0] ==" " else "_"} | {"2" if board[0][1] ==" " else "_"} | {"3" if board[0][2] ==" " else "_"}
            {"4" if board[1][0] ==" " else "_"} | {"5" if board[1][1] ==" " else "_"} | {"6" if board[1][2] ==" " else "_"}
            {"7" if board[2][0] ==" " else "_"} | {"8" if board[2][1] ==" " else "_"} | {"9" if board[2][2] ==" " else "_"}

            """)
    while True:
        try:
            userin = input("Enter your choice: ")
            r, c = MAP[userin][0], MAP[userin][1]
            if not userin.isdigit() or board[r][c] != " " or userin == "":
                print("Invalid Move Please Repeat. ")
                continue
            return r, c
        except:
            print("Inavlid Move Please Repeat")


def choose_computer_move(board):
    '''
    Chooses a random cell in the board for the computer to make a move.

    Parameters:
        board(list of lists): A 3x3 list representing the Tic Tac Toe Board

    Returns:
        Tuple: The row and column selected by the computer.

    '''
    while True:
        computer_choice = str(random.randint(1, 9))
        r, c = MAP[computer_choice][0], MAP[computer_choice][1]
        if board[r][c] != " ":
            continue
        break
    return r, c


def check_for_win(board, mark):
    '''
    Checks weather one of the sides has won.

    Parameters:
        board(list of lists): A 3x3 list representing the Tic Tac Toe Board
        mark (str): 'X' or 'O' denoting either the player or the computer

    Returns:
        bool: True if the player with the given mark has won, False otherwise.

    '''
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
    '''
    Checks if the game is a draw.

    Parameters:
        board(list of lists): A 3x3 list representing the Tic Tac Toe Board

    Returns:
        bool: True if the game resulted in a draw , False otherwise.

    '''
    if any(" " in row for row in board):
        return False
    return True


def play_game(board):
    '''
    Plays a single game of Tic Tac Toe.

    Parameters:
        board(list of lists): A 3x3 list representing the Tic Tac Toe Board

    Returns:
        int: 1 if the player wins , -1 if the player looses , 0 if its a draw.

    '''

    board = initialise_board(board)
    draw_board(board)
    while True:
        pr, pc = get_player_move(board)
        board[pr][pc] = PLAYER
        print("You Played: ")
        draw_board(board)
        player_win = check_for_win(board, PLAYER)
        if player_win:
            print("You Win!!")
            return 1
        draw = check_for_draw(board)
        if draw:
            print("Its A Draw!! ")
            return 0

        cr, cc = choose_computer_move(board)
        board[cr][cc] = COMPUTER
        print("Computer Plays: ")
        draw_board(board)
        computer_win = check_for_win(board, COMPUTER)
        if computer_win:
            print("You Loose!!")
            return -1
        draw = check_for_draw(board)
        if draw:
            return 0
    return 0


def menu():
    ''' 
    Displays the menu options and prompts the user for their choice.

    Returns:
        str: The user's menu choice.
    '''
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
    '''
    Loads scores from the leaderboard.txt file.
    Returns:
        dict or str: A dict containing the loaded scores if the file exists, otherwise returns "FileNotFound".
    '''
    if os.path.exists("leaderboard.txt"):
        with open("leaderboard.txt", "r") as leaderboard:
            json_data = leaderboard.read()
            if not json_data.strip():
                return {}
            return json.loads(json_data)
    else:
        return "FileNotFound"


def save_score(score):
    '''
    Sorts and Saves the score to the leaderboard.txt file

    Parameters:
        board(list of lists): A 3x3 list representing the Tic Tac Toe Board

    Returns:
        None
    '''
    scores = load_scores()
    scores_list = list(scores)
    if scores == "FileNotFound":
        scores = {}
        userin = input(
            "The leaderboard.txt file doesnt exist, would you like to create one? (y/n)"
        )
        if userin == "n":
            return
    with open("leaderboard.txt", "w") as leaderboard:
        for index, val in enumerate(scores.items()):
            print(f"{index+1}: {val[0]}")
        if len(scores) != 0:
            while True:
                userin = input(
                    "Please select one of the users, or enter n to create a new user: "
                ).lower()
                if not userin.isdigit() and userin != "n":
                    print("Invalid Option Please Pick Again")
                    continue
                if userin.isdigit():
                    try:
                        scores[scores_list[int(userin) - 1]] += score
                        break
                    except Exception as e:
                        print("Invalid Selection Please Pick Again")
                        continue
                    break
                else:
                    username = input("Enter Your Username: ")
                    scores[username] = score
                    break
        else:
            username = input("Enter Your Username: ")
            scores[username] = score

        score_sorted = {
            key: scores[key]
            for key in sorted(scores, key=lambda x: scores[x], reverse=True)
        }
        json.dump(score_sorted, leaderboard)


def ordinal(n):
    '''
    Converts a number into its ordinal form.
    Parameters:
        n(int): The number to convert.
    Returns:
        str: The ordinalised form of n.
    '''
    if 11 <= (n % 100) <= 13:
        suffix = "th"
    else:
        suffix = ["th", "st", "nd", "rd", "th"][min(n % 10, 4)]
    return str(n) + suffix


def display_leaderboard(leaders):
    '''
    Displays the leaderboard.
    Parameters:
        leaders(dict): A dictionary containing player names and their scores.
    Returns:
        None
    '''
    for position, val in enumerate(leaders.items()):
        print(f"{ordinal(position+1)} position goes to {val[0]} with a score of {val[1]}")

