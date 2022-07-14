package EJER0_Pevios;
import java.util.Scanner;
 
/*
   Al país dels Barrufets volen fer un referèndum i necessiten un programa per a fer el càlcul dels resultats.
     
   El programa ha d'obtenir 4 quantitats des del teclat:
     Total de barrufets amb dret a vot al país.
     Total de barrufets que han votat.
     Total de vots afirmatius.
     Total de vots negatius.
      
     El programa haurà d'informar de les següents dades:
     % de participació    <<--  total de vots / total de barrufets * 100
     % de vots afirmatius <<--  total afirmatius / total de vots * 100
     % de vots negatius   <<--  total negatius / total de vots * 100
     % de vots blancs o nuls  <<--  (total de vots - total afirmatius - total negatius) / total de vots * 100
      
     Al final haurà de mostrar un missatge segons el resultat:
        "Ha guanyat el SI" ,  "Ha guanyat el NO"  o "Empat"
         
     Per obtenir resultats correctes amb decimals s'ha de fer servir el tipus double.
 */
 
public class E03_Condicions {
     
    public static void main(String[] args) {
    	
    	double barrufets;
    	double votat_barrufets;
    	double si_vot;
    	double no_vot;
    	
    	double participacio;
    	double v_af;
    	double v_neg;
    	double v_blanc;
    	
    	Scanner teclat = new Scanner(System.in);
    	System.out.println("Total de barrufets amb dret a vot al país:");
    	barrufets = teclat.nextDouble();
    	System.out.println("Total de barrufets que han votat:");
    	votat_barrufets = teclat.nextDouble();
    	System.out.println("Total de vots afirmatius:");
    	si_vot = teclat.nextDouble();
    	System.out.println("Total de vots negatius:");
    	no_vot = teclat.nextDouble();
    	
    	participacio = votat_barrufets / barrufets * 100;
    	v_af = si_vot / votat_barrufets * 100;
    	v_neg = no_vot / votat_barrufets * 100;
    	v_blanc = (votat_barrufets - si_vot - no_vot) / votat_barrufets * 100;
    	
    	
    	System.out.println("Participació:  " + participacio + "%");
    	System.out.println("Vots afirmatius: " + v_af + "%");
    	System.out.println("Vots negatius: " + v_neg + "%");
    	System.out.println("Vots blancs o nuls: " + v_blanc + "%");
    	
    	if(v_af == v_neg){
    		System.out.println("Empat");
    	} else {
    		if(v_af > v_neg){
    			System.out.println("Ha guanyat el SI");
    		} else {
    			System.out.println("Ha guanyat el NO");
    		}
    	}

    	
 
    }
}