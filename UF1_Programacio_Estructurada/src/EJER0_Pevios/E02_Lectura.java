package EJER0_Pevios;
import java.util.Scanner;

/*
  Llegeix del teclat valors per a les variables declarades al main, a continuació 
  mostra el valor de cadascuna. 
  Per llegir del teclat es pot fer servir
   
     Scanner teclat=new Scanner(System.in);
  o
     BufferedReader teclat=new BufferedReader(new InputStreamReader(System.in));
      
 */
 
public class E02_Lectura {
    public static void main (String [] args) {
    	int num;
		double total;
		boolean correcte;
		char lletra;
		long comptador;
		
    	Scanner teclat = new Scanner(System.in);
    	
    	System.out.println("Introdueix un nombre enter: ");
    	num = teclat.nextInt();
    	System.out.println("Introdueix un nombre decimal: ");
    	total = teclat.nextDouble();
    	System.out.println("Introdueix un booleà (true o false):");
    	correcte = teclat.nextBoolean();
    	System.out.println("Introdueix una lletra: ");
    	teclat.nextLine();
    	lletra = teclat.nextLine().charAt(0);
    	System.out.println("Introdueix un número gran: ");
    	comptador = teclat.nextLong();
    	
    	System.out.println(num);
    	System.out.println(total);
    	System.out.println(correcte);
    	System.out.println(lletra);
    	System.out.println(comptador);
    }
     
}