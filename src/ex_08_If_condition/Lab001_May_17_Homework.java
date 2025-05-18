package ex_08_If_condition;

public class Lab001_May_17_Homework {
    public static void main(String[] args) {
       // What will be the output of the following code?
        int i = 11;
        i = i++ + ++i; //i=11, i++ -> i=12, ++i=12+1 = 13 -> 11+13 = 24

        System.out.println(i);
    }
}
