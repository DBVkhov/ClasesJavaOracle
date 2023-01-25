package EjerciciosClases1.Empresa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Date;

public class Empresa {

    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static char MenuJefe(Jefe jefe, Trabajador[] trabajadores, Encargado[] encargados, char letra) throws IOException {

        while (letra != 'o' || letra != 'c') {

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

                    System.out.println("DNI:");
                    String dni = buffer.readLine();
                    dni.toUpperCase();

                    boolean dnilongitud = true;
                    boolean dninorepetido = true;
                    boolean dniletra = true;
                    boolean dniinvalido = true;

                    while(dniinvalido) {

                        for(int j = 0; j < trabajadores.length; j++) {
                            if (dni == trabajadores[j].getDNI()) {
                                dninorepetido = false;
                                System.out.println("El DNI se corresponde con un trabajador");
                            }
                        }

                        for(int k = 0; k < encargados.length; k++){
                            if(dni == encargados[k].getDNI()) {
                                dninorepetido = false;
                                System.out.println("El DNI se corresponde con un encargado");
                            }
                        }

                        if(jefe.getDNI() == dni){
                            dninorepetido = false;
                            System.out.println("El DNI se corresponde con el del JEFE");
                        }

                        if(dni.length()!=9){
                            dnilongitud = false;
                            System.out.println("La longitud es incorrecta");
                        }

                        if((!dni.substring(8).matches("[A-Z]*"))){
                            dniletra = false;
                            System.out.println("El ultimo caracter no es una letra");
                        }

                        if(dninorepetido && dnilongitud && dniletra){
                            dniinvalido = false;
                        }

                        if(dniinvalido){
                            System.out.println("Escriba un DNI correcto:");
                            dni = buffer.readLine();
                            dni.toUpperCase();
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

                    System.out.println("Escriba un salario para el trabajador =");
                    trabajadores[posicion].setSalario(Float.parseFloat(buffer.readLine()));

                    break;
                case 'd':

                    //(D)espedir empleado.

                    System.out.println("Escriba el DNI del empleado a despedir:");
                    dni = buffer.readLine();

                    dniinvalido = true;
                    while(dniinvalido) {
                        for(int i = 0; i < trabajadores.length; i++){
                            if(dni == trabajadores[i].getDNI()){
                                dniinvalido = false;
                            }
                            else{
                                System.out.println("Escriba un DNI VALIDO del empleado a despedir:");
                                dni = buffer.readLine();
                            }
                        }

                    }

                    for (int i = 0; i < trabajadores.length; i++) {
                        if (dni == trabajadores[i].getDNI()) {
                            trabajadores[i] = null;
                            i = trabajadores.length;
                        }
                    }

                    break;

                case 'a':

                    //(A)scenso empleado.

                    System.out.println("Escriba el DNI del trabajador a ascender:");
                    dni = buffer.readLine();

                    for (int i = 0; i < trabajadores.length; i++) {
                        if (dni == trabajadores[i].getDNI()) {
                            for (int j = 0; i < encargados.length; j++) {
                                if (encargados[j] == null) {

                                    encargados[j] = new Encargado(trabajadores[i].getDNI(), trabajadores[i].getContrasena(), trabajadores[i].getNacimiento());

                                    System.out.println("Escriba una suma al salario =");
                                    float sumasalario = Float.parseFloat(buffer.readLine());
                                    encargados[j].setSalario(trabajadores[i].getSalario()+sumasalario);

                                    encargados[j].setClientes(trabajadores[i].getClientes());

                                    trabajadores[i] = null;

                                } else {
                                }
                            }
                        } else {
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
                        if(DNIencargado == encargados[i].getDNI()){
                            for (int j = 0; j < trabajadores.length; j++){
                                if(DNItrabajador == trabajadores[j].getDNI()){
                                    trabajadores[j].setEncargado(encargados[i]);
                                }
                            }
                        }
                    }

                case 'o':

                    //(O)tro usuario.

                    break;

                case 'c':

                    //(C)errar empresa.

                    System.out.println(jefe);
                    for(int i = 0; i< encargados.length; i++) {
                        if (encargados[i] != null) {
                            System.out.println(encargados[i]);
                        }
                    }

                    for(int i = 0; i< trabajadores.length; i++) {
                        if (trabajadores[i] != null) {
                            System.out.println(trabajadores[i].getDNI() + ", " + trabajadores[i].getCargo() + ", " + trabajadores[i].getClientes() + ", " + (trabajadores[i].getSalario()-1000));
                        }
                    }

                    break;
            }
        }
        return letra;
    }

    private static char MenuEncargado(Jefe jefe, Encargado encargado, Encargado[] encargados, int inventario, Trabajador[] trabajadores, char letra) throws IOException {

        while (letra != 'o') {

            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            letra = buffer.readLine().charAt(0);
            letra = Character.toLowerCase(letra);

            switch (letra) {

                case 's':

                    //(S)umar inventario.

                    inventario++;

                    break;

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

                    System.out.println("DNI:");
                    String dni = buffer.readLine();
                    dni.toUpperCase();

                    boolean dnilongitud = true;
                    boolean dninorepetido = true;
                    boolean dniletra = true;
                    boolean dniinvalido = true;

                    while(dniinvalido) {

                        for(int j = 0; j < trabajadores.length; j++) {
                            if (dni == trabajadores[j].getDNI()) {
                                dninorepetido = false;
                                System.out.println("El DNI se corresponde con un trabajador");
                            }
                        }

                        for(int k = 0; k < encargados.length; k++){
                            if(dni == encargados[k].getDNI()) {
                                dninorepetido = false;
                                System.out.println("El DNI se corresponde con un encargado");
                            }
                        }

                        if(jefe.getDNI() == dni){
                            dninorepetido = false;
                            System.out.println("El DNI se corresponde con el del JEFE");
                        }

                        if(dni.length()!=9){
                            dnilongitud = false;
                            System.out.println("La longitud es incorrecta");
                        }

                        if((!dni.substring(8).matches("[A-Z]*"))){
                            dniletra = false;
                            System.out.println("El ultimo caracter no es una letra");
                        }

                        if(dninorepetido && dnilongitud && dniletra){
                            dniinvalido = false;
                        }

                        if(dniinvalido){
                            System.out.println("Escriba un DNI correcto:");
                            dni = buffer.readLine();
                            dni.toUpperCase();
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

                    System.out.println("Escriba un salario para el trabajador =");
                    trabajadores[posicion].setSalario(Float.parseFloat(buffer.readLine()));

                    trabajadores[posicion].setEncargado(encargado);

                    break;

                case 'd':

                    //(D)espedir empleado.

                    System.out.println("Escriba el DNI del empleado a despedir:");
                    dni = buffer.readLine();

                    for (int i = 0; i < trabajadores.length; i++) {
                        if (dni == trabajadores[i].getDNI()) {
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
                        else {
                        }
                    }

                    break;

                case 'r':

                    //(R)epartir clientes.

                    if(random50()){
                        trabajadores = aquiendespedir20(trabajadores);
                    }
                    else{
                        int clientesarepartir = encargado.getClientes()%2;
                        encargado.setClientes(encargado.getClientes()-encargado.getClientes()%2);
                        for(int j = 1; j<=clientesarepartir;){
                            for(int k = 0; k<trabajadores.length; k++){
                                if(trabajadores[k] != null) {
                                    trabajadores[k].setClientes(trabajadores[k].getClientes() + 1);
                                    j++;
                                }
                            }
                        }

                    }

                    break;

                case 'v':

                    //(V)entas.

                    if(random20()){
                        System.out.println("Suma al sueldo :" + encargado.getSalario() + " + " + valorventa()*0.30 + " = ");
                        encargado.setSalario((float) (encargado.getSalario()+valorventa()*0.3));
                        System.out.println(encargado.getSalario());

                        jefe.setSalario((float) (valorventa()*0.7));

                        System.out.println("Clientes = " + encargado.getClientes() + " + 1 = ");
                        encargado.setClientes(encargado.getClientes()+1);
                        System.out.println(encargado.getClientes());

                        inventario--;

                        System.out.println("Inventario =" + inventario);

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

    private static char MenuTrabajador(Jefe jefe, Encargado encargado, int inventario, Encargado[] encargados, Trabajador trabajador, char letra) throws IOException{
        while(letra != 'o'){
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            letra = buffer.readLine().charAt(0);
            letra = Character.toLowerCase(letra);

            switch(letra){

                case 'v':

                    //(V)enta.

                    if(random20()){

                        if(trabajador.getEncargado() != null) {

                            System.out.println("Suma al sueldo :" + trabajador.getSalario() + " + " + valorventa() * 0.2 + " = ");
                            trabajador.setSalario((float) (trabajador.getSalario() + valorventa() * 0.2));
                            System.out.println(trabajador.getSalario());


                            for (int i = 0; i < encargados.length; i++) {
                                if (encargados[i] == encargado) {
                                    encargados[i].setSalario((float) (encargados[i].getSalario() + valorventa() * 0.1));
                                    encargado.setSalario(encargados[i].getSalario());
                                }
                            }
                        }

                        else{

                            System.out.println("Suma al sueldo :" + trabajador.getSalario() + " + " + valorventa() * 0.3 + " = ");
                            trabajador.setSalario((float) (trabajador.getSalario() + valorventa() * 0.3));
                            System.out.println(trabajador.getSalario());

                        }
                        jefe.setSalario((float) (valorventa()*0.7));

                        System.out.println("Clientes = " + trabajador.getClientes() + " + 1 = ");
                        trabajador.setClientes(encargado.getClientes()+1);
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

    private static float valorventa(){
        float venta = (float) (Math.random()*1001);
        return venta;
    }

    private static boolean random50(){
        int moneda = (int) (Math.random()*2);
        if (moneda==1){
            boolean random = true;
            return random;
        }
        else {
            boolean random = false;
            return random;
        }
    }
    private static boolean random20(){
        int dado = (int) (Math.random()*5);
        if (dado==0){
            boolean random = true;
            return random;
        }
        else {
            boolean random = false;
            return random;
        }
    }
    private static Trabajador[] aquiendespedir20(Trabajador[] trabajador){

        int[] lista = new int[trabajador.length];
        Trabajador[] nuevalista = new Trabajador[trabajador.length];

        for (int i = 0; i < trabajador.length; i++) {
            lista[i] = trabajador[i].getClientes();
        }

        Arrays.sort(lista);

        for (int i = 0; i <trabajador.length; i++) {
            for (int j = 0; j < trabajador.length; j++){
                if(lista[i] == trabajador[j].getClientes()){
                    nuevalista[i] = trabajador[j];
                }
            }

            if(i == 1 || i == 0) {
                for (int x = 0; x < nuevalista[i].getClientes(); x++){

                    int y = 2;
                    int clientesarepartir = trabajador[i].getClientes();

                    while(clientesarepartir>0) {
                        if(nuevalista[y] != null) {
                            nuevalista[y].setClientes(nuevalista[y].getClientes() + 1);
                            clientesarepartir--;
                            y++;
                            if (y > 10) {
                                y = 2;
                            }
                        }
                    }

            }
                nuevalista[i] = null;
            }

        }

        return nuevalista;

    }

}

