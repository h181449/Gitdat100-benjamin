package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class Oppgave4B {
	public static void main(String[] args) {

		double skatt = 0;
		double brutto = parseDouble(showInputDialog("Inntekt :"));

		if (brutto >= 1021550) {
			skatt = brutto * 0.162;

		} else if (651250 <= brutto && brutto < 10215450) {
			skatt = brutto * 0.132;

		} else if (260100 <= brutto && brutto < 651250) {
			skatt = brutto * 0.04;

		} else if (184800 <= brutto && brutto < 260100) {
			skatt = brutto * 0.017;

		} else {
			skatt = 0;

		}
		showMessageDialog(null, "Du må skatte " + skatt + "kr");
	}

}
