public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallerIDPair me = new CallerIDPair(1234466, "Bill Chapman");
		System.out.println(me);
		System.out.println("This phonenumber is 345656: " + map.find());

	}
	
	// Make a single instance (Singleton) of CallerIDMap and use it
	CallerIDMap map = new CallerIDMap();
	map.add(124234, "Xiaoxin");
}
