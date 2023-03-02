package EjerciciosHerencia;

public class Animals implements Animal{

    private String name;
    private Especies especie;

    private String sound;

    private String dreaming = "Zzz zzz";

    public Animals(String name, Especies especie, String sound) {
        this.name = name;
        this.especie = especie;
        this.sound = sound;
    }

    public Animals(Especies especie, String sound) {
        this.especie = especie;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Especies getEspecie() {
        return especie;
    }

    public void setEspecie(Especies especie) {
        this.especie = especie;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    void printSound(){
        System.out.println(sound);
    }
    void printSleep(){
        System.out.println("Zzz zzz");
    }

    @Override
    public void printSound(String sound) {
        System.out.println(sound);
    }

    @Override
    public void printSleep(String dreaming) {
        System.out.println(dreaming);
    }
}
