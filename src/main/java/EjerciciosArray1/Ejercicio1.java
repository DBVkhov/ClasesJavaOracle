package EjerciciosArray1;
import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numerosaleatorios = new int[10];

        for (int i = 0; i < numerosaleatorios.length; i++) {
            int min = 0;
            int max = 9;

            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            numerosaleatorios[i]= random_int;
        }
        for (int i = 0; i < numerosaleatorios.length; i++) {
            System.out.println(numerosaleatorios[i]);
            if(i == numerosaleatorios.length-1){
                System.out.println(" = ");
            }
            else{
                System.out.println(" + ");
            }
        }
        int sum = Arrays.stream(numerosaleatorios).sum();
        System.out.print(sum);
    }

}
