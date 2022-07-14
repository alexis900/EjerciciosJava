package EJER4_Arrays;

/*

Programa que permite entrar 5 números al usuario y guardarlos en un array.
Los números deben guardarse por orden de menor a mayor.
Para ello buscaremos la posición que le corresponde, desplazaremos todos los posteriores
y guardaremos el número en esa posición.
Cada vez que se introduce un número nuevo se debe mostrar el contenido del array.
 
 
 
Salida del programa
-----------------------------------
Entra un número: 4
Números : 4
 
Entra un número: 9
Números : 4 9
 
Entra un número: 5
Números : 4 5 9
 
Entra un número: 0
Números : 0 4 5 9
 
Entra un número: 13
Números : 0 4 5 9 13
 
El array está completo.
 
*/
 
import java.io.*;
 
public class E19_InsertarPorOrdenS {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
        //Declaración y creación del array
 
        int longitud = 5;
        int[] numeros = new int[longitud];
 
        //Bucle para ir entrando datos en el array
 
        int count = 0;
        while ( count<longitud ) {
 
            System.out.print("\nEntra un número: ");
            int valor = Integer.parseInt(entrada.readLine());
 
            //Bucle que desplaza todos los valores posteriores
            int i = count;
            while( i>0 && numeros[i-1]> valor ){
                numeros[i] = numeros[i-1];
                i--;
            }
 
            //Guardar el nuevo valor e incrementar el contador
            numeros[i] = valor;
            count++;
 
            //Mostramos el array
 
            System.out.print("Números : ");
            for (int j=0; j<count; j++) {
                System.out.print(numeros[j] + " ");
            }
            System.out.println();
        }
 
        System.out.println("\nEl array está completo.");
 
    }
}