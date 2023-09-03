package diffrent_type_numbers;

import java.util.Scanner;

public class ArmStrongNumber {
    public int temp  ,remainder;
    static int num, sum=0;
    public void calculation()
    {
        temp = num;
        while(temp != 0)   // 153 != 0 --> 15 != 0 --> 1!=0 --> 0==0 break
        {
            remainder = temp % 10;    // 3 --> 5 --> 1
            sum = sum + remainder * remainder * remainder ;  // 0 + 3*3*3 = 27 --> 27 + 5*5*5 = 152 --> 152+1*1*1 = 153
            temp = temp / 10; // 153/10 = 15 --> 1 --> 0
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 Digit Number : "); // 153
        num = sc.nextInt();
        ArmStrongNumber arm = new ArmStrongNumber();     // create a object
        arm.calculation();
        if (sum == num)     // check the Sum Equal to Number or not ------> 153 == 153
        {
            System.out.println(num + " is An Armstrong Number.");
        }
        else
        {
            System.out.println(num + " is Not An Armstrong Number.");
        }
    }
}
