package EJER1_Metodos;

import java.util.Scanner;

/*

Programa que permite introducir 10 notas y calcular :
la nota máxima, la nota media y el número de suspensos.
 
Debe contar con :
 
- un método para llenar el array con las notas introducidas
por el usuario
 
- un método para calcular cada uno de los datos que se
piden en el enunciado.
 
Estos últimos métodos no deben contener ninguna instrucción para imprimir
por pantalla, utilizar valores de retorno.
 
*/

public class E10_Notas {
	
	static final int NUMNOTAS = 10;
	
	double leernota(String mensaje) {
		Scanner entrada = new Scanner(System.in);
		System.out.println(mensaje);
		double n = entrada.nextDouble();
		if(n < 0 || n > NUMNOTAS) {
			return 11;
		} else {
			return n;
		}
	}
	
	double[] lee() {
		double[] notas = new double[NUMNOTAS];
		for(int i = 0;i < notas.length;i++) {
			notas[i] = leernota("Entra la nota " + (i+1)); 
		}
		
		return notas;
	}
	
	double max(double[] nota) {
		double max = 0;
		for(int i = 0;i < nota.length;i++) {
			if(max < nota[i]){
				max = nota[i];
			}
		}
		return max;
	}
	
	double media(double[] nota) {
		double media = 0;
		for(int i = 0;i < nota.length;i++) {
			media += nota[i];
		}
		
		media /= nota.length;
		return media;
	}
	
	int suspensos(double[] nota) {
		int suspensos = 0;
		for(int i = 0;i < nota.length;i++) {
			if(nota[i] < 5) {
				suspensos++;
			}
		}
		return suspensos;
	}
	
	
	
	public static void main(String[] args) {
		E10_Notas p = new E10_Notas();
		double[] nota;
		nota = p.lee();
		
		double maxima = p.max(nota);
		double media = p.media(nota);
		int suspensos = (int)p.suspensos(nota);
		
		System.out.printf("La nota máxima es de %.2f\n", maxima);
		System.out.printf("La nota media es de %.2f\n", media);
		System.out.printf("El número de suspensos es de %d", suspensos);
	}

}
