package EJER2_Estructuras_condicionales;

/*

Programa que pide un número al usuario y le dice si es
positivo, negativo o cero
 
Salida del programa
-------------------------------------
Introduce un número : -12
El número es negativo
 
*/
 
import java.io.*;
 
public class E02_PosNegCero {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
        
        int numero;
        
        System.out.println("Introduce un número: ");
        numero = Integer.parseInt(entrada.readLine());
        
        if(numero == 0){
        	System.out.println("El número es 0");
        } else if(numero < 0){
        		System.out.println("El número es negativo");
        } else {
        		System.out.println("El número es positivo");
        }
    }
 
 
}
