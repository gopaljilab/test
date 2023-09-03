package inheritance;

public class Print {
    Print (){
        Student s2 = new Student();
        System.out.println(" --------------- Teacher Details ---------------- ");
        s2.setName("Manu Jha");
        s2.setId(2673);
        s2.setSal(25000);
        s2.setAddress("Bengaluru City");
        System.out.println("ID : " + s2.getId());
        System.out.println("Name : " + s2.getName());
        System.out.println("Address : " + s2.getAddress());
        System.out.println("Marks : " + s2.getSal());

        Student s = new Student();
        s.setName("Gopal");
        s.setId(101);
        s.setMarks(563);
        s.setAddress("Bengaluru");
        System.out.println("-------------------- Student Details ---------------------- ! ");
        System.out.println("ID : " + s.getId());
        System.out.println("Name : " + s.getName());
        System.out.println("Address : " + s.getAddress());
        System.out.println("Marks : " + s.getMarks());

    }
}
