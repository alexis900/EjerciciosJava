package EJER1_Metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

Programa que muestra una pirámide de asteriscos de la altura entrada por el usuario.
 
Utilizar métodos.
 
Salida del programa :
--------------------------------
Entra la altura : 5
 
    *
   ***
  *****
 *******
*********
 
 
*/

public class E05_Piramide {
	
	int leertec(String mensaje) throws NumberFormatException, IOException{
		BufferedReader entrada = new BufferedReader(
	            new InputStreamReader(System.in));
		int n = Integer.parseInt(entrada.readLine());
		return n;
	}
	
	int piramide() throws NumberFormatException, IOException{
		int alt = leertec("Entra la altura:");
		int esp = alt-1;
        int ast = 1;
        
        for(int i = alt;i == 0; i--){
        	for(int j = 0;j <= esp; j++){
        		System.out.print(" ");
        	}
        	
        	for(int k = 0;k < ast;k++){
        		System.out.print("*");
        	}
        	
        	System.out.println(" ");
        	esp++;
        	ast -= 2;
        }
        
        return alt;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		E05_Piramide p = new E05_Piramide();
        p.piramide();
	}
}
