package EjerciciosClasesEmpresa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Objects;

import static EjerciciosClasesEmpresa.Empresa.*;

public class MenuEncargado {
    public static char menuEncargado(Jefe jefe, Encargado encargado, Encargado[] encargados, int inventario, Trabajador[] trabajadores, char letra) throws IOException {

        while (letra != 'o') {

            System.out.println("ELEGIR UNA OPCION:");
            System.out.println("(S)umar inventario");
            System.out.println("(N)uevo empleado (Contratar a nuevo empleado a tu cargo)");
            System.out.println("(D)espedir empleado");
            System.out.println("(R)epartir clientes");
            System.out.println("(V)enta");
            System.out.println("(O)tro usuario (Cambiar de usuario)");
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            letra = buffer.readLine().charAt(0);
            letra = Character.toLowerCase(letra);

            switch (letra) {

                case 's':

                    //(S)umar inventario.

                    System.out.println("Inventario =" + inventario);
                    System.out.println("Cuanto inventario desea añadir?");
                    int nuevo = Integer.parseInt(buffer.readLine());
                    inventario = inventario +nuevo;
                    System.out.println("Inventario =" + inventario);

                    break;

                case 'n':

                    //(N)uevo empleado.

                    boolean haysitio = false;
                    int posicion = 10;

                    for(int i = 0; i < trabajadores.length; i++){
                        if(trabajadores[i] == null){
                            haysitio = true;
                            posicion = i;
                            i = trabajadores.length;
                        }
                    }
                    if(!haysitio){
                        System.out.println("No se pueden contratar a mas trabajadores");
                        break;
                    }

                    boolean dnilongitud = true;
                    boolean dninorepetido = true;
                    boolean dniletra = true;
                    boolean dniinvalido = true;
                    String dni = "";

                    while(dniinvalido) {

                        System.out.println("DNI:");
                        dni = buffer.readLine();

                        for(int j = 0; j < trabajadores.length; j++) {
                            if (Objects.equals(dni, trabajadores[j].getDNI())) {
                                dninorepetido = false;
                                System.out.println("El DNI se corresponde con un trabajador");
                            }
                        }

                        for(int k = 0; k < encargados.length; k++){
                            if(Objects.equals(dni, encargados[k].getDNI())) {
                                dninorepetido = false;
                                System.out.println("El DNI se corresponde con un encargado");
                            }
                        }

                        if(jefe.getDNI() == dni){
                            dninorepetido = false;
                            System.out.println("El DNI se corresponde con el del JEFE");
                        }

                        if(dni.length()!=9){
                            dnilongitud = false;
                            System.out.println("La longitud es incorrecta");
                        }

                        if((!dni.substring(8).matches("[A-Z]*"))){
                            dniletra = false;
                            System.out.println("El ultimo caracter no es una letra o no es mayuscula");
                        }

                        if(dninorepetido && dnilongitud && dniletra){
                            dniinvalido = false;
                        }
                    }

                    System.out.println("Contraseña:");
                    String password = buffer.readLine();

                    System.out.println("Año de nacimiento:");
                    int ano = Integer.parseInt(buffer.readLine()) - 1900;

                    System.out.println("Mes de nacimiento (escribir en numeros 1-12)");
                    int mes = Integer.parseInt(buffer.readLine()) - 1;

                    System.out.println("Dia de nacimiento:");
                    int dia = Integer.parseInt(buffer.readLine());

                    Date nacimiento = new Date(ano, mes, dia);


                    trabajadores[posicion] = new Trabajador(dni, password, nacimiento);

                    trabajadores[posicion].setEncargado(encargado);

                    break;

                case 'd':

                    //(D)espedir empleado.

                    System.out.println("Escriba el DNI del empleado a despedir:");
                    dni = buffer.readLine();

                    dniinvalido = true;
                    while(dniinvalido) {
                        for(int i = 0; i < trabajadores.length; i++){
                            if(trabajadores[i] == null){}
                            else if(Objects.equals(dni, trabajadores[i].getDNI())){
                                dniinvalido = false;
                            }
                        }
                        if(dniinvalido) {
                            System.out.println("Escriba un DNI VALIDO del empleado a despedir:");
                            dni = buffer.readLine();
                        }

                    }

                    for (int i = 0; i < trabajadores.length; i++) {
                        if(trabajadores[i] == null){}
                        else if (Objects.equals(dni, trabajadores[i].getDNI())) {
                            System.out.println(trabajadores[i].getDNI() + " despedido, salario= " + trabajadores[i].getSalario() + ", clientes= " + trabajadores[i].getClientes());
                            int clientesarepartir = trabajadores[i].getClientes();
                            while (clientesarepartir > 0) {
                                for (int j = 0; j < trabajadores.length; j++) {
                                    if (trabajadores[j] != null && trabajadores[j] != trabajadores[i]) {
                                        trabajadores[j].setClientes(trabajadores[j].getClientes() + 1);
                                        clientesarepartir = clientesarepartir - 1;
                                    }

                                }

                            }
                            trabajadores[i] = null;
                        }
                    }

                    break;

                case 'r':

                    //(R)epartir clientes.

                    if(random50()){
                        trabajadores = aquiendespedir20(trabajadores);
                    }
                    else{
                        int clientesarepartir = encargado.getClientes()%2;
                        encargado.setClientes(encargado.getClientes()-encargado.getClientes()%2);
                        for(int j = 1; j<=clientesarepartir;){
                            for(int k = 0; k<trabajadores.length; k++){
                                if(trabajadores[k] != null) {
                                    trabajadores[k].setClientes(trabajadores[k].getClientes() + 1);
                                    j++;
                                }
                            }
                        }

                    }

                    break;

                case 'v':

                    //(V)entas.

                    if(random20()){
                        float venta = valorventa();
                        System.out.println("Valor venta = " + venta);
                        System.out.println("Suma al sueldo :" + encargado.getSalario() + " + " + (venta*0.3) + " = ");
                        encargado.setSalario((float) (encargado.getSalario()+(venta*0.3)));
                        System.out.println(encargado.getSalario());

                        jefe.setSalario((float) (jefe.getSalario()+(venta*0.7)));

                        System.out.println("Clientes = " + encargado.getClientes() + " + 1 = ");
                        encargado.setClientes(encargado.getClientes()+1);
                        System.out.println(encargado.getClientes());

                        inventario--;

                        System.out.println("Inventario =" + inventario);

                    }
                    else{
                        System.out.println("No hubo suerte");
                    }

                    break;

                case 'o':

                    //(O)tro usuario.

                    break;
            }
        }

        return letra;
    }
}
