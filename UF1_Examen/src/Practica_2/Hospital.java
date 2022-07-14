package Practica_2;
import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Ex 1
		//Declaració de variables
		String pacient[] = {"Cuiner", "Inventor", "Mecanic", "Bromista", "Forçut", "Dormilega"};
		int edat_pa[] = {10, 15, 29, 44, 54, 2};
		int edat_max[] = {5, 5, 15, 15, 40, 100, 4, 15};
			//Contador de consulta
		int con[] = new int[edat_max.length];
		int i = 0;
		int edat_maxc = 0;
		boolean exist = false;
		int cons_pa = 0;
		
		
		//Ex2
		//Entrada del text
		System.out.print("Introdueix el nom del pacient: ");
		String paci = entrada.next();
		
		
		for(i = 0;i < pacient.length;i++){
			//Comprova que el nom existeix
			if(paci.equals(pacient[i])){
				exist = true;
				break;
			}
		}
		
		//Compara si existeix aquest pacient
		if(exist){
				//Imprimeix les consultes que pot asistir
			System.out.print("Consultes ");
			for(int j = 0;j < edat_max.length;j++){
				if(edat_pa[i] <= edat_max[j]){
					//Comprova la edat màxima on hi pot asistir
					System.out.print(j + " ");
					}
				}
			} else {
				//Mostra aquest missatge quan el pacient no existeix
				System.out.println("El pacient " + paci + " no existeix");
		}
		System.out.println();
		//Ex3
		
		//Introdueix el número de consulta
		boolean error = false;
		while(!error){
			//Comprova si és un número
			try{
				System.out.print("Introdueix el número de consulta (0 - " + edat_max.length+ "): ");
				cons_pa = entrada.nextInt();
				//Comprova si és el número de consultes correcte
				if(cons_pa <= edat_max.length){
					error = true;
				} else if(cons_pa < 0 || cons_pa > edat_max.length){
					System.out.println("No hi ha " + cons_pa + " consultes");
				}
			}catch(Exception e){
				System.out.println("Només es poden posar números de consulta");
				entrada.next();
			}
		}
		
		//Comproba els màxims
		for(int k = 0; k < edat_max.length;k++){
			for(int y = 0; y < edat_pa.length;y++){
				if(edat_max[k] < edat_pa[y]){
					System.out.println(pacient[y]);
					break;
				}
			}
		}
			
		/*for(int k = 0; k < edat_pa.length;k++){
			if(edat_maxc == edat_pa[k]){
				System.out.println(pacient[k]);
			}
		}*/
		
		//Ex4
		
		System.out.println();
		for(int j = 0;j < pacient.length;j++){
			System.out.print(pacient[j]);
			for(int k = 0;k < edat_max.length;k++){
				if(con[i] == 0 && edat_pa[j] < edat_max[k]){
					con[k]++;
					System.out.print(" consulta " + k);
				} else {
					System.out.print(" EN ESPERA");
					break;
				}
			}
			System.out.println();
		}
		
	}
}
	
