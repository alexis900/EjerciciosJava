package EJER2_Ficheros_Binarios;
/*
Crea un mètode amb identificador porcio que servirà per crear 
un fitxer d'enters amb el contingut d'una porció d'un altre 
fitxer d'enters.  El mètode tindrà com a paràmetres el 
nom d'un fitxer a llegir, el nom d'un fitxer nou que hem de crear, 
una posició d'enter inicial (comptat des de zero) i 
la quantitat d'enters a llegir. 
El primer fitxer serà el que hem de llegir, el mètode haurà de 
llegir el contingut d'aquest fitxer i escriure, en el nou fitxer 
a crear, només els enters des de la posició inicial i en la 
quantitat indicada.
Podem suposar que els paràmetres posició inicial i quantitat d'enters a
llegir seran correctes i corresponen a dades vàlides del fitxer a llegir. 
Si el fitxer a llegir no existeix aleshores no ha d'escriure res. 
Aquest mètode no retorna res.
 
Exemple:
Fitxer a llegir té el següent contingut
27
87
93
223
654
902
Suposem que demanem la porció des de la posició inicial 3 i en quantitat 2. 
El fitxer nou que es crearà, contindrà:
223
654
*/
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
 
public class E12_Porcio{
     
    static void porcio(String fitxerEnt, String fitxerSor, int posI, int quantitat) {
		RandomAccessFile file = null;
		RandomAccessFile file2 = null;
		try {
			file = new RandomAccessFile(fitxerEnt, "r");
			file2 = new RandomAccessFile(fitxerSor, "rw");
			int i = 1, j = 0, n = 0;
			file.seek(i*4);
			while(file.getFilePointer() < file.length()) {
				n = (int) file.readInt();
				if(j < quantitat) {
					file2.writeInt(n);
					j++;
				}
			}
			file.close();
			file2.close();
		} catch (FileNotFoundException e) {
			System.out.println("No es troba el fitxer " + fitxerEnt);
			return;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
 
    public static void main(String args[]) {

        porcio("fitxer.dat", "proves3.dat", 3, 2);
        porcio("proves2.dat", "proves4.dat", 1, 4);
    }
 
}