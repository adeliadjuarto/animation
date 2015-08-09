package animation;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class main{
	
	public static void main(String args[]){
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 400);
		
		body b = new body(0,100);
		body c = new body(0,50);
		f.add(b);
		f.add(c);
		f.setVisible(true);
	}
	
	
}
