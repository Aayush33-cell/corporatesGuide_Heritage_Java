import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;
        int max;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        max = arr[0];

        for (int i = 1; i < 5; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Maximum Element = " + max);
    }
}