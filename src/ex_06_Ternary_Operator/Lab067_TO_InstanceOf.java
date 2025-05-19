package ex_06_Ternary_Operator;

public class Lab067_TO_InstanceOf {
    public static void main(String[] args) {
            if (args.length == 0) {
                System.out.println("Please provide an age as a command-line argument.");
                return;
            }
            String user_input = args[0];
            System.out.println("User input: " + user_input);
            try {
                int age = Integer.parseInt(user_input);
                System.out.println("Parsed age: " + age);
                String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior Citizen";
                System.out.println("Classification: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a numeric age.");
            }
        }
    }

