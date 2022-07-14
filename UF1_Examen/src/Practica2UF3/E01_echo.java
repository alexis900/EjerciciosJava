package Practica2UF3;

/*
E01_echo
 
Programa que guarda en un fitxer binari nombres enters entrats per teclat fins que es premi ENTER sense dades.
 
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class E01_echo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String fi = "fitxer.dat";
			echo(fi);
	}
	
	static void echo(String fitxer) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			try {
				fos = new FileOutputStream(fitxer);
				 try {
					oos = new ObjectOutputStream(fos);
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			
			System.out.println("Introduce un número:");
			String linea = null;
			try {
				linea = entrada.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			while(linea.length() > 0) {
				try {
					oos.writeInt(Integer.parseInt(linea));
					linea = entrada.readLine();
				} catch (NumberFormatException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
		}
	}
}
