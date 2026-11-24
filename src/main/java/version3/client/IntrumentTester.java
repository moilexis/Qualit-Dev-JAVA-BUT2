package version3.client;

import enumType.*;
import version3.instruments.Instrument;
import version3.instruments.InstrumentSpec;
import java.util.TreeMap;

public class IntrumentTester {
    public static void main(String[] args) {
        TreeMap<Specification, Object> dico1 = new TreeMap();
        dico1.put(Specification.MODEL, (Object) "Adversaires très très forts et très respectables sur le terrain");
        dico1.put(Specification.TYPE ,Type.ACOUSTIC);
        dico1.put(Specification.BACKWOOD , Wood.ALDER);
        dico1.put(Specification.TOPWOOD , Wood.CEDAR);
        dico1.put(Specification.BUILDER , Builder.FENDER);
        InstrumentSpec specs1 = new InstrumentSpec(dico1);
        Instrument instrument1 = new Instrument("yes, is a Giroud", 118.218,specs1);

        TreeMap<Specification, Object> dico2 = new TreeMap();
        dico2.put(Specification.MODEL, (Object) "Frédéric");
        dico2.put(Specification.TYPE ,Type.ELECTRIC);
        dico2.put(Specification.BACKWOOD , Wood.ADIRONDACK);
        dico2.put(Specification.TOPWOOD , Wood.ALDER);
        dico2.put(Specification.BUILDER , Builder.OLSON);
        dico2.put(Specification.INSTRUMENT_TYPE, InstrumentType.GUITAR);
        InstrumentSpec specs2 = new InstrumentSpec(dico2);
        Instrument instrument2 = new Instrument("Carglass", 118.218,specs2);

        System.out.println(instrument2);

        TreeMap<Specification, Object> dicoTest = new TreeMap();
        dicoTest.put(Specification.BACKWOOD , Wood.ADIRONDACK);
        dicoTest.put(Specification.TOPWOOD , Wood.ALDER);
        dicoTest.put(Specification.BUILDER , Builder.OLSON);
        InstrumentSpec specstest = new InstrumentSpec(dicoTest);
        Instrument instrumentTest = new Instrument("Carglass", 118.218,specs2);

        System.out.println(specs2.matches(specstest));
    }
}