//Justin Mattix
import java.util.Scanner;

public class Guessing_Game 
{

	public static void main(String[] args) 
	{
		int r = (int)(1 + 100*Math.random()); //equation for a random number
		Scanner cin = new Scanner (System.in);
		int g; //g for the user inputed answer
		System.out.println("I'm thinkning of a number between 1 and 100" + " Do you know what it is?");
		boolean win = false; //code to keep the program running when false

		while (win == false) 
		
			{
			g = cin.nextInt();
			{
			
			if (g == r) {
			win = true;
			System.out.println("You win! Congrats!");
			}

			else if (g < r) {
				System.out.println("Too Low, try again");
			
			}
			else if (g > r) {
			System.out.println("Too high, try again");
			}
	
				{
				}
			}
			}
		cin.close();
		
	}
}
	
