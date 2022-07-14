package EJER3_Estructuras_iterativas_y_de_salto;

/*

Programa que dice si un n�mero dado es primo
( solamente divisible por el mismo y la unidad )
o no lo es.
 
Salida del programa
----------------------------------
Entra un n�mero : 123
El numero no es primo
 
*/
 
import java.io.*;
 
public class E09_EsPrimo {
 
	  public static void main(String args[]) throws IOException {
	 
	    BufferedReader entrada = new BufferedReader(
	        new InputStreamReader(System.in));
	    int contador = 1;
	    //Leer el n�mero
	    System.out.println("Entra un número");
	    int num = Integer.parseInt(entrada.readLine());
	    
	    
	    
	    //Bucle para decidir si es primo
	    
	    for(int i = 2; i < num;i++){
	    	if(num % i == 0){
	    		contador++;
	    	}
	    }
	    
	    if(!(contador >= 3)){
	    	System.out.println("Este numero ES primo");
	    } else {
	    	System.out.println("Este numero NO ES primo");
	    }
	     
	 
	}
}