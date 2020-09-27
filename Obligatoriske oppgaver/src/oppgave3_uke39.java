
public class oppgave3_uke39 {
//a)
	/*
	public static void main(String[] args) {
		int [] tab1 = {2,3,5,6,7};
		int [] tab2 = {3,5,8,9,1};
		int [] tab3 = {2,3,4,5,9};
		
		int [] [] matrise = {tab1, tab2, tab3};
		
		skrivUtv1(matrise);
	}
	
	public static void skrivUtv1(int[][] matrise) {
		for (int [] rekke : matrise) {
			for (int tall : rekke) {
				System.out.print(tall + " ");
			}
			System.out.print("\n");
		}
		
	}
	*/
	
	
//b)
	/*
	public static void main(String[] args) {
		int [] tab1 = {1,2,3};
		int [] tab2 = {4,5,6};
		int [] tab3 = {7,8,9};
		
		int [] [] matrise = {tab1, tab2, tab3};
		skrivUtv1(matrise);
	}
	
	public static void skrivUtv1(int[][] matrise) {
		for (int [] rekke : matrise) {
			for (int tall : rekke) {
				System.out.print(tall + " ");
			}
			System.out.print("\n");
		}
		
	}	
	
	public static String tilStreng(int[][] matrise) {
		
		String utskrift = "";
		String rekkeStreng="";
		
		for (int [] rekke : matrise) {
			for (int tall : rekke) {
				Integer.toString(tall);
				rekkeStreng += tall + " ";
			}
			utskrift += rekkeStreng + "\n";
			rekkeStreng="";
		
	}
		return utskrift;
	}
	*/
	
//c)
	/*
	public static void main(String[] args) {
		int [] tab1 = {1,2,3};
		int [] tab2 = {4,5,6};
		int [] tab3 = {7,8,9};
		
		int [] [] matrise = {tab1, tab2, tab3};
		skrivUtv1(skaler(2, matrise));
	}
	
	public static void skrivUtv1(int[][] matrise) {
		for (int [] rekke : matrise) {
			for (int tall : rekke) {
				System.out.print(tall + " ");
			}
			System.out.print("\n");
		}
		
	}	
	
	public static int[][] skaler(int multi, int[][] matrise) {
		
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
		int i = 0;
		int j = 0;
		
		for (int[] rekke : matrise) {
			for (int tall : rekke) {			
				nyMatrise[i][j] = tall * multi;				
				j++;
			}
		i++;	
		j = 0;										
		}	
		return nyMatrise;
		
		}
		*/
		
//d)
	/*
	public static void main(String[] args) {
		int [] tab1 = {1,2,3};
		int [] tab2 = {4,5,6};
		int [] tab3 = {7,8,9};
		
		int [] [] matrise1 = {tab1, tab2, tab3};
		int [] [] matrise2 = {tab2, tab3, tab1};
		System.out.println(erLik(matrise1, matrise2));
	}
	
	public static void skrivUtv1(int[][] matrise) {
		for (int [] rekke : matrise) {
			for (int tall : rekke) {
				System.out.print(tall + " ");
			}
			System.out.print("\n");
		}
		
	}	
public static boolean erLik(int[][] mat1, int[][] mat2) {
		
		int i = 0;
		int j = 0;
		
		for (int[] rekke : mat1) {
			for (int tall : rekke) {				
				if (tall != mat2[i][j]) {		
					return false;
				}
				j++;
			}
			j = 0;														
			i++;
		}
		return true;
	
}
	
*/
	}
	

