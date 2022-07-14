package EJER3_Recursividad;

/*

Resuelve el siguiente problema de la web Acepta el reto:

https://www.aceptaelreto.com/problem/statement.php?id=183

Utiliza un método recursivo.


*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class E04_Anelidos {
    static BufferedReader tec=new BufferedReader(new InputStreamReader(System.in));
 
    public static void main(String[] args) throws IOException {
         
        String partes[]=tec.readLine().split(" ");
        int fases=Integer.parseInt(partes[0]);
        String anillos=partes[1];
        while (!anillos.equals("C")) {
            //  Realiza un print del anélido resultante
            anelido(fases, anillos.substring(0,anillos.length()-1));
            //  Añade la cabeza
            System.out.println("C");
            //  Lee siguiente caso
            partes=tec.readLine().split(" ");
            fases=Integer.parseInt(partes[0]);
            anillos=partes[1];
        }
    }
 
    /**
     * Método recursivo que construye el anélido.
     * Vuelve a llamar al método para construir cada fase.
     * La solución es válida pero muy lenta, no sirve para la web aceptaelreto.com
     * @param fases  cantidad de fases de crecimiento
     * @param anillos anélido original
     * @return anélido resultante
     */
    private static String crecimiento(int fases, String anillos) {
        // Caso base, no debe crecer más
        if (fases==0) return anillos+"C";
        String resultado="";
        // Para cada anillo del anélido calcula su nuevo anillo
        for (int i=0; i<anillos.length(); i++) {
            String nuevo;
            if (anillos.charAt(i)=='A') nuevo="AN";
            else nuevo="NA";
            resultado=resultado+nuevo;
        }
        // Una vez obtenido el nuevo anélido vuelve a llamar al mètodo con una fase menos
        return crecimiento(fases-1, resultado);
    }
     
    /**
     * Construye el nuevo anélido juntando las piezas necesarias
     * Para mejorar la velocidad se calcula primero el crecimiento de un anillo A y de otro N.
     * A continuación se juntan las piezas según cada anillo original. 
     * Si guardamos el anélido en un String el programa utiliza demasiada memoria y
     * no sirve para la web aceptaelreto.com
     * Para reducir la cantidad de memoria se realiza un print directo del resultado
     * @param fases  cantidad de fases de crecimiento
     * @param anillos anélido original excepto la cabeza
     * @throws IOException
     */
    private static void anelido(int fases, String anillos) throws IOException {
        // Calcula los nuevos anillos para un caso A
        String anelidoA=crecimiento(fases, 'A');
        // Calcula los nuevos anillos para un caso N
        String anelidoN=crecimiento(fases, 'N');
        // Para cada anillo del anélido se elige la pieza correspondiente
        // a añadir.
        for (int i=0; i<anillos.length(); i++) {
            if (anillos.charAt(i)=='A') {
                System.out.print(anelidoA);
            }
            else {
                System.out.print(anelidoN);
            }
        }
    }
 
    /**
     * Método recursivo que construye un anélido a partir de un único anillo.
     * @param fases  cantidad de fases de crecimiento
     * @param anillo anillo inicial 'A' o 'N'
     * @return String que representa el anélido obtenido
     */
    private static String crecimiento(int fases, char anillo) {
        // Caso base, no debe crecer más
        
        // Caso recursivo, calcula el crecimiento del anillo y de su pareja con una fase menos.
        return crecimiento(fases-1, anillo)+crecimiento(fases-1, anillo=='A'?'N':'A');
    }
     
}