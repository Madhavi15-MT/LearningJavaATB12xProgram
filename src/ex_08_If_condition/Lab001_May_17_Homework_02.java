package ex_08_If_condition;

public class Lab001_May_17_Homework_02 {
    public static void main(String[] args) {
        int a = 11, b=22, c;
        c = a + b + a++ + b++ + ++a + ++b;
        System.out.println("a=" + a); //13
        System.out.println("b=" + b); //24
        System.out.println("c=" + c); //103

    }

}