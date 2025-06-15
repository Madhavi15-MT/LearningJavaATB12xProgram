package Exceptions;

public class Try_Catch_03 {
    public static void main(String[] args) {
        try{
            int a = 10;
            int result = a/0;
        } catch(ArithmeticException e) {
            System.out.println("Cannot be Divisible");
        } catch(NullPointerException e) {
            System.out.println("Cannot be Null");
        } catch (Exception e) {
            System.out.println("General exception handle");
        }
    }
}
