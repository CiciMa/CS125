public class CallerIDMap {
	private CallerIDPair[] array = new CallerIDPair[0];
	
	public int getSize() {
		return this.array.length;
	}
	// add method: take a phone number and a name and adds a new record
	public void add(int newNumber, String newName) {
		// create a new array with size one bigger
		CallerIDPair[] newArray = new CallerIDPair[this.getSize() + 1];
		// for loop to copy old data into new array
		for (int i=0; i < this.array.length; i++) {
			newArray[i] = this.array[i];
		}
		//finally, add new number and new name to the end
		newArray[this.array.length] = new CallerIDPair(newNumber, newName);
		this.array = newArray;
	}
	
	// find method: take a phone number. return the name associated with
	// that phone number
	public String Find(int searchNumber) {
		for (int i=0; i < this.getSize(); i++) {
			CallerIDPair temp = this.array[i];
			if(temp.phoneNumber == searchNumber) {
				return temp.name;
			}
		}
		return Integer.toString(searchNumber);
	}
}
