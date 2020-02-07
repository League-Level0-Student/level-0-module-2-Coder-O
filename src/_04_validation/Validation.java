//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);
		
		if (randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "You would make an amazing pufferfish.");
		} else if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "Eres bien.");
		} else if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "If you were a swallow, you could carry a coconut.");
		} else if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "The seagulls avoid dumping on you, so as to not supress your beauty.");
		} else {
			JOptionPane.showMessageDialog(null, "You must have roled an 18 for intelegance.");
		}
		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
