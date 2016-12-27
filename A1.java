package ejercicios;

import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
        String frase;

        Scanner leer = new Scanner(System.in);

        frase = leer.nextLine();
        frase = frase.replace("\\n", "\n").replace("\\t", "\t");

        System.out.println(frase);
    }

}
