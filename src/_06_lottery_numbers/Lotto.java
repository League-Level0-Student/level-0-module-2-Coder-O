package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lotto {

	public static void main(String[] args) {
		Random ran = new Random();
		int Continue = 1;
		while (Continue == 1) {
			String lotteryWin = (ran.nextInt(39)+1) + " " + (ran.nextInt(39)+1) + " " + (ran.nextInt(39)+1) + " " + (ran.nextInt(39)+1) + " " + (ran.nextInt(39)+1);
			Continue = JOptionPane.showConfirmDialog(null, lotteryWin);
		}

	}

}
