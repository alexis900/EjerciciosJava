
package EJER4_Arrays;

/*

Programa que rota los caracteres de una frase y muestra la frase
repetidas veces por pantalla.
La frase está contenida en un array de caracteres.
Para rotar los caracteres se debe pasar cada carácter a la posición
anterior y el que estaba el primero ponerlo el último.
 
Ayuda: Para convertir un String en un array de char utilizar
 
char[] letras = frase.toCharArray();
 
Salida del programa
------------------------------------------
¡Bienvenido al divertido mundo de los Arrays!
Bienvenido al divertido mundo de los Arrays!¡
ienvenido al divertido mundo de los Arrays!¡B
envenido al divertido mundo de los Arrays!¡Bi
nvenido al divertido mundo de los Arrays!¡Bie
venido al divertido mundo de los Arrays!¡Bien
enido al divertido mundo de los Arrays!¡Bienv
nido al divertido mundo de los Arrays!¡Bienve
ido al divertido mundo de los Arrays!¡Bienven
do al divertido mundo de los Arrays!¡Bienveni
o al divertido mundo de los Arrays!¡Bienvenid
 al divertido mundo de los Arrays!¡Bienvenido
al divertido mundo de los Arrays!¡Bienvenido
l divertido mundo de los Arrays!¡Bienvenido a
 divertido mundo de los Arrays!¡Bienvenido al
divertido mundo de los Arrays!¡Bienvenido al
ivertido mundo de los Arrays!¡Bienvenido al d
vertido mundo de los Arrays!¡Bienvenido al di
ertido mundo de los Arrays!¡Bienvenido al div
rtido mundo de los Arrays!¡Bienvenido al dive
tido mundo de los Arrays!¡Bienvenido al diver
ido mundo de los Arrays!¡Bienvenido al divert
do mundo de los Arrays!¡Bienvenido al diverti
o mundo de los Arrays!¡Bienvenido al divertid
 mundo de los Arrays!¡Bienvenido al divertido
mundo de los Arrays!¡Bienvenido al divertido
undo de los Arrays!¡Bienvenido al divertido m
ndo de los Arrays!¡Bienvenido al divertido mu
do de los Arrays!¡Bienvenido al divertido mun
o de los Arrays!¡Bienvenido al divertido mund
 de los Arrays!¡Bienvenido al divertido mundo
de los Arrays!¡Bienvenido al divertido mundo
e los Arrays!¡Bienvenido al divertido mundo d
 los Arrays!¡Bienvenido al divertido mundo de
los Arrays!¡Bienvenido al divertido mundo de
os Arrays!¡Bienvenido al divertido mundo de l
s Arrays!¡Bienvenido al divertido mundo de lo
 Arrays!¡Bienvenido al divertido mundo de los
Arrays!¡Bienvenido al divertido mundo de los
rrays!¡Bienvenido al divertido mundo de los A
rays!¡Bienvenido al divertido mundo de los Ar
ays!¡Bienvenido al divertido mundo de los Arr
ys!¡Bienvenido al divertido mundo de los Arra
s!¡Bienvenido al divertido mundo de los Array
!¡Bienvenido al divertido mundo de los Arrays
¡Bienvenido al divertido mundo de los Arrays!
 
*/
 
import java.io.*;
import java.util.Arrays;
 
public class E14_Rotacion {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
        String s = "¡Bienvenido al divertido mundo de los Arrays!";
        char[] letras = s.toCharArray();  //obtenemos un array de char a partir de la cadena
        int longitud = letras.length;
        
        //Mostrar
        System.out.println(letras);
        for(int k = 0;k < longitud;k++){
        	char aux = letras[0];
            for(int i = 0; i < longitud - 1;i++){
            	letras[i] = letras[i+1];
            }
            letras[letras.length-1] = aux;
            
            for(int i = 0;i < longitud;i++){
            	System.out.print(letras[i]);
            }
            System.out.println();
        }
        
        //System.out.println(Arrays.toString(letras));
         
    }
}