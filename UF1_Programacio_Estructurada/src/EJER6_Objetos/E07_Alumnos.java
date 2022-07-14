package EJER6_Objetos;

import java.util.Scanner;

/*

Definición de la clase Alumno para guardar el nombre y el NIF.
Creción de un array con 3 objetos de tipo Alumno inicializados.
El programa pide un NIF y busca el alumno que tenga ese NIF.
 
Salida del programa:
--------------------------------------------------
Entra un nif : 87654321A
El nif 87654321A corresponde al alumno Manel Vidal
 
 
*/

class Alumno{
	String nombre;
	String nif;
	
	Alumno(){}
	
	Alumno(String no, String ni){
		nombre = no;
		nif = ni;
	}
}

public class E07_Alumnos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Alumno alumnos[] = {
			new Alumno("Alejandro", "1a"),
			new Alumno("Alex","2a"),
			new Alumno("Gio", "1b"),
			new Alumno("Guillermo", "2b")
		};
		
		System.out.println("Entra un NIF:");
		String nif = entrada.next().toLowerCase();
		int pos = 0;
		boolean esta = false;
		for(int i = 0;i < alumnos.length;i++){
			if(alumnos[i].nif.equals(nif)){
				pos = i;
				esta = true;
				break;
			}
		}
		
		if(esta){
			System.out.printf("El NIF %s corresponde al alumno %s", alumnos[pos].nif, alumnos[pos].nombre);
		} else {
			System.out.printf("El NIF %s no corresponde a ningún alumno",nif);
		}
	}

}
