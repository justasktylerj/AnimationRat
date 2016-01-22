package controller;

import java.awt.image.BufferedImage;
import view.Sprite;
import view.Animation;
import java.awt.*;
import javax.swing.*;
import model.RatSprite;


public class Controller extends JPanel
{
	private BufferedImage[] walkingLeft = {Sprite.getSprite(0, 1), Sprite.getSprite(0, 2)}; // Gets the upper left images of my sprite sheet
	private BufferedImage[] walkingRight = {Sprite.getSprite(0, 2), Sprite.getSprite(0, 3)};
	private BufferedImage[] standing = {Sprite.getSprite(1, 0), Sprite.getSprite(1, 1)};
	
	private Animation walkLeft = new Animation(walkingLeft, 10);
	private Animation walkRight = new Animation(walkingRight, 10);
	private Animation stand = new Animation(standing, 10);
	
	private Animation animation = stand;
	
	public void paint(Graphics g) 
		{
		    Image img = createImage();
		    
		    g.drawImage(animation.getSprite(), 20, 20, this);
		}

		public static void main(String[] args) 
		 {
		    JFrame frame = new JFrame();
		    frame.getContentPane().add(new Controller());

		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setSize(200, 200);
		    frame.setVisible(true);
		  }
		  
		 private Image createImage()
		  {
		    BufferedImage bufferedImage = new BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
		    Graphics g = bufferedImage.getGraphics();
		    g.drawString("rat.png", 20,20);
		    
		    return bufferedImage;
		  }
}
