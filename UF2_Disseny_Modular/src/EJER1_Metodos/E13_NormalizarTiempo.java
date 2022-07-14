package EJER1_Metodos;

import java.util.Scanner;

/*

Normalizar un tiempo entrado por teclado para que el valor de los
minutos y de los segundos esté entre 0 y 59.
 
Utilizar una clase Tiempo con campos para las horas, minutos y segundos.
 
Escribe los métodos que faltan.
 
 
Salida del programa
---------------------------------------------------
Entra un tiempo (hh:mm:ss) : 2:65:92
El tiempo normalizado es : 03:06:32
 
*/
class Tiempo {
	int hora;
	int min;
	int seg;
	
	Tiempo(String f){
		String trozo[] = f.split(":");
		hora = Integer.parseInt(trozo[0]);
		min = Integer.parseInt(trozo[1]);
		seg = Integer.parseInt(trozo[2]);
	}
	
	Tiempo(){}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hora, min, seg);
	}
}

public class E13_NormalizarTiempo {
	
	Tiempo leertec(String msg) {
		Scanner entrada = new Scanner(System.in);
		System.out.println(msg);
		String t = entrada.nextLine();
		Tiempo tiempo = new Tiempo(t);
		return tiempo;
	}
	
	void tiempo(Tiempo t) {
		if(t.seg >= 60) {
			t.min += t.seg/60;
			t.seg = t.seg%60;
		}
		
		if(t.min >= 60) {
			t.hora += t.min/60;
			t.min = t.min%60;
		}
	}

	public static void main(String[] args) {
		E13_NormalizarTiempo p = new E13_NormalizarTiempo();
		Tiempo tiempo = p.leertec("Entra un tiempo (hh:mm:ss):");
		p.tiempo(tiempo);
		System.out.print(tiempo);
	}

}
