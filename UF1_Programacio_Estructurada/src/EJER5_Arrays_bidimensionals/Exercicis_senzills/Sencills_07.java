package EJER5_Arrays_bidimensionals.Exercicis_senzills;

/*

Amplia el ejercicio 1 calculando la suma de cada columna y 
la media de estas sumas.
 
 */

public class Sencills_07 {

	public static void main(String[] args) {
		int array[][] = new int [5][8];
		int sumas[] = new int[array[1].length];
		double res = 0;
		
		for(int i = 0;i < array.length;i++){
			for(int j = 0; j < array[i].length;j++){
				array[i][j] = (int) (Math.random()*100);
			}
		}
		
		for(int i = 0;i < array.length;i++){
			System.out.println();
			for(int j = 0; j < array[1].length;j++){
				System.out.printf(array[i][j]+ " ");
			}
		}
		
		//Sumar columnas
		for(int c = 0;c < array[1].length;c++){
			for(int f = 0;f < array.length;f++){
				sumas[c] += array[f][c];
			}
		}
		
		System.out.println("\n\nLas columnas suman: ");
		for(int i = 0; i < sumas.length;i++){
				System.out.println("Columna " + i + ": " + (sumas[i]));
		}
		
		for(int i = 0;i < sumas.length;i++){
			res += sumas[i];
		}
		
		res /= array[1].length;
		
		System.out.println("\nLa media de todas las columnas suma " + res);

	}

}
