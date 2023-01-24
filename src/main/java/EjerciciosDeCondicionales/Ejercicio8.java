package EjerciciosDeCondicionales;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ejercicio8 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Introduce x1:");

            String Valor1 = buffer.readLine();
            int x1 = Integer.parseInt(Valor1);

            System.out.println("Introduce y1:");

            String Valor2 = buffer.readLine();
            int y1 = Integer.parseInt(Valor2);

            System.out.println("Introduce r1:");

            String Valor3 = buffer.readLine();
            int r1 = Integer.parseInt(Valor3);

            System.out.println("Introduce x2:");

            String Valor4 = buffer.readLine();
            int x2 = Integer.parseInt(Valor4);

            System.out.println("Introduce y2:");

            String Valor5 = buffer.readLine();
            int y2 = Integer.parseInt(Valor5);

            System.out.println("Introduce r2:");

            String Valor6 = buffer.readLine();
            int r2 = Integer.parseInt(Valor6);

            float distancia = DistanciaEntreCentros(x1,y1,x2,y2);

            System.out.println("Las circunferencias son " + EsExterior(distancia, r1, r2) + ", " + EsSecTag(distancia, r1, r2) + " y " + EsConcen(x1, x2, y1, y2));

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static float DistanciaEntreCentros (float x1, float y1, float x2, float y2){

        float Distancia;

        if (x1==x2 || y1==y2){
            Distancia = (y1 - y2)+(x1 - x2);
        }

        else {

            float X = Math.max(x1, x2) - Math.min(x1, x2);
            float Y = Math.max(y1, y2) - Math.min(y1, y2);
            Distancia = (float) Math.hypot(X, Y);
        }

        return Distancia;
    }
    public static String EsExterior (float Distancia, float r1, float r2){

        if (Distancia > Math.max(r1,r2)){
            return "exteriores";
        }

        else{
            return "interiores";
        }

    }
    public static String EsSecTag (float Distancia, float r1, float r2){

        if (Distancia==(r1+r2) || ((Distancia+Math.min(r1,r2))==Math.max(r1,r2))){
            return "tangentes";
        }
        else if( (Distancia<(r1+r2) && (Distancia>Math.max(r1,r2)) ) || ( (Distancia+Math.min(r1,r2))>(Math.max(r1,r2)) && (Distancia<Math.max(r1,r2)) ) ){
            return "secantes";
        }
        else{
            return "no son tangentes, ni secantes";
        }

    }
    public static String EsConcen (float x1, float x2, float y1, float y2){
        if ((x1==x2) && (y1==y2)){
            return "son concentricas";
        }
        else{
            return "no son concentricas";
        }
    }
}