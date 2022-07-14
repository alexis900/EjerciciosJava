package EJER5_Arrays_bidimensionals.Exercicis_senzills;

public class Sencills_06 {
	
	/*
	 
	Amplia el ejercicio 1 calculando la suma de cada fila y 
	la media de estas sumas.
	 
	*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[][] = new int [5][8];
		int sumas[] = new int[array.length];
		double res = 0;
		
		for(int i = 0;i < array.length;i++){
			for(int j = 0; j < array[i].length;j++){
				array[i][j] = (int) (Math.random()*100);
			}
		}
		
		for(int i = 0;i < array.length;i++){
			System.out.println();
			for(int j = 0; j < array[i].length;j++){
				System.out.printf(array[i][j]+ " ");
			}
		}
		//Sumar filas
		for(int i = 0;i < array.length;i++){
			for(int j = 0;j < array[i].length;j++){
				sumas[i] += array[i][j];
			}
		}
		
		for(int i = 0;i < array.length;i++){
			res += sumas[i];
		}
		
		System.out.println("\n");
		System.out.println("Las filas suman: ");
		for(int i = 0;i < sumas.length;i++){
			System.out.println("Fila "+ i + ": " + (sumas[i]) + " ");
		}
		
		res /= array.length;
		
		System.out.println("\nLa media de toda la tabla es de " + res);
		
	}

}
