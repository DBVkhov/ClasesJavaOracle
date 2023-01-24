package EjerciciosWhile;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ejercicio3 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            int min = 1;
            int max = 100;

            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

            int numerointroducido = 0;

            while(numerointroducido!=random_int){

                System.out.println("Introduzca un numero entero entre 1 y 100:");

                String num = buffer.readLine();
                numerointroducido = Integer.parseInt(num);

                if(numerointroducido>100 || numerointroducido<1){
                    System.out.println("El numero introducido debe ser igual o menor que 100 y mayor o igual a 1.");
                }
                else if(numerointroducido<random_int){
                    System.out.println("El numero aleatorio es mayor al numero introducido.");
                }
                else if(numerointroducido>random_int){
                    System.out.println("El numero aleatorio es menor al numero introducido");
                }
                else{
                    System.out.println("Adivino el numero! Era " + random_int + ".");
                }
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}