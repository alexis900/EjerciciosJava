package EJER1_Ficheros_Texto;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/*
Crea un mètode amb identificador fragment que servirà per crear
un fitxer amb una part del contingut d'un altre fitxer.  
El mètode tindrà com a paràmetres el nom d'un fitxer a llegir, 
el nom d'un fitxer nou que hem de crear, un número de línia 
inicial i un número de línia final. El primer fitxer serà el 
que hem de llegir, el mètode haurà de llegir el contingut 
d'aquest fitxer i escriure, en el nou fitxer a crear, només 
les línies des de la número inicial fins a la número final ( incloses ).
Podem suposar que els paràmetres línia inicial i final 
seran correctes i corresponen a dades vàlides del fitxer a llegir. 
Si el fitxer a llegir no existeix aleshores no ha de fer res i retorna 0.  
El mètode ha de retornar la quantitat de línies escrites.
 
Exemple. El fitxer a llegir té el següent contingut:
 
Fitxer de proves
El mètode ha de funcionar
amb qualsevol fitxer
Punt i final.
 
Suposem que demanem la porció des de la línia inicial 2 fins a la línia final 3. 
El fitxer nou que es crearà tindrà aquestes línies:
El mètode ha de funcionar
amb qualsevol fitxer
 
El mètode retornarà el valor 2 ( ha escrit dues línies )
  
 */

public class E12_Fragment {

	public static void main(String[] args) throws IOException {
		System.out.println(fragment("lectura.txt", "escriptura.txt", 2, 3));
	}
	
	static long fragment (String lectura, String escritura, int inicial, int finals) {
		FileInputStream lec = null;
		FileOutputStream esc = null;
	try {
		lec = new FileInputStream(lectura);
		esc = new FileOutputStream(escritura);
	} catch (FileNotFoundException e) {
		System.err.println("No existeix el fitxer " + lectura);
		return 0;
	} catch (SecurityException e) {
		System.err.println("No tens drets d'accés al fitxer " + lectura);
		return 0;
	}
	
	BufferedReader p = new BufferedReader(new InputStreamReader(lec));
	PrintStream i = new PrintStream(esc);
	long count = 1;
	long count_e = 0;
	try {
		while (p.ready()) {
			String linea = p.readLine();
			count++;
			if(count >= inicial && count <= finals) {
				count_e++;
				i.println(linea);
			}
			
			if(count > finals) {
				break;
			}
			
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	try {
		i.close();
		p.close();
		esc.close();
		lec.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	return count_e;
	}
}
