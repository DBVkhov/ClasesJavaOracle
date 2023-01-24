package EjerciciosArray1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio5 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Introduzca los numeros de su DNI:");

            String dni = buffer.readLine();
            int numerosdni = Integer.parseInt(dni);

            while(numerosdni>=100000000 || numerosdni<=10000000){
                System.out.println("Introduzca un numero correcto de DNI:");

                dni = buffer.readLine();
                numerosdni = Integer.parseInt(dni);
            }

            int Nletra = numerosdni % 23;

            char[] LetraDNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

            System.out.print(numerosdni);
            System.out.print(LetraDNI[Nletra]);

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
