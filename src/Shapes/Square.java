package Shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape {
	private Color color;

	public Square(int x, int y, int size, Color color) {
		super(x, y, size, 0, 0);
		this.color = color;

	}

	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(this.getX(), this.getY(), this.getSize(), this.getSize());
	}
}
