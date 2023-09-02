import java.util.Scanner;

class Check{
    void swap(Employee obj){
        int temp;
        temp = obj.x;
        obj.x = obj.y;
        obj.y = temp;
        System.out.println("data interchanged");
    }
}
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Check obj = new Check();
        Employee obj1 = new Employee(10,20);
        System.out.println("x : " + obj1.x +" and y : " + obj1.y);
        obj.swap(obj1);
        System.out.println("x : " + obj1.x +" and y : " + obj1.y);
    }
}
class Employee{
    int x,y;
    public Employee(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
