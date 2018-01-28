/*
 * @author xma29
 */
/**
 * Complete the following GeocacheList, to ensure all unit tests pass.
 * There are several errors in the code below
 *
 * Hint: Get the Geocache class working and passing its tests first.
 * 
 */
public class GeocacheList {
	private Geocache[] datalist = new Geocache[0];
	private int size = 0;
	

	public Geocache getGeocache(int i) {
		return this.datalist[i];
	}

	public int getSize() {
		return size;
	}
	
	public GeocacheList() {
	}

	public GeocacheList(GeocacheList other, boolean deepCopy) {
		this.size = other.size;
		this.datalist = new Geocache[other.size];
		
		for (int i=0; i < other.size; i++) {
			if (deepCopy == true) {
				this.datalist[i] = new Geocache(other.datalist[i]);
			}else{
				this.datalist[i] = other.datalist[i];
			}
		}
	}
		
	public void add(Geocache p) {
		size++;
		if (size > datalist.length) {
			Geocache[] old = datalist;
			datalist = new Geocache[size];
			for (int i = 0; i < old.length; i++)
				datalist[i] = old[i];
		}
		datalist[size-1] = p;
	}


	public Geocache removeFromTop() {
		Geocache[] old = datalist;
		Geocache result = datalist[size - 1];	
		for(int i=0; i < size - 1; i++) {
			datalist[i] = old[i];
		}
		size --;
		return result;
	}

	public String toString() {
		String s = "GeocacheList:";
		for (int i = 0; i < size - 1; i++) {
				s += datalist[i] + ",";
		}
		s += datalist[size-1];
		return s;
	}
}