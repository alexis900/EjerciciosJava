package EJER2_Clases_de_Java.System_Arrays_Envolventes;

/*

Cada tipo primitivo tiene una clase envolvente en el paquete java.lang
 
Cada clase envolvente tiene constantes y métodos para trabajar con el tipo
primitivo correspondiente.
 
En este ejemplo se muestra la clase Integer, el resto son similares
 
*/
 
 
public class E02_IntegerDemo{
 
  public static void main(String[] args) throws Exception {
 
  //Información sobre el tipo int
 
    System.out.printf("Rango : %d - %d\n",Integer.MIN_VALUE,Integer.MAX_VALUE);
    System.out.println ("Número de bits : " + Integer.SIZE);
 
  //Conversiones
 
    int num = Integer.parseInt("255");    //de cadena a entero
    int num2= Integer.parseInt("FF",16); //de cadena hexadecimal a entero
 
    String bin = Integer.toBinaryString(num); //de entero a cadena en binario
    String hex = Integer.toHexString(num);    //de entero a cadena en hexadecimal
 
    System.out.println(bin);
    System.out.println(hex);
 
  }
}
