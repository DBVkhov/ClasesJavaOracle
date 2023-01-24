package EjerciciosArray2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            String[][] PaisesConCiudades = new String[3][4];

            for(int i = 0; i < PaisesConCiudades.length; i++) {

                System.out.println("Introduzca un pais:");

                String pais = buffer.readLine();
                PaisesConCiudades[i][0] = pais;

                for (int j = 1; j < PaisesConCiudades[i].length; j++) {
                    System.out.println("Introduzca una ciudad de ese pais:");

                    PaisesConCiudades[i][j] = buffer.readLine();

                }

            }
            for(int i = 0; i < PaisesConCiudades.length; i++) {

                System.out.println(PaisesConCiudades[i][0]);

                for (int j = 1; j < PaisesConCiudades[i].length; j++) {

                    System.out.print(PaisesConCiudades[i][j] + " ");
                }

                System.out.println("");
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
