package EJER1_Metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

Calcula el precio final de un producto después de aplicar un descuento.
El precio inicial y el tanto por ciento de descuento se leen del teclado.
El precio final debe estar redondeado a los céntimos de euro.
 
Salida del programa
----------------------------------------
Entra el precio inicial : 123.6
Entra el descuento : 3
El precio final es 119.89
 
*/

public class E02_Descuento {
	
	double leernum(String mensaje) throws NumberFormatException, IOException{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		double n = Double.parseDouble(entrada.readLine());
		return n;
	}
	
	double descuento(double p, double d) {
		double de = d / 100;
		double desc = p - p * de;
		return desc;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		E02_Descuento p = new E02_Descuento();
		
		double preu = p.leernum("Entra el preco inicial:");
		double descompte = p.leernum("Entra el descuento:");
		double total = p.descuento(preu, descompte);

		System.out.printf("Este producto costará %.2f€", total);
		
	}
}
