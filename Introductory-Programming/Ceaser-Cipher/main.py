# Name: Swoyam Pokharel
# Student Number: 2431342
import os
import string
ALL_ALPHABETS = string.ascii_uppercase
SHIFT_BIT = 0

prompts= {
    "ed" : "Would you like to encrypt (e) or decrypt (d) ? -> ",
    "fc" : "Would you like to read from a file (f) or the console (c) -> ",
    "_" :  "What is the shift number? -> ",
}


def welcome():
    """
    Displays a welcome message for the Caesar Cipher program.

    This function prints a welcome message to the user upon starting
    the Caesar Cipher program.
    """
    
    print("Welcome to the Caesar Cipher")
    print("This program encrypts and decrypts text using Caesar Cipher.")


def enter_message():

    """
    Prompts the user to enter a message, select encryption or decryption mode and enter in the shift bit.

    This function guides the user through entering a message and selecting either 
    encryption (e) or decryption (d) mode for the Caesar Cipher. It also prompts 
    the user to enter the shift number for the encryption / decryption. The function 
    keeps prompting the user for input, until the given input is valid. This function 
    also sets the value for the global variable SHIFT_BIT for later access.

    Returns:
        tuple: A tuple containing the mode ('e' for encryption or 'd' for decryption),
                the message entered by the user (if applicable) or None.
    """

    global SHIFT_BIT 
    choices = []
    for validation,prompt in prompts.items():
        while True:
            userin = input(prompt)
            if validation == "_":
                if not userin.isdigit():
                    print("Please enter a valid shift number")
                    continue
            elif userin not in validation or userin == "":
                print("Invalid option please pick again")
                continue
            choices.append(userin)
            break

    SHIFT_BIT = choices[2]
    if choices[1] =='c':
        message = input("Enter message to encrypt: ").upper() if choices[0]=='e' else input("Enter message to decrypt: ").upper()
        return (choices[0],message)

    return(choices[0],None)


def message_or_file():
    """

    Prompts the user to choose between entering a message or using a file for encryption/decryption.

    This function prompts the user to choose between entering a message directly
    or using a file for encryption or decryption in the Caesar Cipher program. It
    utilizes the `enter_message()` function to get the user's choice and message (if applicable).
    If the user selects to use a file, it prompts for the filename and validates its existence.

    Returns:
        tuple: A tuple containing the mode ('e' for encryption, 'd' for decryption),
               the message entered by the user or None (if a file is used), and the filename
               of the file or None (if a message is used).

    """
    choices = enter_message()
    print(choices)
    match choices:
        case [_,None]:
            while True:
                filename = input("Enter filename: ")
                if not is_file(filename):
                    print("File doesn't exist, Please try again")
                    continue
                break
            return(choices[0],None,filename)
        case [_,message]:
            return (choices[0],message,None)


def encrypt(message,shiftbit):
    """
    Encrypts a message using the Caesar Cipher algorithm.

    This function encrypts the provided message using the Caesar Cipher algorithm
    with the specified shift value. It shifts each letter in the message by the
    specified number of positions in the alphabet, wrapping around if necessary.
    Non-alphabetic characters remain unchanged.

    Args:
        message (str): The message to be encrypted.
        shiftbit (str): The number of positions to shift each letter in the alphabet.

    Returns:
        str: The encrypted message.
    """
    return ''.join([ALL_ALPHABETS[(ALL_ALPHABETS.index(x)+int(shiftbit)) % 26 ] if x in ALL_ALPHABETS else x for x in message.upper() ])  


def decrypt(message,shiftbit):
    """
    Decrypts a message using the Caesar Cipher algorithm.

    This function decrypts the provided message using the Caesar Cipher algorithm
    with the specified shift value. It utilises the encrypt() function by providing 
    a negative shift, effectively reversing the encryption process.

    Args:
        message (str): The message to be decrypted.
        shiftbit (str): The number of positions to shift each letter in the alphabet.

    Returns:
        str: The decrypted message.
    """

    return encrypt(message, "-" + shiftbit)


def process_file(filename,mode):
    """
    Process a file for encryption or decryption using the Caesar Cipher algorithm.

    This function reads the contents of the specified file and processes each line
    for encryption or decryption using the Caesar Cipher algorithm with the global
    shift bit value. The mode parameter determines whether the lines should be encrypted
    or decrypted. The processed lines are stored in a list and returned.

    Args:
        filename (str): The name of the file to be processed.
        mode (str): The mode of operation ('e' for encryption, 'd' for decryption).

    Returns:
        list: A list containing the processed lines after encryption or decryption.
    """
    processed_lines = []
    with open(filename,'r') as in_file:
        for lines in in_file:
            processed_lines.append(encrypt(lines,SHIFT_BIT) if mode == 'e' else decrypt(lines,SHIFT_BIT))
    return processed_lines


def write_messages(processed_lines):
    """
    Write lines to a file.

    This function takes a list and writes them to a file named
    'results.txt'. Each item in the list is written to the file on a new line.

    Args:
        processed_lines (list): A list of either encrypted or decrypted texts. 
    """
    with open('results.txt','w') as out_file:
        for lines in processed_lines:
            out_file.write(lines)


def is_file(filename):
    """
    Check if a file exists.

    This function checks if the specified file exists in the current directory
    or the specified path. It returns True if the file exists, otherwise False.

    Args:
        filename (str): The name of the file to be checked.

    Returns:
        bool: True if the file exists, otherwise False.
    """
    return os.path.isfile(filename)


def main():
    """
    Main function for the Caesar Cipher program.

    This function serves as the entry point for the Caesar Cipher program. It displays
    a welcome message, prompts the user to choose between entering a message or using
    a file, and performs encryption or decryption accordingly. It then prompts the user
    if they want to encrypt or decrypt another message or exit the program.

    """
    welcome()
    while True:
        mode,message,file = message_or_file()
        match mode,message,file:
            case _,_,None:
                if mode == 'e':
                    print(encrypt(message,SHIFT_BIT))
                else:
                    print(decrypt(message,SHIFT_BIT))
            case _,None,_:
                write_messages(process_file(file,mode))
                print("Output has been written to results.txt")
        while True:
            userin = input("Would you like to decrypt or encrypt another message? y/n -> ")
            if userin not in 'yn':
                print("Invalid option please choose again")
                continue
            break
        if userin == 'n':
            print("Thank you for using the program, goodbye!")
            break  

main()

