package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lotto2 {

	public static void main(String[] args) {
		Random ran = new Random();
		boolean Continue = true;
		int lotto1 = 0;
		int lotto2 = 0;
		int lotto3 = 0;
		int lotto4 = 0;
		int lotto5 = 0;
		int attempts = 0;
		while (Continue) {
			lotto1 = ran.nextInt(39)+1;
			lotto2 = ran.nextInt(39)+1;
			lotto3 = ran.nextInt(39)+1;
			lotto4 = ran.nextInt(39)+1;
			lotto5 = ran.nextInt(39)+1;
			attempts = attempts + 1;
//			System.out.println(lotto1 + " " + lotto2 + " " + lotto3 + " " + lotto4 + " " + lotto5 + " Number of attempts:" + attempts);
			if (lotto1 == 14 && lotto2 == 19 && lotto3 == 24 && lotto4 == 29 && lotto5 == 36) {
				Continue = false;
				}
		}
		JOptionPane.showMessageDialog(null, lotto1 + " " + lotto2 + " " + lotto3 + " " + lotto4 + " " + lotto5 + " Number of attempts:" + attempts);
	}

}


