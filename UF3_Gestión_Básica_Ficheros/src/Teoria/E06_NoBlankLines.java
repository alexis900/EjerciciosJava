package Teoria;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class E06_NoBlankLines {
	/*
	 * E06_NoBlankLines
	 * 
	 * Programa que elimina las líneas vacías de un fichero de texto
	 * 
	 */
	public static void main(String[] args) throws IOException {

		String filename1 = "E06_NoBlankLines.txt"; // Ruta
		String filename2 = "E06_NoBlackLinesFi.txt";
		FileInputStream fitxer = null;
		FileOutputStream fitxer2 = null;
		try {
			fitxer = new FileInputStream(filename1);
			fitxer2 = new FileOutputStream(filename2);
		} catch (FileNotFoundException e) {
			System.err.print("No existeix el fitxer " + filename1 + "o" + filename2);
			return;
		} catch (SecurityException e) {
			System.err.print("No es tenen drets d'acces al fitxer");
			return;
		}

		Scanner text = new Scanner(fitxer);
		PrintStream sortida = new PrintStream(fitxer2);
		while (text.hasNext()) {
			String linea = text.nextLine();
			if (linea.trim().length() > 0) sortida.println(linea);
		}
		text.close();
		fitxer.close();

	}

}