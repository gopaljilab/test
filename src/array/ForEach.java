package array;/*Print Array Elements With the help of For Each loop*/

public class ForEach {
    public static void main(String[] args) {
        int [] arr = {20,30,50,70,80};
        System.out.println("Print the Array element : ");
        for (int element : arr)     // Create a new variable and Store the Elements in it.
             {
                 System.out.println(element);
             }
    }
}
