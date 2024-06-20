import java.util.Scanner;
public class Week_two {
    public void question_13() {
        int i = 10;
        while(i<20){
            i++;
            if (i == 15){
                continue;
            }
            System.out.println(i);
        }
    }
    public void question_12() {
        int i = 10;
        while(i<20){
            System.out.println(i);
            if (i==15) {
                break;
            }
            i++;
        }
    }
    public void question_11() {
        int factorial;
        System.out.println("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(factorial = 1;n>0;n--){
            factorial *= n;
        }
        System.out.println(factorial);
    }

    public void question_10() {
        String pattern = "";
        for(int i=0 ; i<=5 ; pattern+="*"){
            System.out.println(pattern);
            i++;
        }
    }  

    public void question_9(){
        System.out.println("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        int sum = 0;
        while(i <=n){
            sum += (i % 2 ==0)? i:0;
            i++;
        }
        System.out.println(sum);
    }

    public void question_8(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for Physics:");
        double physicsMarks = scanner.nextDouble();
        System.out.println("Enter marks for Chemistry:");
        double chemistryMarks = scanner.nextDouble();
        System.out.println("Enter marks for Biology:");
        double biologyMarks = scanner.nextDouble();
        System.out.println("Enter marks for Mathematics:");
        double mathMarks = scanner.nextDouble();
        System.out.println("Enter marks for Computer:");
        double computerMarks = scanner.nextDouble();
        double total = physicsMarks + chemistryMarks + biologyMarks + mathMarks + computerMarks;
        double percentage = (total / 500) * 100;
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("\nPercentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }

    public void question_7(){
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int userin = scanner.nextInt();
        if (userin % 2 == 0 && userin % 4 == 0) {
            System.out.println("Is even and divisible by 4");
        }else if (userin % 7 == 0 && userin % 2 != 0){
            System.out.println("Is odd and divisible by 7");
        }else{
            System.out.println("Is not divisible by both 4 and 7 ");
        }
    }

    public void question_6(){
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int userin = scanner.nextInt();
        System.out.println( userin%2 == 0? "Even" : "Odd");
    }

    public void question_5(){
        System.out.println("Do you got a medical cause?: ");
        Scanner scanner = new Scanner(System.in);
        char userin = scanner.next().charAt(0);
        if (userin == 'y') {
            System.out.println("You can't sit in the exam");
            return;
        }
        System.out.println("Take your exam");
    }

    public void question_4(){
        System.out.println("Enter ages of 3 people: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.printf("Oldest: %d, Youngest: %d \n", Math.max(a, Math.max(b, c)), Math.min(a, Math.min(b, c)));
    }

    public void question_3(){
        System.out.println("Enter marks: ");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        if (l >= 40 && l <= 50) {
            System.out.println("C");
        } else if (l > 50 && l <= 60) {
            System.out.println("C+");
        } else if (l > 60 && l <= 70) {
            System.out.println("B");
        } else if (l > 70 && l <= 80) {
            System.out.println("B+");
        } else if (l > 80 && l <= 90) {
            System.out.println("A");
        } else if (l > 90) {
            System.out.println("A+");
        } else {
            System.out.println("Invalid Marks ");
        }

    }

    public void question_2(){
        System.out.println("Enter number to display multiplication table of: ");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        for (int i = 0; i<=10; i++) {
            System.out.printf("%d x %d = %d\n",l,i,l*i);
        }
    }

    public void question_1(){
        System.out.println("Enter length and breadth: ");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int b = scanner.nextInt();
        if (l == b) {
            System.out.println("It Is A Square");
        }else{
            System.out.println("Nice Rectangle");
        }
    }

    public static void main(String[] args) {
        Week_two obj = new Week_two();
        //obj.question_1();
        //obj.question_2();
        //obj.question_3();
        //obj.question_4();
        //obj.question_5();
        //obj.question_6();
        //obj.question_7();
        //obj.question_8();
        //obj.question_9();
        //obj.question_10();
        //obj.question_11();
        //obj.question_12();
        obj.question_13();
        
    }
}
