package EJER5_Arrays_bidimensionals.Exercicis_senzills;

public class Sencills_01 {
	
	/*
	 
	Crea una tabla de 5 filas y 8 columnas y llénala con números aleatorios. 
	Luego muéstrala por pantalla.
	 
	 */

	public static void main(String[] args) {
		
		int array[][] = new int [5][8];
		
		for(int i = 0;i < array.length;i++){
			for(int j = 0; j < array[i].length;j++){
				array[i][j] = (int) (Math.random()*100);
			}
		}
		
		for(int i = 0;i < array.length;i++){
			System.out.println();
			for(int j = 0; j < array[i].length;j++){
				System.out.print(array[i][j]+ " ");
			}
		}

	}

}
