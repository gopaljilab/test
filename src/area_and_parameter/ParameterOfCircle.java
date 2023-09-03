package area_and_parameter;

import java.text.NumberFormat;
import java.util.Scanner;
                            // Factory method
public class ParameterOfCircle {
    public static void main(String[] args) {
        final double PI = (double)22/7;
        double radius,parameter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle : ");
        radius = sc.nextDouble();
        parameter = 2 * PI * radius;
        System.out.println("Parameter Of Circle : " + parameter);
        NumberFormat obj = NumberFormat.getNumberInstance();     // Factory method of Numberformat class
        obj.setMaximumFractionDigits(2);
        obj.setMinimumIntegerDigits(7);
        String str = obj.format(parameter);
        System.out.println("After Formatting the Digit and fractional : " +str);
    }
}
