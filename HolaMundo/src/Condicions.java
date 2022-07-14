
public class Condicions {

	public static void main(String[] args) {
		
		int quantitat = 100000;
		double preu = 4.99;
		String euro = "€";
		/*
		if(quantitat>5){
			if(quantitat>100){
				preu = preu - 2;
				System.out.println("Descompte de 2€");
			} else {
				preu = preu - 1;
				System.out.println("Descompte d'1€");

			}
		} else {
			preu = preu + 0.50;
			System.out.println("Suma 0.50€");
		}
		
		System.out.println(preu + euro);

	}*/
		// for(variable;comparació;increment/decrement){}
		for(int i = 1; i <= 10; i=i+2){
			System.out.println(i);
			
		}
		
		//Bucle infinito
		
		/*for(;;){
			System.out.println("Infinito");
		}
		*/
		
		//Mientras
		while(quantitat>100) {
			System.out.println(quantitat + ". Estic repetint el While");
			quantitat = quantitat - 5;
		}
		
		//S'executa com a mínim una vegada
		//Hacer mientras
		int suma = 0;
		do{
			System.out.println(suma + ". Soy un Do While!");
			suma = suma + 50;
		}while(suma>1000);
		
		suma = 100;
		System.out.println("Do While con While");
		suma = suma + 50;
		while(suma < 1000){
			System.out.println(suma + ". Do While con While");
			suma = suma + 50;
		}
		
		/*
		
		//while
		for(;suma > 100;){
			System.out.println("While con for");
		}
		
		for (suma = 100, System.out.println(suma + ".Do While con for"), suma = suma + 50; suma < 1000; suma = suma + 50){
			System.out.println(suma + ".Do While con for");
		}
		
		*/
		
		/*
		 * Expressió 7 + 5 = 12 int
		 * 7 >= 40 false (boolean)
		 * 4 < 40 true (boolean)
		 * 10.5/2 = 5.23 double
		 * 
		 * + --> Suma
		 * - --> Resta
		 * * --> Mult
		 * / --> divisió
		 * % --> Mòdul
		 * 
		 * Opció mòdul %: Resta de la divisió entera
		 * 
		 * 
		 * i++; increment postfixe
		 * i--; decrement postfixe
		 * 
		 * ++i; increment prefixe
		 * --i; decrement prefixe
		 */
		
		suma = 4;
		if(suma++ < 5){/*true*/} //suma = 4
		
		suma = 4;
		if(++suma < 5){/*false*/} //suma = 5
		
		 /*
		 * Operecions de comparació
		 * 
		 * < --> Més petit que
		 * > --> Més gran que
		 * <=
		 * >=
		 * ==
		 * !=
		 * 
		 * && --> and Tenen preferència
		 * || --> or
		 * ! --> not
		 * 
		
		Àlgebra de Boole
	
		| ap1   |  ap2  |   ap1 && ap2  
		|-----------------------------  
		| false | false |    false      
		| false | true  |    false      
		| true  | false |    false      
		| true  | true  |    true       
		
		| ap1   |  ap2  |   ap1 || ap2  
		|-----------------------------  
		| false | false |    false      
		| false | true  |    true       
		| true  | false |    true       
		| true  | true  |    true       
		
		| ap     | !ap   
		------------------
		| false  | true  
		| true   | false 
		
		
		 */
		
		preu = 49;
		int dte;
		
		// resulat = condició ? valor true:valor false;
		dte = preu > 50 ? 10:2;
		System.out.println(dte);
		
		quantitat = 0;
		quantitat = quantitat + 17;
		System.out.println(quantitat);
		
		quantitat = 0;
		quantitat+=17;
		System.out.println(quantitat);
		
		
		
		
		
		

	}
}
