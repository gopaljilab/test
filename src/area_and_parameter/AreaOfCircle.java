package area_and_parameter;

import java.util.Scanner;

public class AreaOfCircle {
     static double area, radius;
     static final double PI = 3.14;
    public void calculate() {
        area = PI * radius * radius;
        System.out.print(area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius Of Circle : ");
        radius = sc.nextDouble();
        System.out.println("The area of Circle is ");
        AreaOfCircle ar = new AreaOfCircle();
         ar.calculate();
    }
}
