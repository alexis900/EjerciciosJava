package EJER3_Estructuras_iterativas_y_de_salto;

/*

Programa que calcula de dos maneras diferentes el producto de 0.1
por un número n entrado por el usuario y compara los dos resultados.
 
Esta operación puede realizarse multiplicando 0.1 por n
o sumando n veces 0.1
 
Nota: Este ejercicio sirve de muestra de los problemas que surgen
en ocasiones con la coma decimal flotante.
Prueba verse por ejemplo con n = 6.
 
Salida del programa
-------------------------
Entra el valor de n : 6
La suma de 6 veces 0.1 es   0,6000000000000000
El producto de 6 por 0.1 es 0,6000000000000001
Los resultados son diferentes.
 
*/
 
import java.io.*;
 
public class E03_Producto {
 
    public static void main(String args[]) throws IOException {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
         
        System.out.print("Entra el valor de n : ");
        int n = Integer.parseInt(entrada.readLine());
 
        //Calculo del producto mediante una multiplicacion
 
        double prod1 = n * 0.1;
        System.out.printf ("El producto de %d por 0.1 es %.16f\n",n,prod1);
        
 
 
 
        //Calculo del producto mediante sumas repetidas
        
        double prod2 = 0;
        
        for(int i = 1;i <= n;i++){
        	prod2 = prod2 + 0.1;
        }
        
        System.out.printf ("La suma de %d veces 0.1 es %.16f\n",n,prod2);
 
        //Comparar los resultados
        
        if(prod1 != prod2){
        	System.out.println("Los resultados son diferentes.");
        } else {
        	System.out.println("Los resultados son iguales");
        }
        
 
       
    }
}