package EJER2_Clases_de_Java.String_StringBuilder;

/*

Escribe los m�todos que faltan :
 
cuentaApariciones : M�todo que cuenta cuantas veces aparece una cadena dentro de otra
 
*/

 
public class E04_CuentaApariciones {
    public static void main(String[] args) {
    	E04_CuentaApariciones p  = new E04_CuentaApariciones();
        String frase = "un dos un tres undos tres un";
         
        System.out.println(p.cuentaApariciones(frase,"un") ); //muestra 4
 
    }

	int cuentaApariciones(String frase, String palabra) {
		int contador = 0;
		String[] fra = frase.split(" ");
	    for(int i = 0; i < fra.length;i++) {
	    	if(fra[i].contains(palabra)) {
	    		contador++;
	    	}
	    }
		return contador;
	}
}