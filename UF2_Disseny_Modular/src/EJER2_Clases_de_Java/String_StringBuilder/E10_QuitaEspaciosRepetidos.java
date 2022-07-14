package EJER2_Clases_de_Java.String_StringBuilder;

import java.lang.reflect.Array;

/*

Escribir un método que quite los espacios del inicio y del final de un 
texto así como los grupos de espacios repetidos dejando solo un espacio
por grupo.
 
*/
 
 
public class E10_QuitaEspaciosRepetidos {
    public static void main(String[] args) {
    	E10_QuitaEspaciosRepetidos p = new E10_QuitaEspaciosRepetidos();

        String frase3 = "  un  dos      tres ";
        System.out.println( "["+ p.quitaEspRep2(frase3)+"]" ); //muestra :un dos tres
    }

	String quitaEspRep2(String frase3) {
		StringBuilder sb = new StringBuilder();
		frase3.trim();
		String f[] = frase3.split(" ");
		String frase = "";
		
		for(int i = 0;i < f.length;i++) {
			if(!f[i].equals("")) {
				sb.append(f[i] + " ");
			}
		}
		
		frase = sb.toString();
		return frase.trim();
	}
 
}