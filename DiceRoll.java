/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Feb 2018
 * Rolls a dice with an inputted number of sides and prints the output.
 *
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class DiceRoll {
	
	public static void RollDie(int maxValue) {
		//Generate random number and print to console
		Random rand = new Random();
		int roll = rand.nextInt(maxValue) + 1;
		System.out.println(roll);
	}
	
	public static void main(String[] args) {
		//Get user input and run the RollDie method
		
		String input = "";
		int numberOfSides = 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader
	(System.in));
		while(true) {
			System.out.println("Enter the number of sides on the die: ");
			try {
				//Get user input
				input = reader.readLine();
			} catch (IOException noInput) {
				noInput.printStackTrace();
			}
			try {
				//Convert string to double
				numberOfSides = Integer.parseInt(input);
				break;
			} catch (NumberFormatException stringInput) {
				System.out.println("Please enter an integer");
			}
		}
		
		RollDie(numberOfSides);
	}
}
