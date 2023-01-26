package EjerciciosClasesEmpresa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Objects;

public class MenuJefe {
    public static char menuJefe(Jefe jefe, Trabajador[] trabajadores, Encargado[] encargados, char letra) throws IOException {

        boolean cierre = false;

        while (!cierre) {

            System.out.println("ELEGIR UNA OPCION:");
            System.out.println("(N)uevo empleado (Sin encargado)");
            System.out.println("(D)espedir empleado");
            System.out.println("(A)scenso de un trabajador a encargado");
            System.out.println("(E)Asignar un (e)ncargado a un trabajador");
            System.out.println("(O)tro usuario (Cambiar de usuario)");
            System.out.println("(C)errar empresa");
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            letra = buffer.readLine().charAt(0);
            letra = Character.toLowerCase(letra);

            switch (letra) {
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

                    String dni = "";

                    boolean dnilongitud = true;
                    boolean dninorepetido = true;
                    boolean dniletra = true;
                    boolean dniinvalido = true;

                    while(dniinvalido) {

                        System.out.println("DNI:");
                        dni = buffer.readLine();

                        for(int j = 0; j < trabajadores.length; j++) {
                            if(trabajadores[j] == null){}
                            else if (dni == trabajadores[j].getDNI()) {
                                dninorepetido = false;
                                System.out.println("El DNI esta en uso");
                            }
                        }

                        for(int k = 0; k < encargados.length; k++){
                            if(encargados[k] == null){}
                            else if(dni == encargados[k].getDNI()) {
                                dninorepetido = false;
                                System.out.println("El DNI esta en uso");
                            }
                        }

                        if(jefe.getDNI() == dni){
                            dninorepetido = false;
                            System.out.println("El DNI esta en uso");
                        }

                        if(dni.length()!=9){
                            dnilongitud = false;
                            System.out.println("La longitud es incorrecta");
                        }

                        if(dni.length()==9) {
                            if (!dni.substring(8).matches("[A-Z]*")) {
                                dniletra = false;
                                System.out.println("El ultimo caracter no es una letra o no es mayuscula");
                            }
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
                        for(int i = 0; i < encargados.length; i++){
                            if(encargados[i] == null){}
                            else if(Objects.equals(dni, encargados[i].getDNI())){
                                dniinvalido = false;
                            }
                        }
                        if(dniinvalido){
                            System.out.println("Escriba un DNI valido:");
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
                    for(int i = 0; i < encargados.length; i++){
                        if (Objects.equals(dni, encargados[i].getDNI())){
                            System.out.println(encargados[i].getDNI() + " despedido, salario = " + encargados[i].getSalario() + ", clientes = " + encargados[i].getClientes());
                            int clientesarepartir = encargados[i].getClientes();
                            while (clientesarepartir > 0) {
                                for (int j = 0; j < trabajadores.length; j++) {

                                    if (trabajadores[j] != null && trabajadores[j].getDNI() != encargados[i].getDNI()) {
                                        trabajadores[j].setClientes(trabajadores[j].getClientes() + 1);
                                        clientesarepartir = clientesarepartir - 1;
                                    }

                                }

                            }
                            encargados[i] = null;
                        }
                    }

                    break;

                case 'a':

                    //(A)scenso empleado.

                    System.out.println("Escriba el DNI del trabajador a ascender:");
                    dni = buffer.readLine();

                    for (int i = 0; i < trabajadores.length; i++) {
                        if(trabajadores[i] == null){}
                        else if (Objects.equals(dni, trabajadores[i].getDNI())) {
                            for (int j = 0; i < encargados.length; j++) {
                                if (encargados[j] == null) {

                                    encargados[j] = new Encargado(trabajadores[i].getDNI(), trabajadores[i].getContrasena(), trabajadores[i].getNacimiento());

                                    encargados[j].setClientes(trabajadores[i].getClientes());

                                    trabajadores[i] = null;

                                } else {
                                    System.out.println("Ya hay dos encargados");
                                }
                            }
                        }
                    }

                    break;

                case 'e':

                    //Asignar un (e)ncargado.

                    System.out.println("Escriba el DNI del encargado:");
                    String DNIencargado = buffer.readLine();
                    System.out.println("Escriba el DNI del trabajador:");
                    String DNItrabajador = buffer.readLine();

                    for(int i = 0; i < encargados.length; i++){
                        if(encargados[i] == null){}
                        else if(Objects.equals(DNIencargado, encargados[i].getDNI())){
                            for (int j = 0; j < trabajadores.length; j++){
                                if(trabajadores[i] == null){}
                                else if(Objects.equals(DNItrabajador, trabajadores[j].getDNI())){
                                    trabajadores[j].setEncargado(encargados[i]);
                                    System.out.println("Asignado al trabajador " + trabajadores[i].getDNI() + " el encargado " + trabajadores[i].getEncargado().getDNI());
                                }
                                else{
                                    System.out.println("DNI del trabajador mal escrito");
                                }
                            }
                        }
                        else{
                            System.out.println("DNI del encargado mal escrito");
                        }
                    }

                case 'o':

                    //(O)tro usuario.

                    cierre = true;

                    break;

                case 'c':

                    //(C)errar empresa.

                    cierre = true;

                    for(int i = 0; i< encargados.length; i++) {
                        if (encargados[i] != null) {
                            System.out.println(encargados[i].getDNI() + ", " + encargados[i].getCargo() + ", clientes = " + encargados[i].getClientes() + ", recaudado = " + encargados[i].getSalario());
                        }
                    }

                    for(int i = 0; i< trabajadores.length; i++) {
                        if (trabajadores[i] != null) {
                            System.out.println(trabajadores[i].getDNI() + ", " + trabajadores[i].getCargo() + ", clientes = " + trabajadores[i].getClientes() + ", recaudado = " + trabajadores[i].getSalario());
                        }
                    }
                    System.out.println(jefe.getDNI() + ", " + jefe.getCargo() + ", recaudado = " + jefe.getSalario());

                    break;
            }
        }
        return letra;
    }
}
