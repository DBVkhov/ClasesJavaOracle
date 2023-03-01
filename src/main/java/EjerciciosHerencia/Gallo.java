package EjerciciosHerencia;
import static EjerciciosHerencia.Especies.GALLO;

public class Gallo extends Animals{

    private int yearsOld;

    private int numOfFeathers;

    public Gallo(){
        super(GALLO, "Kukariku");
    }

    public Gallo(Especies especie, String sound, int yearsOld, int numOfFeathers) {
        super(especie, sound);
        this.yearsOld = yearsOld;
        this.numOfFeathers = numOfFeathers;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getNumOfFeathers() {
        return numOfFeathers;
    }

    public void setNumOfFeathers(int numOfFeathers) {
        this.numOfFeathers = numOfFeathers;
    }
}
