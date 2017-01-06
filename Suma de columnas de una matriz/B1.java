package ejercicios;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Ejercicios {

    public static void main(String[] args) {
        String NumerosMatriz = "3 4 2 2 3 4 5 6 7 8 9 10 11 12";
        String x = "-1";
        String f = NumerosMatriz.substring(0,1);
        String c = NumerosMatriz.substring(2,3);
        NumerosMatriz = NumerosMatriz.substring(4,NumerosMatriz.length());
        
        String patron = "[ ]+";
        Pattern p1 = Pattern.compile(patron);
        String[] items = p1.split(NumerosMatriz);
        String n[] = items;
        ArrayList<String> Lista = new ArrayList<>();
        
            for (String s : items) {
               Lista.add(s);
            }
            
            
            int Matriz[][] = new int[Integer.parseInt(f)][Integer.parseInt(c)];
            for(int i = 0; i < Matriz.length; i++){
                for(int j = 0; j < Matriz[i].length; j++){
                    Matriz[i][j] = Integer.parseInt(Lista.get(0));
                    Lista.remove(0);
                }
            }
            
            int con = 0;
            int columna = 0;
            int suma = 0;
             
           
             for(int i = 0; i < Integer.parseInt(c); i++){
                for(int j = 0; j < Integer.parseInt(f); j++){
                
                    con = con + Matriz[j][i];
                    if(con > suma){
                    suma = con;
                    columna = i;
                    
                }
                    
                }
                
             con = 0;    
            }
             
             System.out.println(columna + " " + suma);
    }

}
