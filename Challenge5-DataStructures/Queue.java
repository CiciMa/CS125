/*
 * @author xma29
 */
public class Queue {
	private double [] data = new double[0];
	private int size = 0;
	/** Adds the value to the front of the queue.
	 * Note the queue automatically resizes as more items are added. */
	
	public void add(double value) {
		size ++;
		double[] old = data;
		data = new double[size];
		for (int i=0; i < size - 1; i++) {
			data[i] = old[i];
		}
		data[size - 1] = value;
	}
	/** Removes the value from the end of the queue. If the queue is empty, returns 0 */
	public double remove() {
		if(size == 0) {
			return 0.0;
		}else{
			double[] old = data;
			double result = data[0];	
			for(int i=0; i < size - 1; i++) {
				data[i] = old[i+1];
			}
			size --;
			return result;
		}	
	}
	
	/** Returns the number of items in the queue. */
	public int length() {
		return size;		
	}
	
	/** Returns true iff the queue is empty */
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}else{
			return false;
		}
	}
	
	/** Returns a comma separated string representation of the queue. */
	public String toString() {
		String result = "";
		for(int i = 0; i < size - 1; i++) {
			result += data[i] + ",";
		}
		result += data[size-1];
		return result;
	}
}
