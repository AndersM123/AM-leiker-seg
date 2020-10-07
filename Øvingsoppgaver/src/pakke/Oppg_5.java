package pakke;

import static javax.swing.JOptionPane.*;

public class Oppg_5 {

//a) og b)
	
	public static int tellOrd(String string) {
		int teller=0;
		
		for (int i=0; i < string.length(); i++) {
			
		if(string.charAt(i) == ' ' && string.charAt(i+1)!= ' ') {
				
			teller++;
			}
		}
		return teller + 1;
	}
	
	
	public static void main(String[] args) {
		String ord = showInputDialog("Skriv en setning: ");
		String[] tab = new String [3];
		
		System.out.println(tellOrd(ord) + " Ord");
		
		tab [0] = new String(ord);
		tab [1] = new String(ord);
		tab [2] = new String(ord);
		tab [3] = new String(ord);
		
		for(String a : tab) {
			
			System.out.println(tellOrd(a));
		}
		
	}
	
	

	
	
	
	}


