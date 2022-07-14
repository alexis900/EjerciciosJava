package EJER2_Ficheros_Binarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class E03_SumaNumeros {
	
	/*
	E03_SumaNumeros
	 
	Programa que llegeix nombres enters d'un fitxer binari, els suma i guarda la suma en un segon fitxer binari.
	 
	*/

	public static void main(String[] args) {
		sumaNumeros("numeros.dat", "resultado.dat");
	}
	
	static void sumaNumeros(String fpri, String fseg) {
		FileInputStream ficheroL = null;
		ObjectInputStream primerFichero = null;
		FileOutputStream ficheroE = null;
		ObjectOutputStream segundoFichero = null;
		
		try {
			ficheroL = new FileInputStream(fpri);
			ficheroE = new FileOutputStream(fseg);
		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero " + fpri);
		}
		
		try {
			primerFichero = new ObjectInputStream(ficheroL);
			segundoFichero = new ObjectOutputStream(ficheroE);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int num = 0;
		try {
			while(primerFichero.available() > 0) {
				num += primerFichero.readInt();
			}
			
			segundoFichero.writeInt(num);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		
		try {
			segundoFichero.close();
			ficheroE.close();
			primerFichero.close();
			ficheroL.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
