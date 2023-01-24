package EjerciciosDeCondicionales;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ejercicio16 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("America del Norte(1), America Central(2), America del Sur(3), Europa(4) y Asia(5):");

            String cont = buffer.readLine();
            int continente = Integer.parseInt(cont);

            if(continente>5 || continente<1){
                System.out.println("Introduce un numero del 1 al 5. El resto no son validos.");
            }
            else {

                System.out.println("Introduce los KG:");

                String kg = buffer.readLine();
                int peso = Integer.parseInt(kg);

                if (peso<=0){
                    System.out.println("Introduzca un peso valido (Mayor a cero).");
                }
                else {

                    float impuesto = PrecioEnvioXKG(continente);

                    double precio = peso * impuesto;

                    System.out.println("El precio del envio es: " + precio + "€.");
                }
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static float PrecioEnvioXKG(int continente){

            if(continente==1) {
                float impuesto = 24;
                return impuesto;
            }
            else if(continente==2) {
                float impuesto = 20;
                return impuesto;
            }
            else if(continente==3) {
                float impuesto = 21;
                return impuesto;
            }
            else if(continente==4) {
                float impuesto = 10;
                return impuesto;
            }
            else {
                float impuesto = 18;
                return impuesto;
            }
    }
}