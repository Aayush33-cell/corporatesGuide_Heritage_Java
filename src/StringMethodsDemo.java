public class StringMethodsDemo {
    public static void main(String[] args) {

        String name = "  John Doe  ";

        System.out.println("Original String: \"" + name + "\"");

        System.out.println("After trim(): \"" + name.trim() + "\"");
        System.out.println("After toUpperCase(): " + name.toUpperCase());
        System.out.println("After toLowerCase(): " + name.toLowerCase());
        System.out.println("Length of original String: " + name.length());
        System.out.println("Length after trim(): " + name.trim().length());
    }
}