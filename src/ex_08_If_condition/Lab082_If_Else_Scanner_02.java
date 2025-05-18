//Take a number as input and determine whether it is positive, negative, or zero using an if-else ladder.
package ex_08_If_condition;

import java.util.Scanner;

public class Lab082_If_Else_Scanner_02 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        if(Number > 0){
            System.out.println(Number + " is a positive number");
        } else if (Number < 0) {
            System.out.println(Number + " is a negative number");
        } else {
            System.out.println(Number + " is a Zero");
        }
    }
}
