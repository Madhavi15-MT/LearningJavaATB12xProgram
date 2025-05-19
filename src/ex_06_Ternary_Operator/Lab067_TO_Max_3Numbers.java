package ex_06_Ternary_Operator;

public class Lab067_TO_Max_3Numbers {
    public static void main(String[] args) {
                int n1 = 10, n2 = 25, n3 = 15;
                int max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
                System.out.println("Maximum value: " + max);
            }
        }
