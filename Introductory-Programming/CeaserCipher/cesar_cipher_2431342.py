# Name: Swoyam Pokharel
# Student Number: 2431342

import os
import string
ALL_ALPHABETS = string.ascii_uppercase # A Collection Of All Upper Case Letters.

prompts= {
    "ed" : "Would you like to encrypt (e) or decrypt (d) ? -> ",
    "fc" : "Would you like to read from a file (f) or the console (c) -> ",
    "_" :  "What is the shift number? -> ",
} 


def welcome():
    """
    Description: Displays a welcome message for the Caesar Cipher program.

    Parameters: None

    Returns: None
    """
    
    print("Welcome to the Caesar Cipher")
    print("This program encrypts and decrypts text using Caesar Cipher.")


def enter_message():

    """
    Description: Prompts the user to enter a message, select encryption or decryption mode and enter in the shift bit.

    Parameters: None

    Returns:XJDEXJD
        tuple: A tuple containing the mode ('e' for encryption or 'd' for decryption),
               the message entered by the user (if applicable) or None.
    """

    choices = []
    for validation,prompt in prompts.items():
        while True:
            userin = input(prompt).lower()
            if validation == "_":
                if not userin.isdigit():
                    print("Please enter a valid shift number")
                    continue
            elif userin not in validation or userin == "":
                print("Invalid option please pick again")
                continue
            choices.append(userin)
            break

    if choices[1] =='c':
        message = input("Enter message to encrypt: ").upper() if choices[0]=='e' else input("Enter message to decrypt: ").upper()
        return (choices[0],message,choices[2])

    return(choices[0],None,choices[2])


def message_or_file():
    """

    Description: Prompts the user to choose between entering a message or using a file for encryption/decryption.

    Parameters: None

    Returns:
        tuple: A tuple containing the mode ('e' for encryption, 'd' for decryption),
               the message entered by the user or None (if a file is used), and the filename
               of the file or None (if a message is used).

    """
    choices = enter_message()
    match choices:
        case [_,None,_]:
            while True:
                filename = input("Enter filename: ")
                if not is_file(filename):
                    print("File doesn't exist, Please try again")
                    continue
                break
            return(choices[0],None,filename,choices[2])

    return (choices[0],choices[1],None,choices[2])


def encrypt(message,shiftbit):
    """
    Description: Encrypts a message using the Caesar Cipher algorithm.

    Parameters:
        message (str): The message to be encrypted.
        shiftbit (str): The number of positions to shift each letter in the alphabet.

    Returns:
        str: The encrypted message.
    """
    return ''.join([ALL_ALPHABETS[(ALL_ALPHABETS.index(x)+int(shiftbit)) % 26 ] if x in ALL_ALPHABETS else x for x in message.upper() ])  


def decrypt(message,shiftbit):
    """
    Description Decrypts a message using the Caesar Cipher algorithm.
    
    Parameters:
        message (str): The message to be decrypted.
        shiftbit (str): The number of positions to shift each letter in the alphabet.

    Returns:
        str: The decrypted message.
    """

    return encrypt(message, "-" + shiftbit)


def process_file(filename,mode,shift):
    """
    Description: Process a file for encryption or decryption using the Caesar Cipher algorithm.

    Parameters:
        filename (str): The name of the file to be processed.
        mode (str): The mode of operation ('e' for encryption, 'd' for decryption).

    Returns:
        list: A list containing the processed lines after encryption or decryption.
    """
    processed_lines = []
    with open(filename,'r') as in_file:
        for lines in in_file:
            processed_lines.append(encrypt(lines,shift) if mode == 'e' else decrypt(lines,shift))
    return processed_lines


def write_messages(processed_lines):
    """
    Description: Writes the results to the 'results.txt' file.

    Parameters:
        processed_lines (list): A list of either encrypted or decrypted texts. 

    Returns: None
    """
    with open('results.txt','w') as out_file:
        for lines in processed_lines:
            out_file.write(lines)


def is_file(filename):
    """
    Description: Check if a file exists.

    Parameters:
        filename (str): The name of the file to be checked.

    Returns:
        bool: True if the file exists, otherwise False.
    """
    return os.path.isfile(filename)


def main():
    """
    Description: Main function for the Caesar Cipher program.

    Parameters: None

    Returns: None

    """
    welcome()
    while True:
        mode,message,file,shift = message_or_file()
        match mode,message,file,shift:
            case _,_,None,_:
                print(encrypt(message,shift)) if mode == 'e' else print(decrypt(message,shift))
            case _,None,_,_:
                write_messages(process_file(file,mode,shift))
                print("Output has been written to results.txt")
        while True:
            userin = input("Would you like to decrypt or encrypt another message? y/n -> ")
            if userin not in 'yn' or userin =="":
                print("Invalid option please choose again")
                continue
            break
        if userin == 'n':
            print("Thank you for using the program, goodbye!")
            break  

main()


