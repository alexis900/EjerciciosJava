package EJER4_Arrays.Exercicis_sencills;

/*

6. Tenemos un array de cadenas como este : "Angel","Cuesta","Eva","López","Pol","Castro" 
donde cada nombre va seguido de su apellido. Muéstra el array por pantalla de manera que en
cada línea salga un nombre y su apellido.
 
*/

public class Sencills_06 {

	public static void main(String[] args) {
		String a[] = {"Angel","Cuesta","Eva","López","Pol","Castro"};
		
		for(int i = 0;i < a.length;i+=2){
			System.out.println(a[i] + " " + a[i+1]);
		}
	}

}
