package EJER2_Clases_de_Java.String_StringBuilder;

/*

Implementar el mÃ©todo quitaAcentos de diferentes maneras y comparar 
el tiempo de ejecuciÃ³n de cada implementaciÃ³n.
 
 
*/
 
 
public class E09_QuitaAcentos {
 
    public static void main(String[] args) {
    	E09_QuitaAcentos p = new E09_QuitaAcentos();
        String s = "áéíóú";
        int veces = 5000000;
         
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<veces; i++){
            sb.append(s);
        }
        String texto = sb.toString();
         
        //Medir y mostrar cuanto tarda en ejecutarse este mÃ©todo
         
        long t1 = System.currentTimeMillis();
         
        String resultado = p.quitaAcentos(texto);
         
        long t2 = System.currentTimeMillis();
         
        //System.out.println( resultado ); 
         
        System.out.println("Tiempo : " + (t2-t1));
 
    }

    	String quitaAcentos(String texto) {
    		char[] text = texto.toCharArray();
    		for(int i = 0;i < text.length;i++) {
    			if(text[i] == 'á') text[i] = 'a';
    			else if(text[i] == 'é') text[i] = 'e';
    			else if(text[i] == 'í') text[i] = 'i';
    			else if(text[i] == 'ó') text[i] = 'o';
    			else if(text[i] == 'ú') text[i] = 'u';
    		}
    		String textt = new String(text);
		return textt;
	}
}