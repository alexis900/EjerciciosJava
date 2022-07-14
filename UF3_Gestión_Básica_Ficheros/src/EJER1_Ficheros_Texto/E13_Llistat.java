package EJER1_Ficheros_Texto;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/*
Crea un mètode amb identificador llista que escrigui en un fitxer 
una llista de paraules. El mètode tindrà 2 paràmetres: el nom del 
fitxer i un array de String. Haurà d'escriure tots els Strings en 
el fitxer afegint un salt de línia per a cada String. 
No s'ha d'esborrar el contingut previ del fitxer, s'ha d'escriure 
la llista a continuació de les dades existents. 
Aquest mètode no retorna res.
 
 */

public class E13_Llistat {

	public static void main(String[] args) throws IOException {
		String llista[] = {"hola", "ola", "la", "a"};
		concatena("concat.txt", llista);
	}

	static void concatena(String escriptura, String[] llista) {
		FileOutputStream esc = null;
		try {
			esc = new FileOutputStream(escriptura, true);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	
	PrintStream in = new PrintStream(esc);
	for(int i = 0;i < llista.length;i++) {
		in.println(llista[i]);
	}
	
	try {
		in.close();
		esc.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}
}
