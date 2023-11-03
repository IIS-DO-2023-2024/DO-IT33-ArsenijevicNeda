package mvc;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class DrawingFrame extends JFrame {
	
	DrawingView view=new DrawingView();
	 public DrawingFrame() {
	 	
	 	JPanel panel = new JPanel();
	 	getContentPane().add(view, BorderLayout.CENTER);
		 
	 }
	 
	 public DrawingView getView()
	 {
		 return this.view;
	 }
}
