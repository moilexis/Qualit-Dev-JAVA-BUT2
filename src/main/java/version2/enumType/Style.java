package version2.enumType;

public enum Style {
	 

		  A, F;

		  public String toString() {
		    switch(this) {
		      case A:   return "Amande";
		      case F:   return "Florentine";
		      default:  return "Unspecified";
		    }
		  }


}
