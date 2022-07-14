package EJER6_Objetos;

import java.util.Scanner;

/*

En este programa se define la clase Punto con dos coordenadas de tipo double.
Se crean dos objetos de tipo Punto y se inicializan en el código.
Y se calcula la distancia que los separa.
             ____________________________
Ayuda : d = √ ( x2 - x1 )² + ( y2 - y1 )²
 
 
Salida del programa:
------------------------------
Punto a = (5.00,1.50)
Punto b = (1.00,-2.10)
La distancia entre los puntos a y b es de 5.38 cm
 
*/

class Punto {
	double x;
	double y;
	
	Punto(double cx, double cy){
		x = cx;
		y = cy;
	}
	
	double distancia(Punto desti){
		if(x == desti.x && y == desti.y) return 0;
		double restax = x - desti.x;
		double restay = y - desti.y;
		double distancia = Math.sqrt(Math.pow(restax, 2)+ Math.pow(restay,2));
		return distancia;
	}
	
	void print(){
		if(x == 0 && y == 0) return;
		System.out.printf("(%.2f, %.2f)\n", x, y);
	}
	
}

public class E01_DistanciaPuntos {

	public static void main(String[] args) {
		
		Punto a = new Punto(5,1.5);
		Punto b = new Punto(1,-2.1);
		
		System.out.printf("Punto a = ");
		a.print();
		System.out.printf("Punto b = ");
		b.print();
		System.out.printf("La distancia entre los puntos a y b es de %.2f cm", a.distancia(b));
	}
}
