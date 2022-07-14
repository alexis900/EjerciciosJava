package EJER2_Ficheros_Binarios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

/*
Crea un mètode amb identificador penultim que escrigui, en un 
fitxer binari d'enters, un nombre enter passat per paràmetre i 
ho faci a la penúltima posició. El mètode tindrà dos paràmetres,
el nom del fitxer i l'enter. Haurà d'escriure l'enter a la penúltima 
posició del fitxer conservant el contingut previ. 
Aquest mètode no retorna res.
 
Exemple:
Fitxer:
123
54
342
734
98
Enter:
24
 
Resultat:
123
54
342
734
24
98
 
*/

public class E10_Penultim {

	public static void main(String[] args) {
		penultim("a.dat", 50);
	}

	static void penultim(String fitxer, int num) {
		RandomAccessFile file = null;
		try {
			file = new RandomAccessFile(fitxer, "rw");
		} catch (FileNotFoundException e) {
			System.out.println("No es troba el fitxer " + fitxer);
			return;
		}
		
		try {
			
			file.seek(file.length()-4);
			int nums = (int) file.readInt();
			file.seek(file.length()-4);
			file.writeInt(num);
			file.writeInt(nums);
			file.close();
		} catch (IOException e) {
			return;
		}
	}
	
	

}
