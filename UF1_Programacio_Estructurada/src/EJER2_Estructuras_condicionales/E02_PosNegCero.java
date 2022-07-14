package EJER2_Estructuras_condicionales;

/*

Programa que pide un n�mero al usuario y le dice si es
positivo, negativo o cero
 
Salida del programa
-------------------------------------
Introduce un n�mero : -12
El n�mero es negativo
 
*/
 
import java.io.*;
 
public class E02_PosNegCero {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
        
        int numero;
        
        System.out.println("Introduce un n�mero: ");
        numero = Integer.parseInt(entrada.readLine());
        
        if(numero == 0){
        	System.out.println("El n�mero es 0");
        } else if(numero < 0){
        		System.out.println("El n�mero es negativo");
        } else {
        		System.out.println("El n�mero es positivo");
        }
    }
 
 
}
