import java.util.Scanner;

public class String_Buffer {
    public static void main(String[] args) {
        // Create Empty String Buffer Object
        StringBuffer sb = new StringBuffer();
        // Input string
        Scanner sc = new Scanner(System.in);
        // Accept First Name
        System.out.println("First Name : ");
        String first = sc.nextLine();
        // Accept Middle name
        System.out.println("Middle Name :");
        String middle = sc.nextLine();
        // Accept last Name
        System.out.println("Last Name : ");
        String Last = sc.nextLine();

        sb.append(first); // first name
        sb.append(middle);  // first_name + Middle_name
        sb.append(Last);    // First_name + Middle_name + Last_name == Full_name

        System.out.println( "Name : " + first);
        System.out.println("Middle : " + middle);
        System.out.println("Last : "+ Last);
        System.out.println("Full Name : " + sb);    // connect all the strings
        System.out.println("Reverse : " + sb.reverse());   // reverse the strings
    }
}
