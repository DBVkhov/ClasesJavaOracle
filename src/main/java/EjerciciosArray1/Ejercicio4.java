package EjerciciosArray1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio4 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Introduzca un numero:");

            String numero = buffer.readLine();
            int[] array1 = new int[Integer.parseInt(numero)];
            int[] array2 = new int[Integer.parseInt(numero)];
            int[] array3 = new int[Integer.parseInt(numero)];

            for (int i = 0; i < array1.length; i++) {
                int min = 1;
                int max = 100;

                int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
                array1[i]= random_int;
            }
            for (int i = 0; i < array2.length; i++) {
                int min = 1;
                int max = 100;

                int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
                array2[i]= random_int;
            }
            for (int i = 0; i < array3.length; i++) {
                array3[i] = array1[i]*array2[i];
                System.out.println(array1[i] + " * " + array2[i] + " = " + array3[i]);
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
