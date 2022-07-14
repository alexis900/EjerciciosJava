package EJER2_Clases_de_Java.System_Arrays_Envolventes;

/*
La clase Arrays tiene métodos para trabajar con arrays de diferentes tipos
 
Pertenece al paquete java.util
 
*/
 
 
 
import java.util.*;
 
public class E04_ArraysDemo{
 
  public static void main(String[] args) throws Exception {
 
    int[] nums = {6,2,4,3,5,1};
 
  //Ordenar un array
 
    Arrays.sort(nums);
 
  //Mostrar un array
 
    System.out.println(Arrays.toString(nums));
 
  //Crear un array a partir de otro
 
    int[] copia = Arrays.copyOf(nums,10);
    int[] primeros = Arrays.copyOf(nums,3);
    int[] ultimos = Arrays.copyOfRange(nums,3,6);
 
    System.out.println(Arrays.toString(copia));
    System.out.println(Arrays.toString(primeros));
    System.out.println(Arrays.toString(ultimos));
 
  //Llenar un array
 
    Arrays.fill(nums,3);
    System.out.println(Arrays.toString(nums));
 
  //Comparar arrays
 
    int[] a = { 1,2,3 };
    int[] b = { 1,2,3 };
    if ( Arrays.equals(a,b) ){
      System.out.println("Son iguales");
    }
 
  }
}