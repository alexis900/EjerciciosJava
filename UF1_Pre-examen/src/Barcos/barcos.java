package Barcos;
import java.util.Scanner;

public class barcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int teclat = 0;
			
		int[][] barcos ={
				{1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
				{0, 0, 0, 2, 2, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 1, 0, 5, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 5, 0},
				{0, 3, 0, 0, 3, 3, 3, 0, 5, 0},
				{0, 3, 0, 0, 0, 0, 0, 0, 5, 0},
				{0, 3, 0, 1, 0, 1, 0, 0, 5, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 2, 0, 0, 0, 2, 2, 0, 0, 1},
				{0, 2, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		
		int agua=0;
		int varcos=0;
		int tipos[] = new int[5];
		int num=0;
		
		for(int f=0; f < barcos.length; f++){
			for(int c=0; c < barcos[f].length; c++){
				num = barcos[f][c];
				if(barcos[f][c] == 0){
					agua++;
				} else{
					varcos++;
					tipos[num-1]++;
				}
			}
		}
		num=0;
		System.out.println("Casillas de agua: " +agua);
		System.out.println("Casillas con barcos: " +varcos);
		for(int t=0; t < tipos.length; t++){
			if(tipos[t] > 0){
				num++;
			}
		}
		
		System.out.println("Tipos de barcos: "+num);
		
		boolean acabem = false;
		
		while(!acabem){
			try{
				System.out.println("Tipos de barco: ");
				teclat=entrada.nextInt();
				if(teclat < 0 || teclat > tipos.length){
					System.out.println("Barco no valido!");
				}else if(teclat == 0){
					System.out.println("Aguaaaaa!");
				}else if(tipos[teclat-1] > 0){
					System.out.println("Existeeee!");
					acabem=true;
				}else{
					System.out.println("No exiteeeee!");
					acabem=true;
				}
				
			}catch(Exception e){
				System.out.println("Error del programa!");
				entrada.next();
			}
		}
		
		acabem=false;
		teclat=0;
		
		while(!acabem){
			try{
				System.out.println("Introduce una fila: ");
				teclat=entrada.nextInt();
				if(teclat <= 0 || teclat > 10){
					System.out.println("Te saliste del perímetro!");
				} else{
					acabem=true;
				}
			}catch(Exception e){
				System.out.println("Error del programa!");
				entrada.next();
			}
		}
		
		int partes=0;
		for(int f=0; f < barcos[teclat-1].length; f++){
			if(barcos[teclat-1][f]>0){
				partes++;
			}
		}
		
		System.out.println("Hay "+partes+ " partes de barco");
		
		acabem=false;
		teclat=0;
		
		while(!acabem){
			try{
				System.out.println("Introduce una columna: ");
				teclat=entrada.nextInt();
				if(teclat <= 0 || teclat > 10){
					System.out.println("Te saliste del perímetro!");
				} else{
					acabem=true;
				}
			}catch(Exception e){
				System.out.println("Error del programa!");
				entrada.next();
			}
		}
		
		acabem=false;
		int max = 0;
		for(int f=0; f < barcos.length; f++){
			num = barcos[f][teclat-1];
			if(barcos[f][teclat-1]> 0){
				if(barcos[f][teclat-1] > max){
					max = barcos[f][teclat-1];
				}
				acabem=true;
			}
		}
	
		
		if(!acabem){
			System.out.println("No hay ná");
		}else{
			System.out.print("Tipo " + max);
		}
	}
}
