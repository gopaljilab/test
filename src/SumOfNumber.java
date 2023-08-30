                // Question - 2 : Sum of two Numbers
                //  with the help of three variables
    import java.util.Scanner;

    public class SumOfNumber {
    public static void main(String[] args) {
        int a , b  , c ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number : ");
        // Input Two Numbers with the help of Scanner Class
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b ;  // Assign tha sum of Two values (a and b) to C
        System.out.println("Sum of " + a + " and " + b + " is " +c);
    }
}
