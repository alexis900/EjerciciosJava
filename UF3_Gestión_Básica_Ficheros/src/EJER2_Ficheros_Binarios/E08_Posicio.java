package EJER2_Ficheros_Binarios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

/*
E08_Posicio
 
Programa que demana una posició del fitxer i mostra el nombre enter 
de la posició escollida.
 
*/

public class E08_Posicio {

	public static void main(String[] args) {
		posicio("fitxer.dat");
	}

	static void posicio(String fitxer) {
		RandomAccessFile file = null;
		try {
			file = new RandomAccessFile(fitxer, "rw");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			int num = Integer.parseInt(entrada.readLine());
			file.seek(num*4);
			if(file.getFilePointer() < file.length()) {
				System.out.println(file.readInt());
			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			entrada.close();
			file.close();
		} catch (IOException e) {
			return;
		}
		
	}

}
