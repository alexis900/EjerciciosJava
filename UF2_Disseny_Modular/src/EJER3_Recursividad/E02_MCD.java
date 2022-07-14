package EJER3_Recursividad;

/*

Realiza un método recursivo que calcule el máximo común divisor 
de dos números pasados por parámetro.

Utiliza la siguiente definición recursiva:

              | m            si n=0
  mcd(m,n) = <
              | mcd(n, m%n)  si n!=0
      

*/

public class E02_MCD {
	
	public static void main(String[] args) {
		System.out.println(mcd(35, 65));
	}
	
	static int mcd(int m, int n){
	    if (n==0) return m;
	    else return mcd(n, m%n);
	}

}
