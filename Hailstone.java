// Sanvie Deshmukh
// 11/5/25
// Hailstone.java
// This program takes in a number from user input and uses the hailstone sequence.
// If it is an even number, then it divides by 2. If it is odd, it multiplies
// by 3 and adds 1. This keeps looping til the value is 1. The user types -1 to 
// exit the program
// Working on: Loops (while, do-while), and if-else 
/// Testing plan: 
/// 20 - should get the numbers 20, 10, 5, 16, 8, 4, 2, 1
/// 30 - should get the numbers 30, 15, 46, 23, 70, 35, 106, 53, 160, 80, 40, 20,
/// 10, 5, 16, 8, 4, 2, 1
/// 1 - should just get 1
/// -3 should get the error message
/// -1 should exit the code
/*
 * Pseudocode - look on paper
 */
 
import java.util.Scanner;

public class Hailstone
{
	private int input; // this is the number the user inputs
	private int count; // this stores how many times the loop had to run
	
	public Hailstone()
	{
		input = 0;
		count = 1;
	}
	
	// calls findIt()
	public static void main (String [] args)
	{
		Hailstone german = new Hailstone();
		german.findIt();
	}
	
	// this method uses a do-while loop to see if the value is within range. If it
	// is, the it calls printSeq(). Even if it is out of the range, it always calls
	// printCount(). This only works when input is not -1 or else the code will exit
	public void findIt()
	{
		System.out.println("\n\n\n");
		System.out.println("Welcome to Hailstone Sequence!");
		do
		{
			getInput();
			count = 1;
			if (input > 0 && input <= 10000)
			{
				printSeq();
			}
			printCount();
		}	
		while (input != -1);	
	}
	
	// this method gets the input from the user and stores I it in input
	public void getInput()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("\n\nPlease enter a positive integer (1-10000). To quit, " +
			"enter -1. --> ");
		input = kb.nextInt();
	}
	
	// this uses a while loop and nested if-else to make the number 1. If it is even
	// it divides by 2. If it is odd, then it multiples by 3 and adds 1. It also
	// seperates the number by tabs for every 10 numbers, then goes to another line
	public void printSeq()
	{
		System.out.printf("\n%7d", input);
		while (input != 1)
		{
			if(input % 2 ==0)
			{
				input = input/2;
			}	
			else 
			{
				input = input*3 +1;
			}
			
			System.out.printf("%7d", input);
			count++;
			
			if (count % 10 ==0)
					System.out.println();
		}		
	}
	
	// This method takes the calulations we did and prints out how many times it ran.
	// If there was an error, the error message is also here. 
	public void printCount()
	{
		if (input == 1)
			System.out.printf("\n\nThe loop executed %d times.\n", count);
		else if (input == -1)
			System.out.println("\nThank you for playing Hailstone!\n\n\n");
		else
			System.out.println("\nPlease enter a value within the range!");
	}
} 
