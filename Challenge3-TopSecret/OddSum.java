/**
 * Prints sum of odd numbers in a specific format.
 * TODO: add your netid to the line below
 * @author xma29
 */
public class OddSum { 
/**
Example output if user enters 10:
Max?
1 + 3 + 5 + 7 + 9 = 25
25 = 9 + 7 + 5 + 3 + 1

Example output if user enters 11:
Max?
1 + 3 + 5 + 7 + 9 + 11 = 36
36 = 11 + 9 + 7 + 5 + 3 + 1

 */
	public static void main(String[] args) { 
		int userInput = TextIO.getlnInt();
		TextIO.putln("Max?");
		int k;
		int [] listOfNumber;
		int total1 = 1;
		int total2 = 1;
		if ( userInput%2 == 1)
		{
			listOfNumber = new int [(userInput/2)+1];
			
			TextIO.put("1");
			for ( k = listOfNumber.length - 2; k >= 0; k--)
			{
				TextIO.put(" + " + (userInput - 2*k));
				
			}
			
			for ( k = listOfNumber.length - 1; k > 0; k--)
			{
				
				total1 = total1 + (userInput - 2*(k - 1));
				
			}
			TextIO.put(" = " + total1);
			TextIO.put("\n");
			
			for ( k = 1; k < listOfNumber.length; k++)
			{
				total2 = total2 + (userInput - 2*(k - 1));
				
			}
			TextIO.put(total2 + " = ");
			for ( k = 1; k < listOfNumber.length; k++)
			{
				TextIO.put(userInput - 2*(k -1) + " + ");
			}
			TextIO.put("1");	
		
		}
		
		else
		{
			listOfNumber = new int [userInput/2];
			
			TextIO.put("1");
			for ( k = listOfNumber.length - 1; k > 0; k--)
			{
				TextIO.put(" + " + ((userInput - 1) - 2*(k - 1)));
				//10 - 1 - 2(4-1)
			}
			
			for ( k = listOfNumber.length - 1; k > 0; k--)
			{
				
				total1 = total1 + ((userInput - 1) - 2*(k - 1));
				
			}
			TextIO.put(" = " + total1);
			TextIO.put("\n");
			
			
			for ( k = 1; k < listOfNumber.length; k++)
			{
				total2 = total2 + ((userInput - 1) - 2*(k - 1));
			}
			TextIO.put(total2 + " = ");
			for ( k = 1; k < listOfNumber.length; k++)
			{
				TextIO.put((userInput - 1) - 2*(k -1) + " + ");
			}
			TextIO.put("1");
		}

	} // end of main method
} // end of class 
