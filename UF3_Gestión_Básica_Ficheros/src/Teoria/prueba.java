package Teoria;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class prueba {

	public static void main(String[] args) {
	      FileOutputStream fos = null;
	      ObjectOutputStream oos = null;
	      String fichero = "t.tmp";
		try {
			fos = new FileOutputStream(fichero);
			oos = new ObjectOutputStream(fos);
			for(int i  = 0;i <= 50;i++) {
				String p = "Hola";
				oos.writeUTF(p);
			}

		    oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	      
	}

}