package EjerciciosHerencia;
import static EjerciciosHerencia.Especies.PERRO;

public class Perro extends Animals {

    private int yearsOld;

    private String color;

    public Perro(){
        super(PERRO, "Guau guau");
    }

    public Perro(Especies especie, String sound, String name, int yearsOld, String color) {
        super(especie, sound);
        this.yearsOld = yearsOld;
        this.color = color;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
