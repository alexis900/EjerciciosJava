package EJER4_Arrays.Exercicis_sencills;

/*

7. Crea dos arrays con palabras. Obtén un nuevo array con todas las palabras de 
ambos arrays ( aunque estén repetidas ). Primero las del primer array y luego las 
del segundo. Luego muestra este array.
 
*/

public class Sencill_07 {

	public static void main(String[] args) {
		String a[] = {"Adios", "Hey", "Hola"};
		String b[] = {"Bye", "Google", "Bing"};
		
		String c[] = new String[a.length + b.length];
		
		for(int i = 0;i < a.length;i++){
			c[i] = a[i];
		}
				
		for(int i = 0; i < b.length;i++){
			c[a.length + i] = b[i];
		}
		
		for(int i = 0; i < c.length; i++){
			System.out.print(c[i] + " ");
		}
		
		
	}

}
