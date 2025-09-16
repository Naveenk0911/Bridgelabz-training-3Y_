package Constructors.Access_Modifi;


public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String teamName;

    Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    void displayManager() {
        System.out.println("Manager ID: " + employeeID);     // public → accessible
        System.out.println("Department: " + department);     // protected → accessible in subclass
        System.out.println("Team: " + teamName);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "HR", 40000);
        e1.displayEmployee();

        e1.setSalary(45000);
        System.out.println("Updated Salary: " + e1.getSalary());

        Manager m1 = new Manager(201, "IT", 70000, "Development Team");
        m1.displayManager();
    }
}