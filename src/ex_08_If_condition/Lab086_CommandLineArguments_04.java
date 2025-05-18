//Write a program that takes multiple numbers as arguments and finds the largest one.
package ex_08_If_condition;

public class Lab086_CommandLineArguments_04 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if(a>b && a>c){
            System.out.println("a="+ a + " is the greatest number");
        } else if (b>c && b>a) {
            System.out.println("b=" + b + " is the greatest number");
        } else {
            System.out.printf("c=" + c + " is the greatest number");
        }
    }
}
