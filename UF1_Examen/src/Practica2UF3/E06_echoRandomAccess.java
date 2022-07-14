package Practica2UF3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class E06_echoRandomAccess {

	public static void main(String[] args) {
		echo("fitxer3.dat");
	}
	
	static void echo (String fitxer) {
		RandomAccessFile file = null;
		try {
			file = new RandomAccessFile(fitxer, "rw");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		try {
			file.setLength(0);
			linea = entrada.readLine();
			while(linea.length() > 0) {
				file.writeInt(Integer.parseInt(linea));
				linea = entrada.readLine();
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	
		try {
			entrada.close();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
