package EjerciciosHerencia;

import static EjerciciosHerencia.Especies.CABALLO;

public class Caballo extends Animals{

    private int yearsOld;

    private float peso;

    public Caballo(){
        super(CABALLO, "Yeeeeja");
    }

    public Caballo(Especies especie, String sound, int yearsOld, float peso) {
        super(especie, sound);
        this.yearsOld = yearsOld;
        this.peso = peso;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
