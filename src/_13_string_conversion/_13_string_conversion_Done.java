package _13_string_conversion;

import javax.swing.JOptionPane;

public class _13_string_conversion_Done {

	public static void main(String[] args) {
		String quantity = JOptionPane.showInputDialog("Enter an integer.");
		int number = Integer.parseInt(quantity);
		JOptionPane.showMessageDialog(null, number);

	}

}
