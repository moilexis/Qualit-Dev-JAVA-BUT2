package version2.instruments;

public class Guitar extends Instrument{
    public Guitar(String sN, Double p, GuitarSpec specs) {
        super(sN, p, specs);
    }
    public String toString(){
        return "Mandolin " +super.toString();
    }
}
