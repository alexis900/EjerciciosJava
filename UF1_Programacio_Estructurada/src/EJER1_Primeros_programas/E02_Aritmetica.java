package EJER1_Primeros_programas;

/*

Calcular la suma, la resta, el producto y la divisi�n con decimales de dos
n�meros enteros leidos por teclado.
 
Salida del programa
---------------------------------------
Entra el primer n�mero : 10
Entra el segundo n�mero : 6
La suma es 16
La resta es 4
El producto es 60
La divisi�n es 1.6666666666666667
 
*/
 
import java.io.*;
 
class E02_Aritmetica {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
        //Leer los n�meros
        
        System.out.println("Introduce el primer número: ");
        int primero = Integer.parseInt(entrada.readLine());
        System.out.println("Introduce el segundo número: ");
        int segundo = Integer.parseInt(entrada.readLine());
     
        //Hacer los c�lculos
        
        int suma = primero + segundo;
        int resta = primero - segundo;
        int producto = primero * segundo;
        double division = (double)primero / segundo;
 
         
 
        //Mostrar los resultados
        
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("El producto es " + producto);
        System.out.println("La división es " + division);
 
         
    }
}