package forloop;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = 0;
        double subvalor = 0;
        double iva = 0;

        double precio = 0;
        int cantidad = 0;

        for (int i = 0; i < 5; i++) {

            System.out.print("\nIngrese el precio del producto " + (i + 1) + ": ");
            precio = Double.parseDouble(scanner.nextLine());

            System.out.print("Ingrese la cantidad del producto " + (i + 1) + ": ");
            cantidad = Integer.parseInt(scanner.nextLine());

            subvalor += precio * cantidad;
            iva += (precio * cantidad) * 0.16;
            valor += (precio * cantidad) * 1.16;
        }

        System.out.println("\nSubtotal: " + subvalor + "$");
        System.out.println("Total Iva: " + iva + "$");
        System.out.println("Total: " + valor + "$");
    }
}
