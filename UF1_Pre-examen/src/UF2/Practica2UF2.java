package UF2;

import java.util.Arrays;

import org.omg.Messaging.SyncScopeHelper;

class Marca {

	String nom;
	double temps;
	int dorsal;
	
	Marca(String n, double t, int d) {
		nom=n;
		temps=t;
		dorsal=d;
	}
	
	@Override
	public String toString() {
		return nom+", "+temps+", "+dorsal;
	}
}

public class Practica2UF2 {
	public static void main(String[] args) {
		Practica2UF2 p = new Practica2UF2();
		
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
		Marca esportista[] = {
					new Marca("Andre De Grasse", 9.91, 8008),
					new Marca("Yohan Blake", 9.93, 4302),
					new Marca("Justin Gatlin", 9.89, 2876),
					new Marca("Usain Bolt", 9.81, 3456)
			};
		
		Marca esportista2[] = {
				new Marca("Andre De Grasse", 9.32, 8008),
				new Marca("Yohan Blake", 9.93, 4302),
				new Marca("Justin Gatlin", 3.21, 2876),
				new Marca("Usain Bolt", 9.91, 3456)
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
					minuscules[minC] = minuscules[minC].toLowerCase();
					count++; minC++;
				}
				
				//Comprueba si la letra es mayuscula
				if(Character.isUpperCase(lletra)) {
					mayuscules[mayC] = diverses[i];
					mayuscules[mayC] = mayuscules[mayC].toUpperCase();
					count++; mayC++;
				}
			}
			System.out.println(Arrays.toString(mayuscules));
			System.out.println(Arrays.toString(minuscules));
			return count;
		}
		
	//Ex3
		Marca plata (Marca[] participants) {
			if (participants.length<=1) return null;
			Marca primer=participants[0];
			Marca segon=participants[1];
			if (primer.temps>segon.temps ) {
				Marca aux=primer;
				primer=segon;
				segon=aux;
			}
			for (int i=2; i<participants.length; i++) {
				if (participants[i].temps<primer.temps) {
					segon=primer;
					primer=participants[i];
				}
				else if (participants[i].temps<segon.temps) {
					segon=participants[i];
				}
			}
			return segon;
		}
		
	//Ex4
	boolean correcte(String cadena) {
		String pauta="";
		int l=0;
		if (cadena.startsWith("++*")) {
			pauta="++*";
			l=2;
		}
		else if (cadena.startsWith("*++")) {
			pauta="*++";
			l=1;
		}
		else return false;
		int i;
		for (i=0; i<cadena.length()-2; i+=3) {
			if(!cadena.substring(i, i+3).equals(pauta)) {
				return false;
			}
		}
		if (i<cadena.length()) {
			return (pauta.substring(0,l).equals(cadena.substring(i)));
		}
		return true;
	}
		
		
}
