import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        int time;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Time in [ 24 Format] : ");
        time = sc.nextInt();
        if(time >= 5 && time <= 12)
        {
            System.out.println("Good Morning !");
        }
        if(time >= 12 && time <= 18)
        {
            System.out.println("Good Evening !");
        }
        if(time >= 18 && time <= 24)
        {
            System.out.println("Good Night");
        }
    }
}
