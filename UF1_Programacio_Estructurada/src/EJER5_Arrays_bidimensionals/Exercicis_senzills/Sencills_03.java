package EJER5_Arrays_bidimensionals.Exercicis_senzills;

import java.util.Scanner;

/*

Amplia el ejercicio 1 pidiendo al usuario un número de fila y mostrando 
la suma de esa fila.
 
 */

public class Sencills_03 {

	public static void main(String[] args) {
		
		int array[][] = new int [5][8];
		int res = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Tabla");
		System.out.println("--------------------");
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
		
		System.out.println("\n");
		
		boolean cierto = false;
		int num = 0; 
		while(!cierto){
			try{
				System.out.println("Introduce el numero de fila (0 - "+ (array.length-1) + "): ");
				num = entrada.nextInt();
				if(num < array.length){
					cierto = true;
				} else {
					
				}
			}catch(Exception e){
				System.out.println("ERROR CRITICO!");
				entrada.next();
			}
		}
		
		for(int i = 0;i < array[num].length;i++){
				res += array[num][i];
		}
		System.out.println("El resultado de la fila " + num + " es: " + res);
	} 

}
