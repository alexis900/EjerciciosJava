package EJER2_Ficheros_Binarios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*

E09_Rotacio
 
Programa que realitza la rotació dels nombres enters d'un fitxer binari 
creat amb la classe RandomAccessFile. Avança tots els nombres una posició i 
l'últim l'escriu a l'inici del fitxer.
 
Exemple:
 
Fitxer inicialment conté :  34  56  63  112   1   34   5  -34  88
 
Fitxer al final conté:         88  34  56  63  112   1   34   5  -34
 
*/

public class E09_Rotacio {

	public static void main(String[] args) {
		String fitxer = "fitxer.dat";
		int array[]  = {34, 56, 63, 112, 1,  34,  5, -34, 88};
		insertaarray(fitxer, array);
		rota(fitxer);
	}

	static void insertaarray(String fitxer, int[] array) {
		File a = new File(fitxer);
		a.delete();
		
		RandomAccessFile nums = null;
		try {
			nums = new RandomAccessFile(fitxer, "rw");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	static void rota(String fitxer) {
		RandomAccessFile nums = null;
		try {
			nums = new RandomAccessFile(fitxer, "rw");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			//Quantitat d'enters dins del fitxer
			int lon = (int)nums.length()/4;
			
			//Rotació a la dreta
			
			int aux = llegir(nums, lon-1);
			System.out.print(llegir(nums, lon-1) + " ");
			for(int i = lon-1; i>0;i--) {
				int n = llegir(nums, i-1);
				System.out.print(llegir(nums, i-1) + " ");
				escriure(nums, i, n); // nums[i] = nums[i-1];
			}
			
			escriure(nums, 0, aux); // nums[0] = aux
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			nums.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	static void escriure(RandomAccessFile nums, int i, int aux) {
		try {
			nums.seek(i*4);
			nums.writeInt(aux);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static int llegir(RandomAccessFile nums, int longitud) {
		int num = 0;
		try {
			nums.seek(longitud*4);
			num = nums.readInt();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return num;
	}

}
