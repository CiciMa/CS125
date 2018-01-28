
/* A class to implement the various pixel effects.
 *
 * Todo: Put your netid (i.e. username) in the line below
 * 
 * @author xma29
 */
public class PixelEffects {

	/** Copies the source image to a new 2D integer image */
	public static int[][] copy(int[][] source) {
		// Create a NEW 2D integer array and copy the colors across
		int srcW = source.length;
		int srcH = source[0].length;
		int [][] readImage = new int[srcW][srcH];
		
		for (int tgtX = 0; tgtX < srcW; tgtX++){
			for (int tgtY = 0; tgtY < srcH; tgtY++ ){
				readImage[tgtX][tgtY] = source[tgtX][tgtY];
			}
		}
		// See redeye code below
		return readImage; // Fix Me
	}
	/**
	 * Resize the array image to the new width and height
	 * You are going to need to figure out how to map between a pixel
	 * in the destination image to a pixel in the source image
	 * @param source
	 * @param newWidth
	 * @param newHeight
	 * @return
	 */
	public static int[][] resize(int[][] source, int newWidth, int newHeight) {
		int srcW = source.length;
		int srcH = source[0].length;
		int [][] resizeImage = new int[newWidth][newHeight];
		
		for (int tgtX = 0; tgtX < newWidth; tgtX++){
			for (int tgtY = 0; tgtY < newHeight; tgtY++ ){
				int srcX = (int) ((tgtX/(double) newWidth)*srcW);
				int srcY = (int) ((tgtY/(double) newHeight)*srcH);
				resizeImage[tgtX][tgtY] = source[srcX][srcY];
			}
		}
		return resizeImage; // Fix Me
		// Hints: Use two nested for loops between 0... newWidth-1 and 0.. newHeight-1 inclusive.
		// Hint: You can just use relative proportion to calculate the x (or y coordinate)  in the original image.
		// For example if you're setting a pixel halfway across the image, you should be reading half way across the original image too.
	}

	/**
	 * Half the size of the image. This method should be just one line! Just
	 * delegate the work to resize()!
	 */
	public static int[][] half(int[][] source) {
		return resize(source, source.length/2, source[0].length/2); // Fix Me
	}
	
	/**
	 * Create a new image array that is the same dimesions of the reference
	 * array. The array may be larger or smaller than the source. Hint -
	 * this methods should be just one line - delegate the work to resize()!
	 * 
	 * @param source
	 *            the source image
	 * @param reference
	 * @return the resized image
	 */
	public static int[][] resize(int[][] source, int[][] reference) {
		return resize(source, reference.length, reference[0].length); // Fix Me
	}

	/** Flip the image vertically */
	public static int[][] flip(int[][] source) {
		int srcW = source.length;
		int srcH = source[0].length;
		int [][] tgtImage = new int[srcW][srcH];
		for (int tgtX = 0; tgtX < srcW; tgtX++){
			for (int tgtY = 0; tgtY < srcH; tgtY++ ){
				int srcX = tgtX;
				int srcY = srcH - 1 - tgtY;
				tgtImage[tgtX][tgtY] = source[srcX][srcY];
			}
		}
		return tgtImage;// Fix Me
	}

	/** Reverse the image horizontally */
	public static int[][] mirror(int[][] source) {
		int srcW = source.length;
		int srcH = source[0].length;
		int [][] tgtImage = new int[srcW][srcH];
		for (int tgtX = 0; tgtX < srcW; tgtX++){
			for (int tgtY = 0; tgtY < srcH; tgtY++ ){
				int srcX = srcW - 1 - tgtX;
				int srcY = tgtY;
				tgtImage[tgtX][tgtY] = source[srcX][srcY];
			}
		}
		return tgtImage;// Fix Me
	}

	/** Rotate the image */
	public static int[][] rotateLeft(int[][] source) {
		int srcW = source.length;
		int srcH = source[0].length;
		int tgtW = srcH;
		int tgtH = srcW;
		int [][] tgtImage = new int[tgtW][tgtH];
		for (int tgtX = 0; tgtX < tgtW; tgtX++){
			for (int tgtY = 0; tgtY < tgtH; tgtY++ ){
				int srcX = tgtH - 1 - tgtY;
				int srcY = tgtX;
				tgtImage[tgtX][tgtY] = source[srcX][srcY];
			}
		}
		return tgtImage;
	}

