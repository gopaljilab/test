                // Question - 2 : Sum of two Numbers
                //  with the help of three variables
    import java.util.Scanner;

    public class SumOfNumber {
        public static int calculateSum(int a, int b)
        {
            int sum = a + b ;  // Assign tha sum of Two values (a and b) to sum
            return sum;
        }
    public static void main(String[] args) {
        int a , b  , c ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number : ");
        // Input Two Numbers with the help of Scanner Class
        a = sc.nextInt();
        b = sc.nextInt();
        int sum = calculateSum(a,b);
        System.out.println("Sum of Two Numbers : " + sum);
    }
}
