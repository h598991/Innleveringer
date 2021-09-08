package no.hvl.dat100;
/* Obligatorisk oppgave 2, Fredrik McKibben
 * Struktur: 
 * Innlesing av poengsum. If statement avgjør karakter. 
 * Skrive ut antall poeng og karakter i dialogboks.
 * Gi feilmelding ved ugyldig poengsum (a&b)
 * While løkke krever ny innlesning inntil poengsum tilsvarer en gyldig karakter c) 
 */

public class Poengsum {
	static public void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			int points = java.lang.Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Poeng:"));
			boolean valid = false;
			if (points<=100 && points>=0) {
				valid=true;
			}
			while (valid==false) {
				points = java.lang.Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ugyldig poengsum, oppgi på nytt:"));
				if (points<=100 && points>=0) {
					valid=true;
				}
			}
				if (points<=100 && points>=90) {
					javax.swing.JOptionPane.showMessageDialog(null, points + " poeng tilsvarer karakter A");
				} else if(points<90 && points>=80) {
					javax.swing.JOptionPane.showMessageDialog(null, points + " poeng tilsvarer karakter B");
				} else if(points<80 && points>=60) {
					javax.swing.JOptionPane.showMessageDialog(null, points + " poeng tilsvarer karakter C");
				} else if(points<60 && points>=50) {
					javax.swing.JOptionPane.showMessageDialog(null, points + " poeng tilsvarer karakter D");
				} else if(points<50 && points>=40) {
					javax.swing.JOptionPane.showMessageDialog(null, points + " poeng tilsvarer karakter E");
				} else /*if(points<40 && points>=0)*/ {
					javax.swing.JOptionPane.showMessageDialog(null, points + " poeng tilsvarer karakter F");
	//			} else {
	//				javax.swing.JOptionPane.showMessageDialog(null, "Ugyldig poengsum");
	//		Kommentert vekk ettersom dette er overflødig i deloppgave c)
				}
			
		}
	}

}
