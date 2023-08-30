/*Sum of three No. by calling a method*/

import java.util.Scanner;

public class SimpleMethod {
    static   int a ,b , c;
    public void display ()
    {
        System.out.println("The sum of 3 numbers is : " +(a+b+c));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        //Create a object for calling the Method
        SimpleMethod d = new SimpleMethod();

        /* calling the display method() */
        d.display();
    }
}
