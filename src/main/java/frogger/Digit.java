package frogger;

import javafx.scene.image.Image;

/**Displays the score during the game*/
public class Digit extends Actor{

	/**image that shows the score*/
	private Image imageScore;

	/**Constant size for imageScore*/
	private final static int sizeImageScore = 30;

	/**Empty method inherited from abstract class Actor
	 * @param now time
	 */
	@Override
	public void act(long now) { }

	/**
	 * Constructor for class Digit
	 * @param n the number of the digit
	 * @param xpos x-coordinate for the placing of Digit
	 * @param ypos y-coordinate for the placing of Digit
	 */
	public Digit(int n, int xpos, int ypos) {
		imageScore = new Image("file:src/main/resources/pictures/digit/"+n+".png", sizeImageScore, sizeImageScore, true, true);
		setImage(imageScore);
		setX(xpos);
		setY(ypos);
	}
	
}
