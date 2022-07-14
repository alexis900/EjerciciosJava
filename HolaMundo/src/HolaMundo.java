import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.omg.CORBA.portable.InputStream;

public class HolaMundo {

	public static void main(String[] args) throws Exception{
		
		// tipus identificador = valor;
		// declaració de variables
		
		int quantitat = 56;
		double preu = 100.99;
		long distancia = 10000000000L;
		char lletra = 'a';
		boolean correcte = true;
		
		//Lectura del teclat
		Scanner teclat = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		quantitat = teclat.nextInt();
		System.out.println("Introduce un número decimal: ");
		preu = teclat.nextDouble();
		System.out.println("Introduce un número long: ");
		distancia = teclat.nextLong();
		System.out.println("Introduce una letra: ");
		teclat.nextLine();
		lletra = teclat.nextLine().charAt(0);
		System.out.println("Introduce un booleano (true o false): ");
		correcte = teclat.nextBoolean();
		
		
		//System.out.println("Hola Mundo!!");
		
		System.out.println("Quantitat: " + quantitat);
		System.out.println("Preu: " + preu);
		System.out.println("Distància: " + distancia);
		System.out.println("Lletra: " + lletra);
		System.out.println("Correcte: " + correcte);
		
		
		//Llegir teclat amb BufferedReader
		BufferedReader teclado = new BufferedReader(new InputStreamReader (System.in));
		
		int catet1 = Integer.parseInt(teclado.readLine());
		double euros = Double.parseDouble(teclado.readLine());
		boolean correctes = Boolean.parseBoolean(teclado.readLine());
		
		
		
		
	}

}
