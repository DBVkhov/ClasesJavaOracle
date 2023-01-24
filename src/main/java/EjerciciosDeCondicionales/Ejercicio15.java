package EjerciciosDeCondicionales;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ejercicio15 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Introduce el dia de la semana (1-7):");

            String dia = buffer.readLine();
            int diasemana = Integer.parseInt(dia);

            if (diasemana < 1 || diasemana > 7) {
                System.out.println("ERROR. Introduzca un numero del 1 al 7.");
            } else {
                System.out.println("El dia " + diasemana + " de la semana en letras es " + SemanaEnLetras(diasemana));
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static String SemanaEnLetras(int dia) {
        if (dia == 1) {
            return "Lunes";
        }
        else if (dia == 2) {
            return "Martes";
        }
        else if (dia == 3) {
            return "Miercoles";
        }
        else if (dia == 4) {
            return "Jueves";
        }
        else if (dia == 5) {
            return "Viernes";
        }
        else if (dia == 6) {
            return "Sabado";
        }
        else{
            return "Domingo";
        }

    }
}