package EJER2_Clases_de_Java.System_Arrays_Envolventes;

/*

Cada tipo primitivo tiene una clase envolvente en el paquete java.lang
 
Cada clase envolvente tiene constantes y métodos para trabajar con el tipo
primitivo correspondiente.
 
En este ejemplo se muestra la clase Character
 
*/
 
 
 
public class E03_CharacterDemo{
 
  public static void main(String[] args) throws Exception {
 
  //Conversiones
 
    char c = '9';
    int n = Character.digit(c,10); //base decimal
    int m = Character.digit(c,16); //base hexadecimal
 
    char letra1 = Character.toUpperCase('a');
    char letra2 = Character.toLowerCase('A');
 
  //Información sobre un carácter dado
 
    char d = 'x';
    System.out.println("Es un dígito? " + Character.isDigit(d) );
    System.out.println("Es una letra? " + Character.isLetter(d) );
    System.out.println("Es una letra o dígito? " + Character.isLetterOrDigit(d) );
    System.out.println("Es un letra mayúscula? " + Character.isUpperCase(d) );
    System.out.println("Es un letra minúscula? " + Character.isLowerCase(d) );
 
  }
}