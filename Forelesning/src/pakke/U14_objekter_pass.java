package pakke;

public class U14_objekter_pass {
	
	private String navn;
	
	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getPersonnr() {
		return personnr;
	}

	public void setPersonnr(String personnr) {
		this.personnr = personnr;
	}

	public double getHøyde() {
		return høyde;
	}

	public void setHøyde(double høyde) {
		this.høyde = høyde;
	}

	private String personnr;
	private double høyde;
	
	public U14_objekter_pass(String navn, String personnr, double høyde) {
		this.navn = navn;
		this.personnr = personnr;
		this.høyde = høyde;
	}
	
	public String toString() {
		return navn + ", " + personnr + ", " + høyde + "m";
	}
	

	
	
	
	

}
