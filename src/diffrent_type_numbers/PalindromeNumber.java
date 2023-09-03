package diffrent_type_numbers;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int sum = 0, rem, num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        num = sc.nextInt();   // 313
        int temp = num;
        while (temp != 0) {     // 313!=0 --> 31!=0  --> 3!=0 --> 0==0 false BREAK
            rem = temp % 10;     // rem=3   --> rem=1 --> rem=3
            sum = (sum * 10) + rem; // sum = 0+3 = 3 --> 30+1=33 --> 313
            temp = temp / 10;   // temp = 31 --> 3 --> 0
        }
        if (sum == num)   // 313 == 313
        {
            System.out.println("This Number is palindrome Number.");
        }
        else
        {
            System.out.println("This Number is Not Palindrome Number.");
        }
    }
}
