package Constructors.Access_Modifi;

package constructors.Access_Modifiers;

public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    void displayPGStudent() {
        System.out.println("Postgraduate Student Name: " + name); // accessing protected member
        System.out.println("Specialization: " + specialization);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 8.5);
        s1.displayStudent();

        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        PostgraduateStudent pg = new PostgraduateStudent(201, "Bob", 8.0, "Computer Science");
        pg.displayPGStudent();
    }
}