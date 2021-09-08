package no.hvl.dat100;
/* Obligatorisk oppgave 3, Fredrik McKibben
 * Struktur: 
 * Innlesing av tall, If statement avgjør om tall er større enn 0.
 * Ved gyldig tall ganges dette opp mot økende tall i for loop, intill n. 
 * Utskrift av svar etter loop.
 * Utsrkift av feilmelding ved ugyldig tall.
 */

public class NFakultet {
	public static void main(String[] args) {
		int n= java.lang.Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Grunntall:"));
		long product=1;
		
		if(n>0) {
			for (int i=1; i<=n; i++) {
			product*=i;
			}
			javax.swing.JOptionPane.showMessageDialog(null, n + "! = " + product);
		} else {
			javax.swing.JOptionPane.showMessageDialog(null, "Ugyldig grunntall");
		}
	}

}
