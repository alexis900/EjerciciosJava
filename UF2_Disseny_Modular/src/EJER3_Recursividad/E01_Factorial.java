package EJER3_Recursividad;

/*

Realiza un método recursivo que calcule el factorial
de un número pasado por parámetro.

Utiliza la siguiente definición recursiva:

      |  1         si n=0
 n!= < 
      |  n*(n-1)!  si n>0
      

*/

public class E01_Factorial {
	
	 static long factorial(long n){
		    if (n==0) return 1;
		    else if (n>0)return n*(factorial(n-1));
		    else System.out.println("Error!");
			return 0;
		}

	public static void main(String[] args) {
		System.out.println(factorial(15));

	}

}
