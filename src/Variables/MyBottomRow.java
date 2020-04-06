package Variables;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MyBottomRow extends JPanel {
	private int drawingShape;
	public MyBottomRow() {
	this.setLayout(new FlowLayout());
	JButton Fyrkant = new JButton("Fyrkant");
	JButton Cirkel = new JButton("Cirkel");
	JButton Trekant = new JButton("Trekant");
	this.add(Fyrkant);
	this.add(Cirkel);
	this.add(Trekant);
	this.setBackground(Color.gray);
	
	
	Cirkel.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			setDrawingShape(0);
		}
	});

	Fyrkant.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			setDrawingShape(1);
		}
	});

	Trekant.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			setDrawingShape(2);
		}
	});
	
}
	public int getDrawingShape() {
		return drawingShape;
	}
	public void setDrawingShape(int drawingShape) {
		this.drawingShape = drawingShape;
	}
}
	
	
	