package EJER2_Estructuras_condicionales;

/*

Mostrar el importe correspondiente a una compra de un art�culo
determinado del que se adquieren una o varias unidades.
El IVA a aplicar es del 21% y si el precio total resultante es mayor de
300 euros, se aplicar� un descuento del 5%.
 
Salida del programa
----------------------------------------------------
Entra el precio del art�culo : 58
Entra el n�mero de unidades : 8
 
Importe total : 533,37
 
*/
 
import java.io.*;
 
public class E03_Factura {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
        
        System.out.println("Introduce el precio de un articulo: ");
        double articulo = Double.parseDouble(entrada.readLine());
        System.out.println("Introduce el n�mero de articulos: ");
        int unidades = Integer.parseInt(entrada.readLine());
        
        double total = (articulo * (double)unidades) * (1 + 0.21);
        
        if(total > 300){
        	total *= (1 - 0.05);
        	System.out.println("Importe Total: " + total + " €. Descuento del 5%.");
        } else {
        	System.out.println("Importe Total: " + total + "€");
        }
        
        
        
     
    }
}