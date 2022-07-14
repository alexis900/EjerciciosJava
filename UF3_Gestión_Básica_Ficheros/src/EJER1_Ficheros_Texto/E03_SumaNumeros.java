package EJER1_Ficheros_Texto;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
E03_SumaNumeros

Programa que lee números de un fichero, los muestra por pantalla y finalmente muestra la suma de todos.

*/

public class E03_SumaNumeros {

	public static void main(String[] args) throws IOException {
		String filename = "numeros.txt";
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
	double sum = 0;
	while (text.ready()) {
		sum += Double.parseDouble(text.readLine());
	}
	
	text.close();
	fitxer.close();
	System.out.println(sum);
	}

}
