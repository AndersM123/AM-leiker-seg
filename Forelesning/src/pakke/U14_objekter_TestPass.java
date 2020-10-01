package pakke;

public class U14_objekter_TestPass {

	public static int antallOver(U14_objekter_pass [] tab, double grense) {
		int antall=0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i].getHøyde() > grense) {
				antall++;
			}
			
		}
		
		return antall;
	}
	
	public static void main(String[] args) {
		U14_objekter_pass p = new U14_objekter_pass("Ole", "123", 1.80);
		
		//System.out.println(p.toString());
		//kompilatoren legger automatisk til den toString etter p.
		//System.out.println(p);
		
		U14_objekter_pass[] passTab = new U14_objekter_pass[4];
		passTab[0] = new U14_objekter_pass("Kari", "234", 1.70);
		passTab[1] = p;
		passTab[2] = new U14_objekter_pass("Marianne", "235", 1.75);
		passTab[3] = new U14_objekter_pass("Per", "134", 1.72);
		
		for (int i = 0; i < passTab.length; i++) {
			System.out.println(passTab[i]);
			
		}
		
		double grense = 1.77;
		int antall = antallOver(passTab, grense);
		
		System.out.println("Antall over " + grense + ": " + antall);
	}

}
