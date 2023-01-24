package EjerciciosClases1.Empresa;

import java.util.Date;

import static EjerciciosClases1.Empresa.Cargo.JEFE;

public class Jefe {

    private String DNI;

    private String contrasena;

    private float salario;

    private Date nacimiento;

    private Encargado encargados;

    private Cargo cargo = JEFE;

    public Jefe(String DNI, String contrasena, float salario, Date nacimiento, Encargado encargados, Cargo cargo) {
        this.DNI = DNI;
        this.contrasena = contrasena;
        this.salario = salario;
        this.nacimiento = nacimiento;
        this.encargados = encargados;
        this.cargo = cargo;
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

    public Encargado getEncargados() {
        return encargados;
    }

    public void setEncargados(Encargado encargados) {
        this.encargados = encargados;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
