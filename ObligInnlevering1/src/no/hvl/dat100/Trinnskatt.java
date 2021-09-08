package no.hvl.dat100;
/* Obligatorisk oppgave 2, Fredrik McKibben
 * Struktur:
 * Lese inn Bruttoinntekt, If statement finner rett trinn,
 * beregne trinnskatt, lese ut skattenivå og beregnet trinnskatt.
 */

public class Trinnskatt {
	static public void main(String[] args) {
		int grossPay = java.lang.Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Bruttolønn: "));
		
		if (grossPay>=0 && grossPay<184800) {
			javax.swing.JOptionPane.showMessageDialog(null, "Ingen trinnskatt");
		} else if (grossPay>=184800 && grossPay<260100) {
			double tax = grossPay * 0.017;
			javax.swing.JOptionPane.showMessageDialog(null, "1,7% trinnskatt\n Trinnskatt: " + tax + "kr");
		}else if (grossPay>=260100 && grossPay<651250) {
			double tax = grossPay * 0.04;
			javax.swing.JOptionPane.showMessageDialog(null, "4% trinnskatt\n Trinnskatt: " + tax + "kr");
		}else if (grossPay>=651250 && grossPay<1021550) {
			double tax = grossPay * 0.132;
			javax.swing.JOptionPane.showMessageDialog(null, "13,2% trinnskatt\n Trinnskatt: " + tax + "kr");
		}else if (grossPay>=1021550) {
			double tax = grossPay * 0.162;
			javax.swing.JOptionPane.showMessageDialog(null, "16,2% trinnskatt\n Trinnskatt: " + tax + "kr");
		}else {
			javax.swing.JOptionPane.showMessageDialog(null, "Error!\n Det er ikke mulig å ha negativ inntekt");
		}
	}

}
