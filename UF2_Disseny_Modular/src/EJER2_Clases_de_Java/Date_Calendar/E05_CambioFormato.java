package EJER2_Clases_de_Java.Date_Calendar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class E05_CambioFormato {
	
	public static BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));

	public static void main(String[] args) {
		Date date = leerFecha("Entra tu fecha de nacimiento (dd/mm/aaaa) : ");
		
		System.out.println(cambiaFormato(date));
	}
	
	static String cambiaFormato(Date date) {
		SimpleDateFormat fmtFecha = new SimpleDateFormat("yyyy/MM/dd");
		return fmtFecha.format(date);
	}

	static Date leerFecha(String msg) {
		SimpleDateFormat fmtFecha = new SimpleDateFormat("dd/MM/yyyy");
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
