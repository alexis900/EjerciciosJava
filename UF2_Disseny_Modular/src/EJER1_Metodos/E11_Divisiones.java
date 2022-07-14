package EJER1_Metodos;
import java.io.IOException;
import java.util.Scanner;

//TODO Modificar

/*
	 
	Programa que lee dos enteros entre 1 y 10 y muestra un gráfico de barras
	indicando la cantidad de divisores de cada número que está entre estos dos.
	 
	Implementar los métodos que faltan
	 
	Salida del programa:
	------------------------
	Entra dos numeros : 4 10
	 
	 4|***
	 5|**
	 6|****
	 7|**
	 8|****
	 9|***
	10|****
	  +------------------->
	 
	*/
class Teclado{
	int num1;
	int num2;
	
	Teclado(String t){
		String[] teclado = t.split(" ");
		num1 = Integer.parseInt(teclado[0])-1;
		num2 = Integer.parseInt(teclado[1])-1;
	}
}

public class E11_Divisiones {
	Teclado leernums(String msg){
		Scanner entrada = new Scanner(System.in);
		System.out.println(msg);
		String n = entrada.nextLine();
		Teclado t = new Teclado(n);
		return t;
		
	}
	
	void creartabla(char tipo) {
		int num = 0;
		Teclado t = leernums("Entra dos numeros :");
		for(int i = t.num1;i <= t.num2;i++) {
			if((i+1) < 10) System.out.print(" " +(i+1) + "|");
			else if((i+1) == 10)System.out.print((i+1) + "|");
			for(int j = 1;j <= 9;j++) {
				if((i+1)%j == 0) {
					System.out.print(tipo);
				}
			}
			System.out.println();
		}
		if(num > 0 || num <= 10) {
			System.out.println("  +------------------->");
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		E11_Divisiones p = new E11_Divisiones();
		p.creartabla('#');
	}

}
