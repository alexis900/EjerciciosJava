package EJER3_Estructuras_iterativas_y_de_salto;

/*

Programa que calcula el factorial de un número n entrado por el usuario.
 
El factorial de n se define como n! = n * (n-1) * (n-2) * ... * 1.
 
El programa debe validar que el número entrado sea positivo y lo
suficientemente pequeño para que no produzca un error de desbordamiento
(determinarlo haciendo pruebas),en caso de que el valor entrado no sea
correcto se pide otro al usuario.
 
 
 
Salida del programa :
----------------------------------------
Entra un numero: 25
Entra un numero: -1
Entra un numero: 12
El factorial de 12 es 479001600
 
*/
 
import java.io.*;
 
public class E05_Factorial {
 
    public static void main(String [] args) throws IOException {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
        
        int res = 1;
        int num = 0;
        
 
        //Entrada del número con validación
        //Puede calcularse hasta el factorial de 12.
        //El factorial de 13 no cabe en una variable de tipo int
        //y se produce un desbordamiento
        
        do{
        	System.out.println("Entra un numero: ");
        	num = Integer.parseInt(entrada.readLine());
        }while(num < 0 || num > 12);
 
        //Cálculo del factorial
        
        for(int i = 1; i <= num; i++){
        	res *= i;
        }

        //Mostrar resultado
        
        System.out.println("El factorial de " + num + " es " + res );
 
         
    }
}