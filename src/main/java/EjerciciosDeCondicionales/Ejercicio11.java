package EjerciciosDeCondicionales;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ejercicio11 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Introduce el grupo:");

            String group = buffer.readLine();
            group = group.toUpperCase();
            char grupo = group.charAt(0);
            if(grupo!='A' || grupo!='B'){
                System.out.println("Escriba grupo A o B. El resto de valores no se admiten.");
            }
            else {

                System.out.println("Introduce el tamaño:");

                String size = buffer.readLine();
                int tamano = Integer.parseInt(size);
                if(tamano!='1' || tamano!='2'){
                    System.out.println("Escriba tamaño 1 o 2. El resto de valores no se admiten.");
                }
                else {

                    System.out.println("Introduce los kg:");

                    String weight = buffer.readLine();
                    int kg = Integer.parseInt(weight);

                    if (PrecioKG(grupo, tamano) >= 0) {
                        System.out.println("Debe pagar " + PrecioKG(grupo, tamano) * kg);
                    } else {
                        System.out.println("Se le devuelve " + PrecioKG(grupo, tamano) * kg);
                    }
                }
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static double PrecioKG(char group, int size){
        if (group=='A' && size==1){
            return 0.20;
        }
        else if(group=='A' && size==2){
            return 0.30;
        }
        else if(group=='B' && size==1){
            return -0.30;
        }
        else{
            return -0.50;
        }
    }
}
