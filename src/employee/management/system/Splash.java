package employee.management.system;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 

public class Splash extends JFrame implements ActionListener{
	
	Splash() {
		// panel color
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		// Heading + BG color + font + ratio
		JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		heading.setBounds(80,30,1200,60);
		heading.setFont(new Font("serif", Font.PLAIN, 60));
		heading.setForeground(Color.DARK_GRAY);
		add(heading);
		
		// Image set up with 
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(50,100,1050,500);
		add(image); 
		
		// Button setting up
		JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
		clickhere.setBounds(360, 400, 300, 70);
		clickhere.setBackground(Color.black); 
		clickhere.setForeground(Color.WHITE);
		clickhere.addActionListener(this);
		image.add(clickhere);
		
		// Panel ratio
		setSize(1170, 650);
		setLocationRelativeTo(null);
		setVisible(true);
		
		// dim and show setting of heading
		while(true) {
			heading.setVisible(false);
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
			
			heading.setVisible(true);
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new Login();
	}
	
	
	public static void main(String[] args) {
		new Splash();
		
	}


}
