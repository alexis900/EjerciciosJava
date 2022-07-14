package EJER3_Estructuras_iterativas_y_de_salto;


/*
*
Programa que tiene que adivinar un número entre 1 y 999, pensado
previamente por el usuario.
El programa muestra un valor dentro del rango permitido y el usuario
contesta indicando si el número secreto es mayor, menor o igual al
proporcionado.
En cada intento se reduce el rango de valores permitido.
Cuando el programa acierta mostrará un mensaje indicando cuantos 
intentos ha realizado.

Salida del programa
---------------------------------
Intento 1 ,  0 < x < 1000  ? 500
(<,>,=) ? <
Intento 2 ,  0 < x < 500  ? 200
(<,>,=) ? >
Intento 3 ,  200 < x < 500  ? 300
(<,>,=) ? >
Intento 4 ,  300 < x < 500  ? 400
(<,>,=) ? >
Intento 5 ,  400 < x < 500  ? 480
(<,>,=) ? <
Intento 6 ,  400 < x < 480  ? 440
(<,>,=) ? >
Intento 7 ,  440 < x < 480  ? 465
(<,>,=) ? >
Intento 8 ,  465 < x < 480  ? 475
(<,>,=) ? <
Intento 9 ,  465 < x < 475  ? 468
(<,>,=) ? <
Intento 10 ,  465 < x < 468  ? 466
(<,>,=) ? =
El número secreto era el 466
He necesitado 10 intentos.

*/

import java.io.*;

public class E14_NumeroSecreto {

   public static void main(String args[]) throws IOException {

       BufferedReader entrada = new BufferedReader(
           new InputStreamReader(System.in));
       
       int num_min = 0;
       int num_max = 1000;
       char sim;
       int i = 1;
       int num = 0;
       
       do{
    	   
    	   num = (num_min + num_max)/2;
    	   System.out.println("Intento " + i + " , " + num_min + " < x < " + num_max + " ? " + num);
    	   System.out.print("(<,>,=) ? ");
    	   sim = entrada.readLine().charAt(0);
    	   
    	   if(sim == '<'){
    		   num_max = num;
    		   i++;
    	   } else if(sim == '>'){
    		   num_min = num;
    		   i++;
    	   } else if(sim == '='){
    		   
    	   } else {
    		   System.out.println("Este simbolo no es compatible");
    	   }
    	   
       }while(!(sim == '='));
       
       System.out.println("El número secreto era el " + num);
       System.out.println("He necesitado " +  (i-1) + " intentos.");
   }
}