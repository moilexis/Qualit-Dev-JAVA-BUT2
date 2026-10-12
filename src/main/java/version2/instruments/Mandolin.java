package version2.instruments;

public class Mandolin extends Instrument {
    public Mandolin(String sN, Double p, MandolinSpec specs) {
        super(sN, p, specs);
    }
    public String toString(){
        return "Guitar " +super.toString();
    }
}
