
public class Atom {
	public double x = 0.0;
	public double y = 0.0;
	public double vx = 0.0;
	public double vy = 0.0;
	
	public boolean equals(Atom otherAtom){
		boolean isEqual = true;
		 if (this.x != otherAtom.x) isEqual = false;
		 if (this.y != otherAtom.y) isEqual = false;
		 if (this.vx != otherAtom.vx) isEqual = false;
		 if (this.vy != otherAtom.vy) isEqual = false;
		 
		 return isEqual;
	}
	
}
