'''
# 1)  What is a list in Python and what are some common use cases?
#  Lists are an ordered sequential mutable data type that store multiple values.
'''
'''
# 2) What are some common use cases for dictionaries?
# To store a collection of key value pairs.
'''
'''
# 3) What is a nested data structure, and how can you access its elements?
# Nested data structures are data structures within data structures, eg [[1,2,3],[4,5,6]]; array[0][1] gives 2.
'''
'''
# 4) What are the key differences between a list and a tuple in Python, and when would you use one over the other?
# Lists are mutable, tuples arent. Tuples can be used when the collection cant or shouldnt change
'''
'''
# 5) How can you use Python's built-in functions and methods to manipulate and sort lists, tuples, dictionaries, and sets, and what should you watch out for when working with these data structures?
# You can use methods like .sort() .max() .count() ... so on to perform different operatons with the data strctures. 
'''
'''
#1)Write a Python program to create a list of integers and then append a new integer to the end of the list.

list = [x for x in range(3)]
list.append(69)
'''
'''
# 2) Write a Python program to create a nested list of strings and then print the first element of the second list. 
list = [["a","b","c"],["d","e","f"]]
print(list[1][0])

'''
'''
# 3) Write a Python program to create a tuple of integers and then print the length of the tuple. 

tup = (3,2,1)
print(len(tup))

'''

'''
# 4) Write a Python program to create a set of integers and then add a new integer to the set.

mahSet = {1,2,3,4}
mahSet.add(69420)

'''

'''
# 5) Write a Python program to create a dictionary of student names and their corresponding ages, and then print the age of a specific student.

mahDict = {"Pam" : 69, "Sam": 420}
print(mahDict["Pam"])

'''
'''
# 6) Write a Python program that prompts the user for a list of integers and stores them in a list, For all values that are greater than 100, the string 'over' should be stored instead, The program should display the resulting list.

uin=[]
for i in range(5):
    uin.append(int(input("Enter element to add in the list ")))
filteredArray = ["over" if x > 100 else x for x in uin]
print(filteredArray)
'''

'''
# 7) Write a Python script to concatenate the following dictionaries to create a new one.
dict1={1:10, 2:20}
dict2={3:30, 4:40}
dict3={5:50, 6:60}
print({**dict1,**dict2,**dict3})

'''

'''
# 8) Write a Python program to check if a specific key and a value exist in a dictionary. 
students=[
    {"student_id": 1, "name": "Jean Castro", "class": "V"},
    {'student_id': 2, 'name': 'Lula Powell', 'class': 'V'},
    {'student_id': 3, 'name': 'Brian Howell', 'class': 'VI'},
    {'student_id': 4, 'name': 'Lynne Foster', 'class': 'VI'},
    {'student_id': 5, 'name': 'Zachary Simon', 'class': 'VII'}
]

key = "address"
value = "New York"
found = False
for dictionary in students:
    if key in dictionary:
        if dictionary[key] == value:
            print(f"key: {key} and value: {value} exist")
            found = True
if not found:
    print(f"key: {key} and value: {value} don't exist")

'''
'''
# Part 3
# 1) Write a Python program that takes in a list of strings and returns a new list with only the strings that contain the letter 'a'.
print([element for element in input("Enter strings with spaces: ").split() if "a" in element])
'''

'''
# 2) Write a Python program that takes in two sets of integers and returns a new set with only the common elements in both sets.
a = {1,2,3,4}
b = {3,4,6}
print({x for x in a if x in b})
'''
'''

# 3) Write a Python program that takes in a list of dictionaries representing people with their age, and returns a new list of dictionaries with only the people over the age of 18.
listofDicts = {"somedude":29,"someotherdude":38,"somegirl":65,"someothergirl":38}
print({x:listofDicts[x] for x in listofDicts if listofDicts[x]>18})
'''

'''
# 4) Write a program to input your friend’ names and their Phone Numbers and store them in the dictionary as the key-value pair. Perform the following operations on the dictionary:
#a)Display the name and phone number of all your friends
#b)Add a new k:v in this dictionary and display the modified dictionary
#c)Delete the particular friend from the dictionary
#d)Modify the phone number of an existing friend
#e)Check if a friend is present in the dictionary or not and display it in sorted form.

mahDict = {}
for i in range(3):
    key,value = input("Enter name and phonenum with space: ").split()
    mahDict[key] = value
for element in mahDict:
    print(element)
mahDict["meow"] = "696969"
mahDict["meow"] = "595959"
print("Exists") if "meow" in mahDict else print("No Exists")
'''

'''
#5 Write a Python program to get the top three items in a shop.
mahDict = {'item1': 45.50, 'item2':35, 'item3': 41.30, 'item4':55, 'item5': 24}

for i in range(3):
    max_item = max(mahDict, key=mahDict.get)
    print({max_item: mahDict[max_item]})
    del mahDict[max_item]

'''
