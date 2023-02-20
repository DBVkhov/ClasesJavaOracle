package EjerciciosMapas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            LinkedHashMap<Character,Integer> letras = new LinkedHashMap<Character,Integer>();
            Character l = '1';
            while(l != 0){
                System.out.println("Introduzca un caracter(0 para terminar):");
                String L = buffer.readLine();
                l = L.charAt(0);
                System.out.println("El valor introducido es: " + l);
                if (letras.containsValue(l)) {
                    letras.putIfAbsent(l,(letras.get(l)+1));
                }
                else{
                    letras.put(l, 1);
                }
            }
            char k = letras.entrySet().stream().filter(entry -> entry.getValue()==1).findFirst().get().getKey();
            System.out.println("La letra sin repetir es: " + k);
        } catch (
                Exception exception) {
            exception.printStackTrace();
        }
    }
}
