package EJER3_Estructuras_iterativas_y_de_salto;

/*

Programa que muestra la tabla de multiplicar de un número entrado
por el usuario. El programa debe validar que el número entrado
este entre 1 y 10. Si no lo está repite la pregunta.
 
Salida del programa :
---------------------------------------
Que tabla quieres ver (1-10)? : 15
Que tabla quieres ver (1-10)? : 0
Que tabla quieres ver (1-10)? : 4
 
 
 TABLA DEL 4
=============
 4 *  1 =  4
 4 *  2 =  8
 4 *  3 = 12
 4 *  4 = 16
 4 *  5 = 20
 4 *  6 = 24
 4 *  7 = 28
 4 *  8 = 32
 4 *  9 = 36
 4 * 10 = 40
 
 */
 
import java.io.*;
 
public class E01_TablaMultiplicar {
 
    public static void main(String args[]) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
        //Pedir el número en el rango 1 - 10
    
        int tabla = 0;
        do{
        	System.out.println("Que tabla quieres ver (1-10)?");
        	tabla = Integer.parseInt(entrada.readLine());
        	
        }while(tabla < 1 || tabla > 10);
        
         
        //Mostrar el título de la tabla
        
        System.out.println("TABLA DEL " + tabla);
        System.out.println("=============");
 
        
        //Mostrar la tabla
        
        for(int i = 1; i <=10;i++){
        	int resulatado = tabla * i;
        	System.out.println(tabla + "*" + i + "=" + resulatado);
        	
        }
  
    }
}