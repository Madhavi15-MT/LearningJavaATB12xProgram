//Using Command line prompt - File - Edit configuration
package ex_08_If_condition;

public class Lab083_IF_Else_CommandLineArgument_01 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age > 25){
            System.out.println("Yes you can go to GOA!");
        }else {
            System.out.println("You can't Go to GOA!!");
        }

    }
}
