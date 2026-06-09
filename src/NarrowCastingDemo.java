public class NarrowCastingDemo {
    public static void main(String[] args) {

        // Double salary
        double salary = 75000.99;

        // Narrow casting: double -> int
        int salaryInt = (int) salary;

        System.out.println("Original Salary (double): " + salary);
        System.out.println("Salary after casting to int: " + salaryInt);

        // Float rating
        float rating = 4.8f;

        // Narrow casting: float -> int
        int ratingInt = (int) rating;

        System.out.println("\nOriginal Rating (float): " + rating);
        System.out.println("Rating after casting to int: " + ratingInt);
    }
}