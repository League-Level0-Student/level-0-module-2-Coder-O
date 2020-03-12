package _15_voting_booth;

import javax.swing.JOptionPane;

public class VOTTTTEEEEEE {

	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you? (in years, please.)");
		int ageNumb = Integer.parseInt(age);
		if (ageNumb > 18) {
			JOptionPane.showInputDialog("Who do you think the next Presidant will be?");
		}
		else {
			JOptionPane.showMessageDialog(null, "No one cares what you think!");
		}
	}

}
