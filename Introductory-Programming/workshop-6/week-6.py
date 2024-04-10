'''
#1) Define the function and variable declarations given above in the IDLE shell and execute the following expressions,Which of the statements are valid?
#c) Invalid as n4,n5,n6 arent defined.
#d) valid    
#e) invalid as n5 ,n4 arent defined.

'''

'''
#1) a) types() that prints a given value both as a float and an integer.
def types(num):
    print(float(num))
    print(int(num))

types(8)

'''

'''
#b) squared( ) that take an integer and returns the value squared.
def squared(num):
    return num*num

print(squared(5))

'''

'''
#c) int_to_string( ) that takes an integer value and returns it as a string.
def int_to_string(num):
    return str(num)
print(int_to_string(69))

'''

'''
#d) hello_world( ) that takes a parameter name and displays the following output to the console, "Hello World, my name is name".
def hello_world(name):
    print(f"Hello world, my name is {name}")

hello_world("zed")
'''

'''
#e) improved_average( ) that takes five integer parameters, It should return the mode, median and mean values of the numbers passed to the function.

from statistics import mode, median, mean
def improved_average(*args):
    return f"Mode: {mode(args)}, Median: {median(args)}, Mean: {mean(args)}"

print(improved_average(69,420,69,420,69))

'''

'''
# Part 3
# 1) Create a function that prompts the user for two integer values and displays the results of the first number divided by the second to two decimal places.

def divide():
    a,b = [int(x) for x in input("Enter 2 numbers with spaces: ").split()] 
    print(format(a/b,".2f"))

divide()

'''

'''
# 2) Create a Python program called calculator with functions to perform the following arithmetic calculations, each should take two decimal parameters and return the result of the arithmetic calculation in question (add,substract,divide,multiply,modulo,exponent).

def add(a,b):
    """
    returns a modulo b
    Parameters:
    a (int): a.
    b (int): b.
    
    Returns:
    int: The sum of a and b .
    """
    return a+b;

def multiply(a,b):
    """
    returns a modulo b
    Parameters:
    a (int): a.
    b (int): b.
    
    Returns:
    int: The product of a and b .
    """
    return a*b;

def divide(a,b):
    """
    returns a modulo b
    Parameters:
    a (int): a.
    b (int): b.
    
    Returns:
    int: The quotient of dividing a by b .
    """
    return a/b;

def modulo(a,b):
    """
    returns a modulo b
    Parameters:
    a (int): a.
    b (int): b.
    
    Returns:
    int: The remainder of dividing a by b .
    """
    return a%b;

def exponent(a,b):
    """
    returns a raised to the power b
    
    Parameters:
    a (int): a.
    b (int): a^b.
    
    Returns:
    int: The result of raising a to the power of b.
    """
    return a**b;

# ... eval(input("Enter mathematical operation: ")) 

""" 
help(exponent)
Help on function exponent in module __main__:

exponent(a, b)
    returns a raised to the power b
    
    Parameters:
    a (int): a.
    b (int): a^b.
    
    Returns:
    int: The result of raising a to the power of b.
(END)
"""
'''
'''
#Part 4
# Write a Python program that asks the user to enter their scores for five assignments (each worth 100 points) and calculate their overall grade as a percentage.
def calculateMarks():
    scores = [int(x) for x in input("Enter marks in 5 subjects (with spaces): ").split()]
    print(f"Your total score is {sum(scores)} and the maximum possible score was 500.")
    print(f"Obtained Percentage: {format(((sum(scores)/500)*100),'.2f')}%")

calculateMarks()
'''

