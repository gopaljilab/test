import java.util.Scanner;

public class Greeting {
    static int time ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Time in [ 24 Format] : ");
        time = sc.nextInt();
        Greeting g = new Greeting();
    }
        public Greeting () {
        if (time >= 5 && time < 12) {
            System.out.println("Good Morning !");
        }
        if (time >= 16 && time < 19) {
            System.out.println("Good Evening !");
        }
        if (time >= 12 && time < 16) {
                System.out.println("Good AfterNoon !");
        }
        if (time >= 18 && time < 24) {
            System.out.println("Good Night");
        }
    }
}
