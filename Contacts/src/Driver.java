public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person instructor = new Person("Bill Chapman", 645674857);
		Person president = new Person("Donny Trump", 64859674);
		Person cinda = new Person("Cinda Heeren", 475837);
		System.out.println(instructor);
		president.printDescription();
		
		// make some friends
		Friend warren = new Friend("Warren Buffet", 45968749);
		Friend instructorFriend = new Friend(cinda);
		
		instructorFriend.printDescription();
		
		try {
		SoulMate mySoulMate = new SoulMate(instructorFriend);
		mySoulMate.printDescription();
		
		} catch (IllegalArgumentException e) {
			System.out.println("Mike punches Me");
		}

	}

}
