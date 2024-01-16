package Course.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
	JButton login, cancel;
	Login () {
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		//USER NAME : 
		JLabel lblusername = new JLabel(" USER NAME ");
		lblusername.setBounds(40, 20, 100, 20);
		add(lblusername);
		
		JTextField tfusername = new JTextField();
		tfusername.setBounds(150, 20, 150, 20);
		add(tfusername);
		
		
		//PASSWORD :
		JLabel lblpassword = new JLabel(" PASSWORD ");
		lblpassword.setBounds(40, 70, 100, 20);
		add(lblpassword);
		
		JPasswordField tfpassword = new JPasswordField();
		tfpassword.setBounds(150, 70, 150, 20);
		add(tfpassword);
		
		
		//Button: 
		login = new JButton("Login");
		login.setBounds(40, 140, 120, 30);
		login.setBackground(Color.BLACK);
		login.setBackground(Color.WHITE);
		login.addActionListener(this);
		login.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(login);
		
		cancel = new JButton("Cancel");
		cancel.setBounds(180, 140, 120, 30);
		cancel.setBackground(Color.BLACK);
		cancel.setBackground(Color.WHITE);
		cancel.addActionListener(this);
		cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(cancel);
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
    	Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);    	
    	ImageIcon i3 = new ImageIcon(i2);
    	JLabel image = new JLabel(i3);
    	image.setBounds(350, 0, 200, 200);
    	add(image);
		
		
		
		
		setSize(600, 300);
		setLocation(500, 250);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == login) {
			
		} else if (ae.getSource() == cancel) {
			setVisible(false);
			
		}
	}
	public static void main(String[] args) {
		new Login();
		
	}
	
}