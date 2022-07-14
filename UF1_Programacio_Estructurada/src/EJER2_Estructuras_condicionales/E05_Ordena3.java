package EJER2_Estructuras_condicionales;

/*

Programa que lee tres valores por teclado, los ordena intercambiando
las variables y los muestra por pantalla.
 
Salida del programa
--------------------------------------------------
Escribe el primer valor : 8
Escribe el segundo valor : 3
Escribe el tercer valor : 5
Los valores ordenados son 3 5 8
 
*/
 
import java.io.*;
 
public class E05_Ordena3 {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
        
        int a;
        int b;
        int c;
        
        int d = 0;
        int e = 0;
        int f = 0;

 
        //Leer
        
        System.out.println("Escribe el primer valor: ");
        a = Integer.parseInt(entrada.readLine());
        System.out.println("Escribe el segundo valor: ");
        b = Integer.parseInt(entrada.readLine());
        System.out.println("Escribe el tercer valor: ");
        c = Integer.parseInt(entrada.readLine());
 
 
        //Ordenar
        
        if (a < b && a < c){
        	d = a;
        } else if(b < a && b < c){
        	d = b;
        } else if(c < a && c < b){
        	d = c;
        }
        
        if(a > b && a > c){
        	e = a;
        } else if(b > a && b > c){
        	e = b;
        } else if(c > a && c > a){
        	e = c;
        }
        
        f = (a+b+c) - (d+e);
        
        a = d;
        b = f;
        c = e;
 
 
        //Mostrar
 
        System.out.printf("Los valores ordenados son %d %d %d ",a,b,c);
    }
}