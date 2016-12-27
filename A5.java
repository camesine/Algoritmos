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

        for (int i = 0; i < lista.size(); i++) {
            int c = 0;

            String patron = "[ ]+";
            Pattern p1 = Pattern.compile(patron);
            String[] items = p1.split(lista.get(i));

            for (String s : items) {
                c = c + Integer.parseInt(s);

            }
            System.out.println(c);
        }
    }

}
