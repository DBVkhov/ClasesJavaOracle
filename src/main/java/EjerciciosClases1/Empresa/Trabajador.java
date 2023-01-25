package EjerciciosClases1.Empresa;
import java.util.Date;
import static EjerciciosClases1.Empresa.Cargo.TRABAJADOR;

public class Trabajador {

    private String DNI;

    private String contrasena;

    private float salario;

    private Encargado encargado;

    private Date nacimiento;

    private Cargo cargo = TRABAJADOR;

    private int clientes;

    public Trabajador(String DNI, String contrasena, Encargado encargado, float salario, Date nacimiento, int clientes) {
        this.DNI = DNI;
        this.contrasena = contrasena;
        this.encargado = encargado;
        this.salario = salario;
        this.nacimiento = nacimiento;
        this.clientes = clientes;
    }

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
}
