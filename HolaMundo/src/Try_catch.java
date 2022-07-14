import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Try_catch {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));

        //Bucle de validación con captura de excepciones

        int num = 0;
        boolean error = true;
        while(error){

            try {

                System.out.print("Entra un número : ");
                num = Integer.parseInt(entrada.readLine());
                error = false;

            }catch(Exception e){

                System.out.println("Entrada errónea.");

            }
        }

        System.out.printf("El número introducido es " + num);

    }
}