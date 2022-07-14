package EJER5_Arrays_bidimensionals.Exercicis_senzills;

/*

Amplia el ejercicio 1 mostrando el valor más grande que hay en la tabla.
 
 */

public class Sencills_05 {

	public static void main(String[] args) {
		int array[][] = new int [5][8];
		int max = 0;
		
		for(int i = 0;i < array.length;i++){
			for(int j = 0; j < array[i].length;j++){
				array[i][j] = (int) (Math.random()*100);
			}
		}
		
		for(int i = 0;i < array.length;i++){
			for(int j = 0; j < array[i].length;j++){
				if(array[i][j] > max){
					max = array[i][j];
				}
			}
		}
		
		for(int i = 0;i < array.length;i++){
			System.out.println();
			for(int j = 0; j < array[i].length;j++){
				System.out.printf(array[i][j]+ " ");
			}
		}
		System.out.println("\n\nEl número máxim de la taula és: " + max);

	}

}
