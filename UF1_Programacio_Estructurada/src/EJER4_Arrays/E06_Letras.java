package EJER4_Arrays;

import java.util.Scanner;

/*

Programa que cuenta las veces que aparece cada carácter en una frase
entrada por el usuario, donde puede aparecer cualquier carácter de la
tabla ASCII.
 
Utilizar un array donde el valor de la posicion i se corresponda con
las veces que aparece el caracter i de la tabla ASCII. La tabla ASCII
tiene 256 caracteres.
 
Salida del programa:
---------------------------
Entra una frase: Los arrays en Java son divertidos.
 
Apariciones de cada caracter :
 
  : 5
. : 1
J : 1
L : 1
a : 4
d : 2
e : 2
i : 2
n : 2
o : 3
r : 3
s : 4
t : 1
v : 2
y : 1
 
*/

public class E06_Letras {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Generador de c�digo ascii
		char ascii[] = new char[256];
		int numascii = 0;
		for (int i = 0; i < ascii.length; i++) {
			ascii[i] = (char)numascii;
			numascii++;
		}
		
		//Declaro array de contador
		int asciicont[] = new int[256];
		
		//Escribo la frase
		System.out.print("Introduce una frase: ");
		String frase = entrada.nextLine();

		//Mide la longitud de la frase
		for(int i = 0;i < frase.length();i++){
			char letra = frase.charAt(i);
			for(int j = 0;j < ascii.length;j++){
				//Comprueba que la letra est� en el Array y lo suma al contador
				if(letra == ascii[j]){
					asciicont[j]++;
				}
			}
		}
		
		System.out.println("Apariciones de cada caracter :");
		System.out.println();
		//Bucle para leer el contador si es mayor a 0
		for(int i = 0;i < ascii.length;i++){
			if(asciicont[i] > 0){
				System.out.println(ascii[i] + " : " + asciicont[i]);
			}
		}
		
	}

}
