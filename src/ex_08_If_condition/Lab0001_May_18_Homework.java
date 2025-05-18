package ex_08_If_condition;

import java.util.Scanner;

public class Lab0001_May_18_Homework {
    public static void main(String[] args) {
        System.out.println("Enter side 1 length:");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        System.out.println("Enter side 2 length:");
        int n2 = scanner.nextInt();
        System.out.println("Enter side 3 length:");
        int n3 = scanner.nextInt();
        if (n1==n2 && n2==n3) {
            System.out.println("Its a equilateral triangle");
        }else if (n1!=n2 && n2!=n3 && n3!=n1) {
            System.out.println("Its a scalene triangle");
        }else{
            System.out.println("Its an Isosceles triangle");
        }


        }

        }


