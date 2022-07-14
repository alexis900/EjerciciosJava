package EJER5_Arrays_bidimensionals;

/*
Un grup de 4 alumnes ha realitzat 3 exàmens. Cada examen té un pes en la nota final,
de manera que aquesta es calcula multiplicant aquest pes a cada nota i sumant-les.
 
Fes un programa per calcular les notes finals.
 
Les notes es guarden en un array bidimensional a on una fila es correspon a un alumne
i una columna es correspon a un examen.
 
El pes de cada prova es guarda en un array i ha de ser un número decimal entre 0 i 1,
la suma de tots tres ha de ser 1.
 
Tots aquests valors s'estableix en el codi del programa.
 
El programa ha de mostrar els resultats en forma de taula.
 
 
Sortida del programa: ( En aquest exemple el pes dels exàmens és de 0.5 , 0.3 i 0.2 )
-------------------------------------------------------------------------------------
 
+--------+---------+---------+---------+------------+
| Alumne | Examen1 | Examen2 | Examen3 | Nota final |
+--------+---------+---------+---------+------------+
|      1 |    5.50 |    8.00 |    6.40 |       6.43 |
+--------+---------+---------+---------+------------+
|      2 |    7.10 |    8.80 |    9.20 |       8.03 |
+--------+---------+---------+---------+------------+
|      3 |    4.20 |    5.60 |    7.80 |       5.34 |
+--------+---------+---------+---------+------------+
|      4 |    3.20 |    6.50 |    4.00 |       4.35 |
+--------+---------+---------+---------+------------+
*/
 
public class E04_Notes {
 
    public static void main(String[] args) throws Exception{
        double[][] notes = {
            {5.5,8.0,6.4},
            {7.1,8.8,9.2},
            {4.2,5.6,7.8},
            {3.2,6.5,4.0}
        };
 
        double[] pes = {0.5,0.3,0.2};
        
        double mitja = 0;
        
 
        System.out.println("+--------+---------+---------+---------+------------+");
        System.out.println("| Alumne | Examen1 | Examen2 | Examen3 | Nota final |");
        System.out.println("+--------+---------+---------+---------+------------+");
        
        for(int f = 0;f < notes.length;f++){
        	for(int c = 0;c < notes[f].length;c++){
        		mitja += notes[f][c] * pes[c];
        		
        	}
        	System.out.printf("|      %d |    %.2f |    %.2f |    %.2f |       %.2f |\n", f+1, notes[f][0], 
        			notes[f][1], notes[f][2], mitja);
        	System.out.println("+--------+---------+---------+---------+------------+");
        	mitja = 0;
        }
        
 
    }
}