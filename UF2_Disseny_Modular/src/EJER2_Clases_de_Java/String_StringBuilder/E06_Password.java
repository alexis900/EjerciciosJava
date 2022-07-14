package EJER2_Clases_de_Java.String_StringBuilder;

/*

Escribe los métodos que faltan 
 
esPasswordValido : Metodo que indica si un password es correcto.
                   Se considera correcto si contiene obligatoriamente numeros, mayusculas y minusculas
 
*/
 
public class E06_Password {
 
    public static void main(String[] args) {
        
        String password = "1asdads34";
        System.out.println( esPasswordValido(password) ); //muestra false
 
    }

	static boolean esPasswordValido(String password) {
		boolean num = false, may = false, min = false;
		for(int i = 0;i < password.length();i++) {
			char letra = password.charAt(i);
			if(Character.isDigit(letra)) num = true;
			if(Character.isUpperCase(letra)) may = true;
			if(Character.isLowerCase(letra)) min = true;
		}
		
		if(num && may && min) return true;
		else return false;
	}
 
}