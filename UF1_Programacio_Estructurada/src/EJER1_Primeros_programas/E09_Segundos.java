package EJER1_Primeros_programas;

/*

Transformaci�n de una cantidad de segundos en horas, minutos y segundos.
La cantidad de segundos se entran por teclado.
 
Salida del programa
---------------------------------------------------
Entra la cantidad de segundos : 5623
5623 segundos son 1 horas, 33 minutos y 43 segundos
 
*/
 
import java.io.*;
 
class E09_Segundos {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
        
        //Lee los segundos
        System.out.println("Introduce una cantidad de segundos");
        int total = Integer.parseInt(entrada.readLine());
        
        //Convierte a minutos
        
        double minutos = (double)total / 60;
        double segundos = (double)total%60;
        
        
        //Convierte a horas
        
        double horas = (double)minutos / 60;
        minutos = (double)minutos%60;
        
        //Muestra la conversion
        System.out.println("Tenemos " + (int)horas + " horas, " + (int)minutos + " minutos y " + (int)segundos + " segundos"); 
 
      
    }
}