class Alumne {
	String nom;
	String cognom;
			
	//Constructor de la classe, assigna el nom i el cognom
	Alumne(String nom, String cognom){ //paràmetres
		this.nom = nom;
		this.cognom = cognom;
	}
	
	Alumne(){}
}

public class Objeto {

	public static void main(String[] args) {
		
		Alumne daw = new Alumne("Alejandro", "Martin");
		Alumne tot[] = {
				new Alumne("Alejandro", "Martin"),
				new Alumne("Alex", "Malmagro"),
				new Alumne("Josefina", "Inventada")
		};
		
		for(int i = 0;i < tot.length;i++){
			System.out.println(tot[i].nom + " " + tot[i].cognom);
		}
		
		Alumne asix = new Alumne();
		asix.nom = "Alfred";
		asix.cognom = "Carter";
		
		System.out.println(asix.nom + " " + asix.cognom);

		
		/*
		 Podem dir-li si es una variable o objectes.
		 
		 String nom; //Variable de tipis String
		 
		 n = Integer.parseInt(teclat.readLine);
		 
		 Tipus estructurats. No es guardan més informació que un típus simple.
		 
		 Podriem inventar-nos un tipus on barregem tipus de dades.
		 
		 
		 class alumne { (llista d'atributs objecte "alumne", similar a entitat de BBDD)
		 	String nom;
		 	String dni;
		 	int edat;
		 	Date naix;    --> Atributs
		 	int curs;     --> Camps
		 	String cicle; --> Membres
		 };
		 
		 alumne llista[] = new alumne[30];
		 
		 Podem afegir operacions a la clase.
		 
		 nom = "daw";
		 if(nom.equals("asix")){
		 	
		 } else {
		 
		 }
		 
		 alumne antonio;
		 int NF = antonio.mitaja();
		 
		class vehicle {
		 	String matricula;
		 	String marca;
		 	String model;
		 	char color;
		 	int any;
		 	int carburant;
		 }
		
		
		 El constructor és la part que diferencia els objectes de les variables.
		 Crea un descriptor de l'objecte, pero encara no podem desar res a la memòria. Hem de crear el niu.
		 
		 alumne asix = new alumne();
		 
		 asix.nom = "alfred";
		 asix.cognom = "smith";
		 * */
		
	
		
	}

}


