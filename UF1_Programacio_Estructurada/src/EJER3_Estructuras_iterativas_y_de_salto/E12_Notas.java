package EJER3_Estructuras_iterativas_y_de_salto;


/*
Programa que permite entrar notas validando que esten entre 0 y 10
hasta que se introduzca un -1.
Finalmente el programa muestra cuantos aprobados y cuantos suspensos
ha habido y su porcentaje respecto del total.
 
Salida del programa
----------------------------
Entra la nota del examen : 6.5
Entra la nota siguiente : 13
Nota inválida.
Entra la nota siguiente : 8
Entra la nota siguiente : 5.25
Entra la nota siguiente : 3
Entra la nota siguiente : -1
Hay 1 suspensos que son un 25,00 %
Hay 3 aprobados que son un 75,00 %
 
*/
 
import java.io.*;
 
public class E12_Notas {
 
    public static void main(String args[]) throws IOException {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
        int aprobados = 0;
        int suspensos = 0;
 
        //Leemos la primera nota
         
        System.out.print("Entra la nota del examen : ");
        double nota = Double.parseDouble(entrada.readLine());
 
        //Repetir hasta que el usuario entre un -1
         
        int contador = 0;
        
        do{
            //Procesamos la nota
        	
        	if(nota >= 5 && nota <= 10){
        		aprobados++;
        	} else if(nota < 5 || nota >= 0){
        		suspensos++;
         	} else if(nota == -1){
         		
         	} else if(nota < -1 || nota > 10){
         		System.out.println("NO!");
         	}
        	
            //Leemos la siguiente nota
        	
        		System.out.print("Entra la nota siguiente: ");
        		nota = Double.parseDouble(entrada.readLine());
        		
        	contador++;
        }while(nota >= 0 && nota <= 10);
         
        //Hacemos los cálculos 
 
        int sus = (suspensos * 100) / contador;
        int ap = (aprobados * 100) / contador;
 
        //Mostramos los resultados
        
        System.out.println("Hay " + aprobados + " que son un " + ap + "%");
        System.out.println("Hay " + suspensos + " que son un " + sus + "%");
         
    
 
    }
}

