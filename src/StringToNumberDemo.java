public class StringToNumberDemo {
    public static void main(String[] args) {

        // String values
        String ageStr = "21";
        String salaryStr = "45000.50";

        // Convert String to numeric types
        int age = Integer.parseInt(ageStr);
        double salary = Double.parseDouble(salaryStr);

        // Perform arithmetic operations
        int ageAfter5Years = age + 5;
        double annualSalary = salary * 12;

        // Display results
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        System.out.println("Age after 5 years: " + ageAfter5Years);
        System.out.println("Annual Salary: " + annualSalary);
    }
}