package Practica_1;
import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n = 0;
		int x = 0;
		int resultat = 0;
		
		System.out.println("Entra el valor N: ");
		n = entrada.nextInt();
		System.out.println("Entra el valor X: ");
		x = entrada.nextInt();
		
		int j = 0;
		int i = 0;
		
		for(i = 0;i <= n;i++){
			for(j = 1; j <= x;j+=x)
			resultat += i;
			System.out.printf("%d \n %d \n", i, j);
		}
			
		System.out.println("Si N és " + n + " i X és " + x + " aleshores la suma és " + resultat);
		
	}

}
