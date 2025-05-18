/*  Write a program where a student’s marks are input, and the program assigns grades based on these conditions:
- Marks >= 90 → Grade A
- Marks >= 80 → Grade B
- Marks >= 70 → Grade C
- Marks < 70 → Fail
 */

package ex_08_If_condition;

import java.util.Scanner;

public class Lab081_IF_Else_Scanner_01 {
    public static void main(String[] args) {
       System.out.println("Enter the marks: ");
       Scanner scanner = new Scanner(System.in);
       int Marks = scanner.nextInt();

        if (Marks >= 90){
            System.out.println("Grade A");
        } else if
        (Marks>=80) {
            System.out.println("Grade B");
        } else if
        (Marks>=70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    scanner.close();
    }
}
