package ex_06_Ternary_Operator;

import java.util.Scanner;

public class Lab063_Ternary_Operator {
    public static void main(String[] args) {
        System.out.println("Enter age:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String toVote = age >=18 ? "You can vote" : "You can't vote";
        System.out.println(toVote);

    }
}
