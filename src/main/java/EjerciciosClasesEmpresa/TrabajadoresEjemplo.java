package EjerciciosClasesEmpresa;

import java.util.Date;

public class TrabajadoresEjemplo {

    public static Trabajador[] TrabajadoresdeEjemplo(){

        Trabajador[] trabajadores = new Trabajador[10];

        trabajadores[0] = new Trabajador("11111111Y", "123", new Date());
        trabajadores[1] = new Trabajador("21111111Y", "123", new Date());
        trabajadores[2] = new Trabajador("31111111Y", "123", new Date());
        trabajadores[3] = new Trabajador("41111111Y", "123", new Date());
        trabajadores[4] = new Trabajador("51111111Y", "123", new Date());
        trabajadores[5] = new Trabajador("61111111Y", "123", new Date());
        trabajadores[6] = new Trabajador("71111111Y", "123", new Date());
        trabajadores[7] = new Trabajador("81111111Y", "123", new Date());
        trabajadores[8] = new Trabajador("91111111Y", "123", new Date());
        trabajadores[9] = new Trabajador("10111111Y", "123", new Date());

        return trabajadores;
    }
}
