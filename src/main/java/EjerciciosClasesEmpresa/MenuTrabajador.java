package EjerciciosClasesEmpresa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static EjerciciosClasesEmpresa.Empresa.random20;
import static EjerciciosClasesEmpresa.Empresa.valorventa;

public class MenuTrabajador {
    public static char menuTrabajador(Jefe jefe, Encargado encargado, int inventario, Encargado[] encargados, Trabajador trabajador, char letra) throws IOException {
        while(letra != 'o'){
            System.out.println("ELEGIR UNA OPCION:");
            System.out.println("(V)enta");
            System.out.println("(O)tro usuario (Cambiar de usuario)");
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            letra = buffer.readLine().charAt(0);
            letra = Character.toLowerCase(letra);

            switch(letra){

                case 'v':

                    //(V)enta.

                    if(random20()){

                        float venta = valorventa();

                        System.out.println("Valor venta =" + venta);

                        if(trabajador.getEncargado() != null) {


                            System.out.println("Suma al sueldo :" + trabajador.getSalario() + " + " + (venta * 0.2) + " = ");
                            trabajador.setSalario((float) (trabajador.getSalario() + (venta * 0.2)));
                            System.out.println(trabajador.getSalario());


                            for (int i = 0; i < encargados.length; i++) {
                                if(encargados[i] == null){}
                                else if (encargados[i] == encargado) {
                                    encargados[i].setSalario((float) (encargados[i].getSalario() + (venta * 0.1)));
                                    encargado.setSalario(encargados[i].getSalario());
                                }
                            }
                        }

                        else{

                            System.out.println("Suma al sueldo :" + trabajador.getSalario() + " + " + (venta * 0.3) + " = ");
                            trabajador.setSalario((float) (trabajador.getSalario() + (venta * 0.3)));
                            System.out.println(trabajador.getSalario());

                        }
                        jefe.setSalario((float) (jefe.getSalario()+(venta*0.7)));

                        System.out.println("Clientes = " + trabajador.getClientes() + " + 1 = ");
                        trabajador.setClientes(trabajador.getClientes()+1);
                        System.out.println(trabajador.getClientes());

                        inventario--;
                        System.out.println("Inventario = " + inventario);

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
