package model;

import java.awt.image.BufferedImage;

import view.Animation;
import view.Sprite;

public class RatSprite 
{
	private BufferedImage[] walkingLeft = {Sprite.getSprite(0, 1), Sprite.getSprite(0, 2)}; // Gets the upper left images of my sprite sheet
	private BufferedImage[] walkingRight = {Sprite.getSprite(0, 2), Sprite.getSprite(0, 3)};
	private BufferedImage[] standing = {Sprite.getSprite(1, 0), Sprite.getSprite(1, 1)};

	
	private Animation walkLeft = new Animation(walkingLeft, 10);
	private Animation walkRight = new Animation(walkingRight, 10);
	private Animation stand = new Animation(standing, 10);
	
	private Animation animation = stand;
}
