import java.util.Scanner;

public class CompararArreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del primer arreglo: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("\n--- Ingrese los elementos del primer arreglo ---");
        for (int i = 0; i < n1; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }

        System.out.print("\nIngrese la cantidad de elementos del segundo arreglo: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("\n--- Ingrese los elementos del segundo arreglo ---");
        for (int i = 0; i < n2; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arr2[i] = sc.nextInt();
        }

        boolean iguales = true;

        // Si los tamaños son distintos, ya sabemos que no son iguales
        if (n1 != n2) {
            iguales = false;
        } else {
            // Comparar elemento por elemento
            for (int i = 0; i < n1; i++) {
                if (arr1[i] != arr2[i]) {
                    iguales = false;
                    break;
                }
            }
        }

        if (iguales) {
            System.out.println("\nLos arreglos son iguales.");
        } else {
            System.out.println("\nLos arreglos son diferentes.");
        }
    }
}
