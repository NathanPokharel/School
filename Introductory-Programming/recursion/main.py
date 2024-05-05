# Question 1 
def is_even(num):
    return num%2 == 0

def recursive_is_even(n):
    if n == 0:
        return True
    elif n == 1:
        return False
    else:
        return recursive_is_even(n-2)

#Question 2
def letter_freq(string,letter):
    return string.count(letter)

def recursive_letter_freq(string, letter):
    if len(string) == 0:
        return 0
    elif string[0] == letter:
        return 1 + recursive_letter_freq(string[1:], letter)
    else:
        return recursive_letter_freq(string[1:], letter)

# Question 3
def reverse(string):
    return string[::-1]

def reverse_recursive(string):
    if len(string) == 0:
        return ""
    else:
        return string[-1] + reverse_recursive(string[:-1])

#Question 4
def is_prime(num):
    for i in range(2,int((num**1/2)+1)):
        if num % i == 0:
            return False
    return True
    
def is_prime_recursive(num,i=1):
    if i == int(num**1/2 + 1):
        return True
    if num % i == 0:
        return False
    else:
        return is_prime_recursive(num,i+1)
    
def decimal_to_binary(num):
    binary = []
    while num != 0:
        num,remainder = divmod(num,2);
        binary.append(remainder)
    print(''.join(str(x) for x in binary)[::-1])


def rec_decimal_to_binary(n):
    if n == 0:
        return "0"
    else:
        return rec_decimal_to_binary(n // 2) + str(n % 2)

def fib_iterative(n):
    if n == 1:
        return 0
    elif n == 2:
        return 1
    else:
        a, b = 0, 1
        for _ in range(2, n):
            a, b = b, a + b
        return b

def fib_recursive(n):
    if n == 1:
        return 0
    elif n == 2:
        return 1
    else:
        return fib_recursive(n-1) + fib_recursive(n-2)

def sum_iterative(num):
    total = 0
    for number in num:
        total += number
    return total

def sum_recursive(arr):
    if len(arr) == 0:
        return 0
    return arr[0] + sum_recursive(arr[1:])

def harmonic_recursive(n):
    if n == 0:
        return 0
    return (1/n) + harmonic_recursive(n-1)

def power_recursive(a,b):
    if b == 0:
        return 1
    return a*power_recursive(a,b-1)

def greatest_common_denominator(a,b):
    remainder = a % b
    if remainder == 0:
        return b
    a,b = b,remainder
    return greatest_common_denominator(a,b)

def pattern_01_iter():
    rows = 6  
    for i in range(rows, 0, -1):
        print(" " * (rows - i) + "*" * (i * 2))

def pattern_01_rec(i=6):
    if i == 0:
        return
    rows=6
    print(" "*(rows-i)+"*"*(i*2))
    i-=1
    pattern_01_rec(i)

def pattern_02_iter():
    rows = 7
    for i in range(0, rows, 1):
        print(" " * (rows - i) + "*" * (i * 2))

def pattern_02_rec(i=1):
    rows = 6
    print(" " * (rows - i) + "*" * (i * 2))
    if i == rows:
        return
    i+=1
    pattern_02_rec(i)
    
import random
def guessing_game():
    lower = 1
    upper = 100
    while True:
        guess = random.randint(lower, upper)
        guessed = input(f"Is your number {guess}? (y/n)")
        if guessed == "y":
            print(":P im tottally a mind reader")
            break
        user_input = input(f"Was the number {guess} higher or lower than your number? (h/l)")
        if user_input == "h":
            upper = guess - 1
        else:
            lower = guess + 1


def guessing_game_recur(lower=1,upper=100):
    guess = random.randint(lower,upper)
    guessed = input(f"Is your number {guess}? (y/n)")
    if guessed == "y":
        print(":P im tottally a mind reader")
        return
    user_input = input(f"Was the number {guess} higher or lower than your number? (h/l)")
    if user_input == "h":
        guessing_game_recur(lower,(guess-1))
    else:
        lower = guess + 1
        guessing_game_recur((guess+1),upper)






