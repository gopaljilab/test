/*
 Question 4 - Display a binary number in other Number Systems
 with Input a Number
*/
import java.util.Scanner;

public class Num_system {
    public static void main(String[] args) {
        int num ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        num = sc.nextInt();
        System.out.printf(" \n In Decimal = %d " , num);
        System.out.printf(" \n In Octal = %o " , num);
        System.out.printf(" \n In HexaDecimal = %x " , num);
        System.out.printf(" \n In Binary = %s " , Integer.toBinaryString(num));
    }
}
  // (/n) is used to swift cursor on Next line