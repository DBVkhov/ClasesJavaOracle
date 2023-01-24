package EjerciciosDeCondicionales;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ejercicio3 {
    public static void main (String[]args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Introduce el numero a comprobar:");

            String Valor = buffer.readLine();
            int numero = Integer.parseInt(Valor);

            if (EsPar(numero)){
                System.out.println("El numero " + numero + " es par.");
            }
            else{
                System.out.println("El numero " + numero + " es impar.");
            }

        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static boolean EsPar(int numero1){

        if (numero1%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}