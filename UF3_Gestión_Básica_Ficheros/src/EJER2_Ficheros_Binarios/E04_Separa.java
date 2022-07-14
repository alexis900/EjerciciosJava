package EJER2_Ficheros_Binarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class E04_Separa {

	public static void main(String[] args) {
		separa("separa.dat", "pares.dat", "impares.dat");

	}
	
	static void separa(String principal, String pares, String impares) {
		FileInputStream fPr = null;
		ObjectInputStream ficheroPrincipal = null;
		FileOutputStream fP = null;
		ObjectOutputStream ficheroPares = null;
		FileOutputStream fI = null;
		ObjectOutputStream ficheroImpares = null;
		
		try {
			fPr = new FileInputStream(principal);
			fP = new FileOutputStream(pares);
			fI = new FileOutputStream(impares);
		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero " + principal);
		}
		
		try {
			ficheroPrincipal = new ObjectInputStream(fPr);
			ficheroPares = new ObjectOutputStream(fP);
			ficheroImpares = new ObjectOutputStream(fI);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			int num = 0;
			while(ficheroPrincipal.available() > 0) {
				num = ficheroPrincipal.readInt();
				if(num%2 == 0) ficheroPares.writeInt(num);
				else ficheroImpares.writeInt(num);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		
		try {
			ficheroImpares.close();
			fI.close();
			ficheroPares.close();
			fP.close();
			ficheroPrincipal.close();
			fPr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
