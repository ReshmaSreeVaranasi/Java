package javacore;

// Encapsulation
class Book {
    private int bookId;
    private String bookName;
    private String author;
    private int price;

    // Default constructor
    Book() {
        bookId = 123;
        bookName = "Malgudi Days";
        author = "RkNarayan";
        price = 299;
    }

    // Parameterized constructor
    Book(int bookId, String bookName, String author, int price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    // Getters
    int getBookId() {
        return bookId;
    }

    String getBookName() {
        return bookName;
    }

    String getAuthor() {
        return author;
    }

    int getPrice() {
        return price;
    }

    // Setters
    void setBookId(int bookId) {
        this.bookId = bookId;
    }

    void setBookname(String bookName) {
        this.bookName = bookName;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setPrice(int price) {
        this.price = price;
    }

    void displayBook() {
        System.out.println("Book Id: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// Parent class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Inheritance
class Student extends Person {
    int rollNo;

    Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    void displayStudent() {
        displayPerson();
        System.out.println("Roll no: " + rollNo);
    }
}

// Inheritance
class Faculty extends Person {
    String subject;

    Faculty(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayFaculty() {
        displayPerson();
        System.out.println("Sub: " + subject);
    }
}

// Method Overloading
class Area {

    // Square
    int calculateArea(int side) {
        return side * side;
    }

    // Rectangle
    int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    // Circle
    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }
}

// Parent class
class Vehicle {
    void display() {
        System.out.println("This is a vehicle");
    }
}

// Method Overriding
class Car extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a car");
    }
}

// Method Overriding
class Bike extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a bike");
    }
}

// Abstraction
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Draw circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Draw rectangle");
    }
}

// Interface
interface Printable {
    void print();
}

class Report implements Printable {
    @Override
    public void print() {
        System.out.println("Printing Report");
    }
}

// Main class
public class LibMangSys {

    public static void main(String[] args) {

        // Constructors and Encapsulation
        System.out.println("Book Details");

        Book b1 = new Book();
        Book b2 = new Book(108, "Life", "Thomas", 500);

        b1.displayBook();

        System.out.println();

        b2.displayBook();

        // Inheritance
        System.out.println("Inheritance");

        Student s = new Student("Ram", 20, 18);
        s.displayStudent();

        System.out.println();

        Faculty f = new Faculty("Ramesh", 38, "Maths");
        f.displayFaculty();

        // Method Overloading
        System.out.println("Overloading");

        Area a = new Area();

        System.out.println("Area Square: " + a.calculateArea(4));
        System.out.println("Area Rectangle: " + a.calculateArea(5, 6));
        System.out.println("Area Circle: " + a.calculateArea(9.0));

        // Method Overriding
        System.out.println("Overriding");

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.display();
        v2.display();

        // Abstraction
        System.out.println("Abstraction");

        Shape c = new Circle();
        Shape r = new Rectangle();

        c.draw();
        r.draw();

        // Interface
        System.out.println("Interface");

        Report re = new Report();
        re.print();
    }
}
Book Details
Book Id: 123
Book Name: Malgudi Days
Author: RkNarayan
Price: 299

Book Id: 108
Book Name: Life
Author: Thomas
Price: 500
Inheritance
Name: Ram
Age: 20
Roll no: 18

Name: Ramesh
Age: 38
Sub: Maths
Overloading
Area Square: 16
Area Rectangle: 30
Area Circle: 254.34
Overriding
This is a car
This is a bike
Abstraction
Draw circle
Draw rectangle
Interface
Printing Report
