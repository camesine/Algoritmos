package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicios {

    public static void main(String[] args) {

        ArrayList<String> Lista = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        boolean sw = true;

        while (sw) {

            String texto = in.nextLine();

            if (!texto.equals("-2")) {
                Lista.add(resp(texto));

            } else {
                sw = false;

            }

        }

        for (int i = 0; i < Lista.size(); i++) {
            System.out.println(Lista.get(i));
        }

    }

    public static String resp(String t) {
        String texto = t;

        String cantidad = texto.substring(texto.length() - 1, texto.length());
        String numeros = texto.substring(0, texto.length() - 5);

        String patron = "[ ]+";
        Pattern p1 = Pattern.compile(patron);
        String[] items = p1.split(numeros);
        String n[] = items;
        ArrayList<String> Lista = new ArrayList<>();

        for (String s : items) {
            Lista.add(s);
        }

        int Matriz[] = new int[Lista.size()];
        for (int i = 0; i < Matriz.length; i++) {

            Matriz[i] = Integer.parseInt(Lista.get(0));
            Lista.remove(0);

        }

        int aux = 0;
        String resp = "";
        for (int i = 0; i < Matriz.length; i++) {

            for (int j = i; j < Matriz.length; j++) {

                if ((j + 1) % Integer.parseInt(cantidad) == 0) {

                    for (int x = j; x >= i; x--) {

                        resp = resp + (Matriz[x]) + " ";
                    }

                    aux = j;
                    break;

                }

            }
            i = aux;

        }

        return resp;
    }

}
