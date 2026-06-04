public class EmployeeStringDemo {
    public static void main(String[] args) {
        // String variables
        String employeeName = "Aayush Tiwary";
        String department = "CSE";
        String email = "aayushtiwary33@example.com";

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department: " + department);
        System.out.println("Email: " + email);

        // String comparison
        String str1 = new String("Employee");
        String str2 = new String("Employee");

        // Using ==
        System.out.println("\nUsing == : " + (str1 == str2));

        // Using .equals()
        System.out.println("Using .equals() : " + str1.equals(str2));
    }
}