import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character : "); // Input a Character
        char ch = sc.next().charAt(0);
        System.out.println((int)ch);  // Convert into Integer with Cast Operator
    }
}
