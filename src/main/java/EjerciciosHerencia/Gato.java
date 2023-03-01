package EjerciciosHerencia;

import static EjerciciosHerencia.Especies.GATO;

public class Gato extends Animals{

    private int yearsOld;

    private String nationality;

    public Gato(){
        super(GATO, "Miau miau");
    }

    public Gato(Especies especie, String sound, int yearsOld, String nationality) {
        super(especie, sound);
        this.yearsOld = yearsOld;
        this.nationality = nationality;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
