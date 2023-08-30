import java.util.Scanner;
                    // Question-4 : input a byte  to convert other bitwise operators
public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Byte : ");
        byte a = sc.nextByte();
        byte b = sc.nextByte();

        System.out.println("~a is " + (~ a));         // complement
        System.out.println("a & b is " + (a & b));    // AND
        System.out.println("a | b is " + (a | b));    // OR
        System.out.println("a ^ b is " + (a ^ b));    // XOR
        System.out.println("x << 2 is " + (a<<2));    // Left Shift
        System.out.println("x >> 2 is " + (a>>2));    // Right Shift
        System.out.println("x >>> 2 is " + (a>>>2));  // Zero fill Right Shift
    }
}
