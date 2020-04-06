package Shapes;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	private int x;
	private int y;
	private int size;
	private int width;
	private int height;
	private Color colour;
	
	
	public Shape(int x, int y, int size,int width, int height) {
		this.setY(y);
		this.setX(x);
		this.setSize(size);
		this.setHeight(height);
		this.setWidth(width);
		this.colour = null;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	public abstract void draw(Graphics g);

public void setColour(Color drawingColours) {
	this.colour = drawingColours;
	
	}
		
	
	
	
}
