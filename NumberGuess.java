import java.util.Random;
import java.util.*;
public class NumberGuess 
{
    public static void main(String arg[])
    {
        Random rand=new Random();
        int ranNo=rand.nextInt(100)+1;
	Scanner sc=new Scanner(System.in);
	//System.out.println("Random number is"+ranNo);
	int count=0;
	while(true)
	{
        	System.out.println("Enter your guess (1-100) : ");
        
        	int guess=sc.nextInt();
		count++;
        	if(guess == ranNo)
        	{
            		System.out.println("Correct ! You Win !");
			System.out.println("It took you "+count+"tries");
			break;
        	} else if(ranNo > guess)
        		{
            			System.out.println("Nope ! he number is higher.Guess again.");
        		}
        	else
        	{
            		System.out.println("Nope ! he number is Lower.Guess again.");
        	}
	}

    }
}