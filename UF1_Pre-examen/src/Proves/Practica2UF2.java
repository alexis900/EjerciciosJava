package Proves;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Practica2UF2 {
	
	// Ex1
	void separaNums(long principal[], long secundarioA[], long secundarioB[], long valor_concreto) {
		int posA = 0;
		int posB = 0;
		
		for (int i = 0; i < principal.length;i++) {
			if(principal[i] != 0) {
				if (principal[i] > valor_concreto) {
					secundarioA[posA] += principal[i];
					posA++;
				} 
				
				if(principal[i] < valor_concreto) {
					secundarioB[posB] += principal[i];
					posB++;
				}
			}
		}
		
		System.out.println("Array principal: "+Arrays.toString(principal));
		System.out.println("Array secundari A: "+Arrays.toString(secundarioA));
		System.out.println("Array secundari B: "+Arrays.toString(secundarioB));
		
	}
	
	//Ex2
	String vocalitza (String frase) {
		int canvis = 0;
		String fra = "";
		
		for(int i = 0;i < frase.length();i++) {
			char lletra = frase.charAt(i);
			
			switch(lletra) {
			case 'A': 
			case 'E': 
			case 'I': 
			case 'O': 
			case 'U': 
				lletra = Character.toLowerCase(lletra);
				canvis++;
			}
			
			fra += lletra;
		}
		
		int noCanvis = frase.length()-canvis;
		return String.format("frase: \"%s\" no canviats: %d", fra, noCanvis);
	}
	
	//Ex3
	String claror(char[][] array) {
		int spaces = 0;
		int cas = 0;
		
		for(int i = 0;i < array.length;i++) {
			for(int j = 0;j < array[i].length;j++) {
				cas++;
				if(array[i][j] == ' ') {
					spaces++;
				}
			}
		}
		double pe = (spaces*100)/(double) cas;
		
		return String.format("%.3f%s", pe, '%');
	}
	
	//Ex4
	/*int mateixDia(String data)  {
	    DateFormat fmtFecha = new SimpleDateFormat("dd/MM/yyyy");
	    Calendar cal = Calendar.getInstance();
	    Calendar ca = Calendar.getInstance();
	    int week = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
	    int count = 0;
	    try {
			Date startDate = fmtFecha.parse(data);
			cal.setTime(startDate);
			for(int i = (int)cal.get(Calendar.YEAR);i <= (int)ca.get(Calendar.YEAR);i++) {
				cal.set(Calendar.YEAR, i);
				if(week == cal.get(Calendar.DAY_OF_WEEK)) {
					System.out.println(i);
					count++;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	   
		return count;
	}*/

	public static void main(String[] args)  {
		Practica2UF2 p = new Practica2UF2();
		//Ex1
		long[] principal = { 4, 7, 45, -34, 0, 678, 11, -98, 17 };
		long[] secundariA = new long[principal.length];
		long[] secundariB = new long[principal.length];
		long valor_concret = 11;
		
		
		p.separaNums(principal, secundariA, secundariB, valor_concret);
		
		//Ex2
		String frase = "UF2. PROGRAMACIO MODULAR";
		System.out.println(p.vocalitza(frase));
		
		//Ex3
		char foscor[][] = {
				{'*','*',' ', ' ', '*', '*', ' ', ' ', '*', '*', '*'},
				{'*','*','*', '*', '*', '*', '*', '*', '*', '*', '*'},
				{'*',' ',' ', ' ', ' ', ' ', '*', '*', '*', ' ', '*'},
				{' ','*','*', '*', '*', '*', '*', '*', '*', ' ', '*'},
				{' ',' ',' ', '*', '*', '*', '*', '*', ' ', ' ', ' '}
		};
		
		System.out.println(p.claror(foscor));
		
		/*String dataNaix = "25/12/1992";
		System.out.println(p.mateixDia(dataNaix));*/
	}

}