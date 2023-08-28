import java.util.Scanner;

public class Week_days {
    public static void main(String[] args) {
        int ch ;
        /*Taking Input the number of a days*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day No. = ");
        ch = sc.nextInt();
        System.out.println("The day name is ");
       /* it'll check if the case correct it'll print that case statement either print default */
        switch (ch) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Nothing");
                System.out.println("Because It's not a Day No. ");
        }
    }
}
