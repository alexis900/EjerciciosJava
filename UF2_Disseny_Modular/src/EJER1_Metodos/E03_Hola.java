package EJER1_Metodos;

import java.util.Scanner;

/*

Escribir los métodos que faltan :
 
  - repetir : debe imprimir un carácter un número dado de veces.
  - enmarcar: debe imprimir un texto dado enmarcado con un caràcter dado.
 
Salida del programa :
================================
 
Entra tu nombre : Felix
--------------------------------------------------
 
 
********************
*                  *
* !! Hola Felix !! *
*                  *
********************
 
 
####################
#                  #
# Fin del programa #
#                  #
####################
 
*/

public class E03_Hola {
	
	String leer(String msg) {
		Scanner entrada = new Scanner(System.in);
		System.out.print(msg);
		String n = entrada.nextLine();
		System.out.println();
		return n;
	}
	
	void repetir(String msg, char tipo) {
		int altura = 5;
		int base = msg.length() + 4;
		System.out.println();
        for (int i=0; i<altura; i++) {
 
            for (int j=0; j<base;j++) {
 
                if (i==0 || i==(altura-1) || j==0 || j==(base-1)) {
                    System.out.print(tipo);
                } else {
                	if(i == 2) {
                		System.out.printf(" %s %s", msg, tipo);
                		break;
                	}
                	
                	System.out.print(" ");
                }
        }
 
        System.out.println();
        }
 
	  }
	

	public static void main(String[] args) {
		E03_Hola p = new E03_Hola();
		String nombre = p.leer("Entra tu nombre: ");
		
		p.repetir("!! Hola " + nombre + " !!", '*');
		p.repetir("Fin del programa", '#');
		
	}
	

}
