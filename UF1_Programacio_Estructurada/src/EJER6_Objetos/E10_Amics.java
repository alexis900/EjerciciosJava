package EJER6_Objetos;

import java.util.Scanner;

/*

Programa que gestiona les dades dels aniversaris dels nostres amics.
El programa disposa d'aquestes dades inicialitzades en el codi font.
De cada amic guardem el seu nom i la seva data de naixement.
El programa ha de disposar d'una classe apropiada per les dates.
A més ha de disposar d'un array amb els noms dels mesos.
 
El programa ha de :
- primer, llistar els amics agrupats pel mes en que fan anys, mostrant
  el nom del mes i nom i data de naixement de cada amic.
- després, demanar un nom i mostrar la seva data de naixement
 
Sortida del programa
------------------------------------------------------------------------
 
 
Gener
----------------------
 
Febrer
----------------------
 
Març
----------------------
  10/03/1994 Joan
 
Abril
----------------------
 
Maig
----------------------
 
Juny
----------------------
 
Juliol
----------------------
 
Agost
----------------------
  19/08/1999 Arnau
 
Setembre
----------------------
 
Octubre
----------------------
 
Novembre
----------------------
  29/11/1990 Isa
 
Desembre
----------------------
 
 
Entra un nom : Isa
 
Data de naixement : 29/11/1990
 
 
 
*/

class Amigo{
	String nombre;
	int dia;
	int mes;
	int anyo;
	
	Amigo(String name, int day, int mon, int ye){
		nombre = name;
		dia = day;
		mes = mon;
		anyo = ye;
	}
	
	Amigo(){}

}

public class E10_Amics {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String mes[] = {
				"Enero", "Febrero", "Marzo", "Abril",
				"Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre"
				};
		
		Amigo agenda[] = {
				new Amigo("Alex", 18, 6, 1997),
				new Amigo("Alejandro", 22, 11, 1998),
				new Amigo("Biel", 13, 9, 1999),
				new Amigo("Inventado", 1, 6, 1996)
			};
		
		for(int m = 1;m < mes.length+1;m++){
			System.out.println(mes[m-1]);
			System.out.println("----------------------\n");
			for(int a = 0;a < agenda.length;a++){
				if(agenda[a].mes == m){
					System.out.printf("%d/%d/%d %s\n\n", agenda[a].dia, agenda[a].mes, agenda[a].anyo, agenda[a].nombre);
				}
			}
		}
		System.out.println("Entra un nom:");
		String amigo = entrada.next();
		int pos = 0;
		boolean existe = false;
		for(int n = 0;n < agenda.length;n++){
			if(agenda[n].nombre.equals(amigo)){
				existe = true;
				pos = n;
				break;
			}
		}
		
		if(existe){
			System.out.printf("Data de naixement : %d/%d/%d", agenda[pos].dia, agenda[pos].mes, agenda[pos].anyo);
		} else {
			System.out.println("No existe este amigo");
		}
		
		
	}

}
