import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Choice 1 or 2: ");
        int userChoice = Integer.parseInt(scanner.nextLine());
        
        if (userChoice == 1) {
            while (true) {
                System.out.println("Enter your name, number, password, confirm password, and date of birth separated by underscores (_): ");
                String userInput = scanner.nextLine();
                String[] inputs = userInput.split("_");
                
                if (inputs.length != 5) {
                    System.out.println("Invalid input format. Please enter all fields separated by underscores (_).");
                    continue;
                }
                
                if (inputs[0].length() <= 4) {
                    System.out.println("Invalid full name. Please enter a name longer than four characters.");
                    continue;
                }
                
                if (!inputs[1].matches("^0\\d{9}$")) {
                    System.out.println("Invalid mobile number. Please enter a 10-digit number starting with 0.");
                    continue;
                }
                
                if (!inputs[2].matches("^[A-Za-z]+[@&]\\d+$")) {
                    System.out.println("Invalid password format. Password must start with letters, contain '@' or '&', and end with digits.");
                    continue;
                }
                
                if (!inputs[2].equals(inputs[3])) {
                    System.out.println("Passwords do not match. Please enter matching passwords.");
                    continue;
                }
                
                String[] dateParts = inputs[4].split("/");
                if (dateParts.length != 3) {
                    System.out.println("Invalid date of birth format. Please enter DD/MM/YYYY or MM/DD/YYYY.");
                    continue; 
                }
                
                int birthYear = Integer.parseInt(dateParts[2]);
                int age = 2024 - birthYear; 
                
                if (age < 21) {
                    System.out.println("You must be at least 21 years old.");
                    continue;
                }

                System.out.println("You have successfully signed up.");
                break;
            }
        } else {
            System.out.println("Goodbye!");
        }
    }
}

