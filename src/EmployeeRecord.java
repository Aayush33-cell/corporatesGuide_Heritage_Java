public class EmployeeRecord {
    public static void main(String[] args) {

        // Employee details
        String name = "Aayush Tiwary";
        double salary = 75000.0;
        String department = "IT";
        boolean isActive = true;

        // Performance score
        int performanceScore = 85;

        // Ternary operator
        String performanceLabel =
                (performanceScore >= 80) ? "Excellent" : "Needs Improvement";

        // One-line summary using string concatenation
        String summary = "Employee: " + name +
                ", Department: " + department +
                ", Salary: ₹" + salary +
                ", Active: " + isActive +
                ", Performance: " + performanceLabel;

        System.out.println(summary);
    }
}