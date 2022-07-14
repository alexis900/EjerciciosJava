package EJER1_Metodos;

import java.util.Scanner;

public class E12_Tablero {
	/*
	 
	Supongamos que tenemos un tablero de ajedrez con las casillas numeradas
	de la 1 a la 64 en el orden de izquierda a derecha y de arriba abajo.
	Calcular la fila y la columna en que se encuentra una casilla determinada
	entrando su número.
	 
	Salida del programa
	----------------------------------------
	Escribe el número de la casilla : 18
	 
	La casilla 18 se encuentra en la fila 3 y columna 2
	 
	*/
	int leerteclado(String msg) {
		Scanner entrada = new Scanner(System.in);
		System.out.println(msg);
		int n = entrada.nextInt();
		return n;
	}
	
	int[][] genera(){
		int num[][] = new int[8][8];
		int cont = 1;
		for(int i = 0;i < num.length;i++) {
			for(int j = 0;j < num[i].length;j++) {
				num[i][j] = cont;
				cont++;
			}
		}
		return num;
	}
	
	int[] recerca(int array[][], int num_teclat) {
		int valors[] = new int [2];
		for(int fila = 0;fila<array.length;fila++) {
			for(int col = 0;col < array[fila].length;col++) {
				if(array[fila][col] == num_teclat) {
					valors[0] = fila+1;
					valors[1] = col+1;
				}
			}
		}
		return valors;
	}
	
	public static void main(String[] args) {
		E12_Tablero p = new E12_Tablero();
		int teclat = p.leerteclado("Escribe el número de la casilla: ");
		int taulell[][];
		taulell = p.genera();
		int e[] = p.recerca(taulell, teclat);
		
		System.out.printf("La casilla %d se encuentra en la fila %d y columna %d", teclat, e[0], e[1]);
	}

}
