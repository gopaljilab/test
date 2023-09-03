package inheritance;

class Teacher {
    int id;
    String name;
    double sal;
    String address;
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    int getId() {
        return id;
    }
    void setId(int id) {
        this.id = id;
    }
    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
class Student extends Teacher {
    int marks;
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
}
