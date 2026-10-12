package version2.instruments;

import version2.enumType.Builder;
import version2.enumType.Style;
import version2.enumType.Type;
import version2.enumType.Wood;

public class GuitarSpec extends InstrumentSpec {
    private int numberOfStrings ;
    public GuitarSpec(Builder b, String m, Type t, Wood tw, Wood bw, int s){
        super(b,m,t,tw,bw);
        this.numberOfStrings = s;
    }
    public boolean matches (InstrumentSpec spec){
        return spec instanceof GuitarSpec &&
                this.numberOfStrings == ((GuitarSpec) spec).numberOfStrings&&
                super.matches(spec);
    }
    public String toString(){
        return super.toString()+" Number of strings : "+numberOfStrings;
    }
}
