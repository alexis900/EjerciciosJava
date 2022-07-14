package EJER5_Arrays_bidimensionals.Exercicis_senzills;

import java.util.Scanner;

/*

Amplia el ejercicio 3 pidiendo al usuario un número de columna y 
mostrando la suma de esa columna.
 
 */

public class Sencills_04 {

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
		
		boolean filas = false;
		int num = 0; 
		while(!filas){
			try{
				System.out.println("Introduce el numero de fila (0 - "+ (array.length-1) + "): ");
				num = entrada.nextInt();
				if(num < array.length){
					filas = true;
				} else if(num > array.length || num < 0){
					System.out.println("Este número está fuera de rango!");
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
		
		
		int num2 = 0;
		boolean columnas = false;
		while(!columnas){
			try{
				System.out.println("Introduce el numero de columna (0 - "+ (array[1].length-1) + "): ");
				num2 = entrada.nextInt();
				if(num2 < array[1].length){
					columnas = true;
				} else if(num >= array[1].length){
					System.out.println("Este número está fuera de rango!");
				}
			}catch(Exception e){
				System.out.println("ERROR CRITICO!");
				entrada.next();
			}
		}
		res = 0;
		for(int i = 0;i < array.length;i++){
				res += array[i][num2];
		}
		
		System.out.println("El resultado de la columna " + num2 + " es: " + res);
	
	} 
}
