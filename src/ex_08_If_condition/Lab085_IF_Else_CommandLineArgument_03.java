//Write a program that takes two integers as command-line arguments and
// prints their sum.

package ex_08_If_condition;

public class Lab085_IF_Else_CommandLineArgument_03 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = a + b;
        System.out.println("sum of two arguments = " + c);

    }
}
