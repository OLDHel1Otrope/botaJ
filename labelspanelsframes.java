package package1;
//import java.io.File;
//import javax.sound.sampled.*;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class A {
	
	public static void main(String []args){
		
		ImageIcon image=new ImageIcon("simpleicon.png");
		
		JLabel label=new JLabel();
		label.setText("hiiii");
		label.setIcon(image);
		label.setBounds(0,0,75,75);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.LEFT);
		
		JPanel redpanel=new JPanel();
		redpanel.setBackground(Color.red);
		redpanel.setBounds(0,0,250,250);
		//redpanel.setLayout(new BorderLayout());
		

		
		
		JPanel bluepanel=new JPanel();
		bluepanel.setBackground(Color.blue);
		bluepanel.setBounds(250,0,250,250);
		//bluepanel.setLayout(new BorderLayout());
		bluepanel.add(label);
		
		
		JPanel greenpanel=new JPanel();
		greenpanel.setBackground(Color.green);
		greenpanel.setBounds(0,250,500,250);
		//greenpanel.setLayout(new BorderLayout());	
		greenpanel.add(label);
		
		JFrame frame= new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1366,1024);
		frame.setVisible(true);	
		frame.setLayout(null);
		//frame.pack();    //this has to come after the frame add
		frame.add(redpanel);
		frame.add(bluepanel);
		frame.add(greenpanel);
		
	}
}
