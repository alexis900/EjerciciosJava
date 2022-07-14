package EJER4_Arrays.Exercicis_sencills;

/*

8. Crea un array con 6 nombres de alumnos y un array con las respectivas notas que 
han obtenido en una prueba (por orden correlativo). Muestra primero la lista de 
aprobados y luego la lista de suspensos. Indica también cuantos aprueban y cuantos 
suspenden.
 
*/
 

public class Sencill_08 {

	public static void main(String[] args) {
		String alumnos[] = {"Alejandro", "Isma", "Alex", "Javi", "Josu", "Guillermo"};
		int notas[] = {5,7,8,4,2,0};
		
		int apr = 0;
		int sus = 0;
		int val1 = 1;
		int val2 = 1;
		
		for(int i = 0; i < notas.length;i++){
			for(int j = 0; j < alumnos.length; j++){
				while(val1 != 0){
					System.out.println("Alumnos aprobados");
					System.out.println("-----------------");
					val1--;
				}
				if(notas[i] >= 5){
					System.out.println(alumnos[i] + ": " + notas[i]);
					apr++;
					break;
				}
				
				while(val2 != 0){
					System.out.println();
					System.out.println("Alumnos suspensos");
					System.out.println("-----------------");
					val2--;
				}
				
				if(notas[i] < 5){
					System.out.println(alumnos[i] + ": " + notas[i]);
					sus++;
					break;
				}
			}
		}
		
		System.out.println();
		
		System.out.println("Alumnos aprobados: " + apr);
		System.out.println("Alumnos suspensos: " + sus);

	}

}
