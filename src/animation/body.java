package animation;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class body extends JPanel{
	int numOfObject;
	int MAX = 50;
	
	private int[] x;
	private int[] y;
	private int height = 10;
	private int width = 10;
	private int speed[];
	
	
	public body(){
		x = new int[MAX];
		y = new int[MAX];
		speed = new int[MAX];
		numOfObject = 0;
		Timer tm = new Timer(10, new TimerListener());
		tm.start();
	}
	private class TimerListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			repaint();
			update();
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(int i=0; i<numOfObject; i++){
		g.setColor(new Color(192,192,192));
		g.fillRect(x[i], y[i], width, height);
		}
		
	}
	
	public void update(){
		for (int i=0; i<numOfObject; i++){
		x[i] += speed[i];
		if(x[i]==390 || x[i]==0){
			speed[i] *= -1;
		}
	}
	}
	
	public void addObject(int x, int y){
		this.x[numOfObject] = x;
		this.y[numOfObject] = y;
		speed[numOfObject] = 10;
		numOfObject++;
	}
}
