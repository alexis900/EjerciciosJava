package EJER1_Metodos;

import java.util.Scanner;

/*

Programa que dice si un número dado es primo
( solamente divisible por el mismo y la unidad )
o no lo es.
 
Salida del programa
----------------------------------
Entra un número : 123
El numero no es primo
 
*/


public class E01_EsPrimo {
	
	int leernum(String mensaje) {
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		return n;
	}
	
	boolean esPrimo(int num) {
	    int i=2;
	    while (i<num){
	        if (num%i==0) return false;
	        i++;
	    }
	    
	    return true;
	}
	

	public static void main(String[] args) {
		E01_EsPrimo p = new E01_EsPrimo();
		int primo = p.leernum("Entra un número: ");
		
		if(p.esPrimo(primo)) System.out.println("Este número es primo");  
		else System.out.println("Este número no es primo");
	}

}
