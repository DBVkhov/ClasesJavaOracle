package EjerciciosArray1;
import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros100= new int[100];
        for(int i = 0; i < numeros100.length; i++){
            numeros100[i] = i++;
        }

        int sum = Arrays.stream(numeros100).sum();
        System.out.println("La suma de todos los numeros es = " + sum);

        double media = 0.0;
        for (int i=0; i < numeros100.length; i++) {
            media = media + numeros100[i];
        }
        media = media / numeros100.length;
        System.out.println("La media de los numeros es = " + media);
    }
}
