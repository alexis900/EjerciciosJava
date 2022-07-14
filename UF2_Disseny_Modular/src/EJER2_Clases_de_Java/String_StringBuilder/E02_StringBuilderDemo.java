package EJER2_Clases_de_Java.String_StringBuilder;

/*

Ejemplo de uso de los métodos de la clase StringBuilder
 
La clase StringBuilder nos permite trabajar más eficientemente con cadenas largas
donde hay que hacer varias modificaciones
 
Con cadenas pequeñas o modificaciones puntuales no vale la pena recurrir a ella.
 
*/
 
 
public class E02_StringBuilderDemo {
 
    public static void main(String[] args){
        ejemplo1();
        ejemplo2();
        ejemplo3();
    }
 
    public static void ejemplo1(){
 
        //Ejemplo de constructor sin parametros
 
        StringBuilder sb = new StringBuilder();
 
        //Ejemplo del metodo append
 
        sb.append("uno");
        sb.append(" dos");
        sb.append(" tres");
 
        //Ejemplo del metodo toString
 
        String resultado = sb.toString();
        System.out.println(resultado);
 
    }
 
    public static void ejemplo2(){
 
        //Ejemplo de llamada al constructor pasandole una cadena
 
        String texto="Ejemplo de uso de los metodos de la clase StringBuilder";
         
        StringBuilder sb = new StringBuilder(texto);
 
        //Ejemplo de los metodos charAt y setCharAt
 
        //esto convierte las letras pares en mayusculas
 
        for(int i=0; i<sb.length(); i=i+2){
            char c = sb.charAt(i);
            sb.setCharAt(i, Character.toUpperCase(c) );
        }
 
        System.out.println(sb.toString());
 
    }
 
    public static void ejemplo3() {
 
        String texto="Ejemplo de uso de los metodos de la clase StringBuilder";
         
        StringBuilder sb = new StringBuilder(texto);
 
        //Ejemplo de uso del metodo deleteCharAt
 
        //esto elimina todos los espacios
 
        for(int i=sb.length()-1; i>=0; i--){
            if ( sb.charAt(i) == ' ' ){
                sb.deleteCharAt(i);
            }
        }
 
        System.out.println(sb.toString());
    }
 
}