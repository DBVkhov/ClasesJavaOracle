package EjerciciosCollection;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> nums = new ArrayList<Integer>();
            Integer n = 0;

            while (n != -99) {
                System.out.println("Escriba un entero:");
                n = Integer.parseInt(buffer.readLine());
                if (n != -99) {
                    nums.add(n);
                }
            }
                int sum = 0;
                int cont = 0;
                for(Integer num: nums) {
                    System.out.println(num);
                    sum = sum + num;
                    cont++;
                }
                System.out.println("La suma es = " + sum);
                System.out.println("La media es = " + (sum/cont));
        } catch (
                Exception exception) {
            exception.printStackTrace();
        }
    }
}
