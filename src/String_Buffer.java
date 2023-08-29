import java.util.Scanner;

public class String_Buffer {
    public static void main(String[] args) {
        // Create Empty String Buffer Object
        StringBuffer sb = new StringBuffer();
        // Input string
        Scanner sc = new Scanner(System.in);
        System.out.println("First Name : ");
        String first = sc.nextLine();
        // Accept Middle name
        System.out.println("Middle Name :");
        String middle = sc.nextLine();
        // Accept last Name
        System.out.println("Last Name : ");
        String Last = sc.nextLine();
        sb.append(first);
        sb.append(middle);
        sb.append(Last);
        System.out.println( "Name : " + first);
        System.out.println("Middle : " + middle);
        System.out.println("Last : "+ Last);
        System.out.println("Full Name : " + sb);
        System.out.println("Reverse : " + sb.reverse());
    }
}
