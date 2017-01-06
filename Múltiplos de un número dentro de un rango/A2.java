package ejercicio;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio {

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        
        ArrayList<int[]> Lista = new ArrayList<>();
        
        boolean sw = true;
        
        while(sw){
            
            
        String texto = in.nextLine();
        
        if(!texto.equals("0")){
        String patron = "[ ]+";
        Pattern p1 = Pattern.compile(patron);
        String[] items = p1.split(texto);
        int n[] = new int[items.length];
        
            for (String s : items) {
                for(int i = 0; i < n.length; i++){
                    if(n[i] == 0){
                        n[i] = Integer.parseInt(s);
                        break;
                    }
                }
            }
            
            Lista.add(n);
            
            
        }else{
            sw = false;
            
        }
            
        }
        
        
        for(int i = 0; i < Lista.size(); i++){
            
            
            
          
             String resp = "";
            
        for(int j = Lista.get(i)[1]; j <= Lista.get(i)[2]; j++){
            
            if(j % Lista.get(i)[0] == 0){
                resp = resp + String.valueOf(j) + " ";
            }
            
            
        }
        
        System.out.println(resp.trim());
            
            
            
            
            
            
            
            
        }
        
        
    }
    
}
