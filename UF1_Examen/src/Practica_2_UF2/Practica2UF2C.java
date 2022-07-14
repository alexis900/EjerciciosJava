package Practica_2_UF2;
import java.util.Arrays;

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

public class Practica2UF2C {

	/**
	 * Elimina l'String subs de la frase
	 * @param frase String que volem modificar
	 * @param subs String que volem esborrar
	 * @return String modificat
	 */
	String compta(String frase, String subs) {
		return frase.replaceAll(subs,"");
	}

	/**
	 * Separa les paraules d'un array segons si comencen per minúscula o majúscula
	 * @param paraules  array d'entrada amb les paraules a separar
	 * @param minus  array resultant amb les que comencen amb minúscula
	 * @param majus  array resultant amb les que comencen amb majúscula
	 * @return La quantitat de paraules separades
	 */
	int separa(String[] paraules, String[] minus, String[] majus) {
		int posmin=0;
		int posmaj=0;
		for (int i=0; i<paraules.length; i++) {
			char c=paraules[i].charAt(0);
			if (Character.isLowerCase(c)) {
				minus[posmin]=paraules[i].toLowerCase();
				posmin++;
			}
			if (Character.isUpperCase(c)) {
				majus[posmaj]=paraules[i].toUpperCase();
				posmaj++;
			}
		}
		return posmaj+posmin;
	}

	/**
	 * Busca quin objecte Marca d'un array és el que ha quedat segon
	 * @param participants array de Marca que conté els resultats, no necessariament ordenat.
	 * @return objecte Marca segon
	 */
	static Marca plata(Marca[] participants) {
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

	/**
	 * Comprova si un String és combinació de "++" i "*"
	 * @param cadena String a verificar
	 * @return true si és una combinació correcte, false en altre cas
	 */
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

	public static void main(String[] args) {

		Practica2UF2C programa=new Practica2UF2C();
		
		System.out.println(programa.compta("holmes@gmail.com house@gmail.com poirot@gmail.com marlowe@gmail.com",".com"));
		System.out.println(programa.compta("Aquesta frase no conté CAP adreça de correu electrònic.",".com"));
		
		String paraules[]={"prova", "Total", "2fast4you", "¡peligro!", "fALLAS", "Padre"};		
		String paraules2[]= {"programa", "programadora", "programable", "programación", "programar", "programático"};
		String lletres[]=new String[paraules.length];
		String digits[]=new String[paraules.length];
		System.out.println(programa.separa(paraules, lletres, digits));
		System.out.println(Arrays.toString(lletres));
		System.out.println(Arrays.toString(digits));
		lletres=new String[paraules2.length];
		digits=new String[paraules2.length];
		System.out.println(programa.separa(paraules2, lletres, digits));
		System.out.println(Arrays.toString(lletres));
		System.out.println(Arrays.toString(digits));

		Marca participants[]= {	new Marca("Andre De Grasse", 9.91, 8008), new Marca("Yohan Blake", 9.93, 4302),
							new Marca("Justin Gatlin", 9.89, 2876),	new Marca("Usain Bolt", 9.81, 3456)};
		Marca atletes[]= {	new Marca("Java", 23.78, 6), new Marca("C#", 123.67, 78),
				new Marca("C++", 76.91, 5), new Marca("PHP", 21.76, 3)};
		System.out.println(plata(participants));
		System.out.println(plata(atletes));

		System.out.println(programa.correcte("++*++*++*++*++"));
		System.out.println(programa.correcte("+*++*++*++*"));

	}
}