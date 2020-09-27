
public class oppgave6_uke38 {
/*
//a)
	public static void main(String[] args) {
	int [] a = {4, 2, 5, 6, 8};
		
	skrivut(a);
	}

	private static void skrivut (int[] tabell) {
		for (int b : tabell) {
			System.out.print(b + " ");
		}
		
	}
	*/

	/*
//b)	
	public static void main(String[] args) {
	
	int [] a = {42, 67, 89};
	
	System.out.print(tilStreng(a));
	
}
	public static String tilStreng (int[] tabell) {
		String streng = "[";
		
		for (int i=0; i<=tabell.length - 1; i++) {
			
		String p = String.valueOf(tabell[i]);
		
			streng = streng + p + ", ";
			
			
			
		}
		streng+="]";
		
		return streng;	
		
	}
	*/

//c)
	/*
	public static void main(String[] args) {
		int a [] = {2, 3, 5, 7, 1};
		
		int sum=summer(a);
		
		System.out.println("Summen av disse tallene er: " + sum);
	}
	/*
	private static int summer (int[] tabell) {
		
		int sum=0;
		
		for (int i=0; i<tabell.length; i++) {
			sum = sum + tabell[i];
		}
		return sum;
	}
		*/
	/*
	private static int summer (int[] tabell) {
		int sum=0;
		
		for (int i:tabell) {
			sum+=i;
		}
		return sum;
	}
	
	private static int summer (int[] tabell) {
		int sum = 0;
		int i = 0;
		while (i < tabell.length) {
			sum+=tabell[i];
			i++;
		}
		return sum;
	}
	*/
	
/*	
//d)
	
	public static void main(String[] args) {
		int [] a = {4, 2, 5, 6, 7, 8, 1};
		
		System.out.print(finnesTall(a, 7));
		
	}
	public static boolean finnesTall (int[] tabell, int tall) {
		boolean funnet = false;
		int i = 0;
		
		while (i < tabell.length && (!funnet)) {
			if (tabell[i] > tall) {
				funnet = true;
			}
			i++;
		}
		return funnet;		
	}
	
*/	
	
//e)
	/*
	public static void main(String[] args) {
		int [] a = {4, 2, 5, 6, 7, 8, 1};
		
		System.out.print(posisjonTall(a, 8));
	}
	
	public static int posisjonTall (int[] tabell, int tall) {
		
		
		
		for (int i=0; i<tabell.length-1; i++) {
			if(tabell[i] == tall)
				return i;
		}
			return -1;
		
	}
	*/
		
//f)
	/*
	public static void main(String[] args) {
		int [] tab = {4, 2, 5, 6, 7, 8, 1};
		
		skrivut(reverser(tab));
		
	}
	
	public static int[] reverser(int[] tabell) {
		int [] nyTab = new int [tabell.length];
		for (int i=0; i<nyTab.length; i++) {
			
			nyTab[i] = tabell[tabell.length-(i+1)];
		}
		return nyTab;
	}
	private static void skrivut (int[] tabell) {
		for (int b : tabell) {
			System.out.print(b + " ");
	
		}
	}
	*/
	
//g)
	/*
	public static void main(String[] args) {
		int [] usortertTab = {4, 2, 5, 6, 7, 8, 1};
		int [] sortertTab = {1, 2, 4, 5, 6, 7, 8};
		
		System.out.println(erSortert(usortertTab));
		System.out.println(erSortert(sortertTab));
	}
	
	public static boolean erSortert (int[] tabell) {
		
		for (int i = 0; i<tabell.length-1; i++) {
			if (tabell[i]> tabell[i+1]) {
				return false;
			}
			
		}
		return true;	
	}
	*/
	
//h)
	/*
	public static void main(String[] args) {
		int [] Tab1 = {4, 2, 5, 6, 7, 8, 1};
		int [] Tab2 = {1, 2, 4, 5, 6, 7, 8};	
		
		skrivut(settSammen(Tab1, Tab2));
		
	}
	
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		
		int nyLengde = (tabell1.length + tabell2.length);
		int [] nyTab = new int [nyLengde];
		
		int i = 0;
		for (i=0; i<tabell1.length; i++) {
			
			nyTab[i] = tabell1[i];
		}
		for (int j = 0; j<tabell2.length; j++) {
			nyTab[i] = tabell2[j];
			i++;
		}
		
		return nyTab;
		
		
	}
	private static void skrivut (int[] tabell) {
		for (int b : tabell) {
			System.out.print(b + " ");
	
		}
	}	
	*/	
	
	}
	
	


	
		
	
		
	

