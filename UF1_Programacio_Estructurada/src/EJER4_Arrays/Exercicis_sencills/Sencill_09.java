package EJER4_Arrays.Exercicis_sencills;

import java.util.Scanner;

/*

9. Crea un array con las vocales ( char ). Pide al usuario una letra y dile si es 
una vocal o no. Con un bucle busca en el array para decidir si es vocal.
 
*/

public class Sencill_09 {

	public static void main(String[] args) {
		char vocal[] = {'a','e','i', 'o','u', 'A', 'E', 'I', 'O', 'U'};
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una letra:");
		char letra = entrada.next().charAt(0);
		boolean cierto = false;
		
		for(int i = 0;i < vocal.length;i++){
			if(letra == vocal[i]){
				cierto = true;
				break;
			}
		}
		
		if(!cierto){
			System.out.println(letra + " no es vocal");
		} else {
			System.out.println(letra + " es vocal");
		}
	}

}
