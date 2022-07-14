package EJER2_Clases_de_Java.Date_Calendar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*

Llegeix una data del teclat i mostra la quantitat de dies
de diferència entre la data i la data actual.
 
 */

public class E09_Diferencia {
	
	public static BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
    
    public static SimpleDateFormat fmtFecha = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) {
		
    		Date date1 = leerFecha("Entra la primera fecha (dd/mm/aaaa) : "); //con validacion
		
    		Date date2 = leerFecha("Entra la segunda fecha (dd/mm/aaaa) : "); //con validacion
    		
		System.out.println(diferenciaFecha(date1, date2));
	}

	static String diferenciaFecha(Date date1, Date date2) {
		int dies = (int) ((date2.getTime() - date1.getTime())/86400000);
		return String.format("Hay %d dias de diferencia", dies);
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
