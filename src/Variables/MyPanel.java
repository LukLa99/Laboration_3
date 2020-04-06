package Variables;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import javax.swing.*;
import Shapes.Circle;
import Shapes.Shape;

public class MyPanel extends JPanel {
	private List<Shape> shapes = new LinkedList<>();
	private int drawingShape;
	public Color drawingColours;

	public void AddShape(Shape shape) {
		shape.setColour(drawingColours);
		shapes.add(shape);
		this.repaint();

		
		
		
		
		
	}
	
	

	public void setDrawingColours(Color drawingColours) {
		this.drawingColours = drawingColours;
	}



	public int getDrawingShape() {
		return drawingShape;
	}

	public void setDrawingShape(int drawingShape) {

		this.drawingShape = drawingShape;
	}

	public void paint(Graphics g) {
		super.paint(g);
		for (Shape c : shapes) {
			c.draw(g);

		}
	}

	public void reset() {
		shapes.clear();
		repaint();

	}

}

