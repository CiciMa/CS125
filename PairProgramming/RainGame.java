/**
 * @author xma29, pwk2, zruan3
 */
public class RainGame {

	public static void main(String[] args) {
		// To get points type your netids above (CORRECTLY-Please double check your partner correctly spells your netid correctly!!)
		// Your netid is the unique part of your @illinois email address
		// Do not put your name or your UIN. 
		// REMEMBER TO COMMIT this file...
	
		int x=0, y=0, dx=0, dy=0, score = 0; int numberofPlaces = 999;
		String text = "";
		long startTime =System.currentTimeMillis();
		
		while (Zen.isRunning()) {
			Zen.setFont("Helvetica-64");
	
			Zen.setColor(255, 0, 255);
			Zen.fillRect(0, 0, Zen.getZenWidth(), Zen.getZenHeight());

			Zen.setColor(0, 255, 0);
			Zen.drawText(text, x, y);
			
			Zen.drawText("Level: 0",10,30);
			Zen.drawText("Score:" + score,10,60);
			
			x += dx;
			y += dy;
			
			// Find out what keys the user has been pressing.
			String user = Zen.getEditText();
			// Reset the keyboard input to an empty string
			// So next iteration we will only get the most recently pressed keys.
			Zen.setEditText("");
			
			for(int i=0;i < user.length();i++) {
				char c = user.charAt(i);
				if(c == text.charAt(0))
					text = text.substring(1, text.length()); // all except first character
				
			}
			//return 

			dx = 0;
			dy = (score/3) + 5;
			if (text.length() == 0) {
				x = 0;
				y = Zen.getZenHeight() / 2;
				
				text = "" + (int) (Math.random() * numberofPlaces);
				long elapsed = System.currentTimeMillis() - startTime;
				startTime = System.currentTimeMillis();
				score += 3000 / elapsed;
				
				

				
				if (score > 5)
				{
					numberofPlaces += 4500;
				}
				if (user.length() == 0){
					score = 0;
				}
				
//				if (score >= 3)
//				{
//					dy += 10;
//				}
				
				//score it out of height 
				//! > (30000/dy)
			
				if (y >= Zen.getZenHeight())
				{
					Zen.drawText("Game Over",120,70);
				}
				
				
				}
				Zen.flipBuffer();
				Zen.sleep(90);// sleep for 90 milliseconds

		}
	}

}
