package EJER3_Estructuras_iterativas_y_de_salto;

/*

Programa que calcula el m�ximo com�n divisor de dos n�meros entrados
por teclado.
 
Salida del programa :
------------------------------
Entra el primer n�mero : 128
Entra el segundo n�mero : 96
 
En m.c.d de 128 y 96 es 32
 
*/
 
 
import java.io.*;
 
public class E10_MCD {
 
    public static void main(String args[]) throws IOException {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
        
        int min;
        int mcd = 0;
        
        //Leer los n�meros
        System.out.println("Entra el primer número: ");
        int num1 = Integer.parseInt(entrada.readLine());
        System.out.println("Entra el segundo númeor: ");
        int num2 = Integer.parseInt(entrada.readLine());
         
        if(num1 > num2){
        	min = num1;
        } else {
        	min = num2;
        }
 
        //Buscar el mcd mediante un bucle
        
        for(int i = 1;i <= min;i++){
        	if(num1%i == 0 && num2%i == 0){
        		mcd = i;
        	}
        	
        }
        
         
 
        //Mostrar el resultado
         
        System.out.println("En m.c.d de " + num1 + " y " + num2 + " es  " + mcd);
    }
}