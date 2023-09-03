package array;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows , Column ?");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter Elements of Matrix :");
        int [][] arr = new int [r][c];
        for (int i=0 ; i < r ; i++)  // rows
        {
            for (int j = 0; j < c; j++)  // column
            {
                arr [i][j] = sc.nextInt();
            }
        }
        System.out.println("Print the Matrix");
        for (int i=0 ; i < r ; i++)  // rows
        {
            for (int j=0 ; j < c; j++)  // column
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
