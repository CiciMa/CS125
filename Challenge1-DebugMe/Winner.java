
/**
 * This program prints "a","b","c" depending on who has the highest score. The
 * given code may not be correct. Fix it and additional code to pass the unit
 * tests.
 * 
 * @see Winner-ReadMe.txt for details on how to complete this program.
 * @author xma29
 * 
 */
public class Winner {
	public static void main(String[] args) {
		System.out.println("Enter three unique integer scores.");

		int a = TextIO.getlnInt();
		int b = TextIO.getlnInt();
		int c = TextIO.getlnInt();

		if (a > b && a > c)
		{
			TextIO.putln("1st Place:a");
		}
		else
		{
			if (b > c)
			{
				TextIO.putln("1st Place:b");
			}
			else
			{
				TextIO.putln("1st Place:c");
			}
		}
			
		
		// the logic and text output need further work...
	}
}
