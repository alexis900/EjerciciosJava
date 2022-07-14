package EJER6_Objetos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*

En este programa se define la clase Fecha con campos para el dia, mes y año.
Se entra por teclado dos fechas y el programa dice cual es la fecha menor.
 
Salida del programa:
------------------------------
 
Entra la primera fecha :
Dia : 15
Mes : 3
Año : 2005
 
Entra la segunda fecha :
Dia : 20
Mes : 2
Año : 2005
 
La fecha menor es 20/02/2005
 
*/

class Fecha {
	int dia;
	int mes;
	int anyo;

	Fecha(int d, int m, int y) {
		dia = d;
		mes = m;
		anyo = y;
	}

	Fecha() {
	}

	Fecha(String fechaTexto) {
		String trozos[] = fechaTexto.split("/");
		dia = Integer.parseInt(trozos[0]);
		mes = Integer.parseInt(trozos[1]);
		anyo = Integer.parseInt(trozos[2]);
	}
	
	int menor(Fecha dis){
		int menor = 0;
		if(anyo < dis.anyo) menor = 1;
		else if(dis.anyo < anyo) menor = 2;
		else if(mes < dis.mes) menor = 1;
		else if(dis.mes < mes) menor = 2;
		else if(dia < dis.dia) menor = 1;
		else if(dis.dia < dia) menor = 2;
		else menor = 0;
		return menor;
	}
}

public class E02_Fecha {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Entra la primera fecha: ");
		String f = entrada.nextLine();
		Fecha f1 = new Fecha(f);
		System.out.print("Entra la segunda fecha: ");
		Fecha f2 = new Fecha(entrada.nextLine());

		if(f1.menor(f2) == 0) System.out.println("Las fechas son iguales");
		else if(f1.menor(f2) == 1) System.out.printf("La fecha menor es %d/%d/%d", f1.dia, f1.mes, f1.anyo);
		else if(f1.menor(f2) == 2) System.out.printf("La fecha menor es %d/%d/%d", f2.dia, f2.mes, f2.anyo);
	}
}
