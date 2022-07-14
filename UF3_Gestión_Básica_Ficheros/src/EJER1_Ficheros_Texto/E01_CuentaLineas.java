package EJER1_Ficheros_Texto;

/*
E01_CuentaLineas

Programa que cuenta las líneas de un fichero de texto

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class E01_CuentaLineas {

	public static void main(String[] args) throws IOException {
		String filename = "prueba.txt";
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
		//Scanner text = new Scanner(fitxer);
		
		int count = 0;
		//while (text.hasNext()) {
		while (text.ready()) {
			//text.nextLine();
			text.readLine();
			count++;
		}
		
		text.close();
		fitxer.close();
		System.out.printf("El fichero %s tiene %d linea(s)", filename, count);
	}

}
