package EJER3_Recursividad;

/*

Realiza un método recursivo que determine si una frase
pasada por parámetro es palíndroma.

Palíndroma significa que la frase se puede leer igual
de izquierda a derecha que de derecha a izquierda.

Ejemplos de frases palíndromas:

  Dabale arroz a la zorra el Abad
  Se van sus naves
  Anita lava la tina

Para simplificar el problema supondremos que no hay 
espacios ni signos de puntuación y que todas las letras son minúsculas.

Los ejemplos quedarían así:

  dabalearrozalazorraelabad
  sevansusnaves
  anitalavalatina

Primero define el problema de manera recursiva y después 
codifica el método correspondiente.

*/

public class E03_Palindromos {
	
	static boolean palindromos (String frase) {
		String f = frase.trim();
		f = f.replaceAll(" ", "");
		f = f.toLowerCase();
		
		if(f.length()-1 <= 1) return true;
		else if(f.charAt(0) == f.charAt(f.length()-1)) 
			return palindromos(f.substring(1, f.length()-1));
		else return false;
	}

	public static void main(String[] args) {
		System.out.println(palindromos("Dabale arroz a la zorra el Abad"));
		

	}

}
