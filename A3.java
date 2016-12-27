package ejercicios;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Ejercicios {

    public static void main(String[] args) {
        String NumerosMatriz = "1 0 3 0 2 3";
        String x = "-1";
        String d = "2 3";
        
        String patron = "[ ]+";
        Pattern p1 = Pattern.compile(patron);
        String[] items = p1.split(NumerosMatriz);
        String n[] = items;
        ArrayList<String> Lista = new ArrayList<>();
        
            for (String s : items) {
               Lista.add(s);
            }
            
            int Matriz[][] = new int[Integer.parseInt(d.substring(0,1))][Integer.parseInt(d.substring(2,3))];
            for(int i = 0; i < Matriz.length; i++){
                for(int j = 0; j < Matriz[i].length; j++){
                    Matriz[i][j] = Integer.parseInt(Lista.get(0));
                    Lista.remove(0);
                }
            }
            
            String resp = "";
            int c = 0;
             for(int i = 0; i < Matriz.length; i++){
                for(int j = 0; j < Matriz[i].length; j++){
                  if(Matriz[i][j] == 0){
                      c++;
                      resp = resp + "(" + i +"," + j +  ") ";
                  }
                }
                
            }
             System.out.println(c + " " +resp);
    }

}
