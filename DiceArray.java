
public class DiceArray 
{

	public static void main(String[] args) 
	{
		DiceRoll die1 = new DiceRoll();
		DiceRoll die2 = new DiceRoll();
		int[] value = new int[13];
		
		for (int i = 0; i < 1000; i++) 
		{
			int roll1 = die1.roll();
			int roll2 = die2.roll();
			int sum = roll1 + roll2;
			value[sum] += 1;
		}
		for (int x = 2; x < 13; x++) 
		{
			System.out.println("The sum of " + x  + " was rolled " + value[x] + " times.") ;
		}

	}

}
