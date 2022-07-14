package EJER6_Objetos;

import java.util.Scanner;

/*

Programa que define la clase Fraccion con campos para el numerador y el denominador.
Primero crea un objeto Fraccion con el valor de sus campos entrados por teclado.
 
Luego simplifica la fracción dividiendo cada campo por el mcd de ambos y
muestra el resultado final.
 
Ayuda:
------
Si tenemos una cadena en la forma "3/4" y queremos dividirla en
trozos utilizando un carácter como separador se puede utilizar el
método split de esta forma:
 
String s = "3/4";
String[] partes = s.split("/"); //en este caso la barra hace de separador
 
El array 'partes' contendrá las dos cadenas separadas
 
 
Salida del programa:
------------------------------
Entra la fracción : 6/10
 
La fracción simplificada es 3/5
 
*/

class Fraccion {
	int num;
	int den;
	
	Fraccion(String fraccion){
		String trozos[] = fraccion.split("/");
		num = Integer.parseInt(trozos[0]);
		den = Integer.parseInt(trozos[1]);
	}
	
	Fraccion(){}
	

	void sim(){
		int n = Math.min(num,den);
        while (num%n!=0 || den%n!=0) {
            n--;
        }
        
        num = num / n;
        den = den / n;
	}
	
	void sum(Fraccion f1, Fraccion f2){
		num = (f1.num * f2.den) + (f1.den*f2.num);
		den = (f1.den*f2.den);
		sim();
		return;
	}
	
	void result(){
		System.out.printf("%d/%d",num,den);
	}
	
}
public class E03_SimplificaFraccion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entra la fracción: ");
		Fraccion f = new Fraccion(entrada.next());
		f.sim();
		System.out.printf("La fracción simplificada es ");
		f.result();
	}

}
