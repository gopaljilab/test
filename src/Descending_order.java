/*Print Descending order of a number*/
import java.util.Scanner;

public class Descending_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     /*take Input*/
        System.out.println("Enter a number u want to Descending order = ");
        int n = sc.nextInt();
        System.out.println("----  Descending-order " +n+ " to 1 -------");
                /*Check the condition if it's less than 0 break the statement */
        for (int i = n ; i >= 0 ; i-- )
        {
            System.out.print("  " + i);
        }
    }
}
