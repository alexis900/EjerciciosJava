
public class StringClass {

	public static void main(String[] args) {
		
		
		
		//Podem posar qualsevol carácter
				String frase = "Hola Munda";
				
				//String buit
				String text = new String();
				
				System.out.println("Logitud de la frase: " + frase.length());
				
				int comp = 0;
				
				String lletresA = new String();
				
				for(int i = 0; i < frase.length();i++){
					if(frase.charAt(i) == 'a'){
						lletresA=lletresA+'A';
					} else {
						lletresA = lletresA+frase.charAt(i);
					}
				}
				
				frase = lletresA;
				
				System.out.println(frase);
				
				
				//Malament
				String pal1 = "programació";
				String pal2 = "programació";
				
				
				
				if(pal1 == pal2){
					System.out.println(pal1 + " i " + pal2 + " són iguals");
				} else {
					System.out.println(pal1 + " i " + pal2 + " no són iguals");
				}
				
				String pal3 = "programació";
				String pal4 = "progra";
				pal4 = pal4 + "mació";
				
				if(pal3 == pal4){
					System.out.println(pal3 + " i " + pal4 + " són iguals");
				} else {
					System.out.println(pal3 + " i " + pal4 + " no són iguals");
				}
				
				//Bé
				String pal5 = "programació";
				String pal6 = "progra";
				pal6 = pal6 + "mació";
				
			
				if(pal5.equals(pal6)){
					System.out.println(pal5 + " i " + pal6 + " són iguals");
				} else {
					System.out.println(pal5 + " i " + pal6 + " no són iguals");
				}
				
				System.out.println(frase.toLowerCase());
				System.out.println(frase.toUpperCase());
				

	}

}
