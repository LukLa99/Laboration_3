package Shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math;

public class Triangle extends Shape {
	private Color color;
	private double x1,x2,x3;
	private double y1,y2,y3;
	private int a,b,c,d,e,f;
	
	
	public Triangle (int x, int y, int size,Color color,int width, int height) {
		super(x, y, size, width, height);
		this.color = color;
		y1 = getY() + 0.57 * width;
		a = (int)y1;
		y2 = getY() + 0.57 * width;
		b = (int)y2;
		y3 = getY() -  width; //1,14
		c = (int)y3;
		x1 = getX() - width;
		d = (int)x1;
		x2 = getX() + width;
		e = (int)x2;
		x3 = getX();
		f = (int)x3;
	
}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillPolygon(new int[]	{d,e,f}, new int[] {a,b,c}, 3);
	}
}
