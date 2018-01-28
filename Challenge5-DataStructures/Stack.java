/*
 * @author xma29
 */
public class Stack {
	private String [] data = new String[0];
	private int size = 0;
	
	/** Adds a value to the top of the stack.*/
	public void push(String value){
		size ++;
		String [] old = data;
		data = new String[size];
		for (int i=0; i < size - 1; i++) {
			data[i] = old[i];
		}
		data[size - 1] = value;
	}
	
	/** Removes the topmost string. If the stack is empty, returns null. */
	public String pop() {
		if (size == 0){
			return null;
		}else{
			String[] old = data;
			String result = data[size - 1];	
			for(int i=0; i < size - 1; i++) {
				data[i] = old[i];
			}
			size --;
			return result;
		}
	}
	
	/** Returns the topmost string but does not remove it. If the stack is empty, returns null. */
	public String peek() {
		if (size == 0){
			return null;
		}else{
			String result = data[size - 1];	
			return result;
		}
	}
	
	/** Returns true iff the stack is empty */
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}else{
			return false;
		}
	}

	/** Returns the number of items in the stack. */
	public int length() {
		return size;		
	}
	
	/** Returns a string representation of the stack. Each string is separated by a newline. Returns an empty string if the stack is empty. */
	public String toString() {
		String result = "";
		if (size == 0) {
			return result;
		}else{
			for(int i = 0; i < size; i++) {
				result += data[i] + "\n";
			}
			return result;
		}
	}
}
