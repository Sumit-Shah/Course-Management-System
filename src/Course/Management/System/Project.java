package Course.Management.System;

import java.awt.Color;
import java.awt.Image;
import javax.swing.*;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Project extends JFrame{
	
	Project() {
		setSize(1540, 850);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
    	Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);    	
    	ImageIcon i3 = new ImageIcon(i2);
    	JLabel image = new JLabel(i3);
    	add(image);
    	 
    	
    	//New Informations.
    	JMenuBar mb = new JMenuBar();
    	JMenu newInformation = new JMenu("New Information");
    	newInformation.setForeground(Color.BLUE);
    	mb.add(newInformation);
    	
    	
    	JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
    	facultyInfo.setBackground(Color.WHITE);
    	newInformation.add(facultyInfo);
    	
    	JMenuItem studentInfo = new JMenuItem("New Student Information");
    	studentInfo.setBackground(Color.WHITE);
    	newInformation.add(studentInfo);
    	
    	
    	//Details
    	JMenu details = new JMenu("View Details");
    	details.setForeground(Color.RED);
    	mb.add(details);
    	
    	
    	JMenuItem facultydetails = new JMenuItem("New Faculty Details");
    	facultyInfo.setBackground(Color.WHITE);
    	details.add(facultydetails);
    	
    	JMenuItem studentdetails = new JMenuItem("New Student Details");
    	studentInfo.setBackground(Color.WHITE);
    	details.add(studentdetails);
    	
    	
    	
    	setJMenuBar(mb);
    	setVisible(true);
	}
	
	public static void main(String[] args) {
		new Project();
	}

}