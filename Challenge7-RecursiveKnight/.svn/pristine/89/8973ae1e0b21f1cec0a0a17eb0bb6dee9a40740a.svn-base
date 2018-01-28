
//@author xma29
public class InsecurePasswordLockBreaker {

	public static char[] breakLock(InsecurePasswordLock lock) {
		String s = "";
		int pos = -1;
		while(true) {
			pos = lock.open(s.toCharArray());
			if (pos == s.length()) break;
			if (pos != -1){
				s = s.substring(0, pos) + (char) ('A' + (int) (26 * Math.random())) + s.substring(pos+1, s.length());
			}else
				s += (char) ('A' + (int) (26 * Math.random()));
		}
		// write code here to determine the secret password
		// to unlock the given lock object.
		// You do not need to use recursion.
		// Hint: Read the source code of InsecurePasswordLock
		// The lock has a weakness....
		// Understand it and you can write an algorithm to quickly find the
		// secret password
		// (A brute force guess of a 40 character password would take a long
		// time...
		// as there are 26^40 combinations!
		// Your method should find it in a few seconds.

		// Beginner: You should complete this code in less than an hour

		// Advanced Code-Golf: Can you complete this method in 8 lines
		// (excluding the top and bottom given
		// lines and after autoformating your code)
		
		// Crazy Instructor level:
		// I can write a complete albeit-inefficient solution using single while loop :-)
		// expression: while (____){/*NoCodeHere*/}
		
		//found correct length
		//return correct character
		return s.toCharArray();
	}

	public static void main(String[] args) {
		InsecurePasswordLock lock = new InsecurePasswordLock();
		char[] key = breakLock(lock);
		System.out.println(key);
		System.out.println(lock.isUnlocked());
	}
}
