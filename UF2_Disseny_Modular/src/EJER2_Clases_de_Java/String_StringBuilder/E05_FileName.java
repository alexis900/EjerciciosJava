package EJER2_Clases_de_Java.String_StringBuilder;

/*

Escribe los métodos que faltan 
 
*/
 
public class E05_FileName {
 
    public static void main(String[] args) {
    	E05_FileName p = new E05_FileName();
        String file = "/home/usuario/foto.png";
        System.out.println(p.getFileName(file));    //muestra foto.png
        System.out.println(p.getExtension(file)); //muestra png
        System.out.println(p.getFileNameWithoutExtension(file)); //muestra foto
 
    }

	String getFileNameWithoutExtension(String file) {
		int extension = file.lastIndexOf(".");
		int lastBar = file.lastIndexOf("/");
		String name = file.substring(lastBar+1, extension);
		return name;
		  
	}

	String getExtension(String file) {
		int extension = file.lastIndexOf(".");
		String name = file.substring(extension+1, file.length());
		return name;
	}

	String getFileName(String file) {
		int lastBar = file.lastIndexOf("/");
		String name = file.substring(lastBar+1, file.length());
		return name;
	}
 
}