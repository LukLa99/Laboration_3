package Variables;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Shapes.Circle;
import Shapes.Square;
import Shapes.Triangle;
public class MyListener extends MouseAdapter {

	private MyPanel panel;
	private MyButton panel2;
	private MyBottomRow panel3;

	
	public MyListener(MyPanel Lmao, MyButton lmao,MyBottomRow lamo) {
		super();
		this.panel = Lmao;
		this.panel2 = lmao;
		this.panel3 = lamo;

	}

	public void mouseClicked(MouseEvent e) {
		switch (panel3.getDrawingShape()) {
		case 0:
			panel.AddShape(new Circle(e.getX() - 12, e.getY() - 12, 30, panel2.getDrawingColours()));
			break;
		case 1:
			panel.AddShape(new Square(e.getX() - 12, e.getY() - 12, 30, panel2.getDrawingColours()));
			break;
		case 2:  
			panel.AddShape(new Triangle(e.getX() - 12, e.getY() - 12, 25, panel2.getDrawingColours(), 20, 10));
	
		default:
			
			break;
		}
		
		System.out.println("Koordinat " + e.getX() + "," + e.getY());
		
	}

}
