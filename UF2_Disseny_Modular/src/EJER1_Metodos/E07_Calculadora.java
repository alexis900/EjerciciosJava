package EJER1_Metodos;

import java.util.Scanner;

/*

Programa que calcula el resultado de una operacion aritmetica introducida
por el usuario en forma de cadena, por ejemplo "14 + 23", o "45 * 11".
Esta cadena debe validarse y en caso de que no sea correcta mostrar un
mensaje de error.

Utilizar métodos

*/

class Calc{
	double num1;
	char sim;
	double num2;
	
	Calc(String s){
		String[] e = s.split(" ");
		num1 = Double.parseDouble(e[0]);
		num2 = Double.parseDouble(e[2]);
		
		if(s.contains("+")) {
			sim = '+';
		} else if(s.contains("-")) {
			sim = '-';
		} else if(s.contains("*")) {
			sim = '*';
		} else {
			sim = '/';
		}
	}
	
	Calc(double num12, char c, double num22){
		num1 = num12;
		num2 = num22;
		sim = c;
	}
	
	Calc(){}
}

public class E07_Calculadora {
	
	String leer(String msg) {
		Scanner entrada = new Scanner(System.in);
		System.out.println(msg);
		String n = entrada.nextLine();
		return n;
	}
	
	double calcula(Calc c){
		Calc e = new Calc(c.num1, c.sim, c.num2);
		double result = 0;
		if(e.sim == '+') {
			result =  (e.num1 + e.num2);
		} else if(e.sim == '-') {
			result =  (e.num1 - e.num2);
		} else if(e.sim == '*') {
			result =  (e.num1 * e.num2);
		} else {
			result =  (e.num1 / e.num2);
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		E07_Calculadora p = new E07_Calculadora();
		Calc c = new Calc(p.leer("Introduce una operación:"));
		System.out.printf("El resultado de la operación es %.2f", p.calcula(c));
		
	}

}
