package EjerciciosHerencia;

import static EjerciciosHerencia.Especies.POTRO;

public class Potro extends Animals{

    private int yearsOld;

    private int longEars;

    public Potro(){
        super(POTRO, "Yijo yijo");
    }

    public Potro(Especies especie, String sound, int yearsOld, int longEars) {
        super(especie, sound);
        this.yearsOld = yearsOld;
        this.longEars = longEars;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getLongEars() {
        return longEars;
    }

    public void setLongEars(int numOfFeathers) {
        this.longEars = numOfFeathers;
    }
}
