package Entity;

import java.lang.*;
import java.io.*; //for File IO
import javax.swing.*;

public class PersonLostItem{
	private String s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;
	private File file;
	private FileWriter fwriter;
	
	public PersonLostItem(){}
	public PersonLostItem(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10)
	{
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
		this.s6 = s6;
		this.s7 = s7;
		this.s8 = s8;
		this.s9 = s9;
		this.s10 = s10;
	}
	
	public void AddInfo()
	{
		try{
			file = new File("./Data/userdata.txt");
			
			if(!file.exists())
			{
				file.getParentFile().mkdirs();
				file.createNewFile();
			}
			
			fwriter = new FileWriter(file, true);
			fwriter.write("====================LOST=ITEM====================\n");
			fwriter.write(s1 +" Lost a Item! \nUser Information: \n\n");
			fwriter.write("Name: "+s1+"\n");
			fwriter.write("ID: "+s2+"\n");
			fwriter.write("University: "+s3+"\n");
			fwriter.write("User Type: "+s4+"\n");
			fwriter.write("Contact: "+s5+"\n\n");
			
			fwriter.write("Information about the Item:\n\n");
			fwriter.write("Item Name: "+s6+"\n");
			fwriter.write("Catergory: "+s7+"\n");
			fwriter.write("Location: "+s8+"\n");
			fwriter.write("Color: "+s9+"\n");
			fwriter.write("Condition: "+s10+"\n");
			fwriter.write("=================================================\n");
			
			fwriter.flush(); //ensure all the data are saved (CTRL + S)
			fwriter.close();
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
			JOptionPane.showMessageDialog(null,"Error occcurs");
		}
		
	}
}