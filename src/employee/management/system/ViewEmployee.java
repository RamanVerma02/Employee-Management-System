package employee.management.system;

import net.proteanit.sql.DbUtils;

import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class ViewEmployee extends JFrame implements ActionListener{

	JTable table;
	Choice employeId;
	JButton search, update, print, back;
	
	public ViewEmployee() {
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		JLabel searchlbl = new JLabel("Search by Employee Id");
		searchlbl.setBounds(20, 20, 150, 20);
		add(searchlbl);
		
		employeId = new Choice();
		employeId.setBounds(180, 20, 150, 20);
		add(employeId);
		
		
		table = new JTable();
		
		try {
			Conn c = new Conn();
			ResultSet rs = c.s.executeQuery("select * from empployee"); // DDL Command
			
			while(rs.next()) {
				employeId.add(rs.getString("empId"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Conn c = new Conn();
			ResultSet rs = c.s.executeQuery("select * from empployee"); // DDL Command
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		JScrollPane jsPane = new JScrollPane(table);
		jsPane.setBounds(0,100,900, 600);
		add(jsPane);
		
		
		search = new JButton("Search");
		search.setBounds(20, 70, 80, 20);
		search.addActionListener(this);
		add(search);
		
		print = new JButton("Print");
		print.setBounds(120, 70, 80, 20);
		print.addActionListener(this);
		add(print);
		
		update = new JButton("Update");
		update.setBounds(220, 70, 80, 20);
		update.addActionListener(this);
		add(update);
		
		back = new JButton("Back");
		back.setBounds(320, 70, 80, 20);
		back.addActionListener(this);
		add(back);
		
		
		
		setSize(900, 700);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == search) {
			String query = "select * from empployee where empId = '"+employeId.getSelectedItem()+"' ";
			
			try {
				Conn c = new Conn();
				ResultSet rs = c.s.executeQuery(query);
				table.setModel(DbUtils.resultSetToTableModel(rs));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} else if (ae.getSource() == print) {
			try {
				table.print(); 
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} else if(ae.getSource() == update) {
			setVisible(false);
			new UpdateEmployee(employeId.getSelectedItem());
			
		} else {
			setVisible(false);
			new Home();
		}
	}

	public static void main(String[] args) {
		new ViewEmployee();
	}


}
