package EJER2_Clases_de_Java.String_StringBuilder;

/*

Escribe los siguientes metodos que trabajan con Strings
 
menor : Metodo que devuelve la cadena menor alfab�ticamente
 
Usar el m�todo compareTo
 
*/
 
 
public class E08_PalabraMenor {
 
    public static void main(String[] args) {
    	E08_PalabraMenor p = new E08_PalabraMenor();
        String a = "array";
        String b = "operator";
        System.out.println(p.menor(a,b)); //muestra string menor
         
        String[] palabras = { "operator", "array", "method", "class"};
        System.out.println(p.menor(palabras)); //muestra string menor
 
    }

	String menor(String[] palabras) {
		String menor = "";
		for(int i = 0;i < palabras.length;i++) {
			for(int j = 0;j < palabras.length;j++) {
				int result = palabras[i].compareTo(palabras[j]);
				if(result > 0) {
					menor = palabras[j];
				}
			}
		}
		return menor;
	}

	String menor(String a, String b) {
		int result = a.compareTo(b);
		if(result < 0) {
			return a;
		} else if(result > 0) {
			return b;
		} 
		return a  + '=' + b;
	}
 
}