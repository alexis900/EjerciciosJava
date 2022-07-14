package EJER1_Ficheros_Texto;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/*
E08_GruposAB
 
Tenemos un fichero con un listado de alumnos como este:
 
Abad Mesa, Oscar:B
Agustín Pérez, Arturo:A
Bespa Cinta, Dunia:A
Betas Sorribas, Mario:B
Cano Doménguez, Carlos:B
Casano Minguillon, Alejandro:A
Darpa Sánchez, Néstor:B
Fleming Sánchez, Andrés:A
Gates Heredia, Marcos:B
Martínez Graupera, Kevin:A
Piera Molina, Manuel:B
 
Escribe un programa que guarde en dos ficheros diferentes, �grupoa.txt� y �grupob.txt�, 
los alumnos del grupo A y del grupo B por separado.
 
*/

public class E08_GruposAB {

	public static void main(String[] args) throws IOException {
		String filenameab = "ab.txt";
		String filenamea = "a.txt";
		String filenameb = "b.txt";
		
		FileInputStream fitxerab = null;
		FileOutputStream fitxera = null;
		FileOutputStream fitxerb = null;
	try {
		fitxerab = new FileInputStream(filenameab);
		fitxera = new FileOutputStream(filenamea);
		fitxerb = new FileOutputStream(filenameb);
	} catch (FileNotFoundException e) {
		System.err.println("No existeix el fitxer " + filenameab);
		return;
	} catch (SecurityException e) {
		System.err.println("No tens drets d'accés al fitxer " + filenameab);
		return;
	}
	
	BufferedReader textab = new BufferedReader(new InputStreamReader(fitxerab));
	PrintStream sortidaa = new PrintStream(fitxera);
	PrintStream sortidab = new PrintStream(fitxerb);
	
	while (textab.ready()) {
		String linea = textab.readLine();
		if(linea.charAt(linea.length()-1) == 'A') sortidaa.println(linea);
		else if(linea.charAt(linea.length()-1) == 'B') sortidab.println(linea);
	}
	
	textab.close();
	fitxerab.close();
	sortidab.close();
	sortidaa.close();
	fitxera.close();
	
	}

}
