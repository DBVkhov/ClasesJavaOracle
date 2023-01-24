package EjerciciosWhile;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Introduzca el numero inicial:");

            String ini = buffer.readLine();
            int inicial = Integer.parseInt(ini);

            System.out.println("Introduzca el numero tope:");

            String tope = buffer.readLine();
            int top = Integer.parseInt(tope);

            while(inicial<=top){
                System.out.println(inicial);
                inicial++;
            }


        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
