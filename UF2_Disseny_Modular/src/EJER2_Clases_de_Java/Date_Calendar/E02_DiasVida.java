package EJER2_Clases_de_Java.Date_Calendar;

/*

Completa el programa implementando los m�todos que faltan
 
Los dias transcurridos de una fecha a otra se obtiene convirti�ndolas a
milisegundos y rest�ndolas.
 
*/
 
 
 
import java.util.*;
import java.io.*;
import java.text.*;
 
 
public class E02_DiasVida {
 
    public static BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
    
    public static SimpleDateFormat fmtFecha = new SimpleDateFormat("dd/MM/yyyy");

 
    public static void main(String[] args) throws Exception {
    		Date date = leerFecha("Entra tu fecha de nacimiento (dd/mm/aaaa) : ");
    	
        System.out.println( "Dias vividos : " + diasVividos(date) );
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
    
    static int diasVividos(Date date) {
    	Calendar cal = Calendar.getInstance();
    	Date fI = cal.getTime();
    	Date fF = date;
		int dias=(int) ((fI.getTime()-fF.getTime())/86400000);
		return dias;
	}

	
 
}