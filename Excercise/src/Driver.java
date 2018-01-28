
public class Driver {
	 public static void main (String[] args){
		 Atom atom1 = new Atom ();
		 Atom atom2 = new Atom ();
		 
		 atom1.x = 5.0;
		 atom1.y = 8.0;
		 atom1.vx = 1.0;
		 atom1.vy = 0.0;
		 
		 atom2.x = 17.0;
		 atom2.y = 1.0;
		 atom2.vx = 1.0;
		 atom2.vy = 0.0;
		 
		 System.out.println("atom1 is equal to atom2 : " + equals(atom1, atom2));
		 System.out.println("atom1 is equal to atom2 : " + atom1.equals(atom2));
		 
		 System.out.println("atom1 is moving? " + atom1.moving());
		 
		 Simulation simOf100 = new Simulation();
		 simOf100.init(100);
		 
		 for (int i = 0; i< simOf100.atoms.length; i++){
			 System.out.println("x = " + simOf100.atoms[i].x);
			 System.out.println("y = " + simOf100.atoms[i].y);
			 System.out.println("vx = " + simOf100.atoms[i].vx);
			 System.out.println("vy = " + simOf100.atoms[i].vy);
			 System.out.println();
		 }
		 
		 
	 }
	 
	 public static boolean equals (Atom aa, Atom bb) {
		 boolean isEqual = true;
		 if (aa.x != bb.x) isEqual = false;
		 if (aa.y != bb.y) isEqual = false;
		 if (aa.vx != bb.vx) isEqual = false;
		 if (aa.vy != bb.vy) isEqual = false;
		 
		 return isEqual;
	 }
	 
	 public boolean moving(){
		 return this.vx != 0.0 || this.vy != -0.0;
	 }
}
