public class Person {
     private String Name;
     private int Age;
     private char Gender;

     public int getAge() {
         return Age;
     }
     public void setAge(int newAge) {
         Age = newAge;
     }
     public char getGender() {
         return Gender;
     }
     public void setGender(char newGender) {
         Gender = newGender;
     }
     public String getName() {
         return Name;
     }
     public void setName(String newName) {
         Name = newName;
     }
     public static void main(String[] args) {
         Person details = new Person();
         details.setName("Raj");
         details.setGender('M');
         details.setAge(16);
         System.out.println(details.getName() + " : " + details.getAge() + " : " +details.getGender());
     }
}



