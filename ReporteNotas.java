import java.util.Scanner;

public class ReporteNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        while (true) {
            System.out.print("¿Cuántos estudiantes desea registrar?: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                sc.nextLine();
                if (n > 0) break;
                else System.out.println("Ingrese un número mayor que 0.");
            } else {
                System.out.println("Ingrese un número válido.");
                sc.next();
            }
        }

        String[] alumnos = new String[n];
        int[] edad = new int[n];
        int[] grado = new int[n];
        int[] pc1 = new int[n];
        int[] pc2 = new int[n];
        int[] pc3 = new int[n];
        int[] ef = new int[n];

        System.out.println("\n=== REGISTRO DE ESTUDIANTES ===");

        for (int i = 0; i < n; i++) {
            System.out.println("\nEstudiante " + (i + 1));

            while (true) {
                System.out.print("Nombre: ");
                alumnos[i] = sc.nextLine().trim();
                if (!alumnos[i].isEmpty()) break;
                else System.out.println("El nombre no puede estar vacío.");
            }

            while (true) {
                System.out.print("Edad de " + alumnos[i] + ": ");
                if (sc.hasNextInt()) {
                    edad[i] = sc.nextInt();
                    sc.nextLine();
                    if (edad[i] >= 5 && edad[i] <= 100) break;
                    else System.out.println("Ingrese una edad válida (5 - 100).");
                } else {
                    System.out.println("Ingrese un número válido.");
                    sc.next();
                }
            }

            while (true) {
                System.out.print("Grado de " + alumnos[i] + ": ");
                if (sc.hasNextInt()) {
                    grado[i] = sc.nextInt();
                    sc.nextLine();
                    if (grado[i] >= 1 && grado[i] <= 6) break;
                    else System.out.println("Ingrese un grado válido (1 - 6).");
                } else {
                    System.out.println("Ingrese un número válido.");
                    sc.next();
                }
            }

            while (true) {
                System.out.print("Nota de PC1 de " + alumnos[i] + ": ");
                if (sc.hasNextInt()) {
                    pc1[i] = sc.nextInt();
                    sc.nextLine();
                    if (pc1[i] >= 0 && pc1[i] <= 20) break;
                    else System.out.println("Nota fuera de rango (0 - 20).");
                } else {
                    System.out.println("Ingrese un número válido.");
                    sc.next();
                }
            }

            while (true) {
                System.out.print("Nota de PC2 de " + alumnos[i] + ": ");
                if (sc.hasNextInt()) {
                    pc2[i] = sc.nextInt();
                    sc.nextLine();
                    if (pc2[i] >= 0 && pc2[i] <= 20) break;
                    else System.out.println("Nota fuera de rango (0 - 20).");
                } else {
                    System.out.println("Ingrese un número válido.");
                    sc.next();
                }
            }

            while (true) {
                System.out.print("Nota de PC3 de " + alumnos[i] + ": ");
                if (sc.hasNextInt()) {
                    pc3[i] = sc.nextInt();
                    sc.nextLine();
                    if (pc3[i] >= 0 && pc3[i] <= 20) break;
                    else System.out.println("Nota fuera de rango (0 - 20).");
                } else {
                    System.out.println("Ingrese un número válido.");
                    sc.next();
                }
            }

            while (true) {
                System.out.print("Nota de EF de " + alumnos[i] + ": ");
                if (sc.hasNextInt()) {
                    ef[i] = sc.nextInt();
                    sc.nextLine();
                    if (ef[i] >= 0 && ef[i] <= 20) break;
                    else System.out.println("Nota fuera de rango (0 - 20).");
                } else {
                    System.out.println("Ingrese un número válido.");
                    sc.next();
                }
            }
        }

        double sumaPromedios = 0;
        StringBuilder cadena = new StringBuilder();
        cadena.append("====================================================================\n");
        cadena.append(String.format("%-25s %-5s %-5s %-5s %-5s %-5s %-5s %-5s\n",
                "Nombre", "Edad", "Grado", "PC1", "PC2", "PC3", "EF", "PROM"));
        cadena.append("====================================================================\n");

        for (int i = 0; i < n; i++) {
            double promedio = (pc1[i] + pc2[i] + pc3[i] + ef[i]) / 4.0;
            sumaPromedios += promedio;
            cadena.append(String.format("%-25s %-5d %-5d %-5d %-5d %-5d %-5d %-5.2f\n",
                    alumnos[i], edad[i], grado[i], pc1[i], pc2[i], pc3[i], ef[i], promedio));
        }

        cadena.append("====================================================================\n");
        double promedioGeneral = sumaPromedios / n;
        cadena.append(String.format("Promedio General: %50.2f\n", promedioGeneral));
        cadena.append("====================================================================\n");

        System.out.println(cadena.toString());
    }
}
