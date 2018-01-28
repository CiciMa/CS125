/**
 * Add you netid here..
 * @author xma29
 *
 */

public class PlayListUtil {

	/**
	 * Debug ME! Use the unit tests to reverse engineer how this method should work.
	 * Hint: Fix the formatting (shift-cmd-F) to help debug the following code
	 * @param list
	 * @param maximum
	 */
	public static void list(String[] list, int maximum) {
		int i;
		if(maximum < 0)
		{
			for ( i = 1; i <= list.length; i++ ) 
			{      
				TextIO.putln(""  + i + ". " + list[i-1]);
			}
		}
		else
		{
				if(maximum > 1)
				
				{
					for ( i = 1; i <= maximum; i++) 
					{      
						TextIO.putln(""  + i + ". " + list[i-1]);
					}
				}
		}
	}

	/**
	 * Appends or prepends the title
	 * @param list
	 * @param title
	 * @param prepend if true, prepend the title otherwise append the title
	 * @return a new list with the title prepended or appended to the original list
	 */
	public static String[] add(String[] list, String title, boolean prepend) {
		String [] result = new String[list.length +1];
		if (prepend == true){
			result[0] = title;
			for (int i = 0; i < list.length; i++)
			{
				result[i+1] = list[i];
			}
		}
		else{
			for (int i = 0; i < list.length; i++)
			{
				result[i] = list[i];
			}
			result[list.length] = title;
		}
		return result;
	}
	/**
	 * Returns a new list with the element at index removed.
	 * @param list the original list
	 * @param index the array index to remove.
	 * @return a new list with the String at position 'index', absent.
	 */
	public static String[] discard(String[] list, int index) {
		String [] result = new String[list.length-1];
		for (int i = 0; i < list.length-1; i++){
			if(!(i == index))
			{
				if(i< index)
				{
					result[i] = list[i];
				}
				else
				{
					if( i > index)
					{
						result[i] = list[i+1];
					}
				}
			}
			else 
			{
					if(i == index)
					{
						result[i] = list[i+1];
					}
			}
			
		}
		
		return result;
	}

}
