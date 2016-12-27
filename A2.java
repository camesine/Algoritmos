package ejercicios;

public class Ejercicios {

    public static void main(String[] args) {

        int n = 2;
        int r1 = 0;
        int r2 = 10;

        String resp = "";

        for (int i = r1; i <= r2; i++) {

            if (i % n == 0) {
                resp = resp + String.valueOf(i) + " ";
            }

        }

        System.out.println(resp.trim());

    }

}
