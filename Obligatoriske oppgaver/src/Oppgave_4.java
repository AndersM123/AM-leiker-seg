
import static javax.swing.JOptionPane.*;

public class Oppgave_4 {


	public static void main(String[] args) {
			
			String inntekt=showInputDialog("Skriv inn bruttoinntekt: ");
			int brutto = Integer.parseInt(inntekt);
			
			double pros1 = 1.9/100;
			double pros2 = 4.2/100;
			double pros3 = 13.2/100;
			double pros4 = 16.2/100;
			double trinn1 = 180800;
			double trinn2 = 254500;
			double trinn3 = 639750;
			double trinn4 = 999550;
			
		double diff;
		double rest;
		
		double trinn_12 = (trinn2-trinn1)*pros1;
		double trinn_23 = (trinn3-trinn2)*pros2;
		double trinn_34 = (trinn4-trinn3)*pros3;
		double skatt;
		
		if (brutto<=trinn1) {
			showMessageDialog(null, "0 i skatt");
		
		}	else if (brutto<=trinn2) {
			diff = brutto - trinn1;
			rest = diff*pros1;
			showMessageDialog(null, "Du skal betale " + rest + "kr i skatt!");
			
		}	else if (brutto<=trinn3) {
				diff = brutto - trinn2;
				rest = diff*pros2;
				skatt = rest+trinn_12;
			showMessageDialog(null, "Du skal betale " + rest + "kr i skatt!");
			
		}	else if (brutto<=trinn4) {
			diff = brutto - trinn3;
			rest = diff*pros3;
			skatt = rest+trinn_12+trinn_23;
			showMessageDialog(null, "Du skal betale " + rest + "kr i skatt!");
			
		} else {
			diff = brutto - trinn4;
			rest = diff*pros4;
			skatt = rest+trinn_12+trinn_23+trinn_34;
			showMessageDialog(null, "Du skal betale " + skatt + "kr i skatt");
		}
		
			
			}

	}


