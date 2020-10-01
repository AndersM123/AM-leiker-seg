package javahjelp40;

public class Timeplan {

	public static void listFag(Time[] tTab, String fag) {
		System.out.println("Fagkode på " + fag);
		
		for (Time u : tTab) {
			if (fag.equals(u.getFag() )) {
				
			System.out.println(u.toString());
		  //System.out.println(u.getDag() + ", " + u.getFag());
			}
			
		}
	}
	public static void listDag(Time[] tTab, String dag) {
		System.out.println("Timer på " + dag);
		
		for (Time u : tTab) {
			if (dag.equals(u.getDag() )) {
				
			System.out.println(u.toString());
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		Time t = new Time("DAT100", "Tirsdag", 14);
		
		
		Time[] timeplan = new Time[3];
		timeplan[0] = new Time("ING102", "Mandag", 9);
		timeplan[1] = t;
		timeplan[2] = new Time("ING102", "Torsdag", 12);
		
		/*
		for (Time u : timeplan) {
			System.out.println(u.toString());
		}	*/
		
		for (int i=0; i < timeplan.length; i++) {
			
			
		}
		listDag(timeplan, "Tirsdag");
		listFag(timeplan, "ING102");
		
	}

}
