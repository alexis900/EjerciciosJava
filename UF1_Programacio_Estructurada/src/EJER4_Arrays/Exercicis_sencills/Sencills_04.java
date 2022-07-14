package EJER4_Arrays.Exercicis_sencills;

/*


4. Crea un array con los valores 1,3,6,8,9,11,20,25 y después muéstralos en orden inverso.
 
*/

public class Sencills_04 {

	public static void main(String[] args) {
		int a[] = {1,3,6,8,9,11,20,25};
		
		
		for(int i = a.length - 1;i >= 0;i--){
			System.out.print(a[i] + " ");
		}

	}

}
