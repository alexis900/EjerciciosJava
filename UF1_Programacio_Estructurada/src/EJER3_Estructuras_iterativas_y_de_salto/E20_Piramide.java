package EJER3_Estructuras_iterativas_y_de_salto;

/*

Programa que dibuja una pirámide  de asteriscos.
La altura se entra por teclado.
 
Ayuda: Para imprimir cada línia hay que imprimir un número de espacios
seguidos de un número de asteriscos.
 
Salida del programa :
------------------------
Entra la altura : 5
 
    *
   ***
  *****
 *******
*********
 
*/
 
import java.io.*;
 
public class E20_Piramide {
 
    public static void main(String args[]) throws IOException {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
        System.out.print("Entra la altura : ");
        int alt = Integer.parseInt(entrada.readLine());
 
        System.out.println();
 
        int esp = alt-1; //numero de espacios en una línea
        int ast = 1;        //numero de asteriscos en una línea
 
        /* continuar */
        
        for(int i = 0;i <= alt; i++){
        	for(int j = 0;j <= esp; j++){
        		System.out.print(" ");
        		
        	}
        	
        	for(int k = 0;k < ast;k++){
        		System.out.print("*");
        	}
        	
        	System.out.println("");
        	esp--;
        	ast += 2;
        }
       
 
    }
}