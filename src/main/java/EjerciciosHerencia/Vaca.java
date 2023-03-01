package EjerciciosHerencia;
import static EjerciciosHerencia.Especies.VACA;

public class Vaca extends Animals {

    private int yearsOld;

    private int numOfMarks;

    public Vaca(){
        super(VACA, "Muuuuuu");
    }

    public Vaca(Especies especie, String sound, int yearsOld, int numOfMarks) {
        super(especie, sound);
        this.yearsOld = yearsOld;
        this.numOfMarks = numOfMarks;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getNumOfMarks() {
        return numOfMarks;
    }

    public void setNumOfMarks(int numOfMarks) {
        this.numOfMarks = numOfMarks;
    }
}
