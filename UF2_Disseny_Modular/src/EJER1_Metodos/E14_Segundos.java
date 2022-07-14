package EJER1_Metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*

Transformación de una cantidad de segundos en horas, minutos y segundos.
La cantidad de segundos se entran por teclado.
 
Utiliza una clase Tiempo con campos para las horas, minutos y segundos.
 
Escribe los métodos que faltan.
 
Salida del programa
---------------------------------------------------
Entra la cantidad de segundos : 5623
5623 segundos son 1 horas, 33 minutos y 43 segundos
 
*/

public class E14_Segundos {
	
	int lee(String msg){
		Scanner entrada = new Scanner(System.in);
	    System.out.println(msg);
	    int n = entrada.nextInt();
	    return n;
	}
	
	Tiempo calculaTiempo(int segundos){
		Tiempo res = new Tiempo();
		res.min = segundos / 60;
        res.seg = segundos % 60;
 
        // Calcular las horas totales y los minutos restantes
 
        res.hora = res.min / 60;
        res.min = res.min % 60;
 
        return res;
	}
	
	public static void main(String[] args){
		E14_Segundos p = new E14_Segundos();
		
		
	        //Lee los segundos
	        int s = p.lee("Entra la cantidad de segundos:");
	        
	        Tiempo t = p.calculaTiempo(s);
	        
	        //Muestra la conversion
	        System.out.println("Tenemos " + (int)t.hora + " horas, " + (int)t.min + " minutos y " + (int)t.seg + " segundos"); 

	}

}
