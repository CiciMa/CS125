/**
 * A program to search for specific lines and print their line number.
 * See FindScriptLine.txt for more details
 * TODO: add your netid to the line below
 * @author xma29
 */
public class FindScriptLine {

	public static void main(String[] args) {
		
		String searchWord = "";
		
		System.out.println("Please enter the word(s) to search for");
		searchWord = TextIO.getln();
		System.out.println("Searching for " + "\'" + searchWord + "\'");
		
		TextIO.readFile("thematrix.txt");
		
		boolean output = false;
		int linecounter = 0;
		while (TextIO.eof() == false){
		String line = TextIO.getln();
		linecounter ++;
		line = line.trim();
		
			if (line.length() == 0)
			{	
				;
			}
			else
			{
				if (line.toLowerCase().indexOf(searchWord.toLowerCase()) >= 0)
				{

					System.out.println(linecounter + " - " + line);
				}
			}
		}
		
		System.out.println("Done Searching for " + "\'" + searchWord + "\'");
		
	}
			
}

