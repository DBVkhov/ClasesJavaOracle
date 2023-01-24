package EjerciciosDeCondicionales;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ejercicio5 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Introduce una cadena:");

            String Cadena = buffer.readLine();

            if(EsMayus(Cadena)){
                System.out.println(Cadena + " esta totalmente en mayusculas");
            }
            else{
                System.out.println(Cadena + " no esta en mayusculas o no del todo");
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static boolean EsMayus(String cadena){
        if (cadena==cadena.toUpperCase()){
            return true;
        }
        else{
            return false;
        }
    }
}