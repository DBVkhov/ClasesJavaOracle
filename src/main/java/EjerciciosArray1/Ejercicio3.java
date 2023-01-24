package EjerciciosArray1;
import java.util.Arrays;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ejercicio3 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            int z = 0 ;
            char[] Letras = new char[26];


            for(int i = 65; i <= 90; i++)   {

                Letras[z] = (char)i;
                z++;

            }

            int letra = 0;
            String resultado = "";
            while(letra != -1){
                System.out.println("Introduzca un numero de 0 a 25 o -1 para salir:");

                    String Letra = buffer.readLine();
                    letra = Integer.parseInt(Letra);

                    if (letra == -1) {}

                    else if(letra>25 || letra<-1){
                        System.out.println("Introduzca un valor correcto");
                    }

                    else {
                        resultado = (String) resultado + Letras[letra];
                    }

            }
            System.out.println(resultado);

        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    }
