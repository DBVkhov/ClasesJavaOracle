package EjerciciosDeCondicionales;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ejercicio13 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Minutos de llamada:");

            String min = buffer.readLine();
            int minutos = Integer.parseInt(min);

            System.out.println("Dia de la semana (L/M/X/J/V/S/D):");

            String DiaSemana = buffer.readLine();
            DiaSemana = DiaSemana.toUpperCase();
            char diasemana = DiaSemana.charAt(0);

            System.out.println("Turno dia (M/T):");

            String Turno = buffer.readLine();
            Turno = Turno.toUpperCase();
            char turno = Turno.charAt(0);

            double preciollamada = ImpuestoLlamadas(minutos);
            Double precioTotal = preciollamada+ImpuestoDia(diasemana,preciollamada)+ImpuestoTurno(turno,preciollamada);
            System.out.println("El precio a pagar es de " + precioTotal + "€.");

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static double ImpuestoLlamadas(int minutos){
        if(minutos>10){
            double precioLlamada = (float) ((5)+(0.80*3)+(0.70*2)+((minutos-10)*0.50));
            return precioLlamada;
        }
        else if(minutos>7){
            double precioLlamada = (float) ((5)+(0.80*3)+(0.70*(minutos-7)));
            return precioLlamada;
        }
        else if(minutos>5){
            double precioLlamada = (float) ((5)+(0.80*(minutos-5)));
            return precioLlamada;
        }
        else{
            double precioLlamada = (float) ((1*minutos));
            return precioLlamada;
        }
    }
    public static double ImpuestoDia(char diasemana, double preciollamada){
        if(diasemana=='D'){
            return 0.03*preciollamada;
        }
        else{
            return 0;
        }
    }
    public static double ImpuestoTurno(char turno, double preciollamada){
        if(turno=='M'){
            return 0.15*preciollamada;
        }
        else{
            return 0.1*preciollamada;
        }
    }
}