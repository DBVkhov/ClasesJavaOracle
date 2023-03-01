package EjerciciosHerencia;
import java.util.Date;
import static EjerciciosHerencia.Especies.POLLUELO;

public class Polluelo extends Animals{

    private int yearsOld;

    private Date birthday;

    public Polluelo(){
        super(POLLUELO, "Pio pio");
    }

    public Polluelo(Especies especie, String sound, int yearsOld, Date birthday) {
        super(especie, sound);
        this.yearsOld = yearsOld;
        this.birthday = birthday;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
