package EJER1_Ficheros_Texto;

/*
E02_cat

Programa que lee las lineas de un fichero y las muestra por pantalla.

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class E02_cat {

	public static void main(String[] args) throws IOException {
		String filename = "/etc/passwd";
		FileInputStream fitxer = null;
		try {
			fitxer = new FileInputStream(filename);
		} catch (FileNotFoundException e) {
			System.err.println("No existeix el fitxer " + filename);
			return;
		} catch (SecurityException e) {
			System.err.println("No tens drets d'accés al fitxer " + filename);
			return;
		}
		
		BufferedReader text = new BufferedReader(new InputStreamReader(fitxer));
		
		while (text.ready()) {
			System.out.println(text.readLine());
		}
		
		text.close();
		fitxer.close();
	}

}
