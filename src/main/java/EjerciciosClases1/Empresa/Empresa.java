package EjerciciosClases1.Empresa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Empresa {

    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void MenuJefe(String DNI, String contrasena) throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String letra = buffer.readLine();
        char menu = letra.charAt(0);

        switch(menu){
            case 'n':
                //(N)uevo empleado.
                break;
            case 'd':
                //(D)espedir empleado.
                break;
            case 'a':
                //(A)scenso empleado.
                break;
            case 'c':
                //(C)errar empresa.
                break;
        }
    }

    private static float valorventa(){
        float venta = (float) (Math.random()*1001);
        return venta;
    }

    private static float sumaxventa(float venta, Trabajador trabajador){

        float sumasalsalario;

        if(trabajador.getCargo() == Cargo.TRABAJADOR){
            sumasalsalario = (float) (venta*0.20);
            return sumasalsalario;
        }
        else if(trabajador.getCargo() == Cargo.ENCARGADO){
            sumasalsalario = (float) (venta*0.10);
            return sumasalsalario;
        }
        else{
            sumasalsalario = (float) (venta*0.70);
            return sumasalsalario;
        }

    }

    private static boolean random50(){
        int moneda = (int) (Math.random()*2);
        if (moneda==1){
            boolean random = true;
            return random;
        }
        else {
            boolean random = false;
            return random;
        }
    }
    private static boolean random20(){
        int dado = (int) (Math.random()*5);
        if (dado==0){
            boolean random = true;
            return random;
        }
        else {
            boolean random = false;
            return random;
        }
    }
    private static Trabajador[] aquiendespedir20(Trabajador[] trabajador){

        int[] lista = new int[trabajador.length];
        Trabajador[] nuevalista = new Trabajador[trabajador.length];

        for (int i = 0; i < trabajador.length; i++) {
            lista[i] = trabajador[i].getClientes();
        }

        Arrays.sort(lista);

        for (int i = 0; i <trabajador.length; i++) {
            for (int j = 0; j < trabajador.length; j++){
                if(lista[i] == trabajador[j].getClientes()){
                    nuevalista[i] = trabajador[j];
                }
            }

            if(i == 1 || i == 0) {
                for (int x = 0; x < nuevalista[i].getClientes(); x++){

                    int y = 2;
                    int clientesarepartir = trabajador[i].getClientes();

                    while(clientesarepartir>0) {
                        nuevalista[y].setClientes(nuevalista[y].getClientes() + 1);
                        clientesarepartir--;
                        y++;
                        if(y > 9){
                            y = 2;
                        }
                    }

            }
                nuevalista[i] = null;
            }

        }

        return nuevalista;

    }

}

