package EjerciciosHerencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

public class MainAnimals {
    public static void main(String[] args) throws IOException {

        try {

            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            ArrayList <Animals> listAnimals = new ArrayList<>();


        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
    private static void AddNewAnimal(ArrayList <Animals> listAnimals) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("¿Nombre del animal?:");
        String name = buffer.readLine();

        System.out.println("¿Edad del animal?:");
        int yearsOld = Integer.parseInt(buffer.readLine());

        SetSpecy(yearsOld, name, listAnimals);
    }
    private static void SetSpecy(int yearsOld, String name, ArrayList <Animals> listAnimals) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("VACA(1) PERRO(2) GATO(3) GALLO(4) POLLUELO(5) CABALLO(6) POTRO(7) SALIR(8)");
        System.out.println("Escribe el numero de la especie a elegir:");
        int numEspecie = Integer.parseInt(buffer.readLine());
        switch (numEspecie) {
            case 1:
                System.out.println("¿Numero de marcas de la vaca?");
                int numsOfMarks = Integer.parseInt(buffer.readLine());
                Vaca vaca = new Vaca();
                vaca.setNumOfMarks(numsOfMarks);
                vaca.setName(name);
                vaca.setYearsOld(yearsOld);
                listAnimals.add(vaca);
                break;
            case 2:
                System.out.println("¿Color del perro?");
                String color = buffer.readLine();
                Perro perro = new Perro();
                perro.setColor(color);
                perro.setName(name);
                perro.setYearsOld(yearsOld);
                listAnimals.add(perro);
                break;
            case 3:
                System.out.println("¿Nacionalidad del gato?");
                String nationality = buffer.readLine();
                Gato gato = new Gato();
                gato.setNationality(nationality);
                gato.setYearsOld(yearsOld);
                gato.setName(name);
                break;
            case 4:
                System.out.println("¿Numero de plumas del gallo?");
                int numOfFeathers = Integer.parseInt(buffer.readLine());
                Gallo gallo = new Gallo();
                gallo.setName(name);
                gallo.setYearsOld(yearsOld);
                gallo.setNumOfFeathers(numOfFeathers);
                listAnimals.add(gallo);
                break;
            case 5:
                System.out.println("¿Dia de nacimiento del polluelo?");
                int day = Integer.parseInt(buffer.readLine());
                System.out.println("¿Mes de nacimiento del polluelo?");
                int month = Integer.parseInt(buffer.readLine());
                System.out.println("¿Año de nacimiento del polluelo?");
                int year = Integer.parseInt(buffer.readLine());
                Date birthday = new Date(year - 1900, month - 1, day);
                Polluelo polluelo = new Polluelo();
                polluelo.setBirthday(birthday);
                polluelo.setName(name);
                polluelo.setYearsOld(yearsOld);
                listAnimals.add(polluelo);
                break;
            case 6:
                System.out.println("¿Peso del caballo?");
                int weight = Integer.parseInt(buffer.readLine());
                Caballo caballo = new Caballo();
                caballo.setPeso(weight);
                caballo.setName(name);
                caballo.setYearsOld(yearsOld);
                listAnimals.add(caballo);
                break;
            case 7:
                System.out.println("¿Longitud de orejas?");
                int longEars = Integer.parseInt(buffer.readLine());
                Potro potro = new Potro();
                potro.setName(name);
                potro.setLongEars(longEars);
                potro.setYearsOld(yearsOld);
                listAnimals.add(potro);
                break;
            case 8:
                break;
        }
    }
}
