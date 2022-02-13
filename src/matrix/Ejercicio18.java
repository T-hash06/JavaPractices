package matrix;

import java.util.Arrays;

public class Ejercicio18 {
    public static void main(String[] args) {

        int factor = 10;
        double[][] matrix = new double[3][4];
        double[][] newMatrix = new double[3][4];

        System.out.println("Matrix generada aleatoriamente: \n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.round(Math.random() * factor);
            }
            System.out.println(Arrays.toString(matrix[i]));
        }

        if (matrix[2][2] != 0) {
            System.out.println("\nMatriz calculada por la maquina: \n");
            for (int i = 0; i < newMatrix.length; i++) {
                for (int j = 0; j < newMatrix[i].length; j++) {
                    newMatrix[i][j] = (matrix[i][j] / matrix[2][2]);
                }
                System.out.println(Arrays.toString(newMatrix[i]));
            }
        } else {
            System.out.println("El elemento situado en la posicion (2, 2) es cero, por lo que no se puede efectuar la division");
        }
    }
}
