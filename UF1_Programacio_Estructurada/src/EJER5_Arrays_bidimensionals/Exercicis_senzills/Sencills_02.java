package EJER5_Arrays_bidimensionals.Exercicis_senzills;

/*

Crea una tabla de 8 filas y 8 columnas y llénala, mediante bucles, con 
los números del 1 al 64 donde los números crezcan de izquierda a derecha 
y de arriba abajo. Luego muéstrala por pantalla.
 
 */

public class Sencills_02 {

	public static void main(String[] args) {
		int a[][] = new int[8][8];
		int cont = 1;
		for(int i = 0; i < a.length;i++){
			for(int j = 0;j < a[i].length;j++){
				a[i][j] = cont;
				cont++;
			}
		}
		
		for(int i = 0;i < a.length;i++){
			System.out.println();
			for(int j = 0; j < a.length;j++){
				System.out.print(a[i][j] + " ");
			}
		}
	}

}
