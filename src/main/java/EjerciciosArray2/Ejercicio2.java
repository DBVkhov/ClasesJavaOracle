package EjerciciosArray2;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            String[] Alumnos = new String[10];
            double[] Notas = new double[10];
            String[][] Clase = new String[10][3];

            for (int i = 0; i < Alumnos.length; i++) {

                System.out.println("Introduzca el nombre del alumno:");

                Alumnos[i] = buffer.readLine();

                System.out.println("Introduzca una nota del alumno:");

                String nota = buffer.readLine();
                Notas[i] = Double.parseDouble(nota);

                while (Notas[i]>10 || Notas[i]<0){

                    System.out.println("ERROR. Introduzca una nota VALIDA DE 0 A 10 del alumno:");

                    nota = buffer.readLine();
                    Notas[i] = Double.parseDouble(nota);
                }

                System.out.println("Almacenada la nota " + Notas[i] + " del alumno " + Alumnos[i]);

            }
            for (int i = 0; i < Alumnos.length; i++) {

                Clase[i][0] = Alumnos[i];
                Clase[i][1] = String.valueOf(Notas[i]);
                Clase[i][2] = NotaEnLetras(Notas[i]);

                System.out.println(Arrays.toString(Clase[i]));

            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    private static String NotaEnLetras(double nota){
        if(nota>=9){
            return "Sobresaliente";
        }
        else if(nota>=7){
            return "Notable";
        }
        else if(nota>=5){
            return "Bien";
        }
        else{
            return "Suspenso";
        }
    }
}
