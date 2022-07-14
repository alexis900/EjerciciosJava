package EJER4_Arrays;

import java.io.IOException;
import java.util.Scanner;

/*

Programa que llena un array de 100 elementos con los valores :
0,1,1+2,1+2+3,1+2+3+4,...
 
Fíjate que cada elemento es igual al anterior más un número
 
Despues el usuario entra un número y el programa muestra el valor del
elemento que se encuentra en esta posición.
 
Validar la entrada del usuario para que controle las posibles excepciones
 
 
Salida del programa
-------------------------------
Entra un número entre 0 y 99 :130
Entrada inválida
Entra un número entre 0 y 99 :x
Entrada inválida
Entra un número entre 0 y 99 :10
La suma de los primeros 10 números naturales es 55
 
*/

public class E03_Sumas {

	public static void main(String[] args) throws IOException {

		Scanner entrada = new Scanner(System.in);

		// Bucle de validación con captura de excepciones

		int a[] = new int[100];
		int num = 0;
		
		
		//Introducir un número con excepciones
		do{
			try {
				System.out.print("Entra un número : ");
				num = entrada.nextInt();
			} catch (Exception e) {
				System.out.println("Entrada errónea.");
				entrada.nextLine();
			}
			
		}while(num < 1 || num > 99);
		
		for(int i = 0;i < a.length;i++){
			for(int j = 0; j <= i;j++){
				a[i] = j + a[i];
			}
			
		}
	
		
		System.out.println(a[num]);
		
		
	}
}