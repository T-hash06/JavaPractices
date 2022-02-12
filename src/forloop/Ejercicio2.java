package forloop;

// Dadas las notas de las siete asignaturas de un estudiante encontrar la nota promedio,
// validar la nota entre 0 y 5

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        double nota = 0;
        double promedio = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + " del alumno: ");
            nota = Double.parseDouble(scanner.nextLine());

            if (nota < 0 || nota > 5) {
                System.out.println("Nota invalida!");
                i--;
            } else {
                suma += nota;
            }
        }

        promedio = suma / 7;
        System.out.println("El promedio del estudiante fue: " + promedio);
    }
}
