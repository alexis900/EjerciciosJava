package EJER3_Recursividad;

/*

Crea un mètode recursiu comptaLletres que realitzi el càlcul 
indicat a la següent definició:
 
comptaLletres(frase):
 si longitud de frase==0    retorna 0
 si primer caràcter és lletra   retorna 
 si primer caràcter NO és lletra   retorna comptaLletres(substring(1))
 
Exemples:
si frase és "" retorna 0
si frase és "the quick brown fox jumps over 12 dogs" retorna 29
si frase és "tienes 123 euros con 10 centimos" retorna 22
 
*/

public class E06_ComptaLletres {

	public static void main(String[] args) {
		System.out.println(comptaLletres("-"));

	}

	static int comptaLletres(String frase) {
		if (frase.length() == 0) return 0;
		else if(Character.isLetter(frase.charAt(0))) return 1+comptaLletres(frase.substring(1));
		else return comptaLletres(frase.substring(1));
	}

}
