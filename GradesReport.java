import java.util.Scanner;

public class GradesReport {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = 0;
            while (true) {
                System.out.print("How many students do you want to register?: ");
                if (sc.hasNextInt()) {
                    n = sc.nextInt();
                    sc.nextLine();
                    if (n > 0) break;
                    else System.out.println("Enter a number greater than 0.");
                } else {
                    System.out.println("Enter a valid number.");
                    sc.next();
                }
            }

            String[] students = new String[n];
            int[] age = new int[n];
            int[] grade = new int[n];
            int[] pc1 = new int[n];
            int[] pc2 = new int[n];
            int[] pc3 = new int[n];
            int[] ef = new int[n];

            System.out.println("\n=== STUDENT REGISTRATION ===");

            for (int i = 0; i < n; i++) {
                System.out.println("\nStudent " + (i + 1));

                while (true) {
                    System.out.print("Name: ");
                    students[i] = sc.nextLine().trim();
                    if (!students[i].isEmpty()) break;
                    else System.out.println("Name cannot be empty.");
                }

                while (true) {
                    System.out.print("Age of " + students[i] + ": ");
                    if (sc.hasNextInt()) {
                        age[i] = sc.nextInt();
                        sc.nextLine();
                        if (age[i] >= 5 && age[i] <= 100) break;
                        else System.out.println("Enter a valid age (5 - 100).");
                    } else {
                        System.out.println("Enter a valid number.");
                        sc.next();
                    }
                }

                while (true) {
                    System.out.print("Grade of " + students[i] + ": ");
                    if (sc.hasNextInt()) {
                        grade[i] = sc.nextInt();
                        sc.nextLine();
                        if (grade[i] >= 1 && grade[i] <= 6) break;
                        else System.out.println("Enter a valid grade (1 - 6).");
                    } else {
                        System.out.println("Enter a valid number.");
                        sc.next();
                    }
                }

                while (true) {
                    System.out.print("Score of PC1 for " + students[i] + ": ");
                    if (sc.hasNextInt()) {
                        pc1[i] = sc.nextInt();
                        sc.nextLine();
                        if (pc1[i] >= 0 && pc1[i] <= 20) break;
                        else System.out.println("Score out of range (0 - 20).");
                    } else {
                        System.out.println("Enter a valid number.");
                        sc.next();
                    }
                }

                while (true) {
                    System.out.print("Score of PC2 for " + students[i] + ": ");
                    if (sc.hasNextInt()) {
                        pc2[i] = sc.nextInt();
                        sc.nextLine();
                        if (pc2[i] >= 0 && pc2[i] <= 20) break;
                        else System.out.println("Score out of range (0 - 20).");
                    } else {
                        System.out.println("Enter a valid number.");
                        sc.next();
                    }
                }

                while (true) {
                    System.out.print("Score of PC3 for " + students[i] + ": ");
                    if (sc.hasNextInt()) {
                        pc3[i] = sc.nextInt();
                        sc.nextLine();
                        if (pc3[i] >= 0 && pc3[i] <= 20) break;
                        else System.out.println("Score out of range (0 - 20).");
                    } else {
                        System.out.println("Enter a valid number.");
                        sc.next();
                    }
                }

                while (true) {
                    System.out.print("Final Exam score (EF) for " + students[i] + ": ");
                    if (sc.hasNextInt()) {
                        ef[i] = sc.nextInt();
                        sc.nextLine();
                        if (ef[i] >= 0 && ef[i] <= 20) break;
                        else System.out.println("Score out of range (0 - 20).");
                    } else {
                        System.out.println("Enter a valid number.");
                        sc.next();
                    }
                }
            }

            double totalAverage = 0;
            StringBuilder table = new StringBuilder();
            table.append("====================================================================\n");
            table.append(String.format("%-25s %-5s %-5s %-5s %-5s %-5s %-5s %-5s\n",
                    "Name", "Age", "Grade", "PC1", "PC2", "PC3", "EF", "AVG"));
            table.append("====================================================================\n");

            for (int i = 0; i < n; i++) {
                double average = (pc1[i] + pc2[i] + pc3[i] + ef[i]) / 4.0;
                totalAverage += average;
                table.append(String.format("%-25s %-5d %-5d %-5d %-5d %-5d %-5d %-5.2f\n",
                        students[i], age[i], grade[i], pc1[i], pc2[i], pc3[i], ef[i], average));
            }

            table.append("====================================================================\n");
            double generalAverage = totalAverage / n;
            table.append(String.format("General Average: %50.2f\n", generalAverage));
            table.append("====================================================================\n");

            System.out.println(table.toString());
        }
    }
}
