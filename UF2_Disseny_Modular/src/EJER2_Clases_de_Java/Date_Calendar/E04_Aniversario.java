package EJER2_Clases_de_Java.Date_Calendar;

/*

Completa el programa implementando los métodos que faltan
 
*/
 
 
 
import java.util.*;
import java.io.*;
import java.text.*;
 
public class E04_Aniversario {
	
    public static SimpleDateFormat fmtFecha = new SimpleDateFormat("dd/MM/yyyy");
 
    public static BufferedReader entrada = new BufferedReader(
        new InputStreamReader(System.in));
 
    public static void main(String[] args) throws Exception {
 
    	Date date = null;
		while (date == null) {
    		date = leerFecha("Entra tu fecha de nacimiento (dd/mm/aaaa) : "); //con validacion
    	}
		
        Date cumple = proximoCumple(date);
 
        System.out.println( "Tu próximo cumpleaños será el " + formatea(cumple));
        System.out.println( "El día de la semana caerá en " + diaSemana(cumple) );
 
    }

	static String diaSemana(Date cumple) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(cumple);
		String dw = "";
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		switch(dow) {
		case 1: dw = "Domingo"; break;
		case 2: dw = "Lunes"; break;
		case 3: dw = "Martes"; break;
		case 4: dw = "Miercoles"; break;
		case 5: dw = "Jueves"; break;
		case 6: dw = "Viernes"; break;
		case 7: dw = "Sábado"; break;
		}
		return dw;
	}

	static String formatea(Date cumple) {
		String fecha = fmtFecha.format(cumple);
		return fecha;
	}

	static Date proximoCumple(Date date) {
		Calendar cal = Calendar.getInstance();
		Calendar dat = Calendar.getInstance();
		dat.setTime(date);
    	int year = cal.get(Calendar.YEAR) - dat.get(Calendar.YEAR);
    	int month = (cal.get(Calendar.MONTH)+1) - (dat.get(Calendar.MONTH)+1);
    	int day = cal.get(Calendar.DAY_OF_MONTH) - dat.get(Calendar.DAY_OF_MONTH);
    	int y = 0, m = 0, d = 0;
    	
    	if(month < 0 || (month == 0 && day < 0)) {
    		year -= 1;
    		y = cal.get(Calendar.YEAR);
    	} else {
    		y = cal.get(Calendar.YEAR)+1;
    	}
    	
    	m = dat.get(Calendar.MONTH);
		d =  dat.get(Calendar.DAY_OF_MONTH);
		
    	cal.set(y, m, d);
    	Date sDate = cal.getTime();
    	return sDate;
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