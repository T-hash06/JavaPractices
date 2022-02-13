package whileloop;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion = -1;
        int i = 0;

        int ingIndustrial = 0;
        int ingMultimedia = 0;
        int ingMecatronica = 0;

        while (opcion != 0) {

            System.out.println("\n============================== Estudiante " + (i + 1) + " ==============================\n");

            System.out.println("Programa de estudio\n");
            System.out.println("1. Ingenieria Industrial");
            System.out.println("2. Ingenieria Mecatronica");
            System.out.println("3. Ingenieria Multimedia");
            System.out.println("4. Terminar programa\n");
            System.out.print("R: ");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    ingIndustrial++;
                    break;
                case 2:
                    ingMecatronica++;
                    break;
                case 3:
                    ingMultimedia++;
                    break;
                case 4:
                    opcion = 0;
                    break;
                default:
                    System.out.println("Opcion invalida!");
                    opcion = 0;
            }

            i++;
        }

        System.out.println("\nTotal de estudiantes ingresados: " + (i - 1));
        System.out.println("Estudiantes de Ingenieria Mecatronica: " + ingMecatronica);
        System.out.println("Estudiantes de Ingenieria Industrial: " + ingIndustrial);
        System.out.println("Estudiantes de Ingenieria Multimedia: " + ingMultimedia);
    }
}
