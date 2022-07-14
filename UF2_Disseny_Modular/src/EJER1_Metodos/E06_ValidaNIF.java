package EJER1_Metodos;

/*
  
Programa que lee y valida un NIF.
  
Un NIF se considera válido si tiene los 8 dígitos y la letra de la última
posición es la que le corresponde a la parte numérica.
Se proporciona un método que calcula la letra correcta para un número dado.
  
Será necesario separar la parte númerica de la letra. Puede hacerse así:
  
String nif = "12345678A";
int numNIF = Integer.parseInt( nif.substring(0,8) );
char letra = nif.charAt(8);
  
*/
  
import java.io.*;
  
public class E06_ValidaNIF {
  
    /**
     * Permite leer del teclado
     */
    public BufferedReader entrada = new BufferedReader(
        new InputStreamReader(System.in));
  
    public static void main(String args[]) throws Exception {
  
        E06_ValidaNIF programa=new E06_ValidaNIF();
        String nif;
        do{
            nif = programa.leerNIF();
        }while( !programa.esValido(nif) );
        System.out.println( "El nif entrado es " + nif );
    }
 
    /**
     * Calcula la letra que le corresponde a un número de NIF
     * @param numNIF número del que queremos la letra
     * @return la letra calculada
     */
    public char letraNIF(int numNIF) {
        String codigo = "TRWAGMYFPDXBNJZSQVHLCKE";
        int pos = numNIF%23;
        return codigo.charAt(pos);
    }
 
    /**
     * Lee un NIF del teclado
     * @return el NIF leido
     * @throws IOException
     */
    String leerNIF() throws IOException {
        String dato;
         
        do {
            System.out.print("Entra NIF:");
            dato=entrada.readLine();
        } while (dato.length()<2);
        return dato;
    }
 
    /**
     * Verifica si un NIF es correcto
     * @param nif NIF que se debe verificar
     * @return true si es correcto, false en otro caso
     */
    boolean esValido(String nif) {
        try {
            int numNIF = Integer.parseInt( nif.substring(0,nif.length()-1) );
            char letra = nif.charAt(nif.length()-1);
            if (Character.toUpperCase(letra)!=letraNIF(numNIF)) {
                System.out.println("NIF incorrecto");
                return false;
            }
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
  
}