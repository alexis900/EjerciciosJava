package EJER1_Metodos;

import java.util.Scanner;

/*

Programa que permite realizar conversiones entre las escalas de Celsius y Fahrenheit.
El usuario primero decide el sentido de la conversión, y luego entra el valor a convertir.
 
Utilizar los métodos siguientes:
 
  - un método para validar la entrada del usuario,
  - un método con parámetros para pasar de Celsius a Fahrenheit
  - un método con paràmetros para pasar de Fahrenheit a Celsius,
 
todos estos métodos deben devolver el resultado como valor de retorno.
 
Fórmula :  F = 32 + (9/5) C
 
 
Salida por pantalla
-----------------------------
 
CONVERSOR DE TEMPERATURAS
===========================
1. Fahrenheit a Celsius.
2. Celsius a Fahrenheit.
3. Salir.
 
Elige una opcion : 4
Valor incorrecto.
Elige una opcion : 2
 
Entra la temperatura en Celsius :24
Resultado en Fahrenheit : 75,20
 
....
 
 */

public class E09_ConversorTemperaturas {
	int leerteclado(String mensaje) {
		Scanner entrada = new Scanner(System.in);
		System.out.println(mensaje);
		int n = entrada.nextInt();
		return n;
	}
	
	int ctof(){
		int c = leerteclado("Entra la temperatura en Celsius:");
		double f = 32 + ((double)9/5) * c;
		System.out.printf("Resultado en Fahrenheit : %.2f\n\n", f);
		return c;
	}
	
	void ftoc(){
		int f = leerteclado("Entra la temperatura en Fahrenheit:");
		double c = (f-32)/((double)9/5);
		System.out.printf("Resultado en Celsius : %.2f\n\n", c);
	}
	
	int menu () {
		System.out.println("CONVERSOR DE TEMPERATURAS\n" + 
				"===========================\n" + 
				"1. Fahrenheit a Celsius.\n" + 
				"2. Celsius a Fahrenheit.\n" + 
				"3. Salir."); 
		return (int)leerteclado("Elige una opción:");
	};
	
	public static void main(String[] args) {
		E09_ConversorTemperaturas p = new E09_ConversorTemperaturas();
		
		boolean acaba = false;
		
		while(!acaba) {
			
			int opcion = p.menu();
			switch(opcion) {
				case 1:
					p.ftoc();
					break;
				case 2:
					p.ctof();
					break;
				case 3:
					acaba = true;
					break;
				default:
					System.out.println("Valor incorrecto.");
					break;
			}
		}
		
	}

}
