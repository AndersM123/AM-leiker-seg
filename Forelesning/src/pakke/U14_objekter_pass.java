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

	public double getH�yde() {
		return h�yde;
	}

	public void setH�yde(double h�yde) {
		this.h�yde = h�yde;
	}

	private String personnr;
	private double h�yde;
	
	public U14_objekter_pass(String navn, String personnr, double h�yde) {
		this.navn = navn;
		this.personnr = personnr;
		this.h�yde = h�yde;
	}
	
	public String toString() {
		return navn + ", " + personnr + ", " + h�yde + "m";
	}
	

	
	
	
	

}
