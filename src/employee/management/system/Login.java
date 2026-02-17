package employee.management.system;

import java.sql.*;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Login extends JFrame implements ActionListener{
	
	JTextField tfusername, tfpassword;
	
	Login(){
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		// Username written
		JLabel lblusername = new JLabel("Username");
		lblusername.setBounds(40,20,100,30);
		add(lblusername); 
		
		// Username TextBox
		tfusername = new JTextField();
		tfusername.setBounds(150, 20,150,30);
		add(tfusername);
		
		// Password written
		JLabel lblpassword = new JLabel("Pasword");
		lblpassword.setBounds(40, 70, 100,30);
		add(lblpassword);
		
		// Password TextBox
		tfpassword = new JTextField();
		tfpassword.setBounds(150,70,150,30);
		add(tfpassword);
		
		// Button setting up
		JButton loginbutton = new JButton("Login");
		loginbutton.setBounds(150, 140, 150, 30);
		loginbutton.setBackground(Color.black); 
		loginbutton.setForeground(Color.WHITE);
		loginbutton.addActionListener(this);
		add(loginbutton);
		
		// Image set up with 
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
		Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(350,0,200,200);
		add(image); 
		
		
		setSize(600, 300);
		setLocation(400, 200);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String username = tfusername.getText();
			String password = tfpassword.getText();
			
			Conn conn = new Conn();
			String query = "select * from login where username = '"+username+"' and password = '"+password+"' ";
			
			ResultSet rs =conn.s.executeQuery(query);
			
			if (rs.next()) {
				setVisible(false);
//				JOptionPane.showMessageDialog(null,
//				        "Login Successful!",
//				        "Success",
//				        JOptionPane.INFORMATION_MESSAGE);

				// next class
				new Home();
			} else {
				JOptionPane.showMessageDialog(null, "Invalid username or password");
				setVisible(false);
			}
			
		} catch (Exception ea) {
			ea.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Login();
		
	}


}
