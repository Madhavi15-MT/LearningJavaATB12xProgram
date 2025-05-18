package ex_08_If_condition;
import java.util.Scanner;
public class Lab080_IF_Condition_01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user input
        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        // Start flowchart
        System.out.println("\nChecking if " + year + " is a Leap Year...");
        System.out.println("-------------------------------------------------");

        // Step 1: Divisibility by 4
        System.out.println("Step 1: Is " + year + " divisible by 4?");
        if (year % 4 == 0) {
            System.out.println("✔ Yes");

            // Step 2: Divisibility by 100
            System.out.println("Step 2: Is " + year + " divisible by 100?");
            if (year % 100 == 0) {
                System.out.println("✔ Yes");

                // Step 3: Divisibility by 400
                System.out.println("Step 3: Is " + year + " divisible by 400?");
                if (year % 400 == 0) {
                    System.out.println("✔ Yes → " + year + " is a Leap Year! 🎉");
                } else {
                    System.out.println("✘ No → " + year + " is NOT a Leap Year.");
                }
            } else {
                System.out.println("✘ No → " + year + " is a Leap Year! 🎉");
            }
        } else {
            System.out.println("✘ No → " + year + " is NOT a Leap Year.");
        }

        System.out.println("-------------------------------------------------");
        scanner.close();
    }
}
