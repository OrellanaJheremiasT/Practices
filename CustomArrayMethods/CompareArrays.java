import java.util.Scanner;

public class CompareArrays {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements for the first array: ");
            int n1 = sc.nextInt();
            int[] arr1 = new int[n1];

            System.out.println("\n--- Enter the elements of the first array ---");
            for (int i = 0; i < n1; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                arr1[i] = sc.nextInt();
            }

            System.out.print("\nEnter the number of elements for the second array: ");
            int n2 = sc.nextInt();
            int[] arr2 = new int[n2];

            System.out.println("\n--- Enter the elements of the second array ---");
            for (int i = 0; i < n2; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                arr2[i] = sc.nextInt();
            }

            boolean equal = true;

            if (n1 != n2) {
                equal = false;
            } else {
                for (int i = 0; i < n1; i++) {
                    if (arr1[i] != arr2[i]) {
                        equal = false;
                        break;
                    }
                }
            }

            if (equal) {
                System.out.println("\nThe arrays are equal.");
            } else {
                System.out.println("\nThe arrays are different.");
            }
        }
    }
}
