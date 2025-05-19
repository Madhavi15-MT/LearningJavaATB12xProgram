package ex_06_Ternary_Operator;

import java.util.Scanner;

public class Lab062_Turnary_Operator {
    public static void main(String[] args) {
        //int age = 18;
        System.out.println("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String toVote = age >= 18 ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(toVote);
    }
}
