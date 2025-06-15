package Exceptions;

public class Try_Catch_02 {
    public static void main(String[] args) {
        int num = Integer.parseInt("abc"); // This will cause an exception
        System.out.println("Number: " + num);
    }

}