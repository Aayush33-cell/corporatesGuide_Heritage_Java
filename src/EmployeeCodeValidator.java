public class EmployeeCodeValidator {
    public static boolean validateEmployeeCode(String empCode) {
        // Check if code starts with "EMP"
        boolean startsCorrectly = empCode.startsWith("EMP");
        // Check if it contains a department code
        boolean containsDepartment =
                empCode.contains("FIN") ||
                        empCode.contains("HR") ||
                        empCode.contains("IT") ||
                        empCode.contains("MKT");

        // Check if it ends with a 4-digit number
        String lastFour = empCode.substring(empCode.length() - 4);
        boolean endsWithFourDigits = lastFour.matches("\\d{4}");

        return startsCorrectly && containsDepartment && endsWithFourDigits;
    }

    public static void main(String[] args) {

        String code1 = "EMP-FIN-2042";
        String code2 = "EMP-IT-1234";
        String code3 = "EMP-HR-12A4";

        System.out.println(code1 + " : " + validateEmployeeCode(code1));
        System.out.println(code2 + " : " + validateEmployeeCode(code2));
        System.out.println(code3 + " : " + validateEmployeeCode(code3));
    }
}