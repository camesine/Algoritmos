package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String texto = "";
        ArrayList<String> lista = new ArrayList<>();
        
        while(!texto.equals("-1")){
            texto = in.nextLine();
            if(!texto.equals("-1")){
                lista.add(texto);
            
            }

        }
    int acu = 0;
        for(int i = 0; i < lista.size();i++){
            
            for(int j = 0; j < lista.get(i).length();j++){
                int v = Integer.parseInt(lista.get(i).substring(j,j+1));
                v = v * v * v;
                acu = acu + v;
                
            }
            if(acu == Integer.parseInt(lista.get(i))){
                System.out.println("SE CUMPLE");
            }else{
                System.out.println("NO SE CUMPLE");
            }
            
            acu = 0;
        }
    }

}
