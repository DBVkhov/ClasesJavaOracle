package Calculadora;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class CalculadoraDanilaBorisov {
    public static void main (String[]args) {
        try {
                    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

                    System.out.println("Introduce el primer valor a operar:");

                    String Valor1 = buffer.readLine();
                    int numero1 = Integer.parseInt(Valor1);

                    System.out.println("Introduce el segundo valor a operar:");

                    String Valor2 = buffer.readLine();
                    int numero2 = Integer.parseInt(Valor2);

                    System.out.println(numero1 + " + " + numero2 + " = " + suma(numero1,numero2));
                    System.out.println(numero1 + " - " + numero2 + " = " + resta(numero1,numero2));
                    System.out.println(numero1 + " * " + numero2 + " = " + multiplicacion(numero1,numero2));
                    System.out.println(numero1 + " / " + numero2 + " = " + division(numero1,numero2));


        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static int resta ( int val1, int val2){

        return val1 - val2;

    }
    public static int suma ( int val1, int val2){

        return val1 + val2;

    }
    public static int multiplicacion ( int val1, int val2){

        return val1 * val2;

    }
    public static float division ( float val1, float val2){

        return val1 / val2;

    }

}
