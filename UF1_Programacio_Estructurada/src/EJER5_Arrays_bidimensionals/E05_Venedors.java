package EJER5_Arrays_bidimensionals;

/*

Una empresa té 3 comercials que venen els seus productes a domicili.
Aquests comercials cobren una comissió en funció de les seves vendes.
 
Fes un programa per calcular la comissió setmanal de cada venedor.
Aquest programa ha d'utilitzar un array bidimensional per guardar les
vendes diàries de cada venedor, de manera que en la posició i,j es guardi
les vendes realitzades pel venedor i en el dia j.
Aquestes dades s'estableixen directament en el codi.
 
La comissió està formada per un 5% de l'import de les seves vendes més
una prima per productivitat. Aquesta prima és de 10 euros per cada dia
en el que supera la mitja de vendes diàries.
 
 
Sortida del programa:
----------------------------------------------------------------------------
Venedor 1 : 580.00  700.00  610.00  300.00  200.00 Comissio --> 149.50 euros
Venedor 2 : 350.00  150.00  400.00  530.00  620.00 Comissio --> 122.50 euros
Venedor 3 : 220.00  465.00  640.00  720.00  680.00 Comissio --> 176.25 euros
 
*/
 
import java.io.*;
 
public class E05_Venedors {
 
    public static void main(String[] args) throws IOException{
 
        double[][] vendes = {
            {580,700,610,300,200},
            {350,150,400,530,620},
            {220,465,640,720,680}
        };
        
        double importa = 0;
        double mitja = 0;
        double total = 0;
        
        for(int f = 0;f < vendes.length;f++) {
        	for(int c = 0;c < vendes[f].length;c++) {
        		importa += vendes[f][c];
        		total = importa * 0.05;
        		mitja = importa / 5;
        		if(vendes[f][c] > mitja) {
        			total += 10;
        		}
        		
        	}
        	
        	
        	System.out.printf("Venedor %d : %.2f  %.2f  %.2f  %.2f  %.2f Comissio --> %.2f euros\n",
        			f+1, vendes[f][0], vendes[f][1], vendes[f][2], vendes[f][3], vendes[f][4], total);
        	importa = 0;
        	mitja = 0;
        }
 
 
 
    }
}