package EjerciciosDeCondicionales;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ejercicio4 {
    public static void main (String[]args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Introduce el dividendo:");

            String Valor1 = buffer.readLine();
            float numero1 = Integer.parseInt(Valor1);

            System.out.println("Introduce el divisor:");

            String Valor2 = buffer.readLine();
            float numero2 = Integer.parseInt(Valor2);

            if (numero2==0){
                System.out.println("El divisor no puede ser cero");
            }
            else{
                System.out.println(numero1 + " / " + numero2 + " = " + Division(numero1,numero2));
            }
        }

        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static float Division(float numero1, float numero2){
        float resultado = numero1/numero2;
        return resultado;
    }
}