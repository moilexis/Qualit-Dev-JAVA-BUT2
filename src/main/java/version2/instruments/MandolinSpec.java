package version2.instruments;

import version2.enumType.*;

public class MandolinSpec extends InstrumentSpec{
    private Style style;
    public MandolinSpec(Builder b,String m,Type t, Wood tw, Wood bw,Style s){
        super(b,m,t,tw,bw);
        this.style = s;
    }
    public boolean matches (InstrumentSpec spec){
        return  spec instanceof MandolinSpec &&
                this.style == ((MandolinSpec) spec).style&&
                super.matches(spec);
    }
    public String toString(){
        return super.toString()+" Style : "+style;
    }
}
