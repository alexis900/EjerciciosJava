package Practica_3_UF2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class Master {
	String titol;
	String nom;
	String uni;
	int cred;
	
	Master(String t, String n, String u, int c){
		titol = t;
		nom = n;
		uni = u;
		cred = c;
	}
	
	@Override
	public String toString() {
			return String.format("{'%s' '%s' '%s', %d}", titol, nom, uni, cred);
	}
	
}

public class Practica3UF2 {

	public static void main(String[] args) {
		Practica3UF2 p = new Practica3UF2();
		//Ex1
		System.out.printf("%.2f \n", p.muyDecifuente(23, 47));
		System.out.printf("%.2f \n", p.muyDecifuente(41, 76));
		
		//Ex2
		Master[] master = {
			new Master("Jarbar MBA enhanced", "Pablo", "JARBAR", 33),
			new Master("Derecho autonómico", "Cristina", "URJC", 80),
			new Master("Math Concepts", "José", "URJC", 115),
			new Master("Pedagogía política", "Cristina", "URJC", 65)
		};
		
		Master[] empreses = {
				new Master("Google", "Larry", "GOOGL", 33),
				new Master("Tesla", "Musk", "TSL", 80),
				new Master("Microsoft", "Nadella", "MSFT", 115),
				new Master("SpaceX", "Musk", "SPX", 65)
			};
		
		Master[] llenguatges = {};
		
		System.out.println(p.sospitos(master, "Cristina"));
		System.out.println(p.sospitos(empreses, "Musk"));
		System.out.println(p.sospitos(llenguatges, "Castellà"));
		
		//Ex3
		System.out.println(p.preso("10/3/2011", 2));
		System.out.println(p.preso("10/3/2011", 3));
		System.out.println(p.preso("10/3/2011", 5));
		System.out.println(p.preso("24/6/2007", 9));
		
		//Ex4
		double[] pensions = {100.5, 800.3, 1401.9, 200, 250, 900, 400, 353.75, 200, 450.75};
		System.out.println(p.pensioMitja(pensions, 400, 900));
		System.out.println(p.pensioMitja(pensions, 200, 500));
	}

	double pensioMitja(double[] pensions, int min, int max) {
		double count = 0;
		double sum = 0;
		for(int i = 0;i < pensions.length;i++) {
			//Comprova si la pensió està entre el número mínim i màxim que hem assignat
			if(pensions[i] >= min && pensions[i] <= max) {
				//Compta els pensionistes
				count++;
				//Suma la pensió
				sum += pensions[i];
			}
		}
		
		//Fa la mitja de les pensions
		return sum / count;
	}

	int preso(String data, int anys) {
		Calendar cal = Calendar.getInstance();
		Calendar dat = Calendar.getInstance();
		Date date = new Date();
		//Converteix l'String a Date
		SimpleDateFormat fmtFecha = new SimpleDateFormat("dd/MM/yyyy");
		fmtFecha.setLenient(false);
		try{
	       date = fmtFecha.parse(data);
	    }catch(Exception e){
	       System.out.println("Fecha inválida.");
	    }
		
		//Converteix Date a Calendar
		dat.setTime(date);
		//Comprova si l'any és menor a l'any actual
		while(dat.get(Calendar.YEAR) < cal.get(Calendar.YEAR)) {
			//Afegeix el número d'anys
			dat.add(Calendar.YEAR, anys);
		}
		
		int any = dat.get(Calendar.YEAR);
		return any;
	}

	Master sospitos(Master[] master, String nom) {
		int max = 0;
		int pos = 1;
		if(master.length > 0) {
			for(int i = 0;i < master.length;i++) {
				if(max < master[i].cred && nom.equals(master[i].nom)) {
					//Busca quina será la posició del master amb més punts amb el nom corresponent
					max = master[i].cred;
					pos = i;
				}
			}
			return master[pos];
		} else {
			return null;
		}
	}

	double muyDecifuente(double n, double m) {
		if(n <= 0 || m < n) return 1;
		else if(n > 0 && n < 30 && m < 50) return muyDecifuente(n-2, m/n)+m;
		else if(n > 0 && n >= 30 || m >= 50) return muyDecifuente(n/2, m)+m/7;
		return 0;
	}

}
