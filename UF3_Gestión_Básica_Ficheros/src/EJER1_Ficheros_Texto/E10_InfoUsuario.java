package EJER1_Ficheros_Texto;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/*
E10_InfoUsuario
 
Programa que pide un nombre de usuario y muestra información sobre su cuenta. Por ejemplo :
 
Nombre de usuario : mariano
UID : 1000
GID : 1000
Información : mariano,,,
Directorio personal : /home/mariano
Shell : /bin/bash
Grupos : mariano,adm,cdrom,sudo,dip,plugdev,lpadmin,sambashare
 
Esta información debe obtenerse leyendo el archivo /etc/passwd y el fichero /etc/group
 
 */

public class E10_InfoUsuario {

	public static void main(String[] args) throws IOException {
		String passwd = "/etc/passwd";
		String groups = "/etc/group";
		String info = "info.txt";
		
		FileInputStream pass = null;
		FileInputStream gro = null;
		FileOutputStream inf = null;
	try {
		pass = new FileInputStream(passwd);
		gro = new FileInputStream(groups);
		inf = new FileOutputStream(info);
	} catch (FileNotFoundException e) {
		System.err.println("No existeix el fitxer " + passwd);
		System.err.println("No existeix el fitxer " + groups);
		return;
	} catch (SecurityException e) {
		System.err.println("No tens drets d'accés al fitxer " + passwd);
		System.err.println("No tens drets d'accés al fitxer " + groups);
		return;
	}
	
	System.out.println("Introduce un nombre de usuario:");
	BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader p = new BufferedReader(new InputStreamReader(pass));
	BufferedReader g = new BufferedReader(new InputStreamReader(gro));
	PrintStream i = new PrintStream(inf);
	String nombre = lectura.readLine();
	while (p.ready()) {
		String linea = p.readLine();
		String n = linea.substring(0, linea.indexOf(":", 1));
		if(n.contains(nombre)) {
			String array[] = linea.split(":");
			i.println("Nombre de usuario : " + array[0]);
			i.println("UID : " + array[2]);
			i.println("GID : " + array[3]);
			i.println("Información : " + array[4]);
			i.println("Directorio personal : " + array[5]);
			i.println("Shell : " + array[6]);
			i.print("Grupos : ");
			
			while(g.ready()) {
				String linea2 = g.readLine();
				if(linea2.contains(nombre)) {
					String array2[] = linea2.split(":");
					i.printf("%s,", array2[0]);
				}
			}
			
			i.println("\n");
		}
		
	}
	
	p.close();
	i.close();
	pass.close();
	gro.close();
	inf.close();
	
	}
}
