package employee.management.system;

import java.awt.Color;

import java.awt.Font;

import javax.swing.*;

import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
                             

public class UpdateEmployee extends JFrame implements ActionListener{


	JTextField tfeducation, tffname, tfaddress, tfphone, tfaadhar, tfemail,tfsalary,tfdesignation;
 	JLabel lblempId;
	JButton update,back;
	String empId;
	
	public UpdateEmployee(String empId) {
		this.empId = empId;
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading = new JLabel("Update Employee Detail");
		heading.setBounds(300, 30, 500, 50);
		heading.setFont(new Font("SAN SERIF", Font.BOLD,25)); 
 		add(heading);
 		
 		// Name text
 		JLabel labelname = new JLabel("Name");
 		labelname.setBounds(50,150,  150, 30);
 		labelname.setFont(new Font("serif", Font.PLAIN,20));
 		add(labelname);
 		// Name Box
 		JLabel lblname = new JLabel();
 		lblname.setBounds(200, 150, 150, 30);
 		add(lblname);
 		
 		
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
 		JLabel lbldob = new JLabel();
 		lbldob.setBounds(200,200,150,30);
 		lbldob.setBackground(Color.YELLOW);
 		add(lbldob);
 		
 		
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
 		labeleducation.setBounds(400, 300, 150, 30);
 		labeleducation.setFont(new Font("serif", Font.PLAIN,20));
 		add(labeleducation);
 		// Education Box
 		
 		tfeducation = new JTextField();
 		tfeducation.setBounds(600, 300, 150, 30);
 		add(tfeducation);
 		
 		
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
 		JLabel lblaadhar = new JLabel();
 		lblaadhar.setBounds(600, 350, 150, 30);
 		add(lblaadhar);
 		
 		// EmpId text
 		JLabel labelempId = new JLabel("Employee Id");
 		labelempId.setBounds(50,400,  150, 30);
 		labelempId.setFont(new Font("serif", Font.PLAIN,20));
 		add(labelempId);
 		// Emp Random number
 		lblempId = new JLabel();
 		lblempId.setBounds(200,400,  150, 30);
 		lblempId.setFont(new Font("serif", Font.PLAIN,20));
 		add(lblempId);
 		
 		try {
 			Conn c = new Conn();
 			String query = "select * from empployee where empId = '"+empId+"' ";
 			ResultSet rs = c.s.executeQuery(query);
 			while(rs.next()) {
 				lblname.setText(rs.getString("name"));
 				tffname.setText(rs.getString("fname"));
 				lbldob.setText(rs.getString("dob"));
 				tfaddress.setText(rs.getString("address"));
 				tfsalary.setText(rs.getString("salary"));
 				tfphone.setText(rs.getString("phone"));
 				tfemail.setText(rs.getString("email"));
 				tfeducation.setText(rs.getString("education"));
 				lblaadhar.setText(rs.getString("aadhar"));
 				lblempId.setText(rs.getString("empId"));
 				tfdesignation.setText(rs.getString("designation"));
 				
 			}
 			
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 		
 		// 2 Buttons
 		update = new JButton("Update Details");
 		update.setBounds(250, 550, 150,50);
 		update.setBackground(Color.BLACK);
 		update.setForeground(Color.WHITE);
 		update.addActionListener(this);
		add(update);
		
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
		if(ae.getSource() == update) {
			String fname = tffname.getText();
			String salary =	tfsalary.getText();	
			String address = tfaddress.getText();
			String phone = tfphone.getText();
			String email = tfemail.getText();
			String education = tfeducation.getText();
			String designation = tfdesignation.getText();
			
			try {
				Conn conn = new Conn();
				String query = "update empployee set fname = '"+fname+"', salary = '"+salary+"', address = '"+address+"', phone = '"+phone+"', email = '"+email+"', education = '"+education+"', designation = '"+designation+"' where empId = '"+empId+"' ";
				conn.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Details updated successfully");
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
		new UpdateEmployee("");
		
	}

}
