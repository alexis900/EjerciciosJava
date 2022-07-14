package EJER5_Arrays_bidimensionals;

/*

Utiliza un array de dos dimensiones con las notas de 4 alumnos en 3 examenes.
Cada fila corresponde a un alumno y cada columna a un examen.
Establece estos valores en el código del programa.
El programa debe calcular :
 
- la nota media de cada alumno
- la nota mayor indicando alumno y examen correspondientes
- la nota media más alta y que alumno la ha conseguido
- la nota media de cada examen
 
(Para facilitar el ejercicio suponemos que los valores más altos no estan repetidos)
 
Salida del programa
-----------------------------------------------------------------------
La nota media del alumno 1 es 7,00
La nota media del alumno 2 es 5,00
La nota media del alumno 3 es 5,67
La nota media del alumno 4 es 6,67
La media más alta es 7,00 y la ha conseguido el alumno 1
La nota más alta es 9,00 y la ha conseguido el alumno 3 en el examen 3
La media del examen 1 es 5,75
La media del examen 2 es 5,50
La media del examen 3 es 7,00
 
 */
 
import java.io.*;
 
public class E03_Notas {
 
    public static void main(String[] args) throws IOException {
        int alumnos = 4;
        int examenes = 3;
        double media = 0;
        double max = 0;
        int al = 0;
        int[][] notas = {
        				 {7,6,8},
                         {5,4,6},
                         {3,5,9},
                         {8,7,5}
        };
        
        for(int f = 0;f < notas.length;f++) {
        	for(int c = 0;c < notas[f].length;c++) {
        		media += notas[f][c];
        	}
        	media /= examenes;
        	System.out.printf("La nota media del alumno %d es %.2f\n", f+1, media);
        	if(media > max) {
        		max = media;
        		al++;
        	}
        	media = 0;
        }
        
        System.out.printf("La media más alta es %.2f y la ha conseguido el alumno %d\n", max, al);
        
        for(int c = 0;c < notas[1].length;c++) {
        	for(int f = 0; f < notas.length;f++) {
        		media += notas[f][c];
        	}
        	media /= alumnos;
        	System.out.printf("La media del examen %d es %.2f\n", c+1, media);
        	media = 0;
        }
    }
}