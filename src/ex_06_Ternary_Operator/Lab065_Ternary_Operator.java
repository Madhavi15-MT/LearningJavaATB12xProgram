//max between two integers

package ex_06_Ternary_Operator;

public class Lab065_Ternary_Operator {
    public static void main(String[] args) {
        int a= -1;
        int b = -2;
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
        String c = a>b? "a is greatest" : "b is greater";
        String d = a<b? "a is smallest" : "b is greatest";
        System.out.println(c);
        System.out.printf(d);
            }
}
