package _99_extra;

import javax.swing.JOptionPane;

public class Are_you_sure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int isSure = 0;
		String sures = "sure ";
		int suresSenceNewLine = 0;
		
		while (isSure == 0) {
			isSure = JOptionPane.showConfirmDialog(null, "Are you " + sures + "that you want to run this program?");
			sures = sures + "you're sure ";
			if (suresSenceNewLine > 5) {
				sures = sures + '\n';
				suresSenceNewLine = 0;
			}
			else {
				suresSenceNewLine++;
			}
		}
		
	}

}
