package ejercicios;

public class Ejercicios {

    public static void main(String[] args) {
        String x = "La vaca pasta en el campo azulino";
        x = x.replaceAll("[aA]+", "@");
        x = x.replaceAll("[eE]+", "3");
        x = x.replaceAll("[iI]+", "1");
        x = x.replaceAll("[oO]+", "X");
        x = x.replaceAll("[uU]+", "V");
        System.out.println(x);
    }

}
