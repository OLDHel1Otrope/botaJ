package package1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Xcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1280,960);
		
		frame.setLayout(new FlowLayout(FlowLayout.LEADING,0,0));
		
		JPanel panel=new JPanel();
		panel.setPreferredSize(new Dimension(100,250));
		panel.setBackground(Color.BLACK);
		panel.setLayout(new FlowLayout());
		//JButton button=new JButton();
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		panel.setVisible(true);
		
		frame.add(panel);
		frame.setVisible(true);
		
	}

}
