package Practica_4;
import java.util.Scanner;

//Class EX1
class Partit{
	String nom;
	int any;
	int afiliats;
	
	Partit(String n, int a, int af){
		nom = n;
		any = a;
		afiliats = af;
	}
}

//Class Politic i Corrupte EX2
class Politic {
	String nomPolitic;
	String nomPartit;
	
	Politic(String politic, String partit){
		nomPolitic = politic;
		nomPartit = partit;
	}
}

class Corrupte {
	String nomPolitic;
	String nomCas;
	double quantitatFrau;
	
	Corrupte(String politic, String cas, double frau){
		nomPolitic = politic;
		nomCas = cas;
		quantitatFrau = frau;
	}
}


public class Politica {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Ex1
		//Array tipus Partit
		Partit partit[] = {
				new Partit("pp", 1997, 97500),
				new Partit("psoe", 1879, 1200000),
				new Partit("cs", 2005, 25000),
				new Partit("ciu", 1978, 1000)
		};
		
		//Ex2
		//Array tipus Politic
		
		Politic politic[] = {
			new Politic("zaplana","pp"),
			new Politic("granados","pp"),
			new Politic("rato","pp"),
			new Politic("pujol","ciu"),
			new Politic("cambra","ciu"),
			new Politic("blesa","pp"),
			new Politic("sanchez","psoe"),
			new Politic("lapuerta","pp"),
			new Politic("rosell","ciu"),
			new Politic("bárcenas","pp"),
			new Politic("sanchis","pp"),
			new Politic("ignacio gonzalez","pp"),
			new Politic("rivera","cs"),
			new Politic("diaz","psoe")
		};
		
		//Array tipus Corrupte
		Corrupte corrupte[] = {
			new Corrupte("bárcenas","gürtel",10000000),
			new Corrupte("sanchis","gürtel",5000000),
			new Corrupte("ignacio gonzalez","canal isabel II",25000000),
			new Corrupte("lapuerta","gürtel",7000000),
			new Corrupte("rosell","3%",24000000),
			new Corrupte("pujol","3%",30000000),
			new Corrupte("cambra","3%",12000000),
			new Corrupte("zaplana","canal isabel II",15000000),
			new Corrupte("granados","púnica",11500000),
			new Corrupte("rato","bankia",150000000)
		};
		
		//Ex3
		
		
		System.out.print("Introdueix el nom d'un cas: ");
		String d = entrada.nextLine();
		String no = "";
		double sum = 0;
		
		//Suma els diners defraudats i agafa els politics implicats
		for(int c = 0;c < corrupte.length;c++) {
			if(d.equals(corrupte[c].nomCas)) {
				sum = sum + corrupte[c].quantitatFrau;
				no = corrupte[c].nomPolitic;
			}
		}
		
		//Cerca l'ultim polític implicat i agafa el seu partit
		String p = "";
		for(int i = 0;i < politic.length;i++) {
			if(no.equals(politic[i].nomPolitic)) {
				p = politic[i].nomPartit;
			}
		}
		
		//Comproba que la suma sigui superior a 0, sino, no existirà el partit
		if(sum > 0) {
			System.out.printf("Cas %s del partit %s amb un frau de %.2f €", d, p, sum);
		} else {
			System.out.println("CAS INEXISTENT");
		}
		
		
		//Ex4
		//Introdueix el nom del partit
		System.out.println("\nIntrodueix el nom d'un partit corrupte:");
		String pa = entrada.nextLine();
		boolean corr = false;
		//Comproba el nom de cada polític si està a l'array de corruptes
		for(int i = 0;i < politic.length;i++) {
			//Compara la llista de polítics amb el que has escrit per teclat
			if(pa.equals(politic[i].nomPartit)) {
				for(int j = 0;j < corrupte.length;j++) {
					//compara els noms dels polítics que que hi ha i els compara amb els corruptes
					if(politic[i].nomPolitic.equals(corrupte[j].nomPolitic)) {
						//Imprimeix el nom del polític, el partit i el cas de corrupció posant el booleà a cert
						System.out.printf("%s del %s té el cas de corrupció %s\n", corrupte[j].nomPolitic, politic[i].nomPartit, corrupte[j].nomCas);
						corr = true;
					}
				}
			}
		}
		
		//Comproba si té partits corruptes
		if(!corr) {
			System.out.println("SENSE CORRUPTES");
		}
		
		
	}

}
