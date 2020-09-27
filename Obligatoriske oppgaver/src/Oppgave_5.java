import static javax.swing.JOptionPane.*;
public class Oppgave_5 {

	public static void main(String[] args) {
		
		int studenter = 10;
		
		
		for (int i = 1; i <= studenter; i++ ) {
			String poengsum = showInputDialog("Poeng, student " + i);
			int k = Integer.parseInt(poengsum);
		
		if (k >= 0 && k <= 100) { 
			
			
			if (k >= 90 && k <= 100) {
				showMessageDialog(null, "Du fikk karakter A!");
				
			}
			if (k >= 80 && k <= 89) {
				showMessageDialog(null, "Du fikk Karakter B!");
				
			}
			if (k >= 60 && k <=79) {
				showMessageDialog(null, "Du fikk karakter C!");
				
			}
			if (k >= 50 && k <= 59) {
				showMessageDialog(null, "Du fikk karakter D!");
			}
			if (k >= 40 && k <= 49) {
				showMessageDialog(null, "Du fikk karakter E!");
			}
			if (k >= 0 && k <= 39) {
				showMessageDialog(null, "Du fikk karakter F!");
				
			}
		}
		else {
			showMessageDialog(null, "Error, utenfor karakterskalaen");
			i--;
		}
		}
	}
}
