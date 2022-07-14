package EJER1_Metodos;

/*
 
Programa que realiza el juego de los 3 barriles.
 
Dicho juego comienza con 3 barriles de 8, 5 y 3 litros de capacidad
respectivamente, de los cuales el primero está lleno y los otros
dos vacíos.
 
El objetivo es conseguir 4 litros en alguno de los barriles sin utilizar
ningún otro recipiente de medida, simplemente vertiendo el contenido de
un barril a otro y realizando el menor número posible de vertidos.
 
Para ello el programa debe contar con un array de 3 objetos de tipo Barril.
La clase Barril debe disponer de los campos capacidad y contenido.
 
Salida por pantalla:
================================
 
Movimientos : 0
 
  +--------+
  |########|
  |########|
  |########|  +--------+
  |########|  |        |
  |########|  |        |  +--------+
  |########|  |        |  |        |
  |########|  |        |  |        |
  |########|  |        |  |        |
  +--------+  +--------+  +--------+
 
Elige el barril de origen : 1
Elige el barril de destino : 2
 
 
Movimientos : 1
 
  +--------+
  |        |
  |        |
  |        |  +--------+
  |        |  |########|
  |        |  |########|  +--------+
  |########|  |########|  |        |
  |########|  |########|  |        |
  |########|  |########|  |        |
  +--------+  +--------+  +--------+
 
Elige el barril de origen :
 
*/
 
import java.io.*;
 
class Barril {
    int capacidad;
    int contenido;
}
 
public class E16_JuegoBarriles {
 
    BufferedReader entrada = new BufferedReader(
        new InputStreamReader(System.in));
 
    Barril[] barriles = new Barril[3];
 
    public static void main(String[] args) {
 
        //Programa principal
    E16_JuegoBarriles programa=new E16_JuegoBarriles();
 
        int contador = 0;
 
        programa.inicializar(); //crea y inicializa el array de barriles
 
        while( !programa.hay4litros() ) {
 
            programa.mostrar(contador); //se le pasa 'contador' para que pueda ser mostrado
                               //junto con los barriles
 
            int a = programa.elegirOrigen();
            int b = programa.elegirDestino(a); //se le pasa 'a' para poder validar
                                      //que el destino sea diferente
 
            programa.mover(programa.barriles[a],programa.barriles[b]); //realiza el traspaso de un barril a otro
 
            contador++;
        }
 
        programa.mostrar(contador);
 
        System.out.println("Objetivo conseguido !!!");
 
    }
 
    boolean hay4litros(){
 
        return (barriles[0].contenido==4 ||
                barriles[1].contenido==4 );
 
    }
 
    void inicializar(){
 
        barriles[0] = new Barril();
        barriles[0].capacidad = 8;
        barriles[0].contenido = 8;
 
        barriles[1] = new Barril();
        barriles[1].capacidad = 5;
        barriles[1].contenido = 0;
 
        barriles[2] = new Barril();
        barriles[2].capacidad = 3;
        barriles[2].contenido = 0;
    }
 
    //Metodo que muestra los barriles y el contador
 
    void mostrar(int contador) {
        System.out.printf("\n\nMovimientos : %d\n\n",contador);
        for(int altura=9; altura>=0; altura--) {
            for(int i=0; i<3; i++) {
                System.out.print("  " + lineaBarril(barriles[i],altura));
            }
            System.out.println();
        }
        System.out.println();
    }
 
    String lineaBarril ( Barril barril, int altura){
        String linea ;
 
        if (altura>barril.capacidad+1) linea = "          ";
        else if (altura == barril.capacidad +1 ) linea = "+--------+";
        else if (altura > barril.contenido ) linea = "|        |";
        else if (altura>0) linea = "|########|";
        else linea = "+--------+";
 
        return linea;
    }
 
 
    int elegirOrigen(){
        while (true){
           try {
               System.out.print("Elige el barril de origen : ");
 
               int origen = Integer.parseInt(entrada.readLine()) - 1;
 
               if ( origen<0 || origen>2 ) {
 
                   System.out.println("Ese barril no existe.");
 
               }else if (barriles[origen].contenido==0){
 
                   System.out.println("El barril elegido está vacio.");
 
               }else{
 
                   return origen;
 
               }
 
           }catch (Exception e){
               System.out.println("Valor inválido.");
           }
       }
    }
 
    int elegirDestino(int origen){
       while (true){
           try {
               System.out.print("Elige el barril de destino : ");
 
               int d = Integer.parseInt(entrada.readLine()) - 1;
 
               if ( d<0 || d>2 ) {
 
                   System.out.println("Ese barril no existe.");
 
               }else if (barriles[d].contenido==barriles[d].capacidad){
 
                   System.out.println("El barril elegido está lleno.");
 
               }else if ( d == origen ){
 
                   System.out.println("El barril destino no puede ser el de origen");
 
               }else{
 
                   return d;
 
               }
 
           }catch (Exception e){
               System.out.println("Valor inválido.");
           }
       }
    }
 
    void mover(Barril origen, Barril destino){
 
        int hay = origen.contenido;
        int caben = destino.capacidad - destino.contenido;
        int pasan = Math.min(hay,caben);
 
        origen.contenido -= pasan;
        destino.contenido += pasan;
    }
}