import java.util.Date;

public class SoulMate extends Friend {
	Date foundOn;
	
	public SoulMate(Friend someLuckyFriend) {
		super(someLuckyFriend);
		if (someLuckyFriend.name.equals("Dee")) {
			throw new IllegalArgumentException("Relationshio out-of-bounds");
		}
		foundOn = new Date(); // set the date to now
	}
	// Let's say we now believe in love at first sight
	public SoulMate(String newName, int newNumber) {
		super(newName, newNumber);
		foundOn = new Date(); // set the date to now
	}
	
	public String toString() {
		String friendString = super.toString();
		friendString += " Found soulmate on" + this.foundOn;
		return friendString;
	}
	
	public void printDescription() {
		System.out.println(this);
	}
}
