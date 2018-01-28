/**
 * A program to print one actor's lines. 
 * See ScriptPrinter.txt for more information.
 * TODO: add your netid to the line below
 * @author xma29
 */
public class MyScriptPrinter {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean output = false; //Set to true when we find the desired character
		String name = ""; // Only print lines for this character
		
		while (!(name.equalsIgnoreCase("NEO") || name.equalsIgnoreCase("MORPHEUS") || name.equalsIgnoreCase("ORACLE") ))
		{
		TextIO.putln("Which character's lines would you like? (NEO,MORPHEUS,ORACLE)");
		name = TextIO.getln();
		}

		TextIO.readFile("thematrix.txt"); // stop reading from the keyboard- use the script
		
		//TODO: Print the name here (see ScriptPrinter.txt example output for format)
		System.out.println(name.toUpperCase() + "'s lines:");
		
		output = false; // initially don't print anything

		// This loop will read one line at a time from the script until it
		// reaches the end of the file and then TextIO.eof() will return true.
		// eof means end-of-file

		while (TextIO.eof() == false) {
			String line = TextIO.getln(); // Read the next line
			line= line.trim();
			//output = line.equalsIgnoreCase(name);
			//TODO: If it's a blank line set 'output' to false
			if (line.length() == 0)
			{
				;
			}
			else
			{
				if (line.toUpperCase().equals(name.toUpperCase()))
					{	// We found the character's name, time to start printing their lines
						String scriptNextLine = TextIO.getln();
						scriptNextLine = scriptNextLine.trim();
						System.out.println(name.toUpperCase() + ":" + "\"" + scriptNextLine + "\"");
					}
			}
			

			//TODO: Correct the output format (see ScriptPrinter.txt example output)
			
			//TODO: Re-order the three if statements so the output is correct
	
			// Only print the line if 'output' is true
			
			
		}
		System.out.println("---");
		//TODO: Print 3 dashes here to indicate processing is complete
	}

}
