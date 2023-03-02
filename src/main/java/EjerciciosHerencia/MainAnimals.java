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

            int n = 0;
            int indice;

            while(n != -1){
                System.out.println("Añadir a la lista (1) || Cambiar especie (2) || Contar especies (3) || Imprimir lista (4) || Hacer sonido (5) || Salir (-1)");
                n = Integer.parseInt(buffer.readLine());
                switch (n){
                    case 1:
                        AddNewAnimal(listAnimals);
                        break;
                    case 2:
                        ImprimirList(listAnimals);
                        System.out.println("Indique el indice del animal a cambiar: ");
                        indice = Integer.parseInt(buffer.readLine());
                        ChangeSpecy(listAnimals, listAnimals.get(indice));
                        break;
                    case 3:
                        CountSpecys(listAnimals);
                        break;
                    case 4:
                        ImprimirList(listAnimals);
                        break;
                    case 5:
                        System.out.println("Indique el indice del animal para hacer su sonido");
                        ImprimirList(listAnimals);
                        indice = Integer.parseInt(buffer.readLine());
                        listAnimals.get(indice).printSound();
                        break;
                }
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
    private static void ImprimirList(ArrayList <Animals> listAnimals){
        int i = 0;
        for(Animals animal : listAnimals){
            System.out.println(animal.getName() + ", " + animal.getEspecie() + ", indice: " + i);
            i++;
        }
    }
    private static void CountSpecys(ArrayList <Animals> listAnimals){

        int vacas = (int) listAnimals.stream().filter(animal -> animal.getEspecie() == Especies.VACA).count();
        System.out.println("Vacas: " + vacas);

        int perros = (int) listAnimals.stream().filter(animal -> animal.getEspecie() == Especies.PERRO).count();
        System.out.println("Perros: " + perros);

        int polluelos = (int) listAnimals.stream().filter(animal -> animal.getEspecie() == Especies.POLLUELO).count();
        System.out.println("Polluelos: " + polluelos);

        int potros = (int) listAnimals.stream().filter(animal -> animal.getEspecie() == Especies.POTRO).count();
        System.out.println("Potros: " + potros);

        int gatos = (int) listAnimals.stream().filter(animal -> animal.getEspecie() == Especies.GATO).count();
        System.out.println("Gatos: " + gatos);

        int gallos = (int) listAnimals.stream().filter(animal -> animal.getEspecie() == Especies.GALLO).count();
        System.out.println("Gallos: " + gallos);

        int caballos = (int) listAnimals.stream().filter(animal -> animal.getEspecie() == Especies.CABALLO).count();
        System.out.println("Caballos: " + caballos);
    }
    private static void ChangeSpecy(ArrayList <Animals> listAnimals, Animals animal) throws IOException {
        int yearsOld = 0;
        if(animal instanceof Vaca){
            yearsOld = ((Vaca) animal).getYearsOld();
        }
        else if(animal instanceof Perro){
            yearsOld = ((Perro) animal).getYearsOld();
        }
        else if(animal instanceof Polluelo){
            yearsOld = ((Polluelo) animal).getYearsOld();
        }
        else if(animal instanceof Gallo){
            yearsOld = ((Gallo) animal).getYearsOld();
        }
        else if(animal instanceof Gato){
            yearsOld = ((Gato) animal).getYearsOld();
        }
        else if(animal instanceof Potro){
            yearsOld = ((Potro) animal).getYearsOld();
        }
        else if(animal instanceof Caballo){
            yearsOld = ((Caballo) animal).getYearsOld();
        }
        String name = animal.getName();
        listAnimals.remove(animal);
        SetSpecy(yearsOld, name, listAnimals);
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
                listAnimals.add(gato);
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
                System.out.println("¿Mes de nacimiento del polluelo en numero entero?");
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
