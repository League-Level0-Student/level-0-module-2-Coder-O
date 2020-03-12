package _14_rollercoaster;

import javax.swing.JOptionPane;

public class ROlllllllllllllll {

	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("How tall are you? (in inches, please.)");
		int heightNumb = Integer.parseInt(height);
		if (heightNumb > 48) {
			JOptionPane.showMessageDialog(null, "You can ride!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You can't ride! Grow up!");
		}

	}

}
