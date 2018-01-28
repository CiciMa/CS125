// @author xma29
public class RobotLink {

	private RobotLink next; 	
	private final Robot robot;

	public Robot getRobot() {
		return robot;
	}
	/** Constructs this link.
	 * @param next ; the next item in the chain (null, if there are no more items).
	 * @param robot ; a single robot (never null).
	 */
	public RobotLink(RobotLink next,Robot robot) {
		this.robot = robot;
		this.next = next;
	}

	/**
	 * Returns the number of entries in the linked list.
	 * @return number of entries.
	 */
	public int count() {
		if (next == null)
			return 1; // BASE CASE; no more recursion required!

		// Recursive case:
		return 1 + next.count();
	}
	/**
	 * Counts the number of flying robots in the linked list.
	 * Hint: robot.isFlying is useful here.
	 */
	public int countFlyingRobots() {
		int result = 0;
		if (robot.isFlying())
			result ++;
		if (next == null)
			return result;
		else
			return result + next.countFlyingRobots();
		
	}
	/**
	 * Counts the number of flying robots upto and excluding a sad robot.
	 * (i.e. do not count the sad robot if it is flying).
	 * If there are no sad robots this function will return the same value as countFlyingRobots().
	 * Hint: robot.isHappy() is useful.
	 */
	public int countFlyingRobotsBeforeSadRobot() {
		int result = 0;
		if (robot.isFlying() && robot.isHappy())
			result ++;
		if (next == null || robot.isHappy() == false) 
			return result;
		else 
			return result + next.countFlyingRobotsBeforeSadRobot();
	}
	/** Creates a new LinkedList entry at the end of this linked list.
	 * Recursively finds the last entry then adds a new link to the end.
	 * @param robot - the robot value of the new last link
	 */
	public void append(Robot robot) {
		if (next == null) 
			next = new RobotLink(null,robot);
		else 
			next.append(robot);

	}
	/**
	 * Returns the first flying unhappy robot, or null
	 * if there are not robots that are flying and unhappy.
	 * @return
	 */
	public Robot getFirstFlyingUnhappyRobot() {
		Robot result = null;
		if (next == null) {
			if (robot.isFlying() == true && robot.isHappy() == false) {
				result = this.robot;
			}			
			return result;
		} else {
			if (robot.isFlying() == true && robot.isHappy() == false)
				result = this.robot;
			else 
				result = next.getFirstFlyingUnhappyRobot();
		}
		return result;
	}
	/**
	 * Returns the last flying unhappy robotn the linked list, or null
	 * if there are not robots that are flying and unhappy.
	 * @return
	 */
	public Robot getLastFlyingUnhappyRobot() {
		Robot result = null;
		if (next == null) {
			if (robot.isFlying() == true && robot.isHappy() == false) {
				result = this.robot;
			}			
			return result;
		} else {
			result = next.getLastFlyingUnhappyRobot();
			if (result != null)
				return result;
			if (robot.isFlying() == true && robot.isHappy() == false)
				result = this.robot;
		}
		return result;
	
	}
	/**
	 * Returns a reference to the happy most distant explorer.
	 * Returns null if there are no happy robots
	 * @return reference to the most distant happy robot
	 */
	public Robot findHappyRobotFurthestFromHome() {
		Robot result = null;
		if (next == null) {
			if (robot.isHappy() == true) {
				result = this.robot;
			}			
			return result;
		} else {
			result = next.getFirstFlyingUnhappyRobot();
			if (robot.isHappy() == true 
					&& (this.robot.getDistanceFromHome() > next.robot.getDistanceFromHome()))
				result = this.robot;
		}
		return result;
	}
	/**
	 * Returns true if linked list contains the robot.
	 * Hint: Use robot.equals(other).
	 * @param robot
	 * @return
	 */
	public boolean contains(Robot other) {
		if (next == null) 
			if (robot.equals(other))
				return true;
			else 
				return false;
		else
			if (robot.equals(other))
				return true;
			else 
				return next.contains(other);
	}
}
