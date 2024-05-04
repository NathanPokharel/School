# Question 1 
def is_even(num):
    return num%2 == 0

def recursive_is_even(num):
    if n == 0:
        return True
    elif n == 1:
        return False
    else:
        return recursive_is_even(num-2)

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
    
def is_prime_recursive(num,i):
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
    for number in num:
        total += number
    return total



