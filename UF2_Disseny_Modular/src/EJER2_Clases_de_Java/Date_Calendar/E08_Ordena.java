package EJER2_Clases_de_Java.Date_Calendar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*

Llegeix dues dates del teclat i ordena-les, 
mostra primer la més antiga i després la més moderna.
 
*/

public class E08_Ordena {
	
	public static BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
    
    public static SimpleDateFormat fmtFecha = new SimpleDateFormat("dd/MM/yyyy");
    
	public static void main(String[] args) {
		Date date1 = leerFecha("Entra la primera fecha (dd/mm/aaaa) : ");
		
		
		Date date2 = leerFecha("Entra la segunda fecha (dd/mm/aaaa) : ");
		System.out.println(ordenaFecha(date1, date2));
		
	}
	
	static String ordenaFecha(Date date1, Date date2) {
		int menor;
		
		if(date1.before(date2)) menor = 0;
		else if(date1.after(date2)) menor = 1;
		else menor = 2;
		
		switch(menor) {
		case 0: return fmtFecha.format(date1) + " - " + fmtFecha.format(date2);
		case 1: return fmtFecha.format(date2) + " - " + fmtFecha.format(date1);
		case 2: return "Son iguales";
		}
		return null;
	}

	static Date leerFecha(String msg) {
		Date date = new Date();
		fmtFecha.setLenient(false);
		boolean fcorrecta = false;
		while(!fcorrecta) {
			try{
				System.out.print(msg);
	            date = fmtFecha.parse(entrada.readLine());
	            fcorrecta = true;
	        }catch(Exception e){
	            System.out.println("Fecha inválida.");
	        }
		}
        return date;
	}

}
