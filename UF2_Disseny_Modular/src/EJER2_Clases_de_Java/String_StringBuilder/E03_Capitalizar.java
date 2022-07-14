package EJER2_Clases_de_Java.String_StringBuilder;

/*

Escribe los métodos que faltan
 
capitaliza : Metodo que devuelve la cadena recibida con la inicial en
             mayusculas y el resto en minusculas
 
capitalizaTodo : Metodo que capitaliza todas las palabras de una frase
 
*/
 
 
public class E03_Capitalizar {
 
    public static void main(String[] args) {
    	E03_Capitalizar p = new E03_Capitalizar();
        String nom = "jUaN";
        System.out.println(p.capitaliza(nom)); //muestra Juan
 
        String nombreCompleto = "juaN gArciA PeRez";
        System.out.println(p.capitalizaTodo(nombreCompleto) ); //muestra Juan Garcia Perez
        
    }
   

	String capitalizaTodo(String nombreCompleto) {
		String[] nombre = nombreCompleto.split(" ");
		String nombreC = "";
		for(int i = 0;i < nombre.length;i++){
			nombreC += capitaliza(nombre[i] + " ");
		}
		
		return nombreC.trim();
			
	}

	String capitaliza(String nom) {
		StringBuilder sb = new StringBuilder(nom);
		String nombre = "";
		for(int i = 0;i < sb.length();i++) {
			char letra = sb.charAt(i);
			if(i == 0) {
				letra = Character.toUpperCase(letra);
			} else if (i > 0) {
				letra = Character.toLowerCase(letra);
			}
			nombre += letra;
		}
		return nombre;
	}
}
