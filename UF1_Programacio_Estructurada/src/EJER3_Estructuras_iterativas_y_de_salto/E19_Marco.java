package EJER3_Estructuras_iterativas_y_de_salto;

/*

Programa que dibuja un marco de asteriscos.
La base y la altura se entran por teclado.
 
Salida del programa :
-----------------------------
Entra la altura : 4
Entra la base : 8
 
********
*      *
*      *
********
 
 */
 
import java.io.*;
 
public class E19_Marco {
    public static void main(String args[]) throws IOException {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
        
        System.out.print("Entra la altura : ");
        int altura = Integer.parseInt(entrada.readLine());
        
        System.out.print("Entra la base : ");
        int base = Integer.parseInt(entrada.readLine());
        
 
	     for(int i = 1;i <= altura;i++){
	    	 if(i == 1 || i == altura){
	    		 for(int j = 0;j <= base;j++){
	 	    		System.out.print("*");
	 	    		}
	    		 }else if(i > 1 || i < altura){
	 	    		for(int k = 1;k < base;k++){
	 	    			if(i <= 1 || k == 1){
	 	    				System.out.print("*");
	 	    				for(int l = 1;l <= base - 1;l++){
	 	    					System.out.print(" ");
	 	    				}
	 	    				System.out.print("*");
	 	    			} 
	 	    		}
	 	    	}
	    	 System.out.println("");
	    	 }
	    }
     
    }