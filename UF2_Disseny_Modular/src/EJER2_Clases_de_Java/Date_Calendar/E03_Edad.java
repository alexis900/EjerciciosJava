package EJER2_Clases_de_Java.Date_Calendar;

/*

Completa el programa implementando los métodos que faltan
 
*/
 
import java.util.*;
import java.io.*;
import java.text.*;
 
 
public class E03_Edad {
	
	public static BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
	
	public static SimpleDateFormat fmtFecha = new SimpleDateFormat("dd/MM/yyyy");
 
    public static void main(String[] args) throws Exception {
 
    		Date date = leerFecha("Entra tu fecha de nacimiento (dd/mm/aaaa) : ");
 
        System.out.println( "Edad : " + edad(date) + " años");
 
        if(esMayorEdad(date)){
          System.out.println( "Eres mayor de edad" );
        }else{
          System.out.println( "Eres menor de edad" );
        }
 
    }

	static boolean esMayorEdad(Date date) {
		if(edad(date) > 17) {
			return true;
		} else {
			return false;
		}
	}

	static long edad(Date date) {
		Calendar cal = Calendar.getInstance();
		Calendar dat = Calendar.getInstance();
		dat.setTime(date);
    	int year = cal.get(Calendar.YEAR) - dat.get(Calendar.YEAR);
    	int month = (cal.get(Calendar.MONTH)+1) - (dat.get(Calendar.MONTH)+1);
    	int day = cal.get(Calendar.DAY_OF_MONTH) - dat.get(Calendar.DAY_OF_MONTH);
    	
    	if(month < 0 || (month == 0 && day < 0)) {
    		year -= 1;
    	}
    	
    	return year;
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