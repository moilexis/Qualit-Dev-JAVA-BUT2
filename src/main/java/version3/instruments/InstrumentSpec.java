package version3.instruments;

import enumType.Builder;
import enumType.Specification;
import enumType.Type;
import enumType.Wood;

import java.util.Map;

public class InstrumentSpec {
    private Map <Specification,Object> specs;
    public InstrumentSpec(Map<Specification,Object> dicoSpec ){
        this.specs = dicoSpec;
    }
    public boolean matches(InstrumentSpec autreSpec){
        for (Specification cle : autreSpec.specs.keySet()){
            if (this.specs.keySet().contains(cle)){
                if (!autreSpec.specs.get(cle).equals(this.specs.get(cle))){
                    return false;
                }
            }
            else return false ;
        }
        return true;
    }
    public Builder getBuilder(){
        return (Builder) this.specs.get(Specification.BUILDER);
    }
    public String getModel (){
        return (String) this.specs.get(Specification.MODEL);
    }
    public Type getType(){return (Type) this.specs.get(Specification.TYPE);}
    public Wood getTopWood(){
        return (Wood) this.specs.get(Specification.TOPWOOD);
    }
    public Wood getBackWood(){
        return (Wood) this.specs.get(Specification.BACKWOOD);
    }
    public String toString(){
        StringBuilder message= new StringBuilder();
        for (Specification cle : this.specs.keySet()){
            message.append("\n->").append(cle.toString()).append(" : ").append(this.specs.get(cle).toString());
        }
        return message.toString();
    }

}
