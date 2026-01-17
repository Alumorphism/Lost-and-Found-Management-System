package Frame;

import Entity.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FrameManagement extends JFrame implements ActionListener, MouseListener{
	private JPanel panel, foundPanel, lostPanel, adminPanel;
	private JLabel label0, label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13, label14, label15, label16, label17, label18;
	private JTextField tf1, tf2, tf3, tf4, tf5, tf6;
	private JPasswordField pf1;
	private JComboBox jb1, jb2, jb3, jb4, jb5;
	private JRadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rbAdmin;
	private ButtonGroup bg1, bg2, bg3;
	private JButton bt1, bt2, bt3, bt4, btAdmin, btBack, btBackAdmin, btBackFound, btBackLost, btExit;
	private JTextArea ta;
	
	private Font f1, f2;
	private Color c1;
	
	public FrameManagement(){
		super("Lost & Found Management System");
		
		super.setBounds(600, 200, 800, 800); //(x, y, width, height)
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 800, 800);
		c1 = new Color(211, 211, 211);
		panel.setBackground(c1);
		
		f1 = new Font("Cambria", Font.BOLD, 30);
		label0 = new JLabel("Welcome to");
		label0.setBounds(300, 60, 500, 100); //[pos(x,y) and width/height]
		label0.setFont(f1);
		panel.add(label0);
		
		label1 = new JLabel("Lost & Found Management System");
		label1.setBounds(150, 100, 500, 100); //[pos(x,y) and width/height]
		label1.setFont(f1);
		panel.add(label1);
		
		f2 = new Font("Cambria", Font.BOLD, 20);
		label2 = new JLabel("Your Name "); //NAME
		label2.setBounds(170, 200, 150, 40); //[pos(x,y) and width/height]
		label2.setFont(f2);
		panel.add(label2);
		
		tf1 = new JTextField();
		tf1.setBounds(330, 200, 250, 40);
		tf1.setFont(f2);
		panel.add(tf1);
		
		label3 = new JLabel("ID ");
		label3.setBounds(170, 250, 150, 40); //[pos(x,y) and width/height]
		label3.setFont(f2);
		panel.add(label3);
		
		pf1 = new JPasswordField();
		pf1.setBounds(330, 250, 250, 40); //(x, y, width, height)
		pf1.setFont(f2);
		panel.add(pf1);
		
		
		label4 = new JLabel("University ");
		label4.setBounds(170, 300, 150, 40); //[pos(x,y) and width/height]
		label4.setFont(f2);
		panel.add(label4);
		
		String items[] = new String[] {"", "AIUB", "North South", "IUB", "BRAC", "DIU", "Other..."};
		jb1 = new JComboBox(items);
		jb1.setBounds(330, 300, 250, 40);
		jb1.setFont(f2);
		panel.add(jb1);
		
		label5 = new JLabel("User Type");
		label5.setBounds(170, 350, 150, 40);
		label5.setFont(f2);
		panel.add(label5);
		
		rb1 = new JRadioButton("Faculty ");
		rb1.setBounds(330, 350, 100, 40); //(x, y, width, height)
		rb1.setFont(f2);
		rb1.setBackground(c1);
		panel.add(rb1);
		
		rb2 = new JRadioButton("Staff");
		rb2.setBounds(385, 400, 100, 40); //(x, y, width, height)
		rb2.setFont(f2);
		rb2.setBackground(c1);
		panel.add(rb2);
		
		rb3 = new JRadioButton("Student");
		rb3.setBounds(440, 350, 100, 40); //(x, y, width, height)
		rb3.setFont(f2);
		rb3.setBackground(c1);
		panel.add(rb3);
		
		rb4 = new JRadioButton("Visitor");
		rb4.setBounds(495, 400, 100, 40); //(x, y, width, height)
		rb4.setFont(f2);
		rb4.setBackground(c1);
		panel.add(rb4);
		
		rbAdmin = new JRadioButton("Admin");
		rbAdmin.setBounds(550, 350, 100, 40); //(x, y, width, height)
		rbAdmin.setFont(f2);
		rbAdmin.setBackground(c1);
		panel.add(rbAdmin);
		
		bg1 = new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);
		bg1.add(rb3);
		bg1.add(rb4);
		bg1.add(rbAdmin);
		
		label6 = new JLabel("Contact ");
		label6.setBounds(170, 450, 150, 40);
		label6.setFont(f2);
		panel.add(label6);
		
		tf2 = new JTextField();
		tf2.setBounds(330, 450, 250, 40);
		tf2.setFont(f2);
		panel.add(tf2);
		
		btExit = new JButton("Exit");
		btExit.setBounds(100, 700, 140, 40);
		btExit.setFont(f2);
		panel.add(btExit);
		btExit.addActionListener(this);
		
		btAdmin = new JButton("Admin");
		btAdmin.setBounds(250, 700, 140, 40);
		btAdmin.setFont(f2);
		panel.add(btAdmin);
		btAdmin.addActionListener(this);
		
		bt1 = new JButton("Lost Item");
		bt1.setBounds(400, 700, 140, 40);
		bt1.setFont(f2);
		panel.add(bt1);
		bt1.addActionListener(this);
		
		bt2 = new JButton("Found Item");
		bt2.setBounds(550, 700, 140, 40);
		bt2.setFont(f2);
		panel.add(bt2);
		bt2.addActionListener(this);
		
		
		
		// Panel FOUND
		FoundPanel();
		
		//Panel Lost
		LostPanel();
		
		//ShowChat
		AdminPanel();
		
		super.add(adminPanel);
		super.add(lostPanel);
		super.add(foundPanel);
		super.add(panel);
		
		
		panel.setVisible(true);
        foundPanel.setVisible(false);
		lostPanel.setVisible(false);
		adminPanel.setVisible(false);
		
		
	}
	public void AdminPanel(){ ////YEAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
		adminPanel = new JPanel();
		adminPanel.setLayout(null);
		adminPanel.setBounds(0, 0, 800, 800);
		c1 = new Color(211, 211, 211);
		adminPanel.setBackground(c1);
		ta = new JTextArea();
		JScrollPane scroll = new JScrollPane(ta);
		scroll.setBounds(100, 100, 600, 600); //(x, y, width, height)
		ta.setFont(f2);
		adminPanel.add(scroll);
		showInfo();
		
		btBackAdmin = new JButton("Back");
		btBackAdmin.setBounds(330, 710, 130, 40);
		btBackAdmin.setFont(f2);
		adminPanel.add(btBackAdmin);
		btBackAdmin.addActionListener(this);
		
	}
	
	public void FoundPanel(){ ////YEAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
		foundPanel = new JPanel();
		foundPanel.setLayout(null);
		foundPanel.setBounds(0, 0, 800, 800);
		c1 = new Color(211, 211, 211);
		foundPanel.setBackground(c1);
		
		label7 = new JLabel("Found Item Details");
		label7.setBounds(270, 1, 500, 100); //[pos(x,y) and width/height]
		label7.setFont(f1);
		foundPanel.add(label7);
		
		label8 = new JLabel("Item Name");
		label8.setBounds(120, 100, 150, 40); //[pos(x,y) and width/height]
		label8.setFont(f2);
		foundPanel.add(label8);
		
		tf3 = new JTextField();
		tf3.setBounds(280, 100, 200, 40); //[pos(x,y) and width/height]
		tf3.setFont(f2);
		foundPanel.add(tf3);
		
		label9 = new JLabel("Item Category");
		label9.setBounds(120, 150, 150, 40); //[pos(x,y) and width/height]
		label9.setFont(f2);
		foundPanel.add(label9);
		
		String items1[] = new String[] {"", "Electronics", "Documents", "Keys", "ID", "Money", "Accessories", "Other..."};
		jb2 = new JComboBox(items1);
		jb2.setBounds(280, 150, 200, 40);
		jb2.setFont(f2);
		foundPanel.add(jb2);
		
		label10 = new JLabel("Found Location");
		label10.setBounds(120, 200, 150, 40); //[pos(x,y) and width/height]
		label10.setFont(f2);
		foundPanel.add(label10);
		
		tf4 = new JTextField();
		tf4.setBounds(280, 200, 200, 40); //[pos(x,y) and width/height]
		tf4.setFont(f2);
		foundPanel.add(tf4);
		
		label11 = new JLabel("Item Color");
		label11.setBounds(120, 250, 150, 40); //[pos(x,y) and width/height]
		label11.setFont(f2);
		foundPanel.add(label11);
		
		String items2[] = new String[] {"", "White", "Black", "Grey", "Red", "Blue", "Green", "Yellow", "Orange", "Purple", "Pink", "Brown", "Navy", "Maroon", "Olive", "Cyan", "Teal", "Magenta", "Silver", "Gold", "Other"};
		jb3 = new JComboBox(items2);
		jb3.setBounds(280, 250, 200, 40);
		jb3.setFont(f2);
		foundPanel.add(jb3);
		
		
		label12 = new JLabel("Item Condition");
		label12.setBounds(120, 300, 200, 40); //[pos(x,y) and width/height]
		label12.setFont(f2);
		foundPanel.add(label12);
		
		rb5 = new JRadioButton("Good ");
		rb5.setBounds(280, 300, 100, 40); //(x, y, width, height)
		rb5.setFont(f2);
		rb5.setBackground(c1);
		foundPanel.add(rb5);
		
		rb6 = new JRadioButton("Damaged ");
		rb6.setBounds(420, 300, 120, 40); //(x, y, width, height)
		rb6.setFont(f2);
		rb6.setBackground(c1);
		foundPanel.add(rb6);
		
		rb7 = new JRadioButton("Dirty ");
		rb7.setBounds(590, 300, 100, 40); //(x, y, width, height)
		rb7.setFont(f2);
		rb7.setBackground(c1);
		foundPanel.add(rb7);
		
		bg2 = new ButtonGroup();
		bg2.add(rb5);
		bg2.add(rb6);
		bg2.add(rb7);
		
		btBackFound = new JButton("Back");
		btBackFound.setBounds(270, 700, 130, 40);
		btBackFound.setFont(f2);
		foundPanel.add(btBackFound);
		btBackFound.addActionListener(this);
		
		bt3 = new JButton("Submit");
		bt3.setBounds(420, 700, 130, 40);
		bt3.setFont(f2);
		foundPanel.add(bt3);
		bt3.addActionListener(this);
	}

	public void LostPanel(){  ////YEAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
		lostPanel = new JPanel();
		lostPanel.setLayout(null);
		lostPanel.setBounds(0, 0, 800, 800);
		c1 = new Color(211, 211, 211);
		lostPanel.setBackground(c1);
		
		label13 = new JLabel("Lost Item Details");
		label13.setBounds(270, 1, 500, 100); //[pos(x,y) and width/height]
		label13.setFont(f1);
		lostPanel.add(label13);
		
		label14 = new JLabel("Item Name");
		label14.setBounds(120, 100, 150, 40); //[pos(x,y) and width/height]
		label14.setFont(f2);
		lostPanel.add(label14);
		
		tf5 = new JTextField();/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		tf5.setBounds(280, 100, 200, 40); //[pos(x,y) and width/height]
		tf5.setFont(f2);
		lostPanel.add(tf5);
		
		label15 = new JLabel("Item Category");
		label15.setBounds(120, 150, 150, 40); //[pos(x,y) and width/height]
		label15.setFont(f2);
		lostPanel.add(label15);
		
		String items3[] = new String[] {"", "Electronics", "Documents", "Keys", "ID", "Money", "Accessories", "Other..."};
		jb4 = new JComboBox(items3);
		jb4.setBounds(280, 150, 200, 40);
		jb4.setFont(f2);
		lostPanel.add(jb4);
		
		label16 = new JLabel("Lost Location");
		label16.setBounds(120, 200, 150, 40); //[pos(x,y) and width/height]
		label16.setFont(f2);
		lostPanel.add(label16);
		
		tf6 = new JTextField();
		tf6.setBounds(280, 200, 200, 40); //[pos(x,y) and width/height]
		tf6.setFont(f2);
		lostPanel.add(tf6);
		
		label17 = new JLabel("Item Color");
		label17.setBounds(120, 250, 150, 40); //[pos(x,y) and width/height]
		label17.setFont(f2);
		lostPanel.add(label17);
		
		String items4[] = new String[] {"", "White", "Black", "Grey", "Red", "Blue", "Green", "Yellow", "Orange", "Purple", "Pink", "Brown", "Navy", "Maroon", "Olive", "Cyan", "Teal", "Magenta", "Silver", "Gold", "Other"};
		jb5 = new JComboBox(items4);
		jb5.setBounds(280, 250, 200, 40);
		jb5.setFont(f2);
		lostPanel.add(jb5);
		
		
		label18 = new JLabel("Item Condition");
		label18.setBounds(120, 300, 200, 40); //[pos(x,y) and width/height]
		label18.setFont(f2);
		lostPanel.add(label18);
		
		rb8 = new JRadioButton("Good ");
		rb8.setBounds(280, 300, 100, 40); //(x, y, width, height)
		rb8.setFont(f2);
		rb8.setBackground(c1);
		lostPanel.add(rb8);
		
		rb9 = new JRadioButton("Damaged ");
		rb9.setBounds(420, 300, 120, 40); //(x, y, width, height)
		rb9.setFont(f2);
		rb9.setBackground(c1);
		lostPanel.add(rb9);
		
		rb10 = new JRadioButton("Dirty ");
		rb10.setBounds(590, 300, 100, 40); //(x, y, width, height)
		rb10.setFont(f2);
		rb10.setBackground(c1);
		lostPanel.add(rb10);
		
		bg3 = new ButtonGroup();
		bg3.add(rb8);
		bg3.add(rb9);
		bg3.add(rb10);
		
		btBackLost = new JButton("Back");
		btBackLost.setBounds(270, 700, 130, 40);
		btBackLost.setFont(f2);
		lostPanel.add(btBackLost);
		btBackLost.addActionListener(this);
		
		bt4 = new JButton("Submit");
		bt4.setBounds(420, 700, 130, 40);
		bt4.setFont(f2);
		lostPanel.add(bt4);
		bt4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == btBackAdmin){
			adminPanel.setVisible(false);
			panel.setVisible(true);
		}
		if(ae.getSource() == btBackLost){
			lostPanel.setVisible(false);
			panel.setVisible(true);
		}
		if(ae.getSource() == btBackFound){
			foundPanel.setVisible(false);
			panel.setVisible(true);
		}
		if(ae.getSource() == btExit){
			System.exit(0);
		}
		if(ae.getSource() == btAdmin){
			String s1, s2;
			s1 = pf1.getText();
			if(rb1.isSelected())
			{
				s2 = rb1.getText();
			}
			else if(rb2.isSelected())
			{
				s2 = rb2.getText();
			}
			else if(rb3.isSelected())
			{
				s2 = rb3.getText();
			}
			else if(rb4.isSelected())
			{
				s2 = rb4.getText();
			}
			else if(rbAdmin.isSelected())
			{
				s2 = rbAdmin.getText();
			}
			else{
				s2 = "";
			}
			
			
			if(!s2.equals("Admin"))
			{
				JOptionPane.showMessageDialog(this,"You are not an Admin");
			}
			else if(s1.isEmpty()){
				JOptionPane.showMessageDialog(this,"Invalid ID for an Admin");
			}
			else if(s2.equals("Admin"))
			{
			panel.setVisible(false);
			adminPanel.setVisible(true);
			}
		}
		if(ae.getSource() == bt1){
			String s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;
			
			s1 = tf1.getText(); 
			s2 = pf1.getText();
			
			s3 = jb1.getSelectedItem().toString();
			
			if(rb1.isSelected())
			{
				s4 = rb1.getText();
			}
			else if(rb2.isSelected())
			{
				s4 = rb2.getText();
			}
			else if(rb3.isSelected())
			{
				s4 = rb3.getText();
			}
			else if(rb4.isSelected())
			{
				s4 = rb4.getText();
			}
			else if(rbAdmin.isSelected())
			{
				s4 = rbAdmin.getText();
			}
			else{
				s4 = "";
			}
			
			s5 = tf2.getText();
			
			if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Kindly fill up all the information");
			}
			else{
			panel.setVisible(false);
			lostPanel.setVisible(true);
			}
		}
		
		if(ae.getSource() == bt2){
			String s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;
			
			s1 = tf1.getText(); 
			s2 = pf1.getText();
			
			s3 = jb1.getSelectedItem().toString();
			
			if(rb1.isSelected())
			{
				s4 = rb1.getText();
			}
			else if(rb2.isSelected())
			{
				s4 = rb2.getText();
			}
			else if(rb3.isSelected())
			{
				s4 = rb3.getText();
			}
			else if(rb4.isSelected())
			{
				s4 = rb4.getText();
			}
			else if(rbAdmin.isSelected())
			{
				s4 = rbAdmin.getText();
			}
			else{
				s4 = "";
			}
			
			s5 = tf2.getText();
			
			if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Kindly fill up all the information");
			}
			else{
			panel.setVisible(false);
			foundPanel.setVisible(true);
			}
		}
		if(ae.getSource() == bt3)
		{
			String s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;
			s1 = tf1.getText(); 
			s2 = pf1.getText();
			
			s3 = jb1.getSelectedItem().toString();
			
			if(rb1.isSelected())
			{
				s4 = rb1.getText();
			}
			else if(rb2.isSelected())
			{
				s4 = rb2.getText();
			}
			else if(rb3.isSelected())
			{
				s4 = rb3.getText();
			}
			else if(rb4.isSelected())
			{
				s4 = rb4.getText();
			}
			else if(rbAdmin.isSelected())
			{
				s4 = rbAdmin.getText();
			}
			else{
				s4 = "";
			}
			
			s5 = tf2.getText(); //Contact
			s6 = tf3.getText(); //Item name
			s7 = jb2.getSelectedItem().toString(); //Category
			s8 = tf4.getText();
			s9 = jb3.getSelectedItem().toString();
			
			if(rb5.isSelected())
			{
				s10 = rb5.getText();
			}
			else if(rb6.isSelected())
			{
				s10 = rb6.getText();
			}
			else if(rb7.isSelected())
			{
				s10 = rb7.getText();
			}
			else 
			{
				s10 = "Others";
			}
			
			if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty() || s6.isEmpty() || s7.isEmpty() || s8.isEmpty() || s9.isEmpty() || s10.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Kindly fill up all the information");
			}
			else{
				PersonFindItem pfi = new PersonFindItem(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
				pfi.AddInfo();
				JOptionPane.showMessageDialog(this,"Thanks for fill up the information");
				System.exit(0);
			}
		}
		if(ae.getSource() == bt4)
		{
			String s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;
			s1 = tf1.getText(); 
			s2 = pf1.getText();
			
			s3 = jb1.getSelectedItem().toString();
			
			if(rb1.isSelected())
			{
				s4 = rb1.getText();
			}
			else if(rb2.isSelected())
			{
				s4 = rb2.getText();
			}
			else if(rb3.isSelected())
			{
				s4 = rb3.getText();
			}
			else if(rb4.isSelected())
			{
				s4 = rb4.getText();
			}
			else if(rbAdmin.isSelected())
			{
				s4 = rbAdmin.getText();
			}
			else{
				s4 = "";
			}
			
			s5 = tf2.getText(); //Contact
			s6 = tf5.getText(); //Item name
			s7 = jb4.getSelectedItem().toString(); //Category
			s8 = tf6.getText();
			s9 = jb5.getSelectedItem().toString();
			
			if(rb8.isSelected())
			{
				s10 = rb8.getText();
			}
			else if(rb9.isSelected())
			{
				s10 = rb9.getText();
			}
			else if(rb10.isSelected())
			{
				s10 = rb10.getText();
			}
			else 
			{
				s10 = "Others";
			}
			
			if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty() || s6.isEmpty() || s7.isEmpty() || s8.isEmpty() || s9.isEmpty() || s10.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Kindly fill up all the information");
			}
			else{
				PersonLostItem pli = new PersonLostItem(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
				pli.AddInfo();
				JOptionPane.showMessageDialog(this,"Thanks for fill up the information! We will be looking for your item!!");
				System.exit(0);
				}
			}
			
		
	}
	
	private void showInfo()
	{
		try 
		{
			File file = new File("./Data/userdata.txt");
			if(file.exists())
			{
				FileReader fr = new FileReader(file); //reads one character at a time
				BufferedReader br = new BufferedReader(fr); //reads one line at a time
				
				String line; //line = "Name: Rakib"
				while((line = br.readLine()) != null)
				{
					ta.append(line+"\n");
				}
				br.close();
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			JOptionPane.showMessageDialog(this,"Error occcurs");
		}
	}
	public void mouseClicked(MouseEvent ae){}
	public void mousePressed(MouseEvent ae) {}
	public void mouseReleased(MouseEvent ae) {}
	public void mouseEntered(MouseEvent ae) {}
	public void mouseExited(MouseEvent ae) {}
}