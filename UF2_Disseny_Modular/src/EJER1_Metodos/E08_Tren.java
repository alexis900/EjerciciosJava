package EJER1_Metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*

Programa para resolver el típico problema de fisica sobre un tren que
viaja a velocidad constante de la estación A a la estación B separadas
una distancia D y tarda un tiempo T.
 
Las 3 variables D,T,V estan relacionadas por la formula D = V * T.
 
El programa primero debe mostrar un menú para preguntar cual es la variable
desconocida, luego preguntar los datos necesarios para calcularla y mostrar
el resultado.
 
El resultado debe obtenerse llamando a un método que recibe los datos
conocidos y devuelve como valor de retorno el valor de la incógnita.
 
Deben validarse las entradas no numéricas.
 
Salida del programa
====================================
 
Variables del problema:
-----------------------
1.Distancia
2.Tiempo
3.Velocidad
4.Salir
 
Elige la incognita : 8
Valor incorrecto.
 
Elige la incognita : 2
 
Entra la distancia D (km) :100
Entra la velocidad V (km/h):50
 
El tiempo es : 2.00 horas
 
......
 
*/

public class E08_Tren {
	
	double leernum(String mensaje) {
		BufferedReader entrada = new BufferedReader(
	            new InputStreamReader(System.in));
		System.out.println(mensaje);
		double n = 0;
		try {
			n = Double.parseDouble(entrada.readLine());
		} catch (NumberFormatException | IOException e) {
			System.out.println("ERROR!");
		}
		return n;
	}
	
	void distancia() {
		double v = leernum("Entra la velocidad V (km/h):");
		double t = leernum("Entra el tiempo T (h):");
		double d = v * t;
		System.out.printf("La distancia es de %.2f km\n", d);
	}
	
	void tiempo() {
		double d = leernum("Entra la distancia D (km):");
		double v = leernum("Entra la velocidad V (km/h):");
		double t = d * v;
		System.out.printf("El tiempo es : %.2f\n", t);
	}
	
	void velocidad() {
		double d = leernum("Entra la distancia D (km):");
		double t = leernum("Entra el tiempo T (h):");
		double v = d * t;
		System.out.printf("La velocidad es de %.2f km/h\n", v);
	}
	
	void menu() {
		System.out.println("Variables del problema:\n" + 
				"-----------------------\n" + 
				"1.Distancia\n" + 
				"2.Tiempo\n" + 
				"3.Velocidad\n" + 
				"4.Salir");
	}

	public static void main(String[] args) {
		E08_Tren p = new E08_Tren();
		
		boolean acaba = false;
		while(!acaba) {
			p.menu();
			double tipo = p.leernum("Elige la incognita :");
			switch ((int)tipo) {
				case 1: 
					p.distancia();
					break;
				case 2:
					p.tiempo();
					break;
				case 3:
					p.velocidad();
					break;
				case 4:
					acaba = true;
					break;
				default:
					System.out.println("Valor incorrecto.");
					break;
			}
			
		}
		
	}

}
