package ejercicios;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Ejercicios {

    public static void main(String[] args) {
        String texto = "3 3 1 2 3 4 5 6 7 8 9 -1 2 5 8";

        String numeros = "";
        ArrayList<String> ListaCB = new ArrayList<>();

        for (int i = 0; i < texto.length(); i++) {

            if (texto.substring(i, i + 1).equals("-")) {
                numeros = texto.substring(4, i - 1);
                String patron = "[ ]+";
                Pattern pat = Pattern.compile(patron);
                String[] items = pat.split(texto.substring(i + 3, texto.length()));
                String n[] = items;

                for (String s : items) {
                    ListaCB.add(s);
                }
                break;
            }

        }

        String filas = texto.substring(0, 1);
        String columnas = texto.substring(2, 3);

        String patron = "[ ]+";
        Pattern pat = Pattern.compile(patron);
        String[] items = pat.split(numeros);
        String n[] = items;
        ArrayList<String> Lista = new ArrayList<>();

        for (String s : items) {
            Lista.add(s);
        }

        int Matriz[][] = new int[Integer.parseInt(filas)][Integer.parseInt(columnas)];
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                Matriz[i][j] = Integer.parseInt(Lista.get(0));
                Lista.remove(0);
            }
        }

        boolean sw = false;

        int aux = 0;

        for (int i = 0; i < Integer.parseInt(columnas); i++) {
            for (int j = 0; j < Integer.parseInt(filas); j++) {

                if (Matriz[j][i] == Integer.parseInt(ListaCB.get(j))) {
                    sw = true;
                    aux = i;
                } else {
                    sw = false;
                    break;
                }

            }
            if (sw) {
                System.out.println(aux);
            }

        }
    }

}
