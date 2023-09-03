import java.util.Scanner;

public class Factorial {
    public static void printFactorial(int num) {
        if (num <= 0) {                            // if Number less than equal to 0 then print ()
            System.out.println("Invalid Number !");
            return;
        }
        int factorial = 1;                  // start with 1
        for (int ch = num; ch >= 1; ch--) {           // check the condition
            factorial *= ch;
        }
        System.out.println("Factorial is " + factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        printFactorial(num);
    }
}
