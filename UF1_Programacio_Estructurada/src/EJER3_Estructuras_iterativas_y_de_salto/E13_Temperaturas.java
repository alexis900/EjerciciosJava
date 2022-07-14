package EJER3_Estructuras_iterativas_y_de_salto;


/*

Programa que permite entrar las temperaturas tomadas en varios días
consecutivos. El programa deja de pedir temperaturas cuando el usuario
escribe FIN y  entonces muestra la temperatura media, la máxima y la
mínima de los valores entrados.
 
Salida del programa :
----------------------------------------
Entra la temperatura del dia 1: 21.5
Entra la temperatura del dia 2: 22
Entra la temperatura del dia 3: 21.8
Entra la temperatura del dia 4: 21
Entra la temperatura del dia 5: FIN
 
Se ha entrado la temperatura de 4 días.
La media es de 21.58 ºC
La temperatura máxima ha sido de 22.00 ºC y la mínima de 21.00 ºC
 
*/
 
import java.io.*;
 
public class E13_Temperaturas {
 
    public static void main(String args[]) throws IOException {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
 
        //Inicializamos las variables 
        int dia = 0;
        String temp = new String();
        double res = 0;
        double temp_min = 0;
        double temp_max = 0;
        double tempe = 0;
        
         
        //Bucle para leer las temperaturas
        
        
        do{
        	
        	System.out.print("Entra la temperatura del dia " + (dia+1) + ": ");
            temp = entrada.readLine();
        
        if(temp.equals("FIN")){
        	break;
        }else{
        	tempe = Double.parseDouble(temp);
        }
        
        res += tempe;
        
        dia++;
        
        
        if(tempe > temp_max){
        	temp_max = tempe;
        }else if(tempe < temp_min){
        	temp_min = tempe;
        } else if(dia == 1){
        	temp_max = temp_min;
        }
        
        System.out.println("Temperatura máxima actual: " + temp_max + "\n"
        		+ "Temperatura mínima actual: " + temp_min);
        System.out.println(tempe);
        System.out.println("-------------------");
        
        }while(!(temp.equals("FIN")));
         
        //Mostrar los resultados
        
        System.out.println("Se ha entrado la temperatura de " + (dia-1) + " dias");
        System.out.println("La media es de " + res/dia + "ºC");
        System.out.println("La temperatura máxima ha sido de " +  temp_max + "ºC y la mínima de " + temp_min +"ªC");
        
         
    }


}