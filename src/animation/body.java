package animation;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class body extends JPanel{
	private int x = 0;
	private int y = 100;
	private int height = 10;
	private int width = 10;
	private int speed = 10;
	
	public body(int a, int b){
		Timer tm = new Timer(10, new TimerListener());
		tm.start();
		x = a; y = b;
	}
	private class TimerListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			repaint();
			update();
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(new Color(192,192,192));
		g.fillRect(x, y, width, height);
		
	}
	
	public void update(){
		x += speed;
		if(x==390 || x==0){
			speed *= -1;
		}
	}
}
