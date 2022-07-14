package EJER2_Estructuras_condicionales;

/*

Programa que pide un número al usuario y le dice si es mayor que cero o no
 
Salida del programa
------------------------------------------------------
Introduce un número : -23
-23 no es mayor que 0
 
*/
 
import java.io.*;
 
public class E01_EsMayorCero {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
        
        double numero;
        
        System.out.println("Introduce un número: ");
        numero = Double.parseDouble(entrada.readLine());
        
        if(numero > 0){
        	System.out.println(numero + " es mayor que 0");
        } else {
        	System.out.println(numero + " es menor que 0");
        }
 
 
    }
}
