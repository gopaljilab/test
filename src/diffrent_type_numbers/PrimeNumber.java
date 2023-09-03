package diffrent_type_numbers;

import java.util.Scanner;

public class PrimeNumber {
    static int i,num;

    public static void calculation()
    {
        boolean isPrime = true;
        // 0 and 1 are not prime numbers
        // change isPrime to false for non - prime number
        if (num == 0 || num == 1) {
            isPrime = false;
        }
        for (i = 2; i * i < num; i++)
        {
            // if the number divisible by i , then number is not prime
            // change the isPrime to false for non - prime number
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        // flag is 0 for prime number
        if (isPrime)
        {
            System.out.println(num + " is a Prime Number.");
        }
        else
        {
            System.out.println(num + " is Not a Prime Number.");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        num = sc.nextInt();
        calculation();

    }
}
