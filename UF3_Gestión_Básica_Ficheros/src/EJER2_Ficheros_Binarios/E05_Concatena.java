package EJER2_Ficheros_Binarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
E05_Concatena
 
Programa que concatena els fitxers "parells.dat" i "senars.dat" en un fitxer "enters.dat"
 
*/

public class E05_Concatena {

	public static void main(String[] args) {
		concatena("pares.dat", "impares.dat", "enters.dat");

	}

	static void concatena(String parells, String senars, String enters) {
		FileInputStream lecturaP = null;
		ObjectInputStream lP = null;
		FileInputStream lecturaS = null;
		ObjectInputStream lS = null;
		FileOutputStream escripturaE = null;
		ObjectOutputStream eE = null;
		
		try {
			lecturaP = new FileInputStream(parells);
			lecturaS = new FileInputStream(senars);
			escripturaE = new FileOutputStream(enters);
		} catch (FileNotFoundException e) {
			System.err.println("No existe el fichero " + parells + " o " + senars);
		}
		
		try {
			lP = new ObjectInputStream(lecturaP);
			lS = new ObjectInputStream(lecturaS);
			eE = new ObjectOutputStream(escripturaE);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			while(lP.available() > 0) {
				eE.writeInt(lP.readInt());
			}
			
			while(lS.available() > 0) {
				eE.writeInt(lS.readInt());
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			eE.close();
			escripturaE.close();
			lS.close();
			lecturaS.close();
			lP.close();
			lecturaP.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
