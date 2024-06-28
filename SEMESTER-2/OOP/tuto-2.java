package tuto2;

public class task1 {
	public static void main(String[] args) {
		char[] c= {'h','e','l','l','o'};
		String wel= new String(c);
		
		System.out.println(wel);
		
		String s1= new String("Hello");
		String s2= "Hello";
		String s3= "Hello";
		String s4="shh";
		
		System.out.println(s1==s2);
		
		//string methods
		//compareTo()
		System.out.println(s2.compareTo(s4));
		
		//charAt()
		System.out.println(s3.charAt(4));
		
		//equals()
		System.out.println(s2.equals(s3));
	}

}
package tuto2;
import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
//		String s1 = "hello";
//		String s2 = "hello";
//		String s3 = "harry";
//		String s4 = "nepal";
//		String s5 = "flag";
//		String s6 = "";
//		
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.compareTo(s3));
//		System.out.println(s1.compareTo(s4));
//		System.out.println(s1.compareTo(s5));
//		System.out.println(s1.compareTo(s6));
		
		//concat
		
//		String s1= "Herald College";
//		String s2= " is located in Naxal kathmandu";
//		System.out.println(s1.concat(s2));
		
		//equals
//		String s1="hello";    
//        String s2="hello";    
//        String s3="harry";  
//        String s4="nepal";
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.equals(s4));
        
		//length
//		String s1 = "Herald College";
//        String s2 = "It is located in Naxal Kathmandu";   
//        System.out.println(s1.length());
//        System.out.println(s2.length());
		
		//charAt
//		String name="java";
//		System.out.println(name.charAt(2));
		
		//substring
//		String name = "Bachelors";
//		System.out.println(name.substring(0,4));
		
		//

//		Scanner in= new Scanner(System.in);
//		System.out.println("Enter your name : ");
//		String name= in.nextLine();
//		System.out.println("name is"+ name);
//		in.close();
//		
		

				
	}

}

package tuto2;

import java.util.Iterator;
import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		
		//task1
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Enter birth year in A.D : ");
//		int year = scan.nextInt();
//		int age= 2024-year;
//		if (age> 18)
//			System.out.println("you can cast vote.");
//		else
//			System.out.println("you aren't eligible")

		//task2
		
//		int number1= 15;
//		int number2= 10;
//		int sum=number1+number2;
//		if (sum>20)
//			System.out.println("sum is greater than 20 i.e: "+sum);
//		else
//			System.out.println("sum is smaller than 20 i.e: "+sum);
		
		//task3
		
//		Scanner scan= new Scanner(System.in);
//		System.out.println("enter a number: ");
//		int a= scan.nextInt();
//		System.out.println("enter second number: ");
//		int b= scan.nextInt();
//		if(a>b)
//			System.out.println(a+" is greater than "+b);
//		else
//			System.out.println(b+" is greater than "+a);
		
		//task4
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a number:");
//		int a = scan.nextInt();
//		if (a>0)
//			System.out.println("positive");
//		else if(a==0)
//			System.out.println("neutral");
//		else
//			System.out.println("negative");
//			
		
		//task5
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a number: ");
//		int a= scan.nextInt();
//		if (a%2==0)
//			System.out.println("even");
//		else
//			System.out.println("odd");
		
		
		//task6
//		Scanner scan =new Scanner(System.in);
//		System.out.println("enter a number");
//		int a = scan.nextInt();
//		if (a%5==0 && a%11==0)
//			System.out.println(a+" is divisible by 5 and 11.");
//		else
//			System.out.println(a+" is not divisible");
		
		//task7
//		Scanner scan= new Scanner(System.in);
//		System.out.println("enter first number: ");
//		int a= scan.nextInt();
//		System.out.println("enter second number: ");
//		int b=scan.nextInt();
//		System.out.println("enter third number: ");
//		int c=scan.nextInt();
//		if(a>b)
//			if(a>c)
//				System.out.println(a+" is greater");
//			else
//				System.out.println(c+" is greater");
//		else {
//			if(b>c)
//				System.out.println(b+" is greater");
//			else
//				 System.out.println(c+" is greater");
//		}
		
		
		//task7
		
//		Scanner scan= new Scanner(System.in);
//		System.out.println("enter marks: ");
//		int a= scan.nextInt();
//		if (a<50)
//			System.out.println("fail");
//		else if(a>=50 && a<60)
//			System.out.println("C grade");
//		else if(a>=60 && a<70)
//			System.out.println("B grade");
//		else
//			System.out.println("A grade");
//		
//		
		//task 8
//		Scanner scan= new Scanner(System.in);
//		System.out.println("enter a number: ");
//		int a= scan.nextInt();
//		if (a%2==0) {
//			if(a%4==0)
//				System.out.println("it is even and divisible by 4");
//			else
//				System.out.println("it is even but not divisible by 4");
//		}
//		else {
//			if(a%7==0)
//				System.out.println("it is odd and divisible by 7");
//			else
//				System.out.println("it is odd but not divisible by 7");
//			}
//			
//				
		
		//switch cases
		
		//task 6
		
//		Scanner scan= new Scanner(System.in);
//		System.out.println("enter your gender in 'm' or 'f' ");
//		char a= scan.next().charAt(0);
//		switch (a) {
//		case 'm':
//			System.out.println("male");
//			break;
//		case 'f':
//			System.out.println("female");
//			break;
//		default:
//			System.out.println("geh
//			break;
//			
//		}
//		
		//task7
		
//		Scanner scan= new Scanner(System.in);
//		System.out.println("enter days: ");
//		int a= scan.nextInt();
//		switch(a) {
//		
//		case 1: 
//			System.out.println("Sunday");
//			break;
//		case 2:
//			System.out.println("Monday");
//			break;
//		case 3:
//			System.out.println("tuesday");
//			break;
//		case 4:
//			System.out.println("wednesday");
//			break;
//		case 5:
//			System.out.println("thursday");
//			break;
//		case 6:
//			System.out.println("Friday");
//			break;
//		case 7:
//			System.out.println("Saturday");
//			break;
//		default:
//			System.out.println("Invalid");
//		}
//		
//		
//		
//		
//		String pattern = "";
//		for(int i = 0; i<=5;pattern+="*") {
//			System.out.println(pattern);
//			i++;
//		}
		
		for (int i =1 ; i<=5; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
			}
		
	}

}
