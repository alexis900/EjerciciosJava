package EJER3_Estructuras_iterativas_y_de_salto;

/*
 
Programa que calcula el cociente y el resto de la divisi�n de dos
n�meros a y b entrados por el usuario sin utilizar el operador /
 
Hacerlo mediante restas sucesivas : al dividendo le restaremos el
divisor tantas veces como sea posible. El n�mero de restas efectuadas
ser� el cociente, lo que nos quede al final ser� el resto.
 
Salida del programa :
--------------------------------
Ingrese dividendo: 19
Ingrese divisor: 3
Resultado: 6
Resto: 1
 
*/
import java.io.*;
 
public class E04_Division {
 
    public static void main(String args[]) throws IOException {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));

        int i = 0;
        
        //Pedir el dividendo
        
        System.out.println("Ingrese dividendo:");
        int dividendo = Integer.parseInt(entrada.readLine());
         

        //Pedir el divisor
         
        System.out.println("Ingrese divisor:");
        int divisor = Integer.parseInt(entrada.readLine());
         
 
        //Calcular el cociente haciendo restas
        
       while(dividendo > divisor){
    	   i++;
    	   dividendo = dividendo - divisor;
       }
       
       int resto = dividendo%divisor;
 
        //Mostrar el cociente y el resto
        System.out.println("Resultado: " + i);
        System.out.println("Resto: " + (int)resto);
         
    }
}
