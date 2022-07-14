package utilitats;

public class Fecha {
    /**
     * atributos
     */
    int dia;
    int mes;
    int anyo;
     
    /**
     * Constructor por defecto
     */
    public Fecha(){
         
    }
     
    /**
     * Constructor que asigna la fecha pasada por parámetro
     * @param d  dia
     * @param m  mes
     * @param a  año
     */
    public Fecha(int d, int m, int a){
        dia=d;
        mes=m;
        anyo=a;
    }
     
    /**
     * Constructor que asigna la fecha pasada por parámetro en
     * formato dd/mm/aaaa
     * @param fechaTexto  fecha "dd/mm/aaaa"
     */
    public Fecha(String fechaTexto) {
        String partes[]=fechaTexto.split("/");
        dia=Integer.parseInt(partes[0]);
        mes=Integer.parseInt(partes[1]);
        anyo=Integer.parseInt(partes[2]);
    }
 
    /**
     * Calcula que fecha es menor, si la fecha f o la del objeto this.
     * @param f  fecha que tenemos que comparar con el objeto
     * @return true si la fecha this es menor, false en otro caso
     */
    public boolean esMenor(Fecha f) {
        if (anyo>f.anyo) {
            return false;
        }
        else if (anyo<f.anyo) {
                return true;
        }
        else if (mes<f.mes) {
                return true;
        }
        else if (mes>f.mes) {
                return false;
        }
        else if (dia>f.dia) {
                return false;
        }
        else if (dia<f.dia) {
                return true;
        }
        else {
                return false;
        }
    }
 
    /**
     * Comprueba si la fecha del objeto this es igual a la pasada por parámetro
     * @param f fecha a comparar
     * @return true si se trata de la misma fecha, false en otro caso
     */
    public boolean igual(Fecha f) {
        if (anyo==f.anyo && mes==f.mes && dia==f.dia) return true;
        else return false;
    }
 
    /**
     * Muestra por consola la fecha en formato d/m/a
     */
    public void println() {
        System.out.println(dia+"/"+mes+"/"+anyo);
    }
}
