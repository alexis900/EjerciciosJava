package EJER6_Objetos;

import java.util.Scanner;

/*

Programa que suma dos objetos de tipo Fraccion.
Los datos necesarios se entran por teclado.
El resultado debe ser otro objeto de tipo Fraccion.
Primero se calcula y luego se muestra.
 
Ayuda para sumar fracciones:
-------------------------------------
 
num1   num2  num1*den2 + den1*num2
---- + --- = ---------------------
den1   den2        den1*den2
 
Posteriormente simplificar dividiendo por el mcd
 
 
Salida del programa:
------------------------------
Entra la fraccion 1 : 3/4
Entra la fraccion 2 : 5/6
La fraccion suma es 19/12
 
*/

public class E04_SumaFracciones {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entra la fraccion 1:");
		Fraccion f1 = new Fraccion(entrada.next());
		System.out.println("Entra la fraccion 2:");
		Fraccion f2 = new Fraccion(entrada.next());
		Fraccion fsuma = new Fraccion();
		fsuma.sum(f1,f2);
			
		System.out.print("La fraccion suma es "); fsuma.result();
	}
}
