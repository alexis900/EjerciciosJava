import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Practica1UF3 {

	public static void main(String[] args) {
		
		//Ex1
		System.out.println(mesgran("fitxer1.txt", "fitxer.txt"));
		System.out.println(mesgran("fitxer.txt", "fitxer1.txt"));
		
		//Ex4
		porcio("llegir.txt", "escriure.txt", 3, 3);
		porcio("llegir.txt", "escriure2.txt", 2, 2);
		
		//Ex3
		System.out.println(noemails("emails.txt", "sortida.txt")); //Retorna 0
		System.out.println(noemails("emals.txt", "sortida.txt")); //Retorna -1
		
		//Ex2
		rotacio("llegir.txt", "rota.txt");
		
	}
	
	//Ex2
	static void rotacio(String llegir, String escriure) {
		FileInputStream fitxer1 = null;
    	FileOutputStream fitxer2= null;
    	
    	//Comproba si existeix el fitxer de lectura
    	try {
			fitxer1 = new FileInputStream(llegir);
		} catch (FileNotFoundException e) {
			return;
		}
    	
    	try {
			fitxer2 = new FileOutputStream(escriure);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	
    	BufferedReader text = new BufferedReader(new InputStreamReader(fitxer1));
    	PrintStream sortida = new PrintStream(fitxer2);
    	
    	int num_lin = 0, count = 0;
    	String linea = null;
    	try {
    		//Busca la ultima linia i guarda el numero de linia
			while(text.ready()) {
				linea = text.readLine();
				num_lin++;
			}
			//Escriu la ultima linia
			sortida.println(linea);
			text.close();
			text = new BufferedReader(new InputStreamReader(fitxer1));
			//Escriu les primeres linies excepte la última
			while(text.ready()) {
				linea = text.readLine();
				sortida.println(linea);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	try {
    		sortida.close();
    		text.close();
        	fitxer2.close();
        	fitxer1.close();
    	} catch (Exception e) {
    		System.out.println("Error");
    	}
    	
	}
	
	//Ex3
	static int noemails(String llegir, String escriure) {
		FileInputStream fitxer1 = null;
    	FileOutputStream fitxer2= null;
    	
    	//Comproba si existeix el fitxer de lectura
    	try {
			fitxer1 = new FileInputStream(llegir);
		} catch (FileNotFoundException e) {
			return -1;
		}
    	
    	try {
			fitxer2 = new FileOutputStream(escriure);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	
    	BufferedReader text = new BufferedReader(new InputStreamReader(fitxer1));
    	PrintStream sortida = new PrintStream(fitxer2);
    	
    	try {
    		//Comproba que no ha acabat el fitxer
			while(text.ready()) {
				//Agafa la primera linea del ready i la desa al String linea
				String linea = text.readLine();
				//Substitueix la @ per (a)
				linea = linea.replaceAll("@", "(a)");
				//Escriu linea al fitxer de sortina
				sortida.println(linea);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	try {
    		sortida.close();
        	text.close();
        	fitxer2.close();
        	fitxer1.close();
    	} catch (Exception e) {
    		System.out.println("Error");
    	}
    	
		return 0;
	}
	
	//Ex4
    static void porcio(String llegir, String escriure, int inicial, int num) {
    	FileInputStream fitxer1 = null;
    	FileOutputStream fitxer2= null;
    	
    	//Comproba si existeix el fitxer de lectura
    	try {
			
    		fitxer1 = new FileInputStream(llegir);
		} catch (FileNotFoundException e) {
			System.out.println("No existeix el fitxer " + llegir);
			return;
		}
    	
    	try {
			fitxer2 = new FileOutputStream(escriure);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}
    	
    	BufferedReader text = new BufferedReader(new InputStreamReader(fitxer1));
    	PrintStream sortida = new PrintStream(fitxer2);
    	
    	//Comencen els comtadors
    	int count = 0, count_num = 0;
    	try {
    		//Comproba que no ha acabat el fitxer
			while(text.ready()) {
				//Copia la linea en un String
				String linea = text.readLine();
				count++;
				//Comproba que estigui dins del rang
				if(count >= inicial && count_num < num) {
					//Escriu la linea al fitxer d'escriptura
					count_num++;
					sortida.println(linea);
				}
				
				//Si ja no tenim que mirar més, acabarem el bucle
				if(count_num > num) break;
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	try {
    		sortida.close();
        	text.close();
        	fitxer2.close();
        	fitxer1.close();
    	} catch (Exception e) {
    		System.out.println("Error!");
    	}
    	
	}

	//Ex1
	static String mesgran (String f1, String f2) {
		FileInputStream fi1 = null;
		FileInputStream fi2 = null;
		boolean exists1 = false, exists2 = false;
		
		try {
			fi1 = new FileInputStream(f1);
			exists1 = true;
		} catch (FileNotFoundException e) {
			System.err.println("No existeix el fitxer " + f1);
			return null;
		}
		
		try {
			
			fi2 = new FileInputStream(f2);
			exists2 = true;
		} catch (FileNotFoundException e) {
			System.err.println("No existeix el fitxer " + f2);
			return null;
		}
		
		BufferedReader text1 = new BufferedReader(new InputStreamReader(fi1));
		BufferedReader text2 = new BufferedReader(new InputStreamReader(fi2));
		
		long count1 = 0, count2 = 0;
		
		//Comprobem si existeix el fitxer1
		if(exists1) {
			try {
				//Llegeix cada linea del primer fitxer
				while (text1.ready()) {
					text1.readLine();
					count1++;
				}
				exists1= false;
			} catch (IOException e) {
				System.out.println("No es pot llegir el fitxer " + f1);
			}
		}
		
		//Comprobem que existeix el fitxer2
		if(exists2) {
			try {
				//Llegeix cada linea del segon fitxer
				while(text2.ready()) {
					text2.readLine();
					count2++;
				}
				exists2 = false;
			} catch (IOException e) {
				System.out.println("No es pot llegir el fitxer" + f2);
			}
		}
		
		try {
			text2.close();
			text1.close();
			fi2.close();
			fi1.close();
		} catch (Exception e) {
			System.out.println("Error");
		}
		
		//Comproba que el fitxer1 sigui més gran que el 2 i a l'inversa
		if(count1 > count2) return f1; 
		else return f2;
		
		
	}

}
