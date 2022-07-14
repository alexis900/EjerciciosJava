package EJER1_Metodos;

/*
  
Cálculo del área de una corona circular.
Los valores de los radios se entran por teclado.
  
Instrucciones:
Desde el método que calcula el área de la corona se debe llamar a
otro método que calcule el área de un círculo, ya que el área de una
corona circular es el área del 'círculo mayor' menos el área del
'círculo menor'.
  
  
Salida del programa
----------------------------------------
Escribe el radio interior : 6
Escribe el radio exterior : 9
El area es 141,37
  
*/
  
import java.io.*;
  
public class E04_AreaCoronaCircular {
      
    //Método areaCorona : calcula el área de una corona utilizando el método areaCirculo
    double areaCorona(double radioInt, double radioExt) {
        return areaCirculo(radioExt)-areaCirculo(radioInt);
    }
  
    //Método areaCirculo : calcula el área de un círculo
     
    double areaCirculo(double radio) {
        return Math.PI*radio*radio;
    }
     
    public static void main(String[] args) throws IOException {
  
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
         
        E04_AreaCoronaCircular programa=new E04_AreaCoronaCircular();
  
        System.out.print("Escribe el radio interior : ");
        double radioInt = Double.parseDouble(entrada.readLine());
  
        System.out.print("Escribe el radio exterior : ");
        double radioExt = Double.parseDouble(entrada.readLine());
  
        double area = programa.areaCorona( radioInt, radioExt );
  
        System.out.printf("El area es %.2f\n",area);
    }
}