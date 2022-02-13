package whileloop;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double venta = 0;
        int dia = 0;

        while (true) {

            System.out.print("Ingrese el valor de venta del dia " + (dia + 1) + ": ");
            venta = Double.parseDouble(scanner.nextLine());

            if (venta == 0) break;

            total += venta;
            dia++;
        }

        System.out.println("\nTotal de Ventas: " + total + "$");
        System.out.println("Comision del vendedor: " + total * 0.03 + "$");
    }
}
