package EJER1_Ficheros_Texto;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/*
E05_echo

Programa que guarda en un fichero de texto toda la información que se lee del teclado hasta que se pulse ENTER sin datos.

*/

public class E05_echo {

	public static void main(String[] args) throws IOException {
		String filename = "porteclado.txt";
		
		FileOutputStream fitxer = null;
		
	try {
		fitxer = new FileOutputStream(filename);
	} catch (FileNotFoundException e) {
		System.err.println("No existeix el fitxer " + filename);
		return;
	} catch (SecurityException e) {
		System.err.println("No tens drets d'accés al fitxer " + filename);
		return;
	}
	
	PrintStream sortida = new PrintStream(fitxer);
	BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
	String linia = text.readLine();
	
	while (linia.length()>0) {
		sortida.println(linia);
		linia = text.readLine();
	}
	
	sortida.close();
	text.close();
	fitxer.close();
	
	
	}

}