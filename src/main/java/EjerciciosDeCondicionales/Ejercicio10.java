package EjerciciosDeCondicionales;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ejercicio10 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Introduce el año a analizar:");

            String ano = buffer.readLine();
            int ANO = Integer.parseInt(ano);

            System.out.println("El año " + EsBisiesto(ANO) + ".");

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static String EsBisiesto(int ano){
        if(ano%4==0 && ano%100==0 && ano%400==0){
            return "es bisiesto";
        }
        else{
            return "no es bisiesto";
        }
    }
}