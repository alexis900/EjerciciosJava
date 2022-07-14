package EJER1_Ficheros_Texto;

/*
E09_MezclaOrdenada
 
Programa que fusiona dos ficheros con nombres de alumnos en uno solo. 
Los ficheros originales están ordenados alfabéticamente y el final también debe estarlo.
 
Para no malgastar recursos no deben almacenarse todos los nombres en memoria y luego ordenarlos.
 
Se debe leer un nombre de cada fichero, compararlos y guardar en el fichero de salida el menor. 
Luego leer otro nombre, compararlo con el que nos quedaba de antes y guardar el menor. 
Repetir hasta acabar de guardar todos.
 
*/
 
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
 
 
public class E09_MezclaOrdenada {
    FileInputStream flectura1, flectura2;
    FileOutputStream fescritura;
    BufferedReader entrada1, entrada2;
    PrintStream sortida;    
     
    int openLectura(String filename1, String filename2) {
          try {
               
              flectura1 = new FileInputStream(filename1);
              flectura2 = new FileInputStream(filename2);
          }
          catch (FileNotFoundException e) {
              System.err.println("No existeix el fitxer ");
              return -1;
          }
          catch (SecurityException e) {
              System.err.println("No es tenen drets d'accés al fitxer ");
              return -2;
          }
 
          entrada1 = new BufferedReader(new InputStreamReader(flectura1));
          entrada2 = new BufferedReader(new InputStreamReader(flectura2));
          return 0;
         
    }
 
    int openEscritura(String filename, boolean append) {
          try {
               
              fescritura = new FileOutputStream(filename, append);
          }
          catch (FileNotFoundException e) {
              System.err.println("No es pot crear el fitxer "+filename);
              return -1;
          }
          catch (SecurityException e) {
              System.err.println("No es tenen drets d'accés al fitxer "+filename);
              return -2;
          }
 
          sortida=new PrintStream(fescritura);
          return 0;
    }
     
    void close() throws IOException {
          entrada1.close();
          flectura1.close();
          entrada2.close();
          flectura2.close();
          sortida.close();
          fescritura.close();
    }
     
    public static void main(String[] args) throws IOException {
 
        E09_MezclaOrdenada programa = new E09_MezclaOrdenada();
         
        if (programa.openLectura("grupoa.txt","grupob.txt")<0) {
            return;
        }
 
        if (programa.openEscritura("alumnes.txt", false)<0) {
            return;
        }
         
        boolean final1=false;
        boolean final2=false;
        String alumne1="";
        String alumne2="";
         
        if (programa.entrada1.ready()) alumne1=programa.entrada1.readLine();
        else final1=true;
        if (programa.entrada2.ready()) alumne2=programa.entrada2.readLine();
        else final2=true;
         
        while (!final1 && !final2) {
            if (alumne1.compareTo(alumne2)<0) {
                programa.sortida.println(alumne1);
                if (programa.entrada1.ready()) alumne1=programa.entrada1.readLine();
                else final1=true;
            } else {
                programa.sortida.println(alumne2);
                if (programa.entrada2.ready()) alumne2=programa.entrada2.readLine();
                else final2=true;
            }
        }
         
        while (!final1) {
            programa.sortida.println(alumne1);
            if (programa.entrada1.ready()) alumne1=programa.entrada1.readLine();
            else final1=true;
        }       
        while (!final2) {
            programa.sortida.println(alumne2);
            if (programa.entrada2.ready()) alumne2=programa.entrada2.readLine();
            else final2=true;
        }
         
        programa.close();
    }
}