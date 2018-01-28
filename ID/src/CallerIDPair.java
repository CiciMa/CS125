public class CallerIDPair {
	int phoneNumber;
	String name;
	
	
	public CallerIDPair(int anotherNumber, String anotherName) {
		this.phoneNumber = anotherNumber;
		this.name = anotherName;
	}
	
	public String toString() {
		String result = "";
		result += this.phoneNumber + ", " + this.name;
		return result;
	}
}
