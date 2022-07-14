package EJER4_Arrays;

import java.util.Scanner;

/*

Declara y inicializa un array con 5 palabras.
Pide una palabra al usuario y dile si esa palabra está en el array.
 
Nota: Para una mayor eficiencia el bucle de búsqueda debe finalizar al
encontrar la palabra.
 
*/

public class E02_BuscaPalabra {

	public static void main(String[] args) {
		String palabra[] = {"hola", "adios", "bye", "hey", "aloha"};
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una palabra:");
		String com = entrada.next().toLowerCase();
		boolean com2 = false;
		
		for(int i = 0; i < palabra.length;i++){
			if(com.equals(palabra[i])){
				//Existe
				com2 = true;
				break;
			}
		}
		
		if(!com2){
			System.out.println("La palabra " + com + " no existe");
		} else {
			System.out.println("La palabra " + com + " existe");
		}
	}

}
