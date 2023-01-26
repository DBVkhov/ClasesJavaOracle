package EjerciciosClasesEmpresa;
import java.util.Date;

public class Encargado {

    private String DNI;

    private String contrasena;

    private float salario;

    private Date nacimiento;

    private Cargo cargo = Cargo.ENCARGADO;

    private int clientes;

    public Encargado(String DNI, String contrasena, Date nacimiento) {
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

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public int getClientes() {
        return clientes;
    }

    public void setClientes(int clientes) {
        this.clientes = clientes;
    }
}
