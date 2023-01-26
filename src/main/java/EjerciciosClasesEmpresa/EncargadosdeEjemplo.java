package EjerciciosClasesEmpresa;

import java.util.Date;

public class EncargadosdeEjemplo{
    public static Encargado[] encargadosejemplo(){

        Encargado[] encargados = new Encargado[2];

        encargados[0] = new Encargado("11111111Z","123", new Date());
        encargados[1] = new Encargado("21111111Z","123", new Date());

        return encargados;
    }
}
