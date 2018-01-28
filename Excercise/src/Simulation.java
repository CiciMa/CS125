
public class Simulation {
	public Atom[] atoms;
	public double temperature;
	
	// The init instance method will initialize our atoms array elements
	// to all random location and velocities
	
	public void init(int sizeOfSimulation){
		// create an array of Atoms with 100 Atoms
		atoms = new Atom[sizeOfSimulation]; // reference to object, no object with nullpointer

		// initialize all elements of the array to random values
		for (int i = 0; i < this.atoms.length; i++){
			// x will have range 0.0 to 600.0;
			// y will have range 0.0 to 800.0
			// vx will have range -5.0 to +5.0;
			// vy will have range -2.0 to 10.0;
			this.atoms[i] = new Atom();
		
//			Atom tempAtom = new Atom();
//			this.atoms[i] = tempAtom;
			
			this.atoms[i].x = Math.random()*800.0;
			this.atoms[i].x = Math.random()*600.0;
			this.atoms[i].vx = Math.random()*10.0 - 5.0;
			this.atoms[i].vy = Math.random()*12.0 - 2.0;
			
			
		}
	}
}
