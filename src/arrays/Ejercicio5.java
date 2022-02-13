package arrays;

import java.util.ArrayList;

public class Ejercicio5 {

    public static void main(String[] args) {

        int limite = 100;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i < limite; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) list.add(i);
        }

        System.out.println(list);
    }
}
