class Person1 {
    // instance variables
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    // mutator methods to store the data
    public void setAge(int age) {
        this.age = age;
    }
    // access methods to read the data
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class ThisDemo {
    public static void main(String[] args) {
       Person1 p1 =  new Person1();
       p1.setName("Enia");         // store some data into objects
       Person1 p2 = new Person1();
       p2.setAge(17);
        System.out.println("Name : " + p1.getName());
        System.out.println("Age : " + p2.getAge());

    }
}
