package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 3;

        int[] arrayUsuario = new int[size];
        int[] arrayMaquina = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Ingrese la posicion " + (i + 1) + ": ");
            int entrada = Integer.parseInt(scanner.nextLine());
            arrayUsuario[i] = entrada;

            if (entrada % 2 == 0) arrayMaquina[i] = (int) Math.pow(entrada, 2);
            else arrayMaquina[i] = (int) Math.pow(entrada, 3);
        }

        System.out.println("\nVector ingresado por el usuario: " + Arrays.toString(arrayUsuario));
        System.out.println("Vector calculado por la maquina: " + Arrays.toString(arrayMaquina));
    }
}
