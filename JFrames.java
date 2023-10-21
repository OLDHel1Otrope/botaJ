package package1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class A {
	
	public static void main(String []args){
		
	
		ImageIcon image=new ImageIcon("F6yU5qwWsAAhTON.jpg");
		Border border=BorderFactory.createLineBorder(Color.black);
		
		JLabel label=new JLabel();
		label.setText("this is a sample text, and a sample image");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text to the left center and right of the image
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("ubuntu",Font.ITALIC,20));
		label.setIconTextGap(0);
		label.setBackground(new Color(0,0,0));
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBounds(0,0,1366,768);				//set x and y positions for the frame as well as the size of the label
		
		
		JFrame frame= new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(1366,1024);
		frame.setVisible(true);	
		frame.add(label);
		//frame.setLayout(null);
		frame.pack();    //this has to come after the frame add
	}
}
