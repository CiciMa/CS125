import java.util.Date;

public class Friend extends Person {
	Date friendsSince;
	
	//convenience constructor
	public Friend(String newName, int newNumber){
		super(newName, newNumber);
		friendsSince = new Date(); //sets the date to now
	}
	
	public Friend(Person other) { //promote person to friend constructor
		super(other.name, other.phoneNumber);
		friendsSince = new Date();
		
	}
}
