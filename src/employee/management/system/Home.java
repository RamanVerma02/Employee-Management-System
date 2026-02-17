package employee.management.system;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Home extends JFrame implements ActionListener{
	
	JButton add,view,update,remove;
	
	public Home(){
		
		setLayout(null);
		
		// Image set up with 
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,0,1120,630);
		add(image); 
		
		
		// Heading Set up
		JLabel heading = new JLabel("Employee Management System");
		heading.setBounds(650,20,400,40);
		heading.setFont(new Font("Tahuma", Font.BOLD, 25));
		image.add(heading);
		
		// 4-Buttons 
		add = new JButton("Add Employees");
		add.setBounds(650, 80, 150,50);
		add.addActionListener(this);
		image.add(add);
		
		view = new JButton("View");
		view.setBounds(850, 80, 150,50);
		view.addActionListener(this);
		image.add(view);
		
		
		update = new JButton("Update");
		update.setBounds(650, 170, 150,50);
		update.addActionListener(this);
		image.add(update);
		
		remove = new JButton("Remove");
		remove.setBounds(850, 170, 150,50);
		remove.addActionListener(this);
		image.add(remove);
		
		
		setSize(1120,630);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == add)
		{
			setVisible(false);
			new AddEmployee();
		} 
		else if (ae.getSource() == view) 
		{
			setVisible(false);
			new ViewEmployee();
			
		} 
		else if(ae.getSource() == update) 
		{
			setVisible(false);
			new ViewEmployee();
			
		} 
		else {
			setVisible(false);
			new RemoveEmployee();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		new Home();
	}


}
