package EJER2_Clases_de_Java.String_StringBuilder;

/*

Escribe los métodos que faltan 
 
Utilizar el método format de la clase String

*/


public class E07_FormateaHora {

  public static void main(String[] args) {

      System.out.println( formateaHora(23,5,20) );  // 11:05:20 PM
      System.out.println( formateaHora(10,15,55) ); // 10:15:55 AM
      System.out.println( formateaHora(12,30,0) ); // 12:30:00 PM
      System.out.println( formateaHora(0,10,43) ); // 12:10:43 AM
       
  }

 static String formateaHora(int h, int m, int s) {
	 String sim = "AM";
	 
	if(h > 12) {
		h -= 12;
		sim = "PM";
	}
	
	if(h == 12 && m >= 0) {
		sim = "PM";
	}
	
	if(h == 0) {
		h = 12;
	}
	
	
	return String.format("%02d:%02d:%02d %s", h, m, s, sim);
}

}