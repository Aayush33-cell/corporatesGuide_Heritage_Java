public class EmployeeSummary {
    public static void main(String[] args) {

        // Employee 1
        String name1 = "  Aayush Tiwary  ";
        int id1 = 1001;
        double salary1 = 75000.99;
        String dept1 = "Finance";
        boolean active1 = true;

        // Employee 2
        String name2 = "Pankaj Kumar";
        int id2 = 1002;
        double salary2 = 68000.50;
        String dept2 = "HR";
        boolean active2 = true;

        // Employee 3
        String name3 = "Harish Rai";
        int id3 = 1003;
        double salary3 = 82000.75;
        String dept3 = "IT";
        boolean active3 = false;

        // Employee 4
        String name4 = "Amitaab Banarjee";
        int id4 = 1004;
        double salary4 = 59000.25;
        String dept4 = "Marketing";
        boolean active4 = true;

        // Employee 5
        String name5 = "Khushboo Kumari";
        int id5 = 1005;
        double salary5 = 91000.80;
        String dept5 = "Operations";
        boolean active5 = true;

        // ===== Casting Operations =====

        // Narrow Casting: double -> int
        int salaryRounded = (int) salary1;

        // Widening Casting: int -> double
        double employeeIdAsDouble = id1;

        // ===== String Methods =====

        String cleanName = name1.trim();           // trim()
        String upperName = cleanName.toUpperCase(); // toUpperCase()
        String lowerDept = dept1.toLowerCase();     // toLowerCase()
        int nameLength = cleanName.length();        // length()

        // ===== Ternary Operator =====

        String performance1 = salary1 >= 70000 ? "Excellent" : "Good";
        String performance2 = salary2 >= 70000 ? "Excellent" : "Good";
        String performance3 = salary3 >= 70000 ? "Excellent" : "Good";
        String performance4 = salary4 >= 70000 ? "Excellent" : "Good";
        String performance5 = salary5 >= 70000 ? "Excellent" : "Good";

        // ===== Corporate Report =====

        System.out.println("==============================================");
        System.out.println("         EMPLOYEE SUMMARY REPORT");
        System.out.println("==============================================");

        System.out.println("ID: " + id1 +
                " | Name: " + cleanName +
                " | Dept: " + dept1 +
                " | Salary: ₹" + salary1 +
                " | Active: " + active1 +
                " | Rating: " + performance1);

        System.out.println("ID: " + id2 +
                " | Name: " + name2 +
                " | Dept: " + dept2 +
                " | Salary: ₹" + salary2 +
                " | Active: " + active2 +
                " | Rating: " + performance2);

        System.out.println("ID: " + id3 +
                " | Name: " + name3 +
                " | Dept: " + dept3 +
                " | Salary: ₹" + salary3 +
                " | Active: " + active3 +
                " | Rating: " + performance3);

        System.out.println("ID: " + id4 +
                " | Name: " + name4 +
                " | Dept: " + dept4 +
                " | Salary: ₹" + salary4 +
                " | Active: " + active4 +
                " | Rating: " + performance4);

        System.out.println("ID: " + id5 +
                " | Name: " + name5 +
                " | Dept: " + dept5 +
                " | Salary: ₹" + salary5 +
                " | Active: " + active5 +
                " | Rating: " + performance5);

        System.out.println("\n===== Demonstration Section =====");
        System.out.println("Trimmed Name      : " + cleanName);
        System.out.println("Uppercase Name    : " + upperName);
        System.out.println("Lowercase Dept    : " + lowerDept);
        System.out.println("Name Length       : " + nameLength);

        System.out.println("\n===== Casting Results =====");
        System.out.println("Salary as int     : " + salaryRounded);
        System.out.println("ID as double      : " + employeeIdAsDouble);
    }
}