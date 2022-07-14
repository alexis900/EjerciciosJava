package EJER6_Objetos;

import java.util.Scanner;

/*
 
Programa que realiza el juego de los 3 barriles.
 
Dicho juego comienza con 3 barriles de 8, 5 y 3 litros de capacidad
respectivamente, de los cuales el primero está lleno y los otros dos
vacíos.
 
El objetivo es conseguir 4 litros en alguno de los barriles sin utilizar
ningún otro recipiente de medida, simplemente vertiendo el contenido de
un barril a otro.
 
Para realizar el juego el programa debe contar con un array de 3 objetos
del tipo Barril. Esta clase debe disponer de los campos capacidad y contenido.
 
 
Salida del programa :
-------------------------------------
 
Movimientos : 0
 
Barril 1 --> 8 litros
Barril 2 --> 0 litros
Barril 3 --> 0 litros
 
Que barril cogemos ? 1
Que barril llenamos ? 2
 
Movimientos : 1
 
Barril 1 --> 3 litros
Barril 2 --> 5 litros
Barril 3 --> 0 litros
 
Que barril cogemos ? 2
Que barril llenamos ? 3
 
Movimientos : 2
 
Barril 1 --> 3 litros
Barril 2 --> 2 litros
Barril 3 --> 3 litros
 
Que barril cogemos ?
 
.....
 
*/
 
import java.io.*;
 
class Barril {
    int capacidad;
    int contenido;
     
    /**
     * Constructor
     * @param cap  capacidad máxima del barril
     * @param cont contenido inicial
     */
    Barril(int cap, int cont) {
        capacidad=cap;
        contenido=cont;
    }
}
 
public class E11_Barriles {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));
        //Inicialización de datos
        //Array para los barriles
        Barril[] barriles= {new Barril(8,8), new Barril(5,0), new Barril(3,0)};
 
        int movimientos=0;
        do {
             
            System.out.println("Movimientos :"+movimientos);
            System.out.println();
            for (int i=0; i<barriles.length; i++) {
                System.out.println("Barril "+(i+1)+" litros-->"+barriles[i].contenido);
            }
            System.out.println();
            System.out.print("Que barril cogemos ? ");
            int origen=Integer.parseInt(entrada.readLine())-1;
            System.out.print("Que barril llenamos ? ");
            int destino=Integer.parseInt(entrada.readLine())-1;
 
            // litros que se pueden utilizar en origen
            int cantidad=barriles[origen].contenido;
            // litros que hay en el espacio libre del destino
            int libre=barriles[destino].capacidad-barriles[destino].contenido;
            int mover=0;
            // Se debe mover la cantidad de litros más pequeña
            if (cantidad<libre) mover=cantidad;
            else mover=libre;
            barriles[origen].contenido=barriles[origen].contenido - mover;
            barriles[destino].contenido=barriles[destino].contenido + mover;
            movimientos++;
        }while(barriles[0].contenido!=4 && barriles[1].contenido!=4);
         
        System.out.println("Correcto!!");
        System.out.println("Movimientos :"+movimientos);
         
        for (int i=0; i<barriles.length; i++) {
            System.out.println("Barril "+(i+1)+" litros-->"+barriles[i].contenido);
        }
 
    }
}
