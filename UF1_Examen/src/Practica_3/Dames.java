package Practica_3;
import java.util.Scanner;

public class Dames {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int dames_f = 0, peo_c = 0;
		
		//Ex1
		int tauler_p[][] = {
				{1,0,1,0,1,0,1,0},
				{0,1,0,1,0,1,0,1},
				{1,0,1,0,1,0,1,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,2,0,2,0,2,0,2},
				{2,0,2,0,2,0,2,0},
				{0,2,0,2,0,2,0,2}
		};
		
		//Ex2
		int tauler[][] = {
				{1,0,1,0,1,0,12,0},
				{0,1,0,12,0,1,0,1},
				{1,0,1,0,12,0,1,0},
				{0,12,0,2,0,0,0,0},
				{1,0,0,0,2,0,11,0},
				{0,2,0,2,0,2,0,2},
				{1,0,2,0,1,0,2,0},
				{0,2,0,2,0,2,0,2}
		};
		
		
		
		int blanques = 0, negres = 0;
		
		//Verificació si es dama o peó de cada color
		for(int f = 0;f < tauler.length;f++){
			for(int c = 0;c < tauler[f].length;c++){
				if(tauler[f][c] == 1){
					blanques++;
				} else if(tauler[f][c] == 11) {
					blanques+=5;
				} else if(tauler[f][c] == 2) {
					negres++;
				} else if(tauler[f][c] == 12) {
					negres+=5;
				}
			}
		}
		
		//Resultats de cada color
		System.out.println("BLANQUES " + blanques + " punts");
		System.out.println("NEGRES " + negres + " punts");
		
		if(blanques > negres){
			System.out.println("BLANQUES VAN GUANYANT");
		} else if (negres > blanques){
			System.out.println("NEGRES VAN GUANYANT");
		} else if(negres == blanques){
			System.out.println("EMPAT!");
		}
		
		//Ex3
		//Lectura del teclat per agafar la fila
		boolean acabat = false;
		while(!acabat){
			try{
				System.out.print("Entra una fila (1 - " + tauler.length + "): ");
				dames_f = entrada.nextInt();
				if(dames_f <= 0 || dames_f > tauler.length) {
					System.out.println("VALOR INCORRENCTE!");
				} else {
					acabat = true;
				}
			}catch(Exception e){
				System.out.println("ERROR CRITIC!");
				entrada.next();
			}
		}
		
		int dames = 0;
		//Contador de dames a la fila corresponent
		for(int c = 0;c < tauler.length;c++){
			if(tauler[dames_f-1][c] == 12 || tauler[dames_f-1][c] == 11){
				dames++;
			}
		}
		
		System.out.println("Dames a la fila " + dames_f + ": " + dames );
		
		//Ex4
		//Lectura del teclat per agafar la columna
		acabat = false;
		while(!acabat){
			try{
				System.out.print("Entra una columna 1 - "  + tauler[1].length + "): ");
				peo_c = entrada.nextInt();
				if(peo_c <= 0 || peo_c > tauler.length){
					System.out.println("VALOR INCORRECTE");
				} else {
					acabat = true;
				}
			}catch(Exception e){
				System.out.println("ERROR CRITIC!");
				entrada.next();
			}
		}
		
		int peo = 0;
		//Contador de peons a la columna corresponent
		for(int f = 0;f < tauler[1].length;f++){
			if(tauler[f][peo_c-1] == 1 || tauler[f][peo_c-1] == 2){
				peo++;
			}
		}
		
		System.out.println("Peons a la columna " + peo_c + ": " + peo);
		
		boolean esta = false;
		//Ex5
		int fil = 0, col = 0; 
		for(int f = 0;f < tauler.length;f++){
			for(int c = 0;c < tauler[f].length;c++){
				//Comproba si es una dama i copia la seva posició,
				//posant el comprobador "esta" a true i parant el programa
				if(tauler[f][c] == 11 || tauler[f][c] == 12){
					fil = f;
					col = c;
					esta = true;
					break;
				}
			}
			if(esta){
				break;
			}
		}
		
		
		//Mostra si hi han dames, la fila i la columna
		//Si no hi ha cap mostrarà un missatge que ho confirmi
		if(esta){
			System.out.printf("Hi ha una dama a la fila %d, columna %d", fil+1, col+1);
		} else {
			System.out.println("No hi han dames");
		}

	}
}

