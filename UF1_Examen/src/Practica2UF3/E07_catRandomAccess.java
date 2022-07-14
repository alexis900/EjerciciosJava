package Practica2UF3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class E07_catRandomAccess {

	public static void main(String[] args) {
		cat("fitxer3.dat");
	}

	static void cat(String fitxer) {
		RandomAccessFile file = null;
		try {
			file = new RandomAccessFile(fitxer, "r");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			while (file.getFilePointer() < file.length()) {
				System.out.print(file.readInt() + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
