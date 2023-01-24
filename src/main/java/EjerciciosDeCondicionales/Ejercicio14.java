package EjerciciosDeCondicionales;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ejercicio14 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Introduce el numero que salio del dado:");

            String dado = buffer.readLine();
            int caradado = Integer.parseInt(dado);

            if(caradado<1 || caradado>6){
                System.out.println("ERROR: número incorrecto.");
            }
            else{
                System.out.println("La cara opuesta del dado es " + caraopuesta(caradado) + ".");
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static String caraopuesta(int caradado){
        if(caradado==6){
            String caraopuesta = "uno";
            return caraopuesta;
        }
        else if(caradado==5){
            String caraopuesta = "dos";
            return caraopuesta;
        }
        else if(caradado==4){
            String caraopuesta = "tres";
            return caraopuesta;
        }
        else if(caradado==3){
            String caraopuesta = "cuatro";
            return caraopuesta;
        }
        else if(caradado==2){
            String caraopuesta = "cinco";
            return caraopuesta;
        }
        else{
            String caraopuesta = "seis";
            return caraopuesta;
        }
    }
}