import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] edades = new int[5];
        String[] nombres = new String[5];


        for (int i = 0; i < 5; i++) {

            while (true) {
                System.out.print("Ingresa el nombre de la persona " + (i + 1) + ": ");
                nombres[i] = sc.nextLine().trim();

                if (nombres[i].isEmpty()) {
                    System.out.println("El nombre no puede estar vacío.");
                } else {
                    break;
                }
            }


            while (true) {
                System.out.print("Ingresa la edad de " + nombres[i] + ": ");

                if (sc.hasNextInt()) {
                    edades[i] = sc.nextInt();
                    sc.nextLine(); 

                    if (edades[i] < 0 || edades[i] > 120) {
                        System.out.println("La edad debe estar entre 0 y 120.");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, ingresa solo números.");
                    sc.nextLine(); 
                }
            }
        }


        for (int i = 0; i < edades.length - 1; i++) {
            for (int j = 0; j < edades.length - 1 - i; j++) {
                if (edades[j] > edades[j + 1]) {

                    int tempE = edades[j];
                    edades[j] = edades[j + 1];
                    edades[j + 1] = tempE;

   
                    String tempN = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = tempN;
                }
            }
        }


        System.out.println("\n+-----------------+------+");
        System.out.println("|     NOMBRE      | EDAD |");
        System.out.println("+-----------------+------+");

        for (int i = 0; i < 5; i++) {
            System.out.printf("| %-15s | %4d |\n", nombres[i], edades[i]);
            System.out.println("+-----------------+------+");
        }

        sc.close();
    }
}
