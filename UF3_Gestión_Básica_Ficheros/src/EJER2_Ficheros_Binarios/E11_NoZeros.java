package EJER2_Ficheros_Binarios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
Crea un mètode amb identificador nozeros que elimini els enters zero (0) en 
un fitxer d'enters passat per paràmetre, el mètode haurà de llegir tot 
el fitxer i escriure el contingut en un altre fitxer eliminant els zeros. 
El mètode tindrà com a paràmetres dos noms de fitxer,  el primer
correspon al fitxer original del que no s'ha de modificar el contingut, 
el segon correspon al fitxer que s'ha de crear amb els canvis demanats.
Aquest mètode retornarà 0 si ha pogut crear el fitxer o
-1 en cas d'error.
 
*/
public class E11_NoZeros {

	public static void main(String[] args) {
		System.out.println(nozeros("a.dat", "b.dat"));

	}

	static int nozeros(String origen, String desti) {
		RandomAccessFile file = null;
		RandomAccessFile file2 = null;
		try {
			file = new RandomAccessFile(origen, "r");
			file2 = new RandomAccessFile(desti, "rw");
		} catch (FileNotFoundException e) {
			System.out.println("No es troba el fitxer " + origen);
			return -1;
		}
		
		try {
			while(file.getFilePointer() < file.length()) {
				int num = (int) file.readInt();
				if(num != 0) {
					file2.writeInt(num);
				}
			}
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}

}
