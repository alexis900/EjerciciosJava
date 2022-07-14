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
 
public class E17_EliminaValores {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
 
        int[] codigos = { 122, 232, 234, 376, 455, 583, 766, 812, 895, 933 };
 
        int count = codigos.length-2; //códigos que tenemos en el array
        int num = 0;
 
        while (count > 0) {
 
            //Mostrar los códigos
        	System.out.print("Códigos: ");
        	for(int i = 0; i < count-1; i++){
        		System.out.print(codigos[i] + " ");
        	}
 
             System.out.println();
            //Pedir un código
        	boolean com = false;
        	while(!com){
        		try{
        			System.out.print("Entra un codigo para eliminar:");
        			num = Integer.parseInt(entrada.readLine());
        			break;
        		}catch(Exception e){
        			System.out.println("Error! Solamente se pueden introducir carácteres.");
        		}
        	}
        	
            //Buscar su posicion
        	int pos = 0;
        	boolean cierto = false;
        	for(int i = 0;i < count && num >= codigos[i];i++){
        		if(num == codigos[i]){
        			cierto = true;
        			pos = i;
        			break;
        		}
        	}
 
            
            //Si no se ha encontrado mostrar un mensaje
        	if(!cierto){
        		System.out.println("No has encontrado el número");
        	} else {
        		for(int i = pos;i < count - 1;i++){
        			codigos[i] = codigos[i+1];
        		}
        		//sino 
                	//Desplazamiento de los códigos posteriores
                
        			//Actualización del contador
        		count--;
        		System.out.println("Has eliminado un código. Quedan " + count);
        		}
            }
        
        System.out.println("Se han eliminado todos los códigos.");
        }
 
    }
