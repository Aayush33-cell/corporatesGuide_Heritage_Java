public class EmployeeCodeDemo {
    public static void main(String[] args) {

        String empCode = "EMP-FIN-2042";

        // Extract department name
        String department = empCode.substring(4, 7);

        // Extract employee number
        String employeeNumber = empCode.substring(8);

        // Extract first character
        char firstCharacter = empCode.charAt(0);

        System.out.println("Employee Code: " + empCode);
        System.out.println("Department: " + department);
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("First Character: " + firstCharacter);
    }
}