package EJER4_Arrays.Exercicis_sencills;

import java.util.Arrays;

/*

1. Crea un array de 100 enteros, llénalo con los números del 1 al 100 y 
después muéstralos.
 
*/

public class Senzills_01 {

	public static void main(String[] args) {
		int valors[] = new int[10];
		
		for(int i = 0; i < valors.length; i++){
			valors[i] = i + 1;
		}
		
		for(int i = 0; i < valors.length;i++){
			System.out.print(valors[i] + " ");
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(valors));

	}

}
