package Exceptions;

public class Try_Catch_01 {
    public static void main(String[] args) {
        try{
            int a = 10;
            int result = a/0;
            System.out.println("Print a/10="+ result);
        } catch (ArithmeticException e){
            System.out.println("Cannot be divisible");
        }
        finally {
            System.out.println("Garbage clear");
        }
    }
}
