import java.util.Scanner;

public class Hollow_rectangle {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter rows , column of hollow rectangle ? ");
        System.out.println("Enter Rows : ");
        int n = sc.nextInt();
        System.out.println("Enter Columns : ");
        int m = sc.nextInt();
        System.out.println("Print " +m+ " * " +n+ " hollow Rectangle");
        for (i=1 ; i<=n ; i++)
        {
         for (j=1 ; j<=m ; j++)
         {
             if(i==1 || j==1 || i==n || j==m) {
                 System.out.print("*");
             }
              else
             {
                 System.out.print(" ");
             }
         }
            System.out.println();
        }
    }
}
