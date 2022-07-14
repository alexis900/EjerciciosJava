package EJER1_Ficheros_Texto;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/*
E04_Concatena

Programa que concatena dos ficheros de texto, es decir añade el contenido de uno a otro ya existente.

*/

public class E04_Concatena {

	public static void main(String[] args) throws IOException {
		String filename1 = "primer.txt";
		String filename2 = "segundo.txt";
		
		FileInputStream fitxer1 = null;
		FileOutputStream fitxer2 = null;
	try {
		fitxer1 = new FileInputStream(filename1);
		fitxer2 = new FileOutputStream(filename2, true);
	} catch (FileNotFoundException e) {
		System.err.println("No existeix el fitxer " + filename1);
		System.err.println("No existeix el fitxer " + filename2);
		return;
	} catch (SecurityException e) {
		System.err.println("No tens drets d'accés al fitxer " + filename1);
		System.err.println("No tens drets d'accés al fitxer " + filename2);
		return;
	}
	
	BufferedReader text1 = new BufferedReader(new InputStreamReader(fitxer1));
	PrintStream sortida = new PrintStream(fitxer2);
	while (text1.ready()) {
		sortida.println(text1.readLine());
	}
	
	text1.close();
	fitxer1.close();
	sortida.close();
	fitxer2.close();
	}

}
