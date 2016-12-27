package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicios {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String texto = "";
        ArrayList<String> lista = new ArrayList<>();

        while (!texto.equals("-1")) {
            texto = in.nextLine();
            if (!texto.equals("-1")) {
                lista.add(texto);

            }

        }
        int val1 = 0;
        int amigo1 = 0;
        int acu = 0;
        boolean sw = false;
        for (int i = 0; i < lista.size(); i++) {
            String patron = "[ ]+";
            Pattern p1 = Pattern.compile(patron);
            String[] items = p1.split(lista.get(i));
            int n[] = new int[items.length];

            for (String s : items) {

                for (int j = 1; j < Integer.parseInt(s); j++) {

                    if (Integer.parseInt(s) % j == 0) {
                        acu = acu + j;
                    }

                }

                if (amigo1 == val1 || val1 == Integer.parseInt(s)) {
                    sw = true;
                } else {
                    sw = false;
                }

                val1 = acu;
                amigo1 = Integer.parseInt(s);
                acu = 0;

            }
            if (sw) {
                System.out.println("SON NUMEROS AMIGOS");
            } else {
                System.out.println("FALLO");
            }

        }
    }
}
