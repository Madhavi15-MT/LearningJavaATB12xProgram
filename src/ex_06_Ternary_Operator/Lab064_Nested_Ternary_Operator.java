package ex_06_Ternary_Operator;

import java.util.Scanner;

public class Lab064_Nested_Ternary_Operator {
    public static void main(String[] args) {
        System.out.println("Enter age: ");
        Scanner scanner = new Scanner(System.in);
        int Age = scanner.nextInt();
        String output = (Age >= 18 )? (Age >=25 ? "Eligible to vote": "Eligible not to vote") : "Still Minor to vote";
        System.out.println(output);
    }
}
;
