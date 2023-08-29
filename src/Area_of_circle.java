import java.util.Scanner;

public class Area_of_circle {
    static double area, pi = 3.14, radius;

    public static void calculate() {
        area = pi * radius * radius;
        System.out.print(area);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius Of Circle : ");
        radius = sc.nextDouble();
        System.out.println("The area of Circle is ");
        calculate();
    }
}
