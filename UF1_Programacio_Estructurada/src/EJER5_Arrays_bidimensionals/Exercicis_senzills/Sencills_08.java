package EJER5_Arrays_bidimensionals.Exercicis_senzills;

/*

Crea una tabla dentada con los valores : {3,6,7},{5,7},{8,5,6,7} y 
calcula la media de los valores de cada fila.
 
 */

public class Sencills_08 {

	public static void main(String[] args) {
		int num[][] = {{3,6,7},{5,7},{8,5,6,7}};
		for(int f = 0;f < num.length;f++){
			for(int c = 0;c < num[f].length;c++){
				System.out.print(num[f][c] + " ");
			}
			System.out.println();
		}
	}

}
