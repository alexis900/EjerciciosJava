package Practica2UF3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;

public class Practica2UF3 {

	public static void main(String[] args) {
		//Ex1
		System.out.println(mesllarg("fitxer.dat", 5));
		System.out.println(mesllarg("fitxer.dat", 7));
		
		//Ex2
		modifica("fitxer1.dat", 2);
		modifica("fitxer3.dat", 5);
		
		//Ex3
		rotacio2("lectura.dat", "escriptura.dat");
		rotacio2("lectura1.dat", "escriptura1.dat");
		
		//Ex4
		posicions("fitxer2.dat", "resultat.dat", 4);
		posicions("fitxer2.dat", "resultat2.dat", 8);
	}
	
	//Ex4
	static void posicions(String lectura, String escriptura, int num) {
		int pos = 0;
		RandomAccessFile file1 = null;
		RandomAccessFile file2 = null;
		try {
			file1 = new RandomAccessFile(lectura, "r");
			file2 = new RandomAccessFile(escriptura, "rw");
			while(file1.getFilePointer()<file1.length()) {
				//Llegeix el primer fitxer i ho fica en una variable
				int bnum = (int) file1.readInt();
				if(bnum == num) {
					//Escriu al segon fitxer
					file2.writeInt(pos);
				}
				//Suma 1 la posició
				pos++;
			}
			
			file2.close();
			file1.close();
		} catch (FileNotFoundException e) {
			System.err.println("No existeix el fitxer " + lectura);
			return;
		} catch (IOException e) {
			System.err.println("No es pot llegir el fitxer " + lectura);
			return;
		}
		
	}
	
	static int read(RandomAccessFile file, long pos)  {
        try {
        	file.seek(pos*4);
        	if (file.getFilePointer()<file.length()) return file.readInt();
		} catch (IOException e) {
			System.out.println("Error de permisos en el fitxer " + file);
			return 0;
		}
        return 0;
    }
	
	static void write(RandomAccessFile fitxer, long pos, int valor) {
        try {
			fitxer.seek(pos*4);
			fitxer.writeInt(valor);	
		} catch (IOException e) {
		}
    }

	static void rotacio2(String lectura, String escriptura) {
	        RandomAccessFile file = null;
	        RandomAccessFile file2 = null;
	        try {
	        	file2 = new RandomAccessFile(escriptura, "rw");;
	            file = new RandomAccessFile(lectura, "r");
	            long quantitat=file.length()/4;
		         
		        int ultim=read(file, quantitat-1);
		        
		        if (file.length()==0) {
		            System.err.println("El fitxer està buit");
		            file.close();
		            return;
		        }
		        
		 
		        for (long i=quantitat-2; i>0; i--) {
		             
		            int valor = 0;
		            write(file2, i-2, valor);
		            write(file2, i, valor);

		        	write(file2, 0, ultim);
					file.close();
		        }
	        } catch (FileNotFoundException e) {
	            System.err.println("No existeix el fitxer " + lectura);
	            return;
	        } catch (SecurityException e) {
	        	System.err.println("No es tenen drets d'accés al fitxer "
	                    + lectura);
	            return;
	        } catch (IOException e) {
	        	 System.err.println("No es tenen drets d'accés al fitxer "
		                    + lectura);
	        	 return;
			}
	 
	   }

	static void modifica(String fitxer, int suma) {
		RandomAccessFile file = null;
		try {
			file = new RandomAccessFile(fitxer, "rw");
			while(file.getFilePointer()<0) {
				//Llegeix els enters
				int num = (int) file.readInt();
				//Suma el numero obtingut amb el que li hem dit
				int nums = num + suma;
				//Ho escriu al mateix fitxer
				file.writeInt(nums);
			}
			file.close();
		} catch (FileNotFoundException e) {
			System.err.println("No existeix el fitxer " + fitxer);
			return;
		} catch (IOException e) {
			System.err.println("No es pot llegir el fitxer " + fitxer);
			return;
		}
	}
	
	//Ex1
	static boolean mesllarg(String nom, int num) {
		int count = 0;
		FileInputStream fitxer = null;
		ObjectInputStream dades = null;
		try {
			fitxer = new FileInputStream(nom);
			dades = new ObjectInputStream(fitxer);
			
			
			while(dades.available() > 0) {
				//Llegeix el Int i li sumem 1 al contador
				dades.readInt();
				count++;
			}
			
			dades.close();
			fitxer.close();
			//Comproba el contador amb el número màxim
			if(count <= num) return true;
			else return false;
		} catch (FileNotFoundException e) {
			System.err.println("El fitxer no existeix " + nom);
			return false;
		} catch (IOException e) {
			System.err.println("Error de permisos al fitxer " + nom);
			return false;
		}
			
	}

}
