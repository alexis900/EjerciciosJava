package EJER2_Clases_de_Java.String_StringBuilder;

/*

Ejemplo de uso de diferentes métodos de la clase String

*/


public class E01_StringDemo {

public static void main(String[] args ) {


    //Prueba de constructores

    char[] cars = {'H','o','l','a'};
    String s = new String(cars,1,2);
    System.out.println(s);
     
     //Prueba de charAt

    char c = s.charAt(0);
    System.out.println(c);
     
    //Prueba de comparación de cadenas

    String c1 = "prueba";
    String c2 = "compareTo";

    int result = c1.compareTo(c2);
    if (result<0) {
        System.out.println("c1 es menor que c2");
    } else if (result>0) {
        System.out.println("c1 es mayor que c2");
    } else {
        System.out.println("c1 es igual a c2");
    }
     
    //Prueba de contains

    String email = "pepito@terra.es";
    if ( !email.contains("@")) {
        System.out.println("Email incorrecto");
    }
     
    //Prueba de endsWith y startsWith

    String f1 = "entrega.zip";
    if ( f1.endsWith(".zip")) 
      System.out.println("Archivo ZIP");
    if ( f1.startsWith("/")) 
      System.out.println("Ruta absoluta");

    //Prueba de format

    String filename = String.format("picture_%03d.jpg",10);
    System.out.println(filename);

    String shora = String.format("%02d:%02d:%02d",10,5,32);
    System.out.println(shora);
     
    //Prueba de indexOf y lastIndexOf

    String ruta="/home/usuari/docs/doc1.txt";
    System.out.println(ruta.indexOf("/"));      //0
    System.out.println(ruta.indexOf("/",1));    //5
    System.out.println(ruta.indexOf("noesta")); //-1

    //Muestra la posición de la última barra
    System.out.println(ruta.lastIndexOf("/"));
     
    //Muestra la posición de la última barra antes de la pos 16
    System.out.println(ruta.lastIndexOf("/",16));
     
    //Prueba de substring

    int p = ruta.lastIndexOf("/");
    System.out.println( ruta.substring( p+1 ));
    System.out.println( ruta.substring( 0,p ));
     
    //Prueba de replace

    String texto = "1<2";
    //texto.replace("<","&lt;");  //esto no hace nada
    texto = texto.replace("<","&lt;");
    System.out.println(texto);
     
    //Prueba de toCharArray

    String ruta2 = "/home/usuari/docs/doc1.txt";
    
    char[] car = ruta2.toCharArray();
     
    for (int i=0; i<car.length ; i++) {
        if (car[i]=='/') car[i]='\\';
    }
    String ruta3 = new String(car);
    System.out.println(ruta3);
     
    //Prueba de toLowerCase y toUpperCase
     
    String msg = "Hola";
    System.out.println ( msg.toLowerCase() );
    System.out.println ( msg.toUpperCase() ); 
    System.out.println ( msg ); //no ha cambiado
     
    //Prueba de trim
     
    String texto2 = "    pelota  ";
    texto2 = texto2.trim();
    System.out.println ( texto2 );
     
    //Prueba valueOf

    int n = 10;
    String sn = String.valueOf(n);
    System.out.println(sn);
     
}
}