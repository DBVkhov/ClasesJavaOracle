package EjerciciosClasesEmpresa;
import java.util.Date;

public class Trabajador implements Comparable<Trabajador>{

    private String DNI;

    private String contrasena;

    private float salario;

    private Encargado encargado;

    private Date nacimiento;

    private Cargo cargo = Cargo.TRABAJADOR;

    private int clientes;

    public Trabajador(String DNI, String contrasena, Date nacimiento) {
        this.DNI = DNI;
        this.contrasena = contrasena;
        this.nacimiento = nacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Encargado getEncargado() {
        return encargado;
    }

    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public int getClientes() {
        return clientes;
    }

    public void setClientes(int clientes) {
        this.clientes = clientes;
    }

    @Override
    public int compareTo(Trabajador o){
        if(o == null){
            return 0;
        }
        if(this.getClientes() != o.getClientes()){
            return this.getClientes() - o.getClientes();
        }
        return this.getClientes();
    }

}
