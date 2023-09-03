/* Ques. - Display Star in Triangular Form */
import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number which you want to print in : ");
        int n = sc.nextInt();
        System.out.println("Print your star Pattern : ");
        for (int i=0 ; i <= n ;i++ )   /* This For is represented as a Rows */
        {
            for (int j=0 ; j<=i ; j++)   /* This For is represented as a Columns */
            {
                System.out.print(" *");
            }
            System.out.println();    /* This Statement is used to New Line */
        }
    }
}
