package Shapes;

import java.awt.Color;
import java.awt.Graphics;


public class Circle extends Shape {

	private Color color;
	
	public Circle (int x, int y, int diameter, Color color) {
		super(x,y, diameter,0,0);
		this.color = color;

	}

	
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(this.getX(), this.getY(), this.getSize(), this.getSize());
		
		
	}


		
	
	
	
	
	
}
