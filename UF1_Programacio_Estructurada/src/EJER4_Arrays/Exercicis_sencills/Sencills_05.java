package EJER4_Arrays.Exercicis_sencills;

/*

5. Crea un array con los valores  1,3,2,8,4,5,2 y calcula cuanto suman los valores 
de las posiciones pares y cuanto suman los valores de las posiciones impares.
 
*/
 

public class Sencills_05 {

	public static void main(String[] args) {
		int a[] = {1,3,2,8,4,5,2};
		
		int pares = 0;
		int impares = 0;
		
		
		for(int i = 0; i < a.length;i++){
			if(i %2 == 0){
				//Pares
				pares += a[i];
			} else {
				//impares
				impares += a[i];
			}
		}
		
		System.out.println("Pares: " + pares);
		System.out.println("Impares: " + impares);
	}

}
