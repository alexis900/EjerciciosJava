package Esqui;
import java.util.Scanner;

class Esquiador{
	String nom;
	String dni;
	int nsqui;
	
	Esquiador(String n, String d, int ns){
		nom = n;
		dni = d;
		nsqui = ns;
	}
	
	Esquiador(){}
}

class Hotel{
	String nom;
	String epro;
	double preu;
	
	Hotel(String n, String e, double p){
		nom = n;
		epro = e;
		preu = p;
	}
	
	Hotel(){}
}

class Estacio{
	String nom;
	int altitud;
	boolean ocupada;
	
	Estacio(String n, int a){
		nom = n;
		altitud = a;
	}
	
	Estacio(){}
}

class Fecha{
	int dia, mes;
	
	Fecha(String f){
		String trozos[] = f.split("/");
		dia = Integer.parseInt(trozos[0]);
		mes = Integer.parseInt(trozos[1]);
	}
	
}

class Competicio{
	String nom;
	Fecha data;
	String nom_estacio;
	
	Competicio(String n, String fecha, String ns){
		nom = n;
		nom_estacio = ns;
		data = new Fecha(fecha);
	}
	
	Competicio(){}
}

public class Esqui {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Esquiador esquiador = new Esquiador("Alejandro", "123456A", 3);
		Hotel hotel = new Hotel("Hote de Vallter2000", "Vallter2000", 600);
		
		Estacio est[] = {
				new Estacio("GrandValira", 2000),
				new Estacio("LaMolina", 1600),
				new Estacio("Vallter2000", 2000),
				new Estacio("Baqueira", 1800)
		};
		
		Competicio comp[] = {
				new Competicio("CopaMón", "5/3", "GrandValira"),
				new Competicio("Pirena", "8/3", "LaMolina"),
				new Competicio("Salalom GNU", "14/2", "GrandValira"),
				new Competicio("Snow Java Style", "12/3", "Baqueira")
		};
		
		System.out.println("On vols anar?");
		String estacio = entrada.next();
		
		boolean exist = false;
		int pos = 0;
		for(int i = 0;i < est.length;i++){
				if(estacio.equals(est[i].nom)){
					exist = true;
					pos = i;
					break;
			}
		}
		
		boolean ext = false;
		if(exist){
			for(int i = 0;i < comp.length;i++){
				if(est[pos].nom.equals(comp[i].nom_estacio)){
					System.out.printf("Competició %s el dia %d/%d a %s", comp[i].nom, comp[i].data.dia, comp[i].data.dia, comp[i].nom_estacio);
					ext = true;
				}
			}
			
			if(!ext){
				System.out.println("No hi ha competicions");
			}
		} else {
			System.out.println("ESTACIÓ DESCONEGUDA");
		}
		
		
		System.out.println();
		for(int i = 0;i < comp.length;i++){
			for(int j = 0;j < est.length;j++){
				if(comp[i].nom_estacio.equals(est[j].nom)){
					System.out.printf("La competició %s es farà a %d metres\n", comp[i].nom, est[j].altitud);
				}
			}
		}
		
		
		System.out.println("Introdueix una data:");
		Fecha f1 = new Fecha(entrada.nextLine());
		
		exist = false;
		for(int e = 0;e < est.length;e++){
			boolean ocupada = false;
			for(int c = 0;c < comp.length;c++){
				if(f1.dia == comp[c].data.dia && f1.mes == comp[c].data.mes
						&& comp[c].nom.equalsIgnoreCase(comp[c].nom_estacio)){
					est[e].ocupada = true;
					break;
				}
			}
		}
		
		boolean lliures = false;
		for(int e = 0;e < est.length;e++){
			if(!est[e].ocupada){
				System.out.println(est[e].nom);
				lliures = true;
			}
		}
		
		if(!lliures) System.out.println("TOTES OCUPADES!");
		
	}

}
