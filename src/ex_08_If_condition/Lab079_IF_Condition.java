//Write a program to check whether a given year is a leap year
// or not using if conditions.

package ex_08_If_condition;

import java.util.Scanner;

public class Lab079_IF_Condition {
    public static void main(String[] args) {
        System.out.println("Enter the year:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year%4==0){
            System.out.println(year + " is a LeapYear!");
        } else{
            System.out.println(year + " is not a Leap year!");
        }


    }

}
//Scanner scanner = new Scanner(System.in);
//int n1 = scanner.nextInt();