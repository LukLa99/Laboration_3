package Variables;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class MyButton extends JPanel {

	
	
	
	private int drawingShape;
	public Color drawingColours;
	public MyButton() {
				
		final ArrayList<JButton>buttons = new ArrayList<JButton>();

			this.setLayout(null);
		this.setLayout(new GridLayout(8,1));
		this.setBounds(20,20, 20, 30);
		
		final JButton red = new JButton("Red");
		final JButton blue = new JButton("blue");
		final JButton green = new JButton("green");
		final JButton black = new JButton("black");
		final JButton yellow = new JButton("yellow");
		final JButton gray = new JButton("gray");
		final JButton orange = new JButton("orange");
		final JButton pink = new JButton("pink");

		red.setBackground(Color.red);
		blue.setBackground(Color.blue);
		green.setBackground(Color.green);
		orange.setBackground(Color.orange);
		gray.setBackground(Color.gray);
		black.setBackground(Color.black);
		pink.setBackground(Color.pink);
		yellow.setBackground(Color.yellow);
		this.add(blue);
		this.add(red);
		this.add(black);
		this.add(green);
		this.add(orange);
		this.add(gray);
		this.add(pink);
		this.add(yellow);
	
	


		
			red.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					setDrawingColours(Color.red);
				}
			});
			blue.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					setDrawingColours(Color.blue);
				}
			});
			yellow.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					setDrawingColours(Color.yellow);
				}
			});
			gray.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					setDrawingColours(Color.gray);
				}
			});
			green.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					setDrawingColours(Color.green);
			}		});
		black.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("DU har valt Svart");
				setDrawingColours(Color.black);
			}
		});
		pink.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setDrawingColours(Color.pink);
			}
		});
		orange.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Orange");
				setDrawingColours(Color.orange);
			}
			
		});
		}

		
	public void PaintBorder() {
	this.setBorder(new LineBorder(Color.CYAN));
		

	}
				
	public void UnpaintBorder() {
		this.setBorder(new LineBorder(Color.white));
		
		
		
		
	}
	
	
	
	
	
		
	public  Color getDrawingColours() {
		return this.drawingColours;
	}

	public void  setDrawingColours(Color drawingColours) {
		this.drawingColours = drawingColours;
	}


	}

		
	


