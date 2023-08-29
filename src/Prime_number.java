import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args)
    {
        int i,flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        if (num == 0 || num == 1) {
            flag = 1;
        }
            for ( i=2 ; i <= num /2 ; i++)
            {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
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
