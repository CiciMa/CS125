/**
 * See CipherBreaker.txt for instructions.
 * TODO: add your netid to the line below
 * 
 * @author xma29
 */
import java.util.Arrays;
public class CipherBreaker {

	public static void main(String[] args) {
		TextIO.putln("Text?");
		String line = TextIO.getln();
		TextIO.putln(line);

		char space = (char)(32);

		int numDigits = 0;
	    int numSpaces = 0;
	    int numPunctuations = 0;
	    int [] numletterHistogram = new int[26];
	    int index;

		for (int j=0; j<line.length(); j++)
		{

			if (line.toUpperCase().charAt(j) - 'A' >= 0 && line.toUpperCase().charAt(j) - 'A' < 26)
			{
				index = line.toUpperCase().charAt(j) -'A';
				numletterHistogram[index]++;
			}
			
			
			if((line.toUpperCase().charAt(j) - '0') >= 0 && (line.toUpperCase().charAt(j) - '0') <= 9)
			{
				numDigits ++;		
				
			}
			if (line.toUpperCase().charAt(j) == space)
			{
				numSpaces ++;
				
			}	
			if (line.toUpperCase().charAt(j) == '.' || 
				line.toUpperCase().charAt(j) == ',' ||
				line.toUpperCase().charAt(j) == '"' ||
				line.toUpperCase().charAt(j) == '-' ||
				line.toUpperCase().charAt(j) == '!' ||
				line.toUpperCase().charAt(j) == '\'')
				
			{
				numPunctuations ++;
			}


		}
			
		for ( int m = 0; m < 26; m++) 
		{

				if (numletterHistogram[m] > 0)
				{
				TextIO.putln(""+ (char)('A'+ m) + ":" + numletterHistogram[m]);
				}

		}
		if (numDigits > 0)
		{
			TextIO.putln("DIGITS:" + numDigits );
		}
		
		if (numSpaces > 0 )
		{
			TextIO.putln("SPACES:" + numSpaces);
		}
		if (numPunctuations > 0)
		{
			TextIO.putln("PUNCTUATION:" + numPunctuations);
		}

	}	
		

}