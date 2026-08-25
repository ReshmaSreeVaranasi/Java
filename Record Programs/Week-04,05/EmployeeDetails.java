package javacore;

class Employee {
    String name;
    int id;
    String designation;
    double salary;
    String promotionStatus;

    // Default constructor
    Employee() {
        name = "Ramesh";
        id = 99;
        designation = "Manager";
        salary = 50000;
        promotionStatus = "Yes";
    }

    // Parameterized constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        designation = "Asst Manager";
        salary = 40000;
        promotionStatus = "Yes";
    }

    // Parameterized constructor
    Employee(String name, int id, String designation,
             double salary, String promotionStatus) {

        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    // Display employee details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Promotion Status: " + promotionStatus);
        System.out.println();
    }
}

public class EmployeeDetails {

    public static void main(String[] args) {

        // Using default constructor
        Employee e1 = new Employee();

        // Using parameterized constructor with 2 parameters
        Employee e2 = new Employee("Lalitha", 101);

        // Using parameterized constructor with 5 parameters
        Employee e3 = new Employee(
                "Anil", 102, "Manager", 50000, "Promoted"
        );

        // Display details
        e1.display();
        e2.display();
        e3.display();
    }
}

Name: Ramesh
ID: 99
Designation: Manager
Salary: 50000.0
Promotion Status: Yes

Name: Lalitha
ID: 101
Designation: Asst Manager
Salary: 40000.0
Promotion Status: Yes

Name: Anil
ID: 102
Designation: Manager
Salary: 50000.0
Promotion Status: Promoted
