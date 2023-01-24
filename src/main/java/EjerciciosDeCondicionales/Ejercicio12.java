package EjerciciosDeCondicionales;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ejercicio12 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Introduce el numero de alumnos:");

            String students = buffer.readLine();
            int alumnos = Integer.parseInt(students);

            System.out.print("El precio a pagar a la empresa es de " + PrecioEmpresa(alumnos) + "€.");
            System.out.println(" Y el precio a pagar de cada alumno es de " + PrecioAlumnos(alumnos) + "€.");

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static float PrecioEmpresa(int alumnos){
        if(alumnos>=100){
            float precio = 65*alumnos;
            return precio;
        }
        else if (alumnos>=50){
            float precio = 70*alumnos;
            return precio;
        }
        else if (alumnos>=30){
            float precio = 90*alumnos;
            return precio;
        }
        else{
            float precio =4000;
            return precio;
        }
    }
    public static float PrecioAlumnos(int alumnos){
        if(alumnos>=100){
            float precio = 65;
            return precio;
        }
        else if (alumnos>=50){
            float precio = 70;
            return precio;
        }
        else if (alumnos>=30){
            float precio = 90;
            return precio;
        }
        else{
            float precio =4000/alumnos;
            return precio;
        }
    }
}