package version2.inventaire;
import version2.instruments.Instrument;
import version2.instruments.InstrumentSpec;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Inventory {
    private List instruments;

    public Inventory(){
        this.instruments = new LinkedList();
    }

    public void addInstrument(String serialNumber, Double price, InstrumentSpec specs) {
        Instrument instrument = new Instrument(serialNumber, price, specs);
        instruments.add(instrument);
    }

    public Instrument getInstrument(String serialNumber) {
        for (Iterator i = instruments.iterator(); i.hasNext(); ) {
            Instrument instrument = (Instrument) i.next();
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    public List search(InstrumentSpec searchSpec) {
        List machingInstruments = new LinkedList();
        for (Iterator i = instruments.iterator(); i.hasNext(); ) {
            Instrument instrument = (Instrument) i.next();
            if (instrument.getInstrumentSpec().matches(searchSpec)) {
                machingInstruments.add(instrument);
            }
        }
        return machingInstruments;
    }
}
