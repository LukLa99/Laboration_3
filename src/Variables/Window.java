package Variables;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Window extends JFrame {
			public Window() {
				
				JFrame frame = new JFrame("Välkommen till Ritprogrammet! :)");
				MyPanel panel = new MyPanel();
				JButton Rensa = new JButton("Rensa");
				MyBottomRow BottomPanel = new MyBottomRow();
				MyButton ButtonPanel = new MyButton();
				frame.add(panel,BorderLayout.CENTER);
				ButtonPanel.setBackground(Color.black);
				frame.add(ButtonPanel,BorderLayout.LINE_END);
				frame.add(BottomPanel, BorderLayout.SOUTH);
				panel.addMouseListener(new MyListener(panel,ButtonPanel,BottomPanel));
				frame.setResizable(true);
				frame.setSize(1500, 800);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				BottomPanel.add(Rensa);
				Rensa.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						panel.reset();
					}				
			});

		}
}

		
		
		
