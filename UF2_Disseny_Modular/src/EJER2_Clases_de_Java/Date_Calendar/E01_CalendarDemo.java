package EJER2_Clases_de_Java.Date_Calendar;

/*

La clase Date representa un instante en el tiempo con la precisión de milisegundos.
 
La clase SimpleDateFormat permite :
  - obtener un objeto Date a partir de una cadena con una fecha y hora
  - obtener una cadena con el valor de un objeto Date y un formato determinado
 
La clase Calendar nos permite trabajar con los valores individuales de dia, mes, año, etc...
 
*/
 
 
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.*;
 
public class E01_CalendarDemo {
 
    public static void main(String[] args) throws Exception{
         
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
         
        //Obtener objeto Date con la fecha y hora actual
        Date date = new Date();
 
        //Mostrar una fecha y hora en un objeto Date
         
        //Formato por defecto
        System.out.println("Date : " + date);
 
        // Formatos personalizados
        SimpleDateFormat fmtFecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat fmtFechaHora = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
 
        System.out.println( "Date : " + fmtFecha.format(date) );
        System.out.println( "Date : " + fmtFechaHora.format(date) );
 
 
        //Obtener objeto Calendar con la fecha actual
 
        Calendar cal = Calendar.getInstance();
 
         
        // Obtener los datos separados de un objeto Calendar
        int dia = cal.get(Calendar.DATE);
        int mes = cal.get(Calendar.MONTH)+1; //En Java los meses se numeran desde 0
        int any = cal.get(Calendar.YEAR);
        int hor = cal.get(Calendar.HOUR_OF_DAY); //Hora 0-24
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
        int mil = cal.get(Calendar.MILLISECOND);
 
        //Establecer una fecha y hora en un objeto Calendar
        cal.set(Calendar.DATE, 27);
        cal.set(Calendar.MONTH, 10); //En Java los meses se numeran desde 0
        cal.set(Calendar.MONTH, Calendar.NOVEMBER);
        cal.set(Calendar.YEAR, 2008);
 
        //También se pueden asignar varios valores en una única llamada al método
        cal.set(2001,10,28);          // 28/11/2001 00:00:00
        cal.set(2001,10,28,10,30,25); // 28/11/2001 10:30:25
 
 
        //Mostrar una fecha y hora contenida en un objeto Calendar
 
        System.out.printf("Calendar : %02d/%02d/%02d \n",
            cal.get(Calendar.DATE),
            cal.get(Calendar.MONTH)+1,
            cal.get(Calendar.YEAR)
        );
 
        // Muestra el objeto Calendar con formato
        // Primero lo convertimos en Date
        Date dt = cal.getTime();
        System.out.println("Calendar : " + fmtFechaHora.format(dt));
 
        //Leer una fecha y hora de una cadena
 
        // Activa la verificación de las fechas, que sean coherentes.
        // por ejemplo:  31/2/2000 incorrecto, 0/0/1999 incorrecto
        fmtFecha.setLenient(false);
 
        try{
            System.out.print("Entra fecha en formato dd/mm/aaaa:");
            date = fmtFecha.parse(entrada.readLine());
            // Muestra la fecha
            System.out.println( fmtFecha.format(date) );
            // Asigna la fecha entrada a un objeto Calendar
            cal.setTime(date);
 
        }catch(Exception e){
            System.out.println("Fecha inválida.");
        }
 
    }
}