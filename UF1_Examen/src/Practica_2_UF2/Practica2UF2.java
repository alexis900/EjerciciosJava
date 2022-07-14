package Practica_2_UF2;

import org.omg.Messaging.SyncScopeHelper;

class Marca2 {
	String nom;
	double temps;
	int dorsal;
	
	Marca2 (String n, double t, int d){
		n = nom;
		t = temps;
		d = dorsal;
	}
	
	Marca2(){}
	
	@Override
	public String toString() {
			return String.format("{'%s' '%.2f' '%d'}", nom, temps, dorsal);
	}
}

public class Practica2UF2 {
	public static void main(String[] args) {
		Practica2UF2 p = new Practica2UF2();
		Marca2 m = new Marca2();
		
		//Ex1
		String frase = "holmes@gmail.com house@gmail.com poirot@gmail.com marlowe@gmail.com";
		String fra = ".com";
		String fra2 = "@gmail.com";
		
		System.out.println(p.compta(frase, fra));
		System.out.println(p.compta(frase, fra2));
		
		//Ex2
		String[] diverses = {"prova", "Total", "2fast4you", "¡peligro!", "fALLAS", "Padre"};
		String[] diverses2 = {"¡Hola!", "adeu", "1two3", "¡ayuda!", "Verdaderas", "no"};
		
		String[] minuscules = new String[diverses.length];
		String[] mayuscules = new String[diverses.length];
		
			//Crida 1
			System.out.println(p.separa(diverses, minuscules, mayuscules));
			//Crida 2
			System.out.println(p.separa(diverses2, minuscules, mayuscules));
			
		//Ex3
		Marca2 esportista[] = {
					new Marca2("Andre De Grasse", 9.91, 8008),
					new Marca2("Yohan Blake", 9.93, 4302),
					new Marca2("Justin Gatlin", 9.89, 2876),
					new Marca2("Usain Bolt", 9.81, 3456)
			};
		
		Marca2 esportista2[] = {
				new Marca2("Andre De Grasse", 9.32, 8008),
				new Marca2("Yohan Blake", 9.93, 4302),
				new Marca2("Justin Gatlin", 3.21, 2876),
				new Marca2("Usain Bolt", 9.91, 3456)
		};
		
			System.out.println(p.plata(esportista));
			System.out.println(p.plata(esportista2));
			
		
		//Ex4
		String s1 = "++*++*++*++*++";
		String s2 = "++*+**++*++*++";
		
		System.out.println(p.correcte(s1));
		System.out.println(p.correcte(s2));
	}
	
	//Ex1
	
	String compta(String frase, String fra) {
			//Reemplaza el contenido que coincida con "fra" de la frase por nada
			frase = frase.replace(fra,"");
		return frase;
	}
	
	//Ex2 
		int separa (String[] diverses, String[] minuscules, String[] mayuscules) {
			String paraula = "";
			int minC = 0, mayC = 0, count = 0;
			//Recorre todo el array diverses
			for(int i = 0;i < diverses.length;i++) {
				paraula = diverses[i];
				char lletra = ' ';
				//Coge la primera letra de cada palabra
				for(int j = 0;j < paraula.length();j++) {
					 lletra = paraula.charAt(0);
				}
				
				//Comprueba si la letra es minuscula
				if(Character.isLowerCase(lletra)) {
					minuscules[minC] = diverses[i];
					count++; minC++;
				}
				
				//Comprueba si la letra es mayuscula
				if(Character.isUpperCase(lletra)) {
					mayuscules[mayC] = diverses[i];
					count++; mayC++;
				}
			}
			
			return count;
		}
		
	//Ex3
		Marca2 plata (Marca2[] plata) {
			int i = 0;
			for(i = 0;i < plata.length;i++) {
				System.out.printf("%s %.2f %d", plata[0], plata[1], plata[2]);
			}
			
			//return plata[i].nom;
			return plata[i];
		}
		
	//Ex4
	boolean correcte(String s1) {
		/*while (s1.contains("++*") || s1.contains("*++") ) {
			if (s1.contains("++*")) {
				s1 = s1.replace("", "++*");
			}
			
			if(s1.contains("*++")) {
				s1 = s1.replace("", "*++");
			}
			
		}
		
		if(s1.equals("")) {
			return true;
		}
		*/
		return false;
		
	}
		
		
}
