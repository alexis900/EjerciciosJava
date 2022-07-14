package EJER1_Ficheros_Texto;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/*
Crea un mètode amb identificador referendum que retorni la quantitat
de vots vàlids que conté un fitxer. El mètode tindrà un paràmetre de
tipus String amb el nom del fitxer. A cada línia hi haurà un vot que 
pot ser SI, NO o qualsevol altre cas que seria vot nul. 
Retornarà la quantitat de vots vàlids ( SI o NO).
 
Exemple: (Aquest fitxer conté 10 línies = 10 vots)
SI
NO
NOSÉ
ININDE
MAI
SI
 
NO
SI
NO
 */

public class E11_Consulta {

	public static void main(String[] args) throws IOException {
		String consulta = "consulta.txt";
		System.out.println(cuentaVotos(consulta));
	}
	
	static long cuentaVotos (String fichero) {
		FileInputStream co = null;
	try {
		co = new FileInputStream(fichero);
	} catch (FileNotFoundException e) {
		System.err.println("No existeix el fitxer " + fichero);
		return 0;
	} catch (SecurityException e) {
		System.err.println("No tens drets d'accés al fitxer " + fichero);
		return 0;
	}
	
	BufferedReader p = new BufferedReader(new InputStreamReader(co));
	long count = 0;
	try {
		while (p.ready()) {
			String linea = p.readLine();
			if(linea.equalsIgnoreCase("SI") || linea.equalsIgnoreCase("NO")) {
				count++;
			}
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	try {
		p.close();
		co.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	return count;
	}
}
