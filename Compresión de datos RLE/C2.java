package ejercicios;

import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String x = "";
        String cadena = "";
        while (!x.equals("-1")) {
            x = in.nextLine();
            if (x.equals("-1")) {
                break;
            }
            cadena = cadena + x;
        }

        String letra = cadena.substring(0, 1);
        int acu = 1;

        String resp = "";

        for (int i = 1; i < cadena.length(); i++) {

            if (cadena.substring(i, i + 1).equals(letra)) {
                acu++;

            } else {
                resp = resp + acu + letra;
                letra = cadena.substring(i, i + 1);
                acu = 1;

            }

        }
        resp = resp + acu + letra;
        System.out.println(resp);

    }

}
