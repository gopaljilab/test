import java.util.Scanner;

// Question - 7  : Print Natural Numbers by Input in For Loop

public class Natural_num {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many Natural Number you want To Print : ");
        n = sc.nextInt();
        System.out.println("Natural Numbers : ");
        for (int i = 1; i <= n; i++) {
            System.out.println(+i);
        }
    }
}
