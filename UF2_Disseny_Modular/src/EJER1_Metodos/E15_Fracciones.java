package EJER1_Metodos;
/*
 
Programa que realiza operaciones aritméticas con fracciones.
Utiliza la clase Fraccion con campos para el numerador y el denominador.
 
Escribe los métodos que faltan.
 
Salida del programa:
=============================================
Entra la primera fracción : 3/4
Entra la segunda fracción : 1/2
 
Operaciones:
-----------------------
1.Suma
2.Resta
3.Multiplicación
4.División
 
Elige la operación : 1
El resultado es : 5/4
 
*/
 
import java.io.*;
 
class Fraccion {
    int num;
    int den;
}
 
public class E15_Fracciones {
 
    BufferedReader entrada = new BufferedReader(
        new InputStreamReader(System.in));
 
    public static void main(String args[]) throws Exception {
 
        Fraccion a = new Fraccion();
        Fraccion b = new Fraccion();
     
    E15_Fracciones programa=new E15_Fracciones();
 
        System.out.print("Entra la primera fracción : ");
        programa.leerFraccion(a);
 
        System.out.print("Entra la segunda fracción : ");
        programa.leerFraccion(b);
 
        int op = programa.menu();
        Fraccion result = null;
        switch (op) {
            case 1: result = programa.suma(a,b); break;
            case 2: result = programa.resta(a,b); break;
            case 3: result = programa.multiplica(a,b); break;
            case 4: result = programa.divide(a,b); break;
        }
        System.out.print("El resultado es : ");
        programa.mostrarFraccion(result);
        System.out.println();
    }
 
    int menu(){
        System.out.println("\n\nOperaciones:");
        System.out.println("-----------------------");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicación");
        System.out.println("4.División");
        System.out.print("\nElige la operación : ");
        while (true){
            try{
                int opcion = Integer.parseInt(entrada.readLine());
                return opcion;
            }catch(Exception e){
                System.out.print("Valor incorrecto.Prueba de nuevo : ");
            }
        }
    }
 
    //Método que lee los valores de los campos de una fracción
    //La fracción se pasa como parámetro
 
    void leerFraccion(Fraccion a) throws Exception{
 
        while (true)
        {
            try{
                String s = entrada.readLine();
                String[] partes = s.split("/");
                a.num = Integer.parseInt(partes[0]);
                a.den = Integer.parseInt(partes[1]);
                return;
            }catch(Exception e){
                System.out.print("Valor incorrecto.Prueba de nuevo : ");
            }
        }
    }
 
    //Método que muestra por pantalla una fracción
    //La fracción se pasa como parámetro
 
    void mostrarFraccion(Fraccion a){
        System.out.printf("%d/%d",a.num,a.den);
    }
 
    //Método que calcula la suma de dos fracciones
    //Las dos fracciones se pasan como parámetros y el resultado se
    //devuelve en una nueva fracción
 
    Fraccion suma(Fraccion a, Fraccion b){
        Fraccion r = new Fraccion();
        r.num = a.num * b.den + a.den * b.num;
        r.den = a.den * b.den;
        simplifica(r);
        return r;
    }
 
    //Método que calcula la resta de dos fracciones
    //Las dos fracciones se pasan como parámetros y el resultado se
    //devuelve en una nueva fracción
 
    Fraccion resta(Fraccion a, Fraccion b){
        Fraccion r = new Fraccion();
        r.num = a.num * b.den - a.den * b.num;
        r.den = a.den * b.den;
        simplifica(r);
        return r;
    }
 
    //Método que calcula la multiplicación de dos fracciones
    //Las dos fracciones se pasan como parámetros y el resultado se
    //devuelve en una nueva fracción
 
    Fraccion multiplica(Fraccion a, Fraccion b){
        Fraccion r = new Fraccion();
        r.num = a.num * b.num;
        r.den = a.den * b.den;
        simplifica(r);
        return r;
    }
 
    //Método que calcula la división de dos fracciones
    //Las dos fracciones se pasan como parámetros y el resultado se
    //devuelve en una nueva fracción
 
    Fraccion divide(Fraccion a, Fraccion b){
        Fraccion r = new Fraccion();
        r.num = a.num * b.den;
        r.den = a.den * b.num;
        simplifica(r);
        return r;
    }
 
    //Método que simplifica una fracción
    //La fracción se pasa como parámetro
 
    void simplifica(Fraccion a){
        int m = mcd(a.num,a.den);
        a.num = a.num/m;
        a.den = a.den/m;
    }
 
    //Método que calcula el mcd de dos enteros
 
    int mcd(int a, int b){
        int m = Math.min(a,b);
        while(a%m!=0 || b%m!=0){
            m--;
        }
        return m;
    }
 
}