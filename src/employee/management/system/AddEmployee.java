package employee.management.system;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import com.toedter.calendar.JDateChooser;
// For Random number --> package
import java.util.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
                             

public class AddEmployee extends JFrame implements ActionListener{

	Random ran = new Random();
	int number = ran.nextInt(999999);
	
	JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail,tfsalary,tfdesignation;
	JDateChooser dcdob;
	JComboBox cbeducation;
	JLabel lblempId;
	JButton add,back;
	
	public AddEmployee() {
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading = new JLabel("Add Employee Detail");
		heading.setBounds(300, 30, 500, 50);
		heading.setFont(new Font("SAN SERIF", Font.BOLD,25)); 
 		add(heading);
 		
 		// Name text
 		JLabel labelname = new JLabel("Name");
 		labelname.setBounds(50,150,  150, 30);
 		labelname.setFont(new Font("serif", Font.PLAIN,20));
 		add(labelname);
 		// Name Box
 		tfname = new JTextField();
 		tfname.setBounds(200, 150, 150, 30);
 		add(tfname);
 		
 		
 		// father Name text
 		JLabel labelfname = new JLabel("Father's Name");
 		labelfname.setBounds(400,150,  150, 30);
 		labelfname.setFont(new Font("serif", Font.PLAIN,20));
 		add(labelfname);
 		// father Name Box
 		tffname = new JTextField();
 		tffname.setBounds(600, 150, 150, 30);
 		add(tffname);
 		
 		
 		// DOB Text 
 		JLabel labeldob = new JLabel("Date Of Birth");
 		labeldob.setBounds(50, 200, 150, 30);
 		labeldob.setFont(new Font("serif", Font.PLAIN,20));
 		add(labeldob);
 		// DOB BOX
 		dcdob = new JDateChooser();
 		dcdob.setBounds(200,200,150,30);
 		dcdob.setBackground(Color.YELLOW);
 		add(dcdob);
 		
 		
 		// salary
 		JLabel labelsalary = new JLabel("Salary");
 		labelsalary.setBounds(400,200,  150, 30);
 		labelsalary.setFont(new Font("serif", Font.PLAIN,20));
 		add(labelsalary);
 		// Salary Box
 		tfsalary = new JTextField();
 		tfsalary.setBounds(600, 200, 150, 30);
 		add(tfsalary);

 		
 		// Address Text
 		JLabel labeladdress = new JLabel("Address");
 		labeladdress.setBounds(50,250,  150, 30);
 		labeladdress.setFont(new Font("serif", Font.PLAIN,20));
 		add(labeladdress);
 		// Address Box
 		tfaddress = new JTextField();
 		tfaddress.setBounds(200, 250, 150, 30);
 		add(tfaddress);
 		
 		// Phone text
 		JLabel labelphone = new JLabel("Phone");
 		labelphone.setBounds(400,250,  150, 30);
 		labelphone.setFont(new Font("serif", Font.PLAIN,20));
 		add(labelphone);
 		// Phone Box
 		tfphone = new JTextField();
 		tfphone.setBounds(600, 250, 150, 30);
 		add(tfphone);
 		
 		// Email Text
 		JLabel labelemail = new JLabel("Email");
 		labelemail.setBounds(50,300,  150, 30);
 		labelemail.setFont(new Font("serif", Font.PLAIN,20));
 		add(labelemail);
 		// Email Box
 		tfemail = new JTextField();
 		tfemail.setBounds(200, 300, 150, 30);
 		add(tfemail);
 		
 		// Education text
 		JLabel labeleducation = new JLabel("Education");
 		labeleducation.setBounds(400,300,  150, 30);
 		labeleducation.setFont(new Font("serif", Font.PLAIN,20));
 		add(labeleducation);
 		// Education Box
 		String courses[] = {
 				"Select",
 				"BBA",
 			    "BCA",
 			    "BA",
 			    "BSC",
 			    "B.COM",
 			    "BTech",
 			    "MBA",
 			    "MCA",
 			    "MA",
 			    "MTech",
 			    "MSC"
 		};
 		cbeducation = new JComboBox(courses);
 		cbeducation.setBounds(600, 300, 150, 30);
 		cbeducation.setBackground(Color.WHITE);
 		add(cbeducation);
 		
 		
 		// Designation Text
 		JLabel labeldesignation = new JLabel("Designation");
 		labeldesignation.setBounds(50,350,  150, 30);
 		labeldesignation.setFont(new Font("serif", Font.PLAIN,20));
 		add(labeldesignation);
 		// Designation Box
 		tfdesignation = new JTextField();
 		tfdesignation.setBounds(200, 350, 150, 30);
 		add(tfdesignation);
 		
 		// Aadhar text
 		JLabel labelaadhar = new JLabel("Aadhar Number");
 		labelaadhar.setBounds(400,350,  150, 30);
 		labelaadhar.setFont(new Font("serif", Font.PLAIN,20));
 		add(labelaadhar);
 		// Aadhar Box
 		tfaadhar = new JTextField();
 		tfaadhar.setBounds(600, 350, 150, 30);
 		add(tfaadhar);
 		
 		// EmpId text
 		JLabel labelempId = new JLabel("Employee Id");
 		labelempId.setBounds(50,400,  150, 30);
 		labelempId.setFont(new Font("serif", Font.PLAIN,20));
 		add(labelempId);
 		// Emp Random number
 		lblempId = new JLabel(""+ number);
 		lblempId.setBounds(200,400,  150, 30);
 		lblempId.setFont(new Font("serif", Font.PLAIN,20));
 		add(lblempId);
 		
 		// 2 Buttons
 		add = new JButton("Add Details");
		add.setBounds(250, 550, 150,50);
		add.setBackground(Color.BLACK);
		add.setForeground(Color.WHITE);
		add.addActionListener(this);
		add(add);
		
		back = new JButton("Back");
		back.setBounds(450, 550, 150,50);
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
 		
		setSize(900,700);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == add) {
			String name = tfname.getText();
			String fname = tffname.getText();
			String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
			String salary =	tfsalary.getText();	
			String address = tfaddress.getText();
			String phone = tfphone.getText();
			String email = tfemail.getText();
			String education = (String) cbeducation.getSelectedItem();  // but ye obj ko return karta h toh isiliye type cast kiya
			String designation = tfdesignation.getText();
			String aadhar = tfaadhar.getText();
			String empId = lblempId.getText();
			
			try {
				Conn conn = new Conn();
				String query = "insert into empployee value('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+aadhar+"', '"+empId+"' )";
				conn.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Details added successfully");
				setVisible(false);
				new Home();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} else {
			setVisible(false);
			new Home();
		}
	}
	
	public static void main(String[] args) {
		new AddEmployee();
		
	}

}
