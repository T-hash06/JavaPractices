package matrix;

import java.util.Arrays;

public class Ejercicio21 {
    public static void main(String[] args) {

        double[][] matrix = new double[5][3];
        double suma = 0;

        System.out.println("Matriz generada de manera aleatorea: \n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.round(Math.random() * 100);
                suma += matrix[i][j];
            }
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("\nSuma de los elementos de la matriz: " + suma);
    }
}
