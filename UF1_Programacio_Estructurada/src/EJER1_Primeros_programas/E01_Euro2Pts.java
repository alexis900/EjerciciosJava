package EJER1_Primeros_programas;
import java.io.*;

/*

Calcular el valor en pesetas de una cantidad de euros.
La cantidad de euros se entra por teclado.
 
Salida del programa
----------------------------------------
Entra un valor en euros : 35.6
El valor en pesetas es : 5923.3416 pts.
 
*/
 

 
class E01_Euro2Pts {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
        double CAMBIO = 166.386;
         
        //Leer el valor en euros
        
        System.out.println("Entra un valor en euros: ");
        double euros = Double.parseDouble(entrada.readLine());
         
        //Calcular el valor en pesetas
         
        double resulatdo = CAMBIO * euros;
 
        //Mostrar el resultado
        
        System.out.println("El valor en pesetas es: " + resulatdo + " pts");
         
       
    }
}