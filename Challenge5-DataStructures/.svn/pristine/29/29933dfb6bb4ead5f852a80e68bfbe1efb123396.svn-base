/*
 * @author xma29
 */
import java.awt.Color;

public class KeyValueMap { // aka Dictionary or Map
	private String [] keydata = new String[0];
	private Color [] valuedata = new Color[0];
	private int size = 0;
	/**
	 * Adds a key and value. If the key already exists, it replaces the original
	 * entry.
	 */
	public void add(String key, Color value) {
			size ++;
			String[] old = keydata;
			keydata = new String[size];
			
			Color[] oldmap = valuedata;
			valuedata = new Color[size];
			for (int i=0; i < size - 1; i++) {
				keydata[i] = old[i];
				valuedata[i] = oldmap[i];
			}
			keydata[size - 1] = key.toUpperCase();
			valuedata[size - 1] = value;
		
	}

	/**
	 * Returns particular Color object previously added to this map.
	 */
	public Color find(String key) {
		Color result;
		for (int i = 0; i < size; i++) {
			if(key.toUpperCase().equals(keydata[i])) {
				result = valuedata[i];
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns true if the key exists in this map.
	 */
	public boolean exists(String key) {
		for (int i = 0; i < size; i++) {
			if(key.toUpperCase().equals(keydata[i])) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Removes the key (and the color) from this map.
	 */
	public void remove(String key) {
		int index = 0;
		for (int i=0; i < size; i++) {
			if(key.toUpperCase().equals(keydata[i])){
				index = i;
			}	
		}
		for (int i= index; i < size - 1; i++) {
			keydata[i] = keydata[i+1];
			valuedata[i] = valuedata[i+1];
		}
		size --;


	}

}
