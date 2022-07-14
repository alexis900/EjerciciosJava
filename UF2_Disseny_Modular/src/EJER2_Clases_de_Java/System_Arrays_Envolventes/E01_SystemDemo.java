package EJER2_Clases_de_Java.System_Arrays_Envolventes;

/*

La clase System pertenece al paquete java.lang
 
*/
 
 
public class E01_SystemDemo{
 
  public static void main(String[] args) throws Exception {
 
  //Salida estandard y de errores
 
    System.out.println("Imprimir en la salida estandard.");
    System.err.println("Imprimir en la salida de errores.");
    //La salida de un programa puede redireccionarse desde línea de comandos
    // java 01_SystemDemo >salida.txt 2>errores.txt
 
  //Método getenv
 
    System.out.println( "Variable de entorno HOME = " + System.getenv("windir"));
 
  //Método currentTimeMillis
 
    long ini = System.currentTimeMillis();
    Thread.sleep(100);
    long fin = System.currentTimeMillis();
    System.out.println("Has pasado " + (fin-ini) + " milisegundos.");
 
  //Método exit
 
    System.exit(0); //codigo de salida 0
 
  }
}