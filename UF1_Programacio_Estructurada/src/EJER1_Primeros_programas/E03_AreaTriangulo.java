package EJER1_Primeros_programas;

/*

Calcular el área de un triángulo a partir de su base y su altura.
 
El área de un triangulo es la mitad de su base multiplicada por su altura.
 
 
Salida del programa
---------------------------------------
Introduzca la base del triángulo : 12
Introduzca la altura del triángulo : 25
La superfície del triángulo es: 150.0
 
*/
 
import java.io.*;
 
class E03_AreaTriangulo {
 
  public static void main (String args[]) throws Exception{
 
    BufferedReader entrada = new BufferedReader(
      new InputStreamReader(System.in));
 
    //Leer la base
    System.out.println("Introduce la base: ");
    int base = Integer.parseInt(entrada.readLine());
 
    //Leer la altura
    
    System.out.println("Introduce la altura: ");
    int altura = Integer.parseInt(entrada.readLine());
 
    //Calcular el area
    
    int area = (base * altura) / 2;
    
 
    //Mostrar el resultado
    
    System.out.println("La área del triangulo es de " + area + " cm");
 
     
  }
}