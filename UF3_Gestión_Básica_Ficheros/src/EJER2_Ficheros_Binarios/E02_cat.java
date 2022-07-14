package EJER2_Ficheros_Binarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class E02_cat {

	public static void main(String[] args) {
		cat("enters.dat");
	}
	
	static void cat(String fitxer) {
		FileInputStream fis = null;
		ObjectInputStream dades = null;
		try {
			fis = new FileInputStream(fitxer);
		} catch (FileNotFoundException e) {
			System.err.println("El fichero " + fitxer + " no existe");
		}
	    
		try {
			dades = new ObjectInputStream(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			while(dades.available() > 0) {
				System.out.println(dades.readInt());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			dades.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
