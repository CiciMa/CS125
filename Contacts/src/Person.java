public class Person {
	String name;
	int phoneNumber;
	public Person(String newName, int newPhoneNumber) {
		this.name = newName;
		this.phoneNumber = newPhoneNumber;
	}
	
	public String toString() {
		String personString = "";
		personString += "Name: " + this.name;
		personString += ", Phone Number: " + this.phoneNumber;
		return personString;
	}
	
	//this instance method prints a description of an instance of this class
	
	public void printDescription() {
		System.out.println(this);
		
	}

}
