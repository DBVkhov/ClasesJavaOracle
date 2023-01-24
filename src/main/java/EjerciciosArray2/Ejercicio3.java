package EjerciciosArray2;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;


public class Ejercicio3 {
    public static void main(String[] args) {
        try {

            boolean SinVencedor = true;
            boolean VencioElPC = false;
            boolean VencioElJugador = false;
            boolean GanoLaAmistad = false;
            String[][] Tresenraya = new String[3][3];
            int cont = 1;

            for(int i = 0; i < Tresenraya.length; i++) {

                for (int j = 0; j < Tresenraya[i].length; j++) {

                    Tresenraya[i][j] = ".";

                }

            }

            System.out.println("[x] [0, 1, 2]");
            for (int i = 0; i < Tresenraya.length; i++) {
                System.out.println("[" + i + "] " + Arrays.toString(Tresenraya[i]));
            }

            while(SinVencedor) {

                BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Altura:");

                String Altura = buffer.readLine();
                int altura = Integer.parseInt(Altura);

                System.out.println("Ancho:");

                String Ancho = buffer.readLine();
                int ancho = Integer.parseInt(Ancho);

                while(Tresenraya[altura][ancho] == "X" || Tresenraya[altura][ancho] == "O") {

                    while (altura > 2 || altura < 0) {

                        System.out.println("ERROR. Introduzca una posicion sin ocupar");

                        System.out.println("Altura:");

                        Altura = buffer.readLine();
                        altura = Integer.parseInt(Altura);

                    }

                    while (ancho > 2 || ancho < 0) {

                        System.out.println("Ancho:");

                        Ancho = buffer.readLine();
                        ancho = Integer.parseInt(Ancho);

                    }
                }

                Tresenraya[altura][ancho] = "X";

                if(cont<5) {

                    int randomaltura = ThreadLocalRandom.current().nextInt(0, 2 + 1);
                    int randomancho = ThreadLocalRandom.current().nextInt(0, 2 + 1);
                    while (Tresenraya[randomaltura][randomancho] == "X" || Tresenraya[randomaltura][randomancho] == "O") {

                        randomaltura = ThreadLocalRandom.current().nextInt(0, 2 + 1);
                        randomancho = ThreadLocalRandom.current().nextInt(0, 2 + 1);
                    }

                    Tresenraya[randomaltura][randomancho] = "O";
                }

                for (int i = 0; i < Tresenraya.length; i++) {

                        if (Tresenraya[i][0] == Tresenraya[i][1] && Tresenraya[i][2] == Tresenraya[i][1] && Tresenraya[i][2] == "X") {
                            SinVencedor = false;
                            VencioElJugador = true;
                        }
                        if (Tresenraya[i][0] == Tresenraya[i][1] && Tresenraya[i][2] == Tresenraya[i][1] && Tresenraya[i][2] == "O") {
                            SinVencedor = false;
                            VencioElPC = true;
                        }
                    }
                for (int i = 0; i < Tresenraya.length; i++) {

                        if (Tresenraya[0][i] == Tresenraya[1][i] && Tresenraya[2][i] == Tresenraya[1][i] && Tresenraya[2][i] == "X") {
                            SinVencedor = false;
                            VencioElJugador = true;
                        }
                        if (Tresenraya[0][i] == Tresenraya[1][i] && Tresenraya[2][i] == Tresenraya[1][i] && Tresenraya[2][i] == "O") {
                            SinVencedor = false;
                            VencioElPC = true;
                        }
                    }

                if (Tresenraya[0][0] == Tresenraya[1][1] && Tresenraya[2][2] == Tresenraya[1][1] && Tresenraya[2][2] == "X") {
                        SinVencedor = false;
                        VencioElJugador = true;
                    }
                if (Tresenraya[0][0] == Tresenraya[1][1] && Tresenraya[2][2] == Tresenraya[1][1] && Tresenraya[1][1] == "O") {
                        SinVencedor = false;
                        VencioElPC = true;
                    }

                if (Tresenraya[0][2] == Tresenraya[1][1] && Tresenraya[2][0] == Tresenraya[1][1] && Tresenraya[1][1] == "X") {
                        SinVencedor = false;
                        VencioElJugador = true;
                    }
                if (Tresenraya[0][2] == Tresenraya[1][1] && Tresenraya[2][0] == Tresenraya[1][1] && Tresenraya[1][1] == "O") {
                        SinVencedor = false;
                        VencioElPC = true;
                    }

                System.out.println("[ ] [0, 1, 2]");
                for (int i = 0; i < Tresenraya.length; i++) {
                        System.out.println("[" + i + "] " + Arrays.toString(Tresenraya[i]));
                    }


                cont++;

                if (cont == 6 && VencioElJugador == false) {
                    GanoLaAmistad = true;
                    SinVencedor = false;
                }

            }
            if(VencioElJugador){
                System.out.println("Vencio el jugador.");
            }
            if(VencioElPC){
                System.out.println("Vencio el PC.");
            }
            if(GanoLaAmistad){
                System.out.println("Gano la amistad.");
            }



        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
