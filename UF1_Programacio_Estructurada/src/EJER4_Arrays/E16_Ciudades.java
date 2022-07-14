package EJER4_Arrays;

/*

Programa que dispone de un array con el nombre de 10 ciudades españolas
y se las muestra al usuario en forma de lista numerada. El usuario elige
una ciudad introduciendo su número y el programa la elimina del array.
Esta eliminación debe efectuarse desplazando los elementos posteriores
una posición hacia el inicio. Luego se vuelve a mostrar la lista de
ciudades.
 
Repetir los pasos anteriores hasta que se hayan eliminado todas las
ciudades.
 
Validar los valores entrados controlando las posibles excepciones.
 
 
Salida del programa
-----------------------
Ciudades :
 1 - Albacete
 2 - Barcelona
 3 - Valencia
 4 - Segovia
 5 - Madrid
 6 - Pamplona
 7 - Orense
 8 - Tarragona
 9 - Cuenca
10 - Granada
 
Elige una ciudad : 7
 
Ciudades :
 1 - Albacete
 2 - Barcelona
 3 - Valencia
 4 - Segovia
 5 - Madrid
 6 - Pamplona
 7 - Tarragona
 8 - Cuenca
 9 - Granada
 
Elige una ciudad : Cuenca
Entrada incorrecta.
 
Elige una ciudad : 10
El valor es incorrecto.
 
Elige una ciudad : 8
 
Ciudades :
 1 - Albacete
 2 - Barcelona
 3 - Valencia
 4 - Segovia
 5 - Madrid
 6 - Pamplona
 7 - Tarragona
 8 - Granada
 
Elige una ciudad :
 
*/
 
import java.io.*;
 
public class E16_Ciudades {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
        String[] ciudades = {
            "Albacete","Barcelona","Valencia","Segovia","Madrid",
            "Pamplona","Orense","Tarragona","Cuenca","Granada" };
 
        int count = ciudades.length; //número de ciudades
        int num = 0;
 
        while (count > 0) {
 
            //Mostrar las ciudades
        	for(int i = 0; i < count;i++){
        		System.out.println((i + 1) + "." + " " + ciudades[i]);
        	}
           
        	boolean error = true;
            //Pedir un número y validarlo
        	while(error){
        		try{
        			System.out.print("Elige una ciudad : ");
            		num = Integer.parseInt(entrada.readLine());
            		if(num >= 1 && num <= count){
            			error = false;
            		} else {
            			System.out.println("El valor es incorrecto");
            		}
            		break;
        		}catch(Exception e){
        			System.out.println("Solo se permiten valores nuemricos");
        		}
        	}
 
             
 
            //Desplazamiento de los elementos posteriores
            for(int i = num -1; i < count-1; i++){
            	 ciudades[i] = ciudades[i+1];
            }
 
             
 
            //Actualización del contador
            
            count--;
            
 
        }
 
        System.out.println("Ya no quedan ciudades.");
    }
}
