package EjerciciosDeCondicionales;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ejercicio6 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Introduce un numero a elevar:");

            String Valor1 = buffer.readLine();
            int numero1 = Integer.parseInt(Valor1);

            System.out.println("Introduce el numero por el que se eleva:");

            String Valor2 = buffer.readLine();
            int numero2 = Integer.parseInt(Valor2);

            System.out.println(numero1 + " ^ " + numero2 + " = " + (float) Math.pow(numero1,numero2));

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}