package EjerciciosDeCondicionales;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ejercicio9 {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Introduce el primer lado:");

            String Lado1 = buffer.readLine();
            int lado1 = Integer.parseInt(Lado1);

            System.out.println("Introduce el segundo lado:");

            String Lado2 = buffer.readLine();
            int lado2 = Integer.parseInt(Lado2);

            System.out.println("Introduce el tercer lado:");

            String Lado3 = buffer.readLine();
            int lado3 = Integer.parseInt(Lado3);

            float a1 = Math.max(lado1,lado2);
            float a2 = Math.max(lado2,lado3);
            float hipo = Math.max(a1,a2);

            float A1 = Math.min(lado1,lado2);
            float A2 = Math.min(lado2,lado3);
            float catB = Math.min(A1,A2);

            float catA = lado1+lado2+lado3-hipo-catB;

            if ((catB+catA)<=hipo){
                System.out.println("Introduzca unos valores de lados validos para un triangulo.");
                System.out.println("La suma de los catetos no puede ser menor o igual a la hipotenusa.");
            }

            if (lado1==0 || lado2==0 || lado3==0){
                System.out.println("Introduzca unos valores de lados validos para un triangulo.");
                System.out.println("Ningun lado puede valer 0.");
            }

            float anguloA = TeoremaCos(catA,catB,hipo);
            float anguloB = LeyDeSen(anguloA,catA,catB);
            float anguloC = SumaAngulos(anguloA,anguloB);

            System.out.println("El triangulo " + EsRectangulo(anguloA,anguloB,anguloC) + " y " + QueTrianguloEs(catA,catB,hipo) + ".");

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static float TeoremaCos(float catA, float catB, float hipo){
        float anguloA = (float) Math.acos((-Math.pow(catA,2)-Math.pow(catB,2)-Math.pow(hipo,2))/(2*catB*hipo));
        return anguloA;
    }
    public static float LeyDeSen(float anguloA, float ladoA, float ladoB){
        float anguloB = (float) Math.asin((ladoB*Math.sin(anguloA))/ladoA);
        return anguloB;
    }
    public static float SumaAngulos(float anguloA, float anguloB){
        float anguloC = 180-anguloA-anguloB;
        return anguloC;
    }
    public static String EsRectangulo(float angulo, float angulo2, float angulo3){
        if(angulo==90 || angulo2==90 || angulo3==90){
            return "es rectangulo";
        }
        else{
            return "no es rectangulo";
        }
    }
    public static String QueTrianguloEs(float lado, float lado2, float lado3){
        if (lado==lado2 && lado2==lado3){
            return "es equilatero";
        }
        else if((lado==lado2 && lado3!=lado2) || (lado2==lado3 && lado3!=lado) || (lado==lado3 && lado3!=lado2)){
            return "es isosceles";
        }
        else{
            return "es escaleno";
        }
    }
}