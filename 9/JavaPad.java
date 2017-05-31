/*
* Description: JavaPad represents simple text editor.
* FileName: JavaPad.java
*/

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;

public class JavaPad extends JPanel{
    
	//list of variables
    private final static String[] colorNames = {"Change color:","black", 
            "blue", "cyan", "gray", "green", "orange", "pink", 
            "red", "yellow"};
    
    private final static String[] fontSize = { "","8", 
            "10", "12", "14", "16","18", "20", "22", "24","26","28","30" };
    
    private final static File file = new File("hardcode.txt");

    private JPanel tabPanel,bottomPanel;
    private JScrollPane scroll;
    private JTextArea textArea;
    private JButton newText, saveText, loadText,quit;
    private JComboBox colorBox,fontSizeBox;
    
    // main constructor sets size, layout,
    // adds components and sets their locations  
    public JavaPad() 
    {
        setPreferredSize(new Dimension(700, 400));
        setLayout(new BorderLayout());
        
        tabPanel();
        add(tabPanel, BorderLayout.NORTH);
        bottomPanel();
        add(bottomPanel, BorderLayout.SOUTH);
        textArea();
        add(scroll, BorderLayout.CENTER);
    }
    
    // TabPanel constructor creates a top panel   
    public void tabPanel() 
    {
        tabPanel = new JPanel();
        tabPanel.setPreferredSize(new Dimension(400, 35));
        tabPanel.setLayout(new FlowLayout());
        
        buttons();
        colorBox();
        fontSizeBox();
        
        tabPanel.add(newText);
        tabPanel.add(saveText);
        tabPanel.add(loadText);
        tabPanel.add(quit);
        tabPanel.add(colorBox);
        tabPanel.add(fontSizeBox);
    }
    
    // Bottom panel constructor creates a bottom
    // panel  
    public void bottomPanel() 
    {
        bottomPanel = new JPanel();
        JLabel label = new JLabel("Microstuff: Resistance is futile.");
        bottomPanel.setPreferredSize(new Dimension(400,25));
        bottomPanel.add(label, BorderLayout.CENTER);
    }
    

    // Buttons constructor creates buttons, adds 
    // listeners and sets action commands.  
    public void buttons() 
    {
        newText = new JButton("NEW");
        saveText = new JButton("SAVE");
        loadText = new JButton("LOAD");
        quit = new JButton("QUIT");
        
        newText.addActionListener(new ButtonListener());
        saveText.addActionListener(new ButtonListener());
        loadText.addActionListener(new ButtonListener());
        quit.addActionListener(new ButtonListener());
        
        newText.setActionCommand("N");
        saveText.setActionCommand("S");
        loadText.setActionCommand("L");
        quit.setActionCommand("Q");
    }
    
    // Text area constructor creates a text area
    // with specified parameters, default font size
    // and style. Creates only vertical scroll panel.
    public void textArea() 
    {
        textArea = new JTextArea("",15,25);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setForeground(Color.BLACK);
        textArea.setFont(new Font("Serif",Font.PLAIN,14));
        //creates a new scroll box with text area     
        scroll = new JScrollPane(textArea,
            ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    }

    // Color box constructor creates a box for 
    // color changing  
    public void colorBox() 
    {
        colorBox = new JComboBox(colorNames);
        colorBox.setEditable(false);
        colorBox.setForeground(Color.BLACK);
        colorBox.addActionListener(new ComboColor());
    }
    
    // Font size box constructor creates a box for
    // font changing.
    public void fontSizeBox() 
    {
        fontSizeBox = new JComboBox(fontSize);
        fontSizeBox.setPreferredSize(new Dimension(55,25));
        fontSizeBox.setEditable(true);
        fontSizeBox.setForeground(Color.BLACK);
        fontSizeBox.addActionListener(new ComboFontSize());
    }
    
    // Method to clear text in the main text area
    // and set default font size and color  
    public void newText() 
    {
        textArea.setText("");
        textArea.setForeground(Color.BLACK);
        textArea.setFont(new Font("Serif",Font.PLAIN,14));
    }

    // Method to exit the program   
    public void quit() 
    {
    	//call dialog window to asks user
		int answer = JOptionPane.showConfirmDialog(null, 
				"Quitting: Save?","Quit",JOptionPane.YES_NO_OPTION);
		
		//based on answer do next statements:
		if(answer == JOptionPane.NO_OPTION) 
		{
			System.exit(0);;
		}
		else if(answer == JOptionPane.YES_OPTION) 
		{
			try
			{
				saveText();
				System.exit(0);;
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}	
		}
		else if(answer == JOptionPane.CLOSED_OPTION) 
		{
			System.exit(0);;
		}
	}
    
    // Method to write text that's currently in 
    // the main text area into the file 
    // hardcode.txt 
    public void saveText() throws IOException 
    {
    	//Checks if file doesn't exist, and if not
    	//creates it.
        if(!file.exists())
        {
        	file.createNewFile();
        }
        PrintWriter out = new PrintWriter(file);
        out.print(textArea.getText());
        out.close();
        JOptionPane.showMessageDialog(null, "Text saved.");    
    }    
    
    // Method to read the file hardcode.txt if 
    // possible and places its text into 
    // the main text area   
    public void loadText() throws IOException 
    {
    	//checks if the file exist. If not
    	//sends a message.
        if(!file.exists()) 
        {
            JOptionPane.showMessageDialog(null, "File hardcode.txt doesnt exist");
        }
        else 
        {
            Scanner scan = new Scanner(new FileReader(file));
            // while there's still something to read
            while (scan.hasNext())
            {
            	// append the line to the TextArea
                textArea.append(scan.nextLine() + "\n");
            }
            scan.close();
        }
    }

    // Represents listener for buttons 
    private class ButtonListener implements ActionListener {
    	
        //actionPerformed() method uses an if-else statement
        //to determine which button generated the event           
        public void actionPerformed(ActionEvent event)
        {
            if (event.getActionCommand().equals(newText.getActionCommand())) 
            {
                newText();
            }
            else if(event.getActionCommand().equals(saveText.getActionCommand())) 
            {
                try 
                {
                    saveText();
                } 
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
            }
            else if(event.getActionCommand().equals(loadText.getActionCommand())) 
            {
                try 
                {
                    loadText();
                }
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
            }
            else if(event.getActionCommand().equals(quit.getActionCommand())) 
            {
            	quit();
            }            
        }
    }
    
    // Combo color listener performs color changing
    // of the text.   
    private class ComboColor implements ActionListener 
    {
        public void actionPerformed(ActionEvent event) 
        {
            String color = colorBox.getSelectedItem().toString();
			//Sets the color of the text 
			//depends on which color was chosen
            if(color.equals("black")) {
                textArea.setForeground(Color.black);
            }
            else if(color.equals("blue")) {
                textArea.setForeground(Color.blue);
            }
            else if(color.equals("cyan")) {
                textArea.setForeground(Color.cyan);
            }
            else if(color.equals("gray")) {
                textArea.setForeground(Color.gray);
            }
            else if(color.equals("green")) {
                textArea.setForeground(Color.green);
            }
            else if(color.equals("orange")) {
                textArea.setForeground(Color.orange);
            }
            else if(color.equals("pink")) {
                textArea.setForeground(Color.pink);
            }
            else if(color.equals("red")) {
                textArea.setForeground(Color.red);
            }
            else if(color.equals("yellow")) {
                textArea.setForeground(Color.yellow);
            }
        }
    }
    
    // Combo font size listener performs font size
    // changing.
    private class ComboFontSize implements ActionListener 
    {
        public void actionPerformed(ActionEvent event) 
        {
            String size = (String)fontSizeBox.getSelectedItem();
            try 
            {
            	//checks if font size box field is empty
            	if(size.isEmpty())
            	{
            		textArea.setFont(new Font("Serif",Font.PLAIN,14));
            	}
            	
            	else 
            	{
            		//convert choice to int
            		textArea.setFont(new Font("Serif",Font.PLAIN,
            					Integer.parseInt(size)));
            	}
            }
            catch(NumberFormatException e)
            {
                e.printStackTrace();    
            }
        }
    }
}
