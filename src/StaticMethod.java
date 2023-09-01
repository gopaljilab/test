class test {
     static int x;
     // parameterized constructor
     test(int x){
         test.x = x;
     }
     // static  method
     static void access(){
         System.out.println("x : " + x);
     }
}
public class StaticMethod {
    public static void main(String[] args) {
        test obj = new test(12);
        test.access();  // call access() method

    }
}
