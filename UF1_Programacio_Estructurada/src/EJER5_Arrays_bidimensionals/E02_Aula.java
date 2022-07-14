package EJER5_Arrays_bidimensionals;

/*

Un aula de ordenadores con 3 filas de mesas y 4 ordenadores por fila se
utiliza por un grupo de 12 alumnos que siempre se sientan en el mismo
sitio.
 
Escribe un programa que utilize un array bidimensional donde se guarden
los nombres de los alumnos, de manera que su posición en el array se
corresponda con su posición en el aula. Este array se inicializa en el
código.
 
El usuario del programa tiene que poder entrar un nombre de alumno y
obtener la fila y el ordenador que tiene asignado. La pregunta se repite
hasta que el usuari introduce una cadena vacía.
 
Salida del del programa :
----------------------------------------------------
Entra el nombre de un alumno : Lucia Cases
Este alumno no existe.
 
Entra el nombre de un alumne : Anna Cuesta
Anna Cuesta tiene asignado el ordenador 2 de la fila 1.
 
Entra el nombre de un alumno :
 
Fin del programa.
 
 */
 
import java.io.*;

import java.util.Scanner;
 
public class E02_Aula{
 
  public static void main (String[]args)throws Exception{
	Scanner entrada = new Scanner(System.in);
    String alumno[][] = {{"Biel Carreras", "Alejandro Martin", "Alex Malmagro","Emilio"},
    		{"Anna Cuesta","Yampi","Ana Maria de la Concepción","Josue"},
    		{"Pau Mata", "Javier Redondo", "Guillermo Torrejon", "Ana Maria Purísima"}};
    
    String alum = new String();
    int ordenador = 0;
    int fila = 0;
    
    boolean falso = false;
    while(!falso) {
    	System.out.print("Entra el nombre de un alumno: ");
    	alum = entrada.nextLine();
    	boolean t = false;
	    for(int f = 0;f < alumno.length;f++) {
	    	for(int c = 0;c < alumno[f].length;c++) {
			    if(alumno[f][c].equals(alum)) {
			    	ordenador = c;
			    	fila = f;
			    	t = true;
			    	alum = " ";
			    	break;
			    } else if(alum.equals("")) {
			    	falso = true;
			    }
    		}
    	}
	    
	    if(t) {
    		System.out.println(alumno[fila][ordenador] + " tiene asignado el ordenador " + (ordenador+1) + 
    				" de la fila " +  (fila+1) + ".");
    	} else if(alum.equals("")){
    		break;
    	} else {
    		System.out.println("Este alumno no existe.");
    	}
    }
    
    System.out.println("Fin del programa.");
 
    
  }
}