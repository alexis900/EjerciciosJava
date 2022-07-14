package EJER4_Arrays;

/*

Programa que permite realizar el recuento de votos en unas elecciones.
El programa pide el número de candidatos y el número de votantes.
 
Luego pregunta a cada votante a que candidato vota.
Al final muestra el total de votos para cada candidato.
No es necesario almacenar todos los votos, solo irlos contando.
 
Utilizar un array de contadores. Cada vez que se introduce un voto se incrementa el
contador correspondiente.
 
Validar cualquier posible error al votar.
 
 
Salida del programa :
------------------------------------
Entra número de candidatos: 3
Entra número de votantes: 4
 
Votante 1, entra tu voto (1-3): 1
Votante 2, entra tu voto (1-3): 3
Votante 3, entra tu voto (1-3): x
Voto inválido.
Votante 3, entra tu voto (1-3): 5
Voto inválido.
Votante 3, entra tu voto (1-3): 2
Votante 4, entra tu voto (1-3): 1
 
Resultados:
-----------------------
Candidato 1: 2 votos.
Candidato 2: 1 votos.
Candidato 3: 1 votos.
 
 
*/
 
import java.io.*;
 
public class E07_Votacion {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
        
        int candidato;
        int votantes;
        while(true){
        	try{
        		System.out.print("Entra número de candidatos: ");
                candidato = Integer.parseInt(entrada.readLine());
                System.out.print("Entra número de votantes: ");
                votantes = Integer.parseInt(entrada.readLine());
                break;
        	} catch(Exception e){
        		System.out.println("Error!");
        	}
            
        }
        
        int voto[] = new int[votantes];
        int cuentavoto[] = new int[candidato];
        
        boolean fals = false;
        
        for(int i = 0; i < votantes;i++){
        	try{
        		System.out.println("Votante " + (i+1) + ", entra tu voto (1-" + candidato + "):");
        		voto[i] = Integer.parseInt(entrada.readLine());
        		if(voto[i] > candidato || voto[i] < 1){
        			System.out.println("Voto inválido.");
            		i--;
        		}
        	}catch(Exception e){
        		System.out.println("Voto inválido.");
        		i--;
        	}

        		cuentavoto[voto[i]-1]++;
        	
        }
        System.out.println("Resultados:");
        System.out.println("-----------------------");
        for(int i = 0; i < cuentavoto.length;i++){
        	System.out.println("Candidato " + (i+1) + ": " + cuentavoto[i] + " votos.");
        }
    }
}