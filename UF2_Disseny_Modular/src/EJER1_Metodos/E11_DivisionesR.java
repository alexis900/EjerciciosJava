package EJER1_Metodos;

/*

Programa que lee dos enteros entre 1 y 10 y muestra un gráfico de barras
indicando la cantidad de divisores de cada número que está entre estos dos.
 
Implementar los métodos que faltan
 
Salida del programa:
------------------------
Entra dos numeros : 4 10
 
 4|***
 5|**
 6|****
 7|**
 8|****
 9|***
10|****
  +------------------->
 
 */
 
import java.io.*;
 
public class E11_DivisionesR {
 
    BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
    public static void main(String[] args) throws Exception {
 
        E11_DivisionesR programa = new E11_DivisionesR();
        int[] rango = programa.leerRango();
        for (int i = rango[0]; i <= rango[1]; i++) {
 
            System.out.printf("%2d|", i);
            programa.repetir('*', programa.numDivisores(i));
            System.out.println();
        }
        System.out.println("  +------------------->");
    }
 
    /**
     * lee un mínimo y un máximo desde teclado
     * @return un array con los dos valores leidos
     */
    int[] leerRango() {
        while (true) {
            try {
 
                System.out.print("Entra dos numeros : ");
                String[] partes = entrada.readLine().split(" ");
                int a = Integer.parseInt(partes[0]);
                int b = Integer.parseInt(partes[1]);
                if (a > 0 && a < 100 && b > 0 && b < 100) {
 
                    int[] rango = new int[2];
                    rango[0] = Math.min(a, b);
                    rango[1] = Math.max(a, b);
                    return rango;
 
                } else {
                    System.out.println("Error.");
                }
 
            } catch (Exception e) {
                System.out.println("Error.");
            }
        }
    }
 
    /**
     * Cuenta el número de divisores de un número dado
     * @param num número que se debe utilizar
     * @return la cantidad de divisores de num
     */
    int numDivisores(int num) {
        int cont = 2;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i==Math.sqrt(num)) cont++;
                else cont+=2;
            }
        }
        return cont;
    }
 
    /**
     * Imprime un carácter dado un número de veces
     * @param c  carácter
     * @param n  veces a imprimir
     */
    void repetir(char c, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
}