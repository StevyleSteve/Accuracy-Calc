import javax.swing.JOptionPane;

public class AccuracyCalc {

    public static void main(String[] args) {
	//Info windows, follow instructions
        double A;
		double a;
		double ad;
		double aa;
		double E;
		String B = JOptionPane.showInputDialog("Affinity" );
		String C = JOptionPane.showInputDialog("Accuracy");
		String D = JOptionPane.showInputDialog("Enemy Defence");
		String F = JOptionPane.showInputDialog("Enemy Armour");
		A = Double.parseDouble(B);
		a = Double.parseDouble(C);
		ad = Double.parseDouble(D);
		aa = Double.parseDouble(F);
		E = ((0.0008*ad)*(0.0008*ad)*(0.0008*ad)+(4*ad)+40)+aa;
		double G = A * (a/E);
		JOptionPane.showMessageDialog(null, "Hit Chance: " + G);
    }

}