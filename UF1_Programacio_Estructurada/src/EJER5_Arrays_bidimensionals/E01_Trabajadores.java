package EJER5_Arrays_bidimensionals;

import java.util.Scanner;

/*

Crea un array de dos dimensiones para guardar las horas trabajadas por 3 trabajadores
durante los 5 días laborables de una semana. Estos datos se entran por teclado.
Posteriormente, el programa debe mostra la tabla por pantalla y calcular :
- el sueldo de cada trabajador teniendo en cuenta que la hora se paga a 20 euros
- la suma de todos los sueldos
 
 
Salida del programa
---------------------------
Entra las horas del trabajador 1
Dia 1 : 5
Dia 2 : 7
Dia 3 : 6
Dia 4 : 8
Dia 5 : 8
Entra las horas del trabajador 2
Dia 1 : 7
Dia 2 : 6
Dia 3 : 6
Dia 4 : 7
Dia 5 : 7
Entra las horas del trabajador 3
Dia 1 : 8
Dia 2 : 8
Dia 3 : 8
Dia 4 : 7
Dia 5 : 8
 
               Lunes   Martes  Mierc.  Jueves  Viernes Sueldo
Trabajador 1       5       7       6       8       8    680
Trabajador 2       7       6       6       7       7    660
Trabajador 3       8       8       8       7       8    780
 
El sueldo total es 2120
 
 
 */

public class E01_Trabajadores {

	public static void main(String[] args) {
		 	Scanner entrada = new Scanner(System.in);
		 	
		 	int trabajadores[][] = new int[3][5];
		 	boolean falso = false;
		 	int hora = 0;
		 	int sueldo = 0;
		 	int total = 0;
		 	
		 	for(int t = 0;t < trabajadores.length;t++){
		 		System.out.println("Entra las horas del trabajador " + (t+1));
		 		for(int h = 0;h < trabajadores[t].length;h++){
		 				while(!falso){
		 					try{
		 						System.out.print("Dia " + (h+1) + ": ");
		 						hora = entrada.nextInt();
		 						trabajadores[t][h] = hora;
		 						falso = true;
		 					}catch(Exception e){
		 						System.out.println("FATAL ERROR!");
		 						entrada.next();
		 					}
		 				}
		 				falso = false;
		 		}
		 	}
		 	
		 	System.out.println("               Lunes   Martes  Mierc.  Jueves  Viernes Sueldo");
	 		for(int i = 0;i < trabajadores.length;i++){
	 			System.out.print("Trabajador " + (i+1));
	 			for(int j = 0;j < trabajadores[i].length;j++){
	 				sueldo += trabajadores[i][j] * 20;
	 				System.out.print("       " + trabajadores[i][j]);
	 				
	 			}
	 			System.out.print("   " + sueldo + " €");
	 			total += sueldo;
	 			sueldo = 0;
	 			System.out.println();
	 		}
	 		
	 		System.out.println("\nEl sueldo total es " + total + " €");
	 		
		 	
	}

}
