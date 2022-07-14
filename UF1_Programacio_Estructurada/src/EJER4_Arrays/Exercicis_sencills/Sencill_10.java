package EJER4_Arrays.Exercicis_sencills;

import java.util.Scanner;

/*

10. Crea un array con 6 nombres de alumnos y otro array con sus 6 DNI en orden 
correlativo. Pide al usuario que introduzca un DNI y si está en el array debe mostrar 
el nombre del alumno correspondiente.
 
*/

public class Sencill_10 {

	public static void main(String[] args) {
		String nom[] = {"Alejandro", "Alex", "Isma", "Borja G.", "Javi", "Yampi"};
		String dni[] = {"0", "1", "2", "3", "4", "5"};
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un DNI: ");
		String dnial = entrada.next();
		int pos = 0;
		
		for(int i = 0;i < dni.length;i++){
			if(dnial.equals(dni[i])){
				System.out.println(nom[pos]);
			}
			
			pos++;
		}

	}

}
