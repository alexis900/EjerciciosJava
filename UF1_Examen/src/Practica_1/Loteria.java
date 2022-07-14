package Practica_1;
import java.util.Scanner;

public class Loteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Scanner entrada = new Scanner(System.in);
		
		int suma = 0;
		
		System.out.println("Introdueix el número del teu bitllet");
		int bitllet = entrada.nextInt();
		
		if(bitllet >= 0 && bitllet <= 9999 || bitllet >= 80000 && bitllet <= 89999){
			
			if(bitllet >= 0 && bitllet <= 9999){
				suma = 10000 - bitllet;
			} else if(bitllet >= 80000 && bitllet <= 89999){
				suma = 90000 - bitllet;
			}
			
			System.out.printf("El bitllet %05d no li agrada, sumant %d li agradará", bitllet, suma);
		} else {
			System.out.println("Si el pot comprar");
		}
		
	}

}
