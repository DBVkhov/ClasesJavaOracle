package EjerciciosDeCondicionales;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ejercicio7 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Introduzca su edad:");

            String Edad = buffer.readLine();
            int edad = Integer.parseInt(Edad);

            System.out.println("Introduzca su genero (M/F):");

            String Genero = buffer.readLine();
            Genero = Genero.toUpperCase();
            char sexo = Genero.charAt(0);

            System.out.println("Introduzca la nota:");

            String Puntuacion = buffer.readLine();
            int nota = Integer.parseInt(Puntuacion);

            System.out.println(Pase(edad,nota,sexo));

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static String Pase(int edad, int nota, char sexo){
        if (sexo=='M' && nota==5 && edad>=18){
            return "Posible";
        }
        else if ((sexo=='F' || sexo=='M') && nota<=10 && nota>=5 && edad>=18){
            return "Aceptada";
        }
        else{
            return "No aceptada";
        }
    }
}