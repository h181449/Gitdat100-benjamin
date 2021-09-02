package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class OppgaveO3 {
	public static void main(String args[]) {

		int fact = 1;
		String nummerTxt = showInputDialog("Tast inn et tall :");
		int nummer = parseInt(nummerTxt);

		for (int i = 1; i <= nummer; i++) {
			fact = fact * i;

		}
		showMessageDialog(null, "Fakultet av " + nummer + " er: " + fact);
	}
}