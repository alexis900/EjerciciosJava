package Practica_1_UF2;

import java.util.Scanner;

// Classe del Ex3
class Criptomoneda{
	String nom;
	String simbol;
	double preu;
	
	Criptomoneda(String n, String sim, double p){
		nom = n;
		simbol = sim;
		preu = p;
	}
	
	Criptomoneda(){}
	
	// Converteix l'objecte en un format entendible
	@Override
	public String toString() {
			return String.format("{'%s' '%s' '%.2f'}", nom, simbol, preu);
	}
	
}

public class Practica1UF2 {
	//Ex1
	String repetida(String frase, char lletra) {
		int contador = 0;
		//Missatge per defecte
		String f = "";
		char l = ' ';
		for(int i = 0;i < frase.length();i++) {
			//Comproba que sigui una lletra igual a la frase
			l = frase.charAt(i);
			if(l == lletra) {
				contador++;
			}
		}
		if(contador >= 2) {
			f = "Resultat true";
		} else {
			f = "Resultat false";
		}
		return f;
	}
	
	//Ex2
	void edimarip(int alzada) {
		for(int ast = (alzada*2)-1, espacios = 0; espacios <= alzada;espacios++, ast -= 2) {
			//Posa els espais de la piràmide
					for(int i = 0;i < espacios;i++) {
						System.out.print(" ");
					}
			//Posa els asteriscos de la piramide
					for(int i = 0;i < ast;i++) {
						System.out.print("*");
					}
			System.out.println();
		}
	}
	
	//Ex3
	Criptomoneda virtualMoney(Criptomoneda[] cripto, double preu) {
		int i = 0;
		//Comproba el preu de la criptomoneda
		for(i = 0;i < cripto.length;i++) {
			if(cripto[i].preu <= preu) {
				break;
			}
			
			//System.out.printf("%s %s %2f", cripto[0], cripto[1], cripto[2]);
		}
		return cripto[i];
	}
	
	//Ex4
	int menu() {
			System.out.println("Opcions\n" + 
					"1- Repetida\n" + 
					"2- Piràmide\n" + 
					"3- virtualMoney\n" + 
					"4- Finalitza");
			System.out.println();
			int num = leeInt("Introdueix una opció");
			return num;
	}
	
	public static void main(String[] args) {
		Practica1UF2 p = new Practica1UF2();
		
		//Switch per a introuïr les opcions
		boolean acaba = false;
		while(!acaba) {
			int numero = p.menu();
			switch(numero) {
			case 1: 
				String frase = p.leeString("Introdueix la frase que vols comprovar: ");
				char lletra = p.leeChar("Introdueix la lletra que volem comprovar: ");
				String repetida = p.repetida(frase, lletra);
				System.out.println(repetida);
				break;
			case 2:
				int alzada = p.leeInt("Introdueix l'alçada de la piràmide");
				p.edimarip(alzada);
				break;
			case 3:
				Criptomoneda[] cripto = {
						new Criptomoneda("Bitcoin", "BTC", 10819.00),
						new Criptomoneda("Ethereum", "ETH", 868.60),
						new Criptomoneda("Ripple", "XRP", 0.92930)
				};
				
				double preu = p.leeDouble("Introdueix un preu de criptomoneda: ");
				Criptomoneda resC = p.virtualMoney(cripto, preu);
				System.out.println(resC);
				break;
			case 4:
				acaba = true;
				break;
			default:
				System.out.println("És una opció incorrecta!");
				break;
			}
		}
	}
	
	//Mètodes per a llegir
	String leeString(String msg) {
		Scanner entrada = new Scanner(System.in);
		System.out.println(msg);
		String f = entrada.nextLine();
		return f;
	}
	
	char leeChar(String msg) {
		Scanner entrada = new Scanner(System.in);
		System.out.println(msg);
		char c = entrada.nextLine().charAt(0);
		return c;
	}
	
	int leeInt(String msg) {
		Scanner entrada = new Scanner(System.in);
		System.out.println(msg);
		int n = entrada.nextInt();
		return n;
	}
	
	double leeDouble(String msg) {
		Scanner entrada = new Scanner(System.in);
		System.out.println(msg);
		double d = entrada.nextDouble();
		return d;
	}

}
