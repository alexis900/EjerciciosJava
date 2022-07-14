package EJER3_Estructuras_iterativas_y_de_salto;

/*

Programa que calcula la potencia de una base elevada a un exponente.
La base y el exponente son introducidos por el usuario.
NO utilizar el método Math.pow.
 
Salida del programa:
-------------------------------
Entra la base : 2
Entra el exponente : 8
El resultado es 256
 
*/
 
import java.io.*;
 
public class E02_Potencia {
 
    public static void main(String args[]) throws IOException {
    	
    	int base = 0;
    	int exponente = 0;
    	int resultado = 1;
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
        //Pedir la base
        System.out.println("Entra la base: ");
        base = Integer.parseInt(entrada.readLine());
      
        //Pedir el exponente
        System.out.println("Entra el exponente: ");
        exponente = Integer.parseInt(entrada.readLine());
         
      
        //Calcular la potencia con un bucle
        
        	for(int i = 1;i <= exponente;i++){
            	 resultado = resultado * base;
            }
       //Mostrar el resultado
         
        System.out.println("El resultado es " + resultado);
    }
}