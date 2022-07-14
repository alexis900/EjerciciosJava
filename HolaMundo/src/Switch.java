import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		System.out.println("Dime un dia de la semana: ");
		Scanner entrada = new Scanner(System.in);
		int dia = entrada.nextInt();
		String strDia = new String();
		switch(dia){
		case 1:
			strDia = "Lunes";
			break;
		case 2: 
			strDia = "Martes";
			break;
		case 3:
			strDia = "Miercoles";
			break;
		case 4:
			strDia = "Jueves";
			break;
		case 5:
			strDia = "Viernes";
			break;
		case 6:
			strDia = "Sabado";
			break;
		case 7:
			strDia = "Domingo";
			break;
		default:
			strDia = "Valor incorrecto";
		}
		
		System.out.println("Es el dia " + strDia);
		
		System.out.println("Dime un dia: ");
		Scanner tipo = new Scanner(System.in);
		int libre = tipo.nextInt();
		String Dia = new String();
		switch(dia){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			Dia = "Laborable";
			break;
		case 6:
		case 7:
			Dia = "Fin de semana";
			break;
		default:
			Dia = "Valor incorrecto";
		}
		
		System.out.println("Este dia es " + Dia);

	}

}
