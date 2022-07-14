package EJER4_Arrays.Exercicis_sencills;

public class Senzills_02 {
	
	/*
	 
	2. Crea un array de 100 enteros, llénalo con los números del 101 al 200 y 
	después muéstralos.
	 
	*/

	public static void main(String[] args) {

		int valor[]	= new int[100];
		
		int dato = 101;
		for(int i = 0; i < valor.length;i++){
			valor[i] = dato;
			dato++;
		}
		
		for(int i = 0;i < valor.length;i++){
			System.out.print(valor[i]);
		}
	}

}
