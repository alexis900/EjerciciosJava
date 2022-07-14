package EJER5_Arrays_bidimensionals;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*

Utiliza un array 2D escalonado para guardar las distancias entre 4 ciudades.
Este array se inicializa en el codigo y tendrá forma de pirámide.
Utiliza valores inventados o busca en la web.
 
Ademas se cuenta con un array con los nombres de las ciudades.
 
El programa pide al usuario que elija dos ciudades y muestra la distancia
que hay entre ellas.
 
Salida del programa
-----------------------------------------
CIUDADES
=========================
1. Barcelona
2. Madrid
3. Salamanca
4. Zaragoza
 
Elige la primera ciudad : 1
 
Elige la segunda ciudad : 2
 
La distancia entre Barcelona y Madrid es de 600 km
 
 */
 
import java.util.Scanner;
 
public class E06_Distancias {
 
    public static void main(String[] args) throws Exception {
 
    	BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));
     
            int[][] distancias = {
                {624},
                {845,215},
                {313,314,529}
            }; //valores inventados
     
            String[] ciudades = {"Barcelona","Madrid,","Salamanca","Zaragoza"};
     
            System.out.println("CIUDADES\n=========================");
            for(int i=0; i<ciudades.length; i++){
                System.out.printf("%d. %s\n",i+1,ciudades[i]);
            }
     
            System.out.print("\nElige la primera ciudad : ");
            int ciu1 = Integer.parseInt(entrada.readLine());
     
            System.out.print("\nElige la segunda ciudad : ");
            int ciu2 = Integer.parseInt(entrada.readLine());
     
            if(ciu1<ciu2){
                // Interesa que la primera ciudad sea la mayor
                int aux = ciu1;
                ciu1 = ciu2;
                ciu2 = aux;
            }
     
             
            int d = 0;
            if (ciu1!=ciu2) d=distancias[ciu1-2][ciu2-1];
            System.out.printf("\nLa distancia entre %s y %s es de %d km",ciudades[ciu1-1],ciudades[ciu2-1],d);
    }
}