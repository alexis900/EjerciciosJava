package EJER3_Estructuras_iterativas_y_de_salto;

/*

Programa que convierte un número entrado por el usuario en el
sistema decimal en su representación en el sistema binario.
 
Hazlo mediante divisiones sucesivas por 2 y añadiendo el resto obtenido
a una cadena de texto que serà el número en binario.
 
Salida del programa
----------------------------------------
Entra un numero decimal : 519
En binario es : 1000000111
 
 */
 
import java.io.*;
 
public class E16_Dec2Bin {
	

 
    public static void main(String args[]) throws IOException {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
        //Leer un número en base decimal
        
         
        System.out.print("Entra un número decimal : ");
        int dec = Integer.parseInt(entrada.readLine());
 
        String bin = "";    //Cadena para el número en binario
        
        
        
 
        //Dividir el número por 2 hasta llegar a cero
        
        int i = dec;
        int res = 0;
        
        while(i != 1){
        	res = i%2;
        	i /= 2;
        	bin = res + bin;
        	
        }
 
         bin = i + bin;
 
        //Mostrar el resultado
         
       System.out.println(bin);
        
    }
}