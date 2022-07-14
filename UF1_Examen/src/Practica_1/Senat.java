package Practica_1;
import java.util.Scanner;

public class Senat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int senadors = 0;
		int vot_si = 0;
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Introdueix el nombre de senadors: ");	
		senadors = entrada.nextInt();
		System.out.print("Introdueix el nombre de vots positius: ");
		vot_si = entrada.nextInt();
		
		double s_necessaris = (senadors * 2)/3;
		long s_necessaris_r = Math.round(s_necessaris);
		
		if(vot_si >= s_necessaris_r){
			System.out.println("La resolució queda aprovada");
		} else if(vot_si < s_necessaris_r){
			System.out.println("No s'ha aprovat la resolució, falten " + (s_necessaris_r - vot_si) + " vots");
		}
		
		
	}

}
