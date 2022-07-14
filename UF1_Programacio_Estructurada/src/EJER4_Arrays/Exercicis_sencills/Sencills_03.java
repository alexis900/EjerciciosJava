package EJER4_Arrays.Exercicis_sencills;

/*

3. Crea un array de 100 enteros, llénalo con los 100 primeros números pares y 
después muéstralos.
 
*/

public class Sencills_03 {

	public static void main(String[] args) {
		int valors[] = new int[100];

	int dato = 0;
	for(int i = 0;i < valors.length;i++){
		valors[i] = dato;
		dato += 2;
		}
	
	for(int i = 0;i < valors.length;i++){
		System.out.print(valors[i] + " ");
	}
	}
}
