package EjerciciosDeCondicionales;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ejercicio1 {
    public static void main (String[]args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Introduce el primer valor a comparar:");

            String Valor1 = buffer.readLine();
            int numero1 = Integer.parseInt(Valor1);

            System.out.println("Introduce el segundo valor a comparar:");

            String Valor2 = buffer.readLine();
            int numero2 = Integer.parseInt(Valor2);

            if(MayorQue(numero1,numero2)){
                System.out.println("El numero " + numero1 + " es mayor que " + numero2);
            }
            else if(MayorQue(numero2,numero1)){
                System.out.println("El numero " + numero2 + " es mayor que " + numero1);
            }
            else{
                System.out.println("El numero " + numero1 + " y " + numero2 + " son iguales.");
            }
        }

        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static boolean MayorQue(int numero1, int numero2){

        if (numero1 > numero2){
            return true;
        }
        else{
            return false;
        }
    }
}
