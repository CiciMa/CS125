
public class FlappyBird {
	public int x, y;
	public void setX(int newx){ this.x = newx;}
	public void setY(int newy){ this.y = newy;}
	public void moveRightOne(){ this.x ++;}
	
	public static void main (String [] args){
		FlappyBird leftBird = new FlappyBird();
		leftBird.setX(10);
		leftBird.setY(292);
		leftBird.moveRightOne();
		System.out.println(leftBird.x);
	}
	
}
