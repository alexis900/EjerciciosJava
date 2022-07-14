package Barcos;
import java.util.Scanner;

public class Vaixells {
    public static void main(String[] args) throws Exception{
    	Scanner entrada = new Scanner(System.in);
    	 int quadricula[][] = {
    			 {1,0,0,0,0,0,0,0,0,1},
    			 {0,0,0,2,2,0,0,0,0,0},
    			 {0,0,0,0,0,0,1,0,5,0},
    			 {0,0,0,0,0,0,0,0,5,0},
    			 {0,3,0,0,3,3,3,0,5,0},
    			 {0,3,0,0,0,0,0,0,5,0},
    			 {0,3,0,1,0,1,0,0,5,0},
    			 {0,0,0,0,0,0,0,0,0,0},
    			 {0,2,0,0,0,2,2,0,0,1},
    			 {0,2,0,0,0,0,0,0,0,0}
    	 };
    	 
    	 int barcos = 5;
    	 int barcoc[] = new int[barcos];
    	 int tec = 0;
    	 int agua = 0;
    	 int barco = 0;
    	 int num = 0;
    	 
    	 for(int f = 0;f < quadricula.length;f++){
    		 for(int c = 0;c < quadricula[f].length;c++){
    			 num = quadricula[f][c];
    			 if(quadricula[f][c] == 0){
    				 agua++;
    			 } else if(quadricula[f][c] > 0){
    				 barco++;
    				 barcoc[num-1]++;
    			 }
    		 }
    	 }
    	 
    	 num=0;
    	 
    	 for(int i = 0;i < barcoc.length;i++) {
    		 if(barcoc[i] > 0) {
    			 num++;
    		 }
    	 }
    	 
    	 
    	 
    	 System.out.println("Hay " + agua + " casillas con agua");
    	 System.out.println("Hay " + barco + " casillas con barcos");
    	 System.out.println("Hay " + num + " tipos de barcos");
    	 
    	 boolean falso = false;
    	 
    	 while(!falso) {
    		 try {
    			 System.out.print("Introduce un tipo de barco: ");
    			 tec = entrada.nextInt();

    			 if(tec == 0) {
    				 System.out.println("Agua");
    			 } else if (tec < 0){
    				 System.out.println("No pueden haber barcos negativos");
    			 } else if(tec > barcoc.length){
    				 System.out.println("No pueden existir tantos barcos");
    			 } else if(barcoc[tec-1] > 0) {
    	    		 System.out.println("Existe!");
    	    		 falso = true;
    	    	 } else {
    	    		 System.out.println("No existe!");
    	    		 falso = true;
    	    	 }
    			 
    		 }catch(Exception e) {
    			 System.out.println("ERROR!");
    			 entrada.nextLine();
    		 }
    	 }
    	 
    	 falso = false;
    	 int fila = 0;
    	 while(!falso) {
    		 try {
    			 System.out.print("Introduce la fila: ");
    			 fila = entrada.nextInt();
    			 if(fila <= 0 || fila > 10) {
    				 System.out.println("La fila no está en el rango");
    			 } else {
    				 falso = true;
    			 }
    		 }catch(Exception e) {
    			 System.out.println("ERROR!");
    			 entrada.nextInt();
    		 }
    	 }
    	 int partes = 0;
    	 for(int f = 0;f < quadricula[fila-1].length;f++) {
    		 if(quadricula[fila-1][f] > 0) {
    			 partes++;
    		 }
    	 }
    	 
    	 System.out.printf("Hay %d partes de barcos\n", partes);
    	 
    	 
    	 falso = false;
    	 int columna = 0;
    	 while(!falso) {
    		 try {
    			 System.out.print("Introduce la fila: ");
    			 columna = entrada.nextInt();
    			 if(columna <= 0 || columna > quadricula.length) {
    				 System.out.println("La columna no está en el rango");
    			 } else {
    				 falso = true;
    			 }
    		 }catch(Exception e) {
    			 System.out.println("ERROR!");
    			 entrada.nextInt();
    		 }
    	 }
    	 falso = false;
    	 int tipo[] = new int [barcos];
    	 for(int c = 0;c < quadricula.length;c++) {
    		 if(quadricula[c][columna-1] > 0) {
    			 tipo[num-1]++;
    			 falso = true;
    		 }
    	 }
    	 
    	 if(!falso) {
    		 System.out.print("Tipo ");
    		 for(int i = 0;i < tipo.length;i++) {
    			System.out.print(tipo[i] + " ");
    		 }
    	 } else {
			 System.out.println("Ningún tipo");

    	 }
    }
}
