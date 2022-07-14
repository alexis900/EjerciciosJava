package EJER3_Estructuras_iterativas_y_de_salto;

/*

Programa que convierte un número binario entrado por el usuario en
su representación decimal.
 
Ayuda : Guarda el número binario entrado por el usuario en una cadena
llamada binario y entonces
binario.length()  será la longitud de la cadena y
binario.charAt(n) será el carácter de la posición n
 
 
Salida del programa
------------------------------------
Entra un numero binario : 1101011101
En decimal es : 861
 
 */
 
import java.io.*;
 
public class E15_Bin2Dec {
 
    public static void main(String args[]) throws IOException {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
 
        //Leer un número binario
         
        System.out.print("Entra un número binario : ");
        String bin = entrada.readLine();
        
        int dec = 0;
        int len = bin.length(); //Longitud de la cadena
        int pot = len -1;
        //Bucle para procesar la cadena carácter a carácter empezando por el final
        
        for(int i = 0; i < len; i++){
        	if(bin.charAt(i) == '1'){
        		dec += Math.pow(2, pot);
        	} else if(bin.charAt(i) == '0'){
        		
        	} else  {
        		System.out.println("Has introducido un carácter no computable");
        		dec = 0;
        	}
        pot--;
        }
        
        //Mostramos el resultado
         
         System.out.println("En decimal es : " + dec);
    }
}