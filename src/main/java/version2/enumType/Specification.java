package version2.enumType;

public enum Specification {
	
	INSTRUMENT_TYPE, BUILDER, MODEL, TYPE, TOPWOOD, BACKWOOD,
	NUMBER_OF_STRINGS, 
	STYLE,
	YEAR_OF_MANUFACTURE;

	  public String toString() {
	    switch(this) {
	      case INSTRUMENT_TYPE:   return "instrument de type";
	      case BUILDER:    return "fabricant";
	      case MODEL:    return "modèle";
	      case TYPE:   return "type";
	      case TOPWOOD:     return "bois dessus";
	      case BACKWOOD: return "bois dessous";
	      case NUMBER_OF_STRINGS:   return "nombre de cordes";
	      case STYLE:     return "style";
	      case YEAR_OF_MANUFACTURE: return "annee de fabrication";
	      default:       return "Unspecified";
	    }
	  }

}
