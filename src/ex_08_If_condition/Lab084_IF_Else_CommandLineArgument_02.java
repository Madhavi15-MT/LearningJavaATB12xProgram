//Write a Java program that prints all command-line arguments given by the user.
package ex_08_If_condition;

public class Lab084_IF_Else_CommandLineArgument_02 {
     public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments were given!");
        } else {
            System.out.println("Command-Line Arguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}

