import java.util.Scanner;

public class NamesAndAgesReport {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] ages = new int[5];
            String[] names = new String[5];

            for (int i = 0; i < 5; i++) {

                while (true) {
                    System.out.print("Enter the name of person " + (i + 1) + ": ");
                    names[i] = sc.nextLine().trim();

                    if (names[i].isEmpty()) {
                        System.out.println("Name cannot be empty.");
                    } else {
                        break;
                    }
                }

                while (true) {
                    System.out.print("Enter the age of " + names[i] + ": ");

                    if (sc.hasNextInt()) {
                        ages[i] = sc.nextInt();
                        sc.nextLine();

                        if (ages[i] < 0 || ages[i] > 120) {
                            System.out.println("Age must be between 0 and 120.");
                        } else {
                            break;
                        }
                    } else {
                        System.out.println("Invalid input. Please enter numbers only.");
                        sc.nextLine();
                    }
                }
            }

            for (int i = 0; i < ages.length - 1; i++) {
                for (int j = 0; j < ages.length - 1 - i; j++) {
                    if (ages[j] > ages[j + 1]) {
                        int tempA = ages[j];
                        ages[j] = ages[j + 1];
                        ages[j + 1] = tempA;

                        String tempN = names[j];
                        names[j] = names[j + 1];
                        names[j + 1] = tempN;
                    }
                }
            }

            System.out.println("\n+-----------------+------+");
            System.out.println("|      NAME       | AGE  |");
            System.out.println("+-----------------+------+");

            for (int i = 0; i < 5; i++) {
                System.out.printf("| %-15s | %4d |\n", names[i], ages[i]);
                System.out.println("+-----------------+------+");
            }

            sc.close();
        }
    }
}