	/** Merge the red,blue,green components from two images */
	public static int[][] merge(int[][] sourceA, int[][] sourceB) {
		// The output should be the same size as the input. Scale (x,y) values
		// when reading the background
		// (e.g. so the far right pixel of the source is merged with the
		// far-right pixel of the background).
		//sourceA , sourceB(background)
		sourceB = resize(sourceB, sourceA.length, sourceA[0].length);
		int [][] newImage = new int [sourceA.length][sourceA[0].length];
		for (int srcX = 0; srcX < sourceA.length; srcX++){
			for (int srcY = 0; srcY < sourceA[0].length; srcY++ ){
				int srcRed = RGBUtilities.toRed(sourceA[srcX][srcY]);
				int srcGreen = RGBUtilities.toGreen(sourceA[srcX][srcY]);
				int srcBlue = RGBUtilities.toBlue(sourceA[srcX][srcY]);
				
				int backRed = RGBUtilities.toRed(sourceB[srcX][srcY]);
				int backGreen = RGBUtilities.toGreen(sourceB[srcX][srcY]);
				int backBlue = RGBUtilities.toBlue(sourceB[srcX][srcY]);
				newImage [srcX][srcY] = RGBUtilities.toRGB((srcRed+backRed)/2, (srcGreen+backGreen)/2, (srcBlue+backBlue)/2);
			}	
		}
				
				
		
		return newImage;
	}

	/**
	 * Replace the green areas of the foreground image with parts of the back
	 * image
	 */
	public static int[][] chromaKey(int[][] foreImage, int[][] backImage) {
			backImage = resize(backImage, foreImage.length, foreImage[0].length);
			int [][] newImage = new int [foreImage.length][foreImage[0].length];
			for (int foreX = 0; foreX < foreImage.length; foreX++){
				for (int foreY = 0; foreY < foreImage[0].length; foreY++ ){
					int foreRed = RGBUtilities.toRed(foreImage[foreX][foreY]);
					int foreGreen = RGBUtilities.toGreen(foreImage[foreX][foreY]);
					int foreBlue = RGBUtilities.toBlue(foreImage[foreX][foreY]);
					if (foreGreen > foreRed && foreGreen > foreBlue){
						newImage[foreX][foreY] = backImage[foreX][foreY];
					}
					else
					{
						newImage[foreX][foreY] = foreImage[foreX][foreY];
					}	
				}
			}
		// If the image has a different size than the background use the
		// resize() method
		// create an image the same as the background size.
			
		// using foreImage 
		return newImage;
	}

	/** Removes "redeye" caused by a camera flash. sourceB is not used */
	public static int[][] redeye(int[][] source, int[][] sourceB) {

		int width = source.length, height = source[0].length;
		int[][] result = new int[width][height];
		for (int i = 0; i < width; i++)
			for (int j = 0; j < height; j++) {
				int rgb = source[i][j];
				int red = RGBUtilities.toRed(rgb);
				int green = RGBUtilities.toGreen(rgb);
				int blue = RGBUtilities.toBlue(rgb);
				if (red > 4 * Math.max(green, blue) && red > 64)
					red = green = blue = 0;
				result[i][j] = RGBUtilities.toRGB(red, green, blue);
			}

		return result;
	}

	/* Upto you! do something fun to the image */
	public static int[][] funky(int[][] source, int[][] sourceB) {
		// You need to invent your own image effect
		// Minimum boring requirements to pass autograder:
		
		// Does not ask for any user input and returns a new 2D array
		// Todo: remove this return null
		int width = source.length, height = source[0].length;
		int[][] result = new int[width][height];
		for (int i = 0; i < width; i++)
			for (int j = 0; j < height; j++) {
				int rgb = source[i][j];
				int red = RGBUtilities.toRed(rgb);
				int green = RGBUtilities.toGreen(rgb);
				int blue = RGBUtilities.toBlue(rgb);
				if (green > 25 || blue < 100)
					green = 255;
					blue = 255;
				result[i][j] = RGBUtilities.toRGB(red, green, blue);
			}

		return result;
	}
}
