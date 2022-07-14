package utilitats;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
 * Define la clase Fraccion
 */
public class Fraccion {
    /**
     * atributos
     */
    int num;
    int den;
     
    /**
     * Constructor que asigna a la fracción los valores obtenidos del parámetro
     * en formato "num/den"
     * @param fraccion String en formato "num/den", p.ej: "3/4", "12/45", ...
     */
    public Fraccion (String fraccion) {
        String partes[]=fraccion.split("/");
        num=Integer.parseInt(partes[0]);
        den=Integer.parseInt(partes[1]);
    }
 
 
    /**
     * Constructor por defecto
     */
    public Fraccion() {
 
    }
     
    /**
     * Crea la Fracción con los valores indicados
     * @param n numerador
     * @param d denominador
     */
    public Fraccion(int n, int d) {
        num=n;
        den=d;
    }
 
    /**
     *  Simplifica la fracción, modifica el objeto
     */
    public void simplifica() {
        // calcula mcd
        int mcd = Math.min(num,den);
        while ( num%mcd!=0 || den%mcd!=0 ) {
            mcd--;
        }
        num=num/mcd;
        den=den/mcd;
 
    }
 
 
    /**
     * Visualiza la fracción por consola en formato "num/den"
     */
    public void println() {
        System.out.println(num+"/"+den);
    }
 
}