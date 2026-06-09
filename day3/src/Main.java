
class Student {
    int rollNumber;
    String name;
    double marks;

    static int studentCount = 0;

    // Default Constructor
    Student() {
        rollNumber = 0;
        name = "Unknown";
        marks = 0.0;
        studentCount++;
    }

    // Parameterized Constructor
    Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
        studentCount++;
    }

    // Display Method
    void display() {
        char grade;

        if (marks >= 80)
            grade = 'A';
        else if (marks >= 60)
            grade = 'B';
        else if (marks >= 40)
            grade = 'C';
        else
            grade = 'F';

        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

public class Main{
    public static void main(String[] args) {

        Student s1 = new Student(); // Default constructor
        Student s2 = new Student(101, "Aayush", 85.5);
        Student s3 = new Student(102, "Rahul", 67.0);

        s1.display();
        s2.display();
        s3.display();

        System.out.println("Total Students = " + Student.studentCount);
    }
}
