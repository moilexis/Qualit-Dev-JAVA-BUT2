package version2.instruments;

public class Instrument {
    private String serialNumber;
    private Double price;
    private InstrumentSpec instrumentSpec ;
    public Instrument (String sN,Double p, InstrumentSpec specs){
        this.instrumentSpec = specs;
        this.price = p;
        this.serialNumber = sN;
    }
    public String getSerialNumber(){
        return this.serialNumber;
    }
    public Double getPrice (){
        return this.price;
    }
    public InstrumentSpec getInstrumentSpec () {
        return this.instrumentSpec;
    }

    public String toString(){
        return " Serial number : "+serialNumber+" Price : " + price +" "+ instrumentSpec;
    }
}
