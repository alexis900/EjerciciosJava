package EJER4_Arrays;

/*

Programa que trabaja con un array de 10 enteros ordenados en orden
creciente inicializado en el código del programa.
 
El usuario entra un valor, el programa lo busca en el array y
si lo encuentra lo elimina. No es necesario validar las entradas.
 
Esta búsqueda debe optimizarse teniendo en cuenta que se trata de un
array ordenado.
 
Al eliminar un valor los que le siguen deben desplazarse para dejar
el espacio libre al final
 
Repetir hasta que se hayan eliminado todos.
 
 
Salida del programa
-----------------------------
 
Códigos :  122 232 234 376 455 583 766 812 895 933
Entra un código per eliminar: 232
Código eliminado. Quedan 9
 
Códigos :  122 234 376 455 583 766 812 895 933
Entra un código para eliminar: 333
El código 333 no existe.
 
Códigos :  122 234 376 455 583 766 812 895 933
Entra un codigo para eliminar: 1000
El codigo 1000 no existe.
 
Códigos :  122 234 376 455 583 766 812 895 933
Entra un código para eliminar: 455
Código eliminado. Quedan 8
 
Códigos :  122 234 376 583 766 812 895 933
Entra un código para eliminar:
 
....(continua)....
 
*/
 
import java.io.*;
 
public class E17_EliminaValoresS {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
        int[] codigos = { 122, 232, 234, 376, 455, 583, 766, 812, 895, 933 };
 
        int count = codigos.length; //códigos que tenemos en el array
 
        while (count > 0) {
 
            //Mostrar los códigos
 
            System.out.print("\n\nCódigos : ");
            for (int i=0; i<count; i++) {
                System.out.print(" " + codigos[i]);
            }
 
            //Pedir un código
 
            System.out.print("\nEntra un código para eliminar: ");
            int n = Integer.parseInt(entrada.readLine());
 
            //Buscar su posicion
 
            int pos = -1;
            int i=0;
            while( i < count && n >= codigos[i] ) {
                if( n == codigos[i] ) pos = i;
                i++;
            }
 
            if (pos==-1) {
 
                //Código no encontrado
                System.out.printf("El código %d no existe.", n);
 
            }else{
 
                //Desplazamiento de los códigos posteriores
                for (int j=pos; j< count-1; j++) {
                    codigos[j] = codigos[j+1];
                }
 
                //Actualización del contador
                count--;
                System.out.printf("Código eliminado. Quedan %d", count);
 
            }
        }
 
        System.out.println("Se han eliminado todos los códigos.");
 
    }
}