import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("How many numbers do you want to enter?: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            System.out.println("\nArray sorted in ascending order:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

            sc.close();
        }
    }
}
