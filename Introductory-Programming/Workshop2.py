# Variable assignment value
# int, float, string -> to store int & point values; to store string values
# Mutable can be changed, immutable cant be changed after assignment. Tuple,Lists
##
#
## Square Input Number
#print(int(input("Enter a number to square: "))**2)
#
## Circumference of a circle
#import math
#print(format(int(input("Enter radius: "))*2*math.pi,".2f"))
#
## Kg -> G
#print("Grams: ",int(input("Enter kilogram: "))*1000)
#
## Input Name And Print it out
#print("Hello: ",input("Enter your name: "))
#
## Print as is
#print(" Herald College Kathmandu\n Naxal, PO:44600\n Kathmandu, Nepal")
#
## Remainder If Divisor Is 2
#print("Remainder is: ",int(input("Enter a number to divide: "))%2)

# BMI Calculator
weight,height = map(float,input("Enter Your Weight And Height: (Weight (kgs) Height(m2)) ").split())
print(format(weight/height,".2f"))

# Cube Root:
print("Cube Root: ",int(input("Enter A Number To Cube Root: "))**(1/3))

#Average Of 3 Subjects
print(sum(map(int,input("Enter Grades in 3 subjects ... 100 full marks: ").split()))/3)

# Probability Of randomly selecting a left handed student
print(format(8/20,".2f"))

# Equally Distributed Sheets
print(f"Equally Distributed Sheets:{50//15}, Remaining Sheets:{50%15}")

# Minimum size of paper required to cover the entire desk 
print(f"Minimum Size of the paper would be {80*60}cm")

# Conversion
seconds = 13442
minutes,seconds = divmod(seconds,60)
hours,minutes = divmod(minutes,60)
print(f"{hours}H:{minutes}M,{seconds}S")

#number of days if a,b,c decide to work together
x,y,z = map(int,input("Values of x,y,z: ").split())
print(round(x*y*z/(x*y+y*z+z*x),0))


#Area of tringle
a,b,c = map(float,input("Values of x,y,z: ").split())
s= (a + b + c) / 2  
area = (s*(s-a)*(s-b)*(s-c)) ** 0.5
print(round(area))


