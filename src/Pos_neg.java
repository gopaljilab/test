                // Question - 5 : Check the Number it Positive or Negative

import java.util.Scanner;

public class Pos_neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number Which you want to check is it Positive or negative = ");
        int num = sc.nextInt();
        if (num>0)      // if the num is greater than 0 PRINT Positive Else PRINT Negative
        {
            System.out.println(num + " is a Positive Number ");
        }
        else
        {
            System.out.println(num + " is a Negative Number ");
        }
    }
}
