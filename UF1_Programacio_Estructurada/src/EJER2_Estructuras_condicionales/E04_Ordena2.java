package EJER2_Estructuras_condicionales;

/*

Programa que lee dos valores por teclado, los ordena y los
muestra ordenados.
La ordenación debe hacerse intercambiando el valor de las
variables si es necesario.
 
Salida del programa
-----------------------------------------------
Escribe el primer valor : 5
Escribe el segundo valor : 3
Los valores ordenados son 3 5
 
*/
 
import java.io.*;
 
public class E04_Ordena2 {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
        
        int a;
        int b;
        int c;
 
        //Leer las variables a y b
        System.out.println("Escribe el primer valor: ");
        a = Integer.parseInt(entrada.readLine());
        System.out.println("Escribe el segundo valor: ");
        b = Integer.parseInt(entrada.readLine());
 
 
        //Ordenar las variables a y b
        
        if(a > b){
        	c = a;
        	a = b;
        	b = c;
        }
        
 
        //Mostrar las variables a y b
 
        System.out.printf("Los valores ordenados son %d %d ",a, b);
    }
}