package Renda2015;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

class offshore {
	 String nomContribuent;
	 long capital;
	 String paradisFiscal;
	 
	 offshore(String n, long c, String p){
		 nomContribuent = n;
		 capital = c;
		 paradisFiscal = p;
	 }
}

public class Renda2015 {

	public static void main(String[] args) {
		Renda2015 p = new Renda2015();
		double[] taula1	= {100000.50, 234600.99, 123500999.00,  234600.99, 123500999.00,  888500.00};
		double[] taula2 = {234600.99, 100000.50, 999600.99, 999.00,  500999.00, 888500.00};
		double[] taula3	= {9999999.50, 234600.50, 9999999.50,  888500.99, 500999.00,  234600.00};
		
		
		System.out.println("//Ex1");
		System.out.printf("%.2f \n", p.elMaxim(taula1));
		System.out.printf("%.2f \n", p.elMaxim(taula2));
		System.out.printf("%.2f \n", p.elMaxim(taula3));
		
		System.out.println("//Ex2");
		System.out.printf("%.2f \n", p.multa(299999, 2013));
		System.out.printf("%.2f \n", p.multa(299999, 2015));
		System.out.printf("%.2f \n", p.multa(299999, 2017));
		System.out.printf("%.2f \n", p.multa(299999, 1998));
		
		offshore[] taula = {
				new offshore("José Barrufet Soria", 2000000, "jersey"),
				new offshore("Barrufet Osborne", 12300000, "panama"),
				new offshore("Rodrigo Barrufet", 99800000, "jersey"),
				new offshore("Pilar de Barrufet", 5000000, "jersey"),
				new offshore("Barrufet Almodívar", 7000000, "caiman"),
				new offshore("Barrufet Blesa", 29000000, "panama")
		};
		
		System.out.println("//Ex3");
		System.out.printf("%s \n", Arrays.toString(p.evasio(taula, "jersey")));
		System.out.printf("%s \n", Arrays.toString(p.evasio(taula, "panama")));   
		
		System.out.println("//Ex4");
		System.out.println(p.prescrit(p.data("21-3-2013")));
		System.out.println(p.prescrit(p.data("18-5-2013")));
		System.out.println(p.prescrit(p.data("12-5-1999")));
		System.out.println(p.prescrit(p.data("21-3-2016")));

	}
	
	Date data(String f) {
		Date fecha = new Date();
		SimpleDateFormat fmtFecha = new SimpleDateFormat("dd-MM-yyyy");
		fmtFecha.setLenient(false);
		try{
			fecha = fmtFecha.parse(f);
	    }catch(Exception e){
	    	System.out.println("Fecha invalida");
	    }
		return fecha;
	}
	
	boolean prescrit(Date data) {
		Calendar cal = Calendar.getInstance();
		Calendar dat = Calendar.getInstance();
		dat.setTime(data);
		cal.add(Calendar.YEAR, -5);

		if(cal.before(dat) || cal.equals(dat))
			return false;
			else return true;
		
	}

	String[] evasio(offshore[] taula, String paradis) {
		int count = 0;
		String[] contri = new String[taula.length];
		for(int i = 0;i < taula.length;i++) {
			if(taula[i].paradisFiscal.equals(paradis)) 
				contri[count++] = taula[i].nomContribuent;
		}
		
		String[] c = Arrays.copyOf(contri, count);
		return c;
	}
	
	double multa(double capital, int any) {
		if(any>2015) return 0;
		else if(capital < 0 && any <= 2015) return 1000;
		else if(capital >= 0 && any < 2011) return multa(capital, 2011);
		else return multa(capital, any+1)+capital/100;
	}

	double elMaxim(double[] taula) {
		double max = 0;
		int pos_max = 0;
		int count = 1;
		for(int i = 0;i < taula.length;i++) {
			if(taula[i] > max) {
				max = taula[i];
				pos_max = i;
			 }
		}
		
		for(int i = 0;i < taula.length;i++) {
			if(max == taula[i] && i != pos_max) {
				count++;
			}
		}
		
		max = max * count;
		
		return max;
	}
	
	

}
