package EJER3_Estructuras_iterativas_y_de_salto;

/*

Programa que dibuja un rectángulo de asteriscos.
La base y la altura se entran por teclado.
 
Salida del programa :
-----------------------------
Entra la altura : 4
Entra la base : 8
 
********
********
********
********
 
 */
 
import java.io.*;
 
public class E18_Rectangulo {
 
    public static void main(String args[]) throws IOException {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
        
        System.out.println("Entra la altura: ");
        int altura = Integer.parseInt(entrada.readLine());
        System.out.println("Entra la base: ");
        int base = Integer.parseInt(entrada.readLine());
        
        for(int i = 0; i < altura;i++){
        	for(int j = 0; j < base;j++){
        		System.out.print("*");
        	}
        	System.out.println("");
        }
 
    }
}