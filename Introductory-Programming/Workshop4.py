'''
Part 1
1. Nested loops are loops within loops. It can be used to iterate over more complex data structures such as 2d arrays.
2. for and while loops while both doing the same thing, for loops are generally used when the amount of iteration is fixed, whereas while loops
    are used when an itereation has to be done until sentinel value / condition is met.
3. Python is dynamically typed. It means that the variable's type doesnt have to be declared before hand. 

num = int(input("Enter a number"))
factorial = 1
while (num > 1):
    factorial = num * factorial
    num -=1
print(factorial)
'''

'''Part 2:

1. 
for i in range(1,11):
    print(i)

2.
for i in range (1,16,2):
    print(i)
3. 
print(sum(range(11)))

4.
userin = -1
while (userin < 0):
    userin = int(input("Enter a positive integer: "))

for i in range(1,11):
    print(f"{userin} x {i} = {userin * i}")

5.
def factorial(n):
    if n == 1 or n == 0:
        return 1
    else:
        return n * factorial(n-1)

print(factorial(int(input("Enter a number: "))))
    
6.
userinputs = []
userin = 0
while (True):
    userin = input("Enter a number or type end to end: ")
    if userin == "end":
        break
    userinputs.append(int(userin))
print(f"Positive: {sum(1 for x in userinputs if x > 0)}")
print(f"Negative: {sum(1 for x in userinputs if x < 0)}")
print(f"Zero: {sum(1 for x in userinputs if x == 0)}")

7.
n = int(input("Enter n: "))
a,b = 0,1
for _ in range(n):
    print(a)
    a,b = b,a+b

8.
userstring = input("Enter a string: ")
print(userstring[::-1])

9.

for i in range(1,6):
    print(f"{i}"*i)

'''

'''
Part 3

1.
print("Sum of all numbers divisible by both 5 and 3 between 1 and a hundered is: ",sum(x for x in range(1,101) if x % 3 ==0 and x % 5 == 0))

2.
userinput = input("Enter a string: ")
print("Palindrome") if userinput == userinput[::-1] else print("Not A Palindrome")

3.a
print(sum(x for x in range(100,202,2)))

3.b
    userinputs = []
    while(True):
        userin =(input("Enter a number or type end to stop: "))
        if userin == "end":
            break
        userinputs.append(int(userin))

    print(sum(x for x in userinputs if x <= 100))


3.c
start,total_sum = 100,0
while (True):
    total_sum += start if start % 3 == 0 and start%5 == 0 else 0
    if start <= 200:
        start +=1
    else:
        print(total_sum)
        break

4. num = int(input("Enter first number: ")) # From input("Enter first number: ")
5. (n<10) is the definite loop (num == 0) is the indefinite loop.
6.
userin =(input("Enter a number: "));
userinarray = [int(x) for x in userin]
print("The max digit is: ",max(userinarray))

7.
userin = input("Enter a string: ")
vowels = "aeiou"
print(sum(1 for vowel in vowels if vowel in userin))

8.
import random
random_num = random.randint(1,100)
print(random_num)
for i in range(5):
    userin = int(input("Enter a guess between 1 and 100: "))
    if userin > random_num:
        print("Guess was too high")
    if userin < random_num:
        print("Guess was too low")
    if userin == random_num:
        print(" CONGRATULATIONS YOU'VE CORRECTLY GUESSED IT !!!! ")

print("Sorry Youve Failed")

'''
'''
Part 4
1.
while (True):
    a,b = map(int,(input("Enter 2 numbers with spaces: ").split()))
    operator = input("Enter an operator: (or q to quit): ")
    match operator:
        case "+":
            print(a+b)
        case "-":
            print(a-b)
        case "/":
            print(a/b)
        case "*":
            print(a*b)
        case "q":
            break


2.

import random
random_num = random.randint(1,6) + random.randint(1,6)
print(random_num)
while (True):
    userguess =(input("Enter your guess (q to quit): "))
    if userguess == "q":
        break
    else:
        if int(userguess) > random_num:
            print("Too High")
        if int(userguess) < random_num:
            print("Too Low")
        if int(userguess) == random_num:
            print("You guessed it CONGRATULATIONS !!!")

3.
import random
count = 0
wins = 0
random_num = random.randint(1,6) + random.randint(1,6)
while (True):
    count +=1
    userguess =(input("Enter your guess (q to quit): "))
    if userguess == "q":
        print(f"The Number was {random_num}")
        print(f"you won {wins} amount of games played")
        break
    else:
        if int(userguess) > random_num:
            print("Too High")
        if int(userguess) < random_num:
            print("Too Low")
        if int(userguess) == random_num:
            print("You guessed it CONGRATULATIONS !!!")
            wins += 1
            print(f"You Took {count} attempts and you won {wins} amount of games played")
'''

