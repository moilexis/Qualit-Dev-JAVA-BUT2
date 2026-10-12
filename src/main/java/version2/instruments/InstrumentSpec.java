package version2.instruments;

import version2.enumType.Builder;
import version2.enumType.Type;
import version2.enumType.Wood;

import java.time.chrono.IsoChronology;

public class InstrumentSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood topWood;
    private Wood backWood;
    public InstrumentSpec (Builder b, String m, Type t, Wood tw, Wood bw){
        this.builder = b;
        this.model = m;
        this.type = t;
        this.topWood = tw;
        this.backWood = bw;
    }
    public boolean matches(InstrumentSpec autreSpec){
        if (this.builder == autreSpec.getBuilder()&&
                this.model.equals(autreSpec.getModel())&&
                this.type ==autreSpec.getType()&&
                this.backWood == autreSpec.getBackWood()&&
                this.topWood == autreSpec.getTopWood()){
            return true;
        }
        return false;
    }
    public Builder getBuilder(){
        return builder;
    }
    public String getModel (){
        return model;
    }
    public Type getType(){
        return type;
    }
    public Wood getTopWood(){
        return topWood;
    }
    public Wood getBackWood(){
        return backWood;
    }
    public String toString(){
        return  " Builder : "+builder+ " Model : "+model+" Type : "+type+" BackWood : "+backWood+" TopWood : "+topWood;
    }
}
