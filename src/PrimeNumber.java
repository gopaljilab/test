import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args)
    {
        int i,flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        // 0 and 1 are not prime numbers
        // change flag to 1 for non - prime number
        if (num == 0 || num == 1) {
            flag = 1;
        }
            // a number is divisible by only half itself
            for ( i=2 ; i <= num /2 ; i++)
            {
                // if the number divisible by i , then number is not prime
                // change the flag to 1 for non - prime number
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
            // flag is 0 for prime number
        if (flag == 0)
        {
            System.out.println(num + " is a Prime Number. ");
        }
        else
        {
            System.out.println(num + " is Not a Prime Number. ");
        }
    }
}
