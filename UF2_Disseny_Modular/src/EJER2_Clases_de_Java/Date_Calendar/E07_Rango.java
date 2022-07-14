package EJER2_Clases_de_Java.Date_Calendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*

Llegeix una data del teclat i una quantitat de dies ( des de 1 fins a 1000 ). 
Mostra la data resultant si sumen els dies indicats i 
la data resultant si restem els dies indicats.
 
*/

public class E07_Rango {
	
	public static SimpleDateFormat fmtFecha = new SimpleDateFormat("dd/MM/yyyy");
	 
    public static BufferedReader entrada = new BufferedReader(
        new InputStreamReader(System.in));

	public static void main(String[] args) {
		int n = 0;
		Date date = leerFecha("Entra una fecha (dd/mm/aaaa) : ");

		do {
			n = leerDias("Entra el numero de dias que quieres sumar y restar (1 - 1000): ");
		} while(n == 0);
		
		System.out.println("Suma: " + sumaDias(date, n));
		System.out.println("Resta: " + restaDias(date, n));
	}
	
	static String restaDias(Date date, int days) {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date);
		cal2.add(Calendar.DAY_OF_MONTH, -days);
		cal.set(cal2.get(Calendar.YEAR), cal2.get(Calendar.MONTH), cal2.get(Calendar.DAY_OF_MONTH));
		Date da = cal.getTime();
		return fmtFecha.format(da);
	}

	static String sumaDias(Date date, int days) {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date);
		cal2.add(Calendar.DAY_OF_MONTH, days);
		cal.set(cal2.get(Calendar.YEAR), cal2.get(Calendar.MONTH), cal2.get(Calendar.DAY_OF_MONTH));
		Date da = cal.getTime();
		return fmtFecha.format(da);
	}

	static int leerDias(String msg) {
		System.out.println(msg);
		try {
			int e = Integer.parseInt(entrada.readLine());
			if(e < 1 || e > 1000) {
				return 0;
			} else {
				return e;
			}
		} catch (Exception e) {
			System.out.println("Esto no es un numero");
			return 0;
		} 
	}
	
	static Date leerFecha(String msg) {
		Date date = new Date();
		System.out.print(msg);
		fmtFecha.setLenient(false);
		boolean fcorrecta = false;
		while(!fcorrecta) {
			try{
	            date = fmtFecha.parse(entrada.readLine());
	            fcorrecta = true;
	        }catch(Exception e){
	            System.out.println("Fecha inválida.");
	            return null;
	        }
		}
        return date;
	}

}
