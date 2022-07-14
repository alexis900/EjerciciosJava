package EJER1_Primeros_programas;

/*

Cálculo de la hipotenusa de un triángulo rectángulo.
La longitud de los catetos se entran por teclado.
 
Utiliza el teorema de Pitágoras. 
  
Consulta : http://es.wikipedia.org/wiki/Teorema_de_Pit%C3%A1goras
 
La raiz cuadrada en JAVA se obtiene con Math.sqrt(expresión)
   Ej:    resultado = Math.sqrt(18 * 4 + suma);
 
Salida del programa
-------------------------------------
Entra la longitud del primer cateto : 10
Entra la longitud del segundo cateto : 7
 
La hipotenusa mide 12.207
 
*/
 
import java.io.*;
 
class E05_Hipotenusa {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
        
        int primer_cateto;
        int segundo_cateto;
        double hipotenusa;
 
        //Leer la longitud de los catetos
        System.out.println("Entra la longitud del primer cateto: ");
        primer_cateto = Integer.parseInt(entrada.readLine());
        System.out.println("Entra la longitud del segundo cateto: ");
        segundo_cateto = Integer.parseInt(entrada.readLine());
        

        //Calcular la hipotenusa
        
        hipotenusa = Math.sqrt((double)Math.pow(primer_cateto, 2) + (double)Math.pow(segundo_cateto, 2));
 
        
 
        //Mostrar el resultado
        System.out.println("La hipotenusa mide " + hipotenusa);
 
         
    }
}