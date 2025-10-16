import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();

            int[] original = new int[n];
            int[] copy = new int[n];

            System.out.println("\n--- Enter the elements ---");
            for (int i = 0; i < n; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                original[i] = sc.nextInt();
            }

            // Copy elements manually
            for (int i = 0; i < n; i++) {
                copy[i] = original[i];
            }

            System.out.println("\nOriginal array:");
            for (int i = 0; i < n; i++) {
                System.out.print(original[i] + " ");
            }

            System.out.println("\nCopied array:");
            for (int i = 0; i < n; i++) {
                System.out.print(copy[i] + " ");
            }

            sc.close();
        }
    }
}
