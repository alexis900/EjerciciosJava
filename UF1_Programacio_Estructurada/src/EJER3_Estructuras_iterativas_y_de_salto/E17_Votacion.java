package EJER3_Estructuras_iterativas_y_de_salto;
/*

Programa que permite realizar una votación donde se permite votar
si, no o abstenerse. El programa pide los votos uno a uno, validándolos,
y al final muestra un gráfico de barras horizontales mostrando el
porcentaje de votos de cada una de las tres opciones.
 
Salida del programa
------------------------------------------------------
Entra tu voto ( 1=SI , 2=NO, 3=ABSTENCION, 4=FIN ) : 1
Entra tu voto ( 1=SI , 2=NO, 3=ABSTENCION, 4=FIN ) : 2
Entra tu voto ( 1=SI , 2=NO, 3=ABSTENCION, 4=FIN ) : 6
Voto inválido.
Entra tu voto ( 1=SI , 2=NO, 3=ABSTENCION, 4=FIN ) : 2
Entra tu voto ( 1=SI , 2=NO, 3=ABSTENCION, 4=FIN ) : 1
Entra tu voto ( 1=SI , 2=NO, 3=ABSTENCION, 4=FIN ) : 3
Entra tu voto ( 1=SI , 2=NO, 3=ABSTENCION, 4=FIN ) : 4
 
   +
SI |************************
NO |************************
ABS|************
   +-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+
   0     10    20    30    40    50    60    70    80    90    100%
 
 */
 
import java.io.*;
 
public class E17_Votacion {
 
    public static void main(String args[]) throws IOException {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
        //Leer los votos
        
        int voto = 0;
        int voto_si = 0;
        int voto_no = 0;
        int voto_abs = 0;
        
        do{
        	System.out.print("Entra tu voto ( 1=SI , 2=NO, 3=ABSTENCION, 4=FIN ) :");
        	voto = Integer.parseInt(entrada.readLine());
        	
        	if(voto == 1){
        		voto_si++;
        	} else if(voto == 2){
        		voto_no++;
        	} else if (voto == 3){
        		voto_abs++;
        	} else if (voto == 4){
        		
        	} else {
        		System.out.println("Voto inválido.");
        	}
        	
        }while(!(voto == 4));
 
     
        //Calculamos la longitud de las barras teniendo en cuenta
        //que 60 asteriscos equivalen al 100%
        
        int voto_total = voto_si + voto_no + voto_abs;
        
        int voto_si_s = (voto_si * 60) / voto_total;
        int voto_no_s = (voto_no * 60) / voto_total;
        int voto_abs_s = (voto_abs * 60) / voto_total;

        
         
        //Mostrar gráfica
        System.out.println("");
        System.out.println("   +");
        System.out.print("SI |");
        
        for(int i = 0; i < voto_si_s;i++){
        	System.out.print("*");
        }
        
        System.out.println("");
        System.out.print("NO |");
        
        for(int j = 0; j < voto_no_s;j++){
        	System.out.print("*");
        }
        
        System.out.println("");
        System.out.print("ABS|");
        
        for(int k = 0; k < voto_abs_s;k++){
        	System.out.print("*");
        }
        
        System.out.println("");
        System.out.println("   +-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
        System.out.println("   0     10    20    30    40    50    60    70    80    90    100%");
         
         
    }
}