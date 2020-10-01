package javahjelp40;

public class Time {

	
		private String fag;
		private String dag;
		private int starttid;
		
		
		public Time(String fag, String dag, int starttid) {
			this.fag = fag;
			this.dag = dag;
			this.starttid = starttid;
			
		}
		public String getFag() {
			return fag;
		}
		public void setFag(String fag) {
			this.fag = fag;
		}
		public String getDag() {
			return dag;
		}
		public void setDag(String dag) {
			this.dag = dag;
		}
		public int getStarttid() {
			return starttid;
		}
		public void setStarttid(int starttid) {
			this.starttid = starttid;
		}
		
		public String toString() {
			return fag + ", " + dag + ", " + starttid;
			
		}
		
	}


