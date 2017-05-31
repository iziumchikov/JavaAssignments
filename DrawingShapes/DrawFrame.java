
/* Description:
 FileName: DrawFrame.java*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawFrame extends JFrame
{
	//list of variables
    private final static String[] colorNames = {"Black", 
            "Blue", "Cyan", "Gray", "Green", "Orange", "Pink", 
            "Red", "Yellow"};
    
    private final static String[] shapesNames = { "Line" ,
    		"Oval", "Rect" };

    private JPanel tabPanel,bottomPanel;
    private JComboBox colorBox,shapeTypeBox;
    private JButton undo, clear;
    private JLabel statLabel;
    private DrawPanel drawPanel;
    

    // Main constructor sets size, layout,
    // adds components and sets their locations
    public DrawFrame()
    {
    	super("Java Drawings");
        	setPreferredSize(new Dimension(400, 400));
        	setLayout(new BorderLayout());
        
        statLabel = new JLabel();
        drawPanel = new DrawPanel(statLabel);
        
        tabPanel();
        add(tabPanel, BorderLayout.NORTH);
        
        add(drawPanel, BorderLayout.CENTER);
        
        bottomPanel();
        add(bottomPanel, BorderLayout.SOUTH);
    }
    
    //tabPanel constructor creates a top panel.
    public void tabPanel()
    {
        tabPanel = new JPanel();
        tabPanel.setLayout(new FlowLayout());
        
        buttons();
        colorBox();
        shapeTypeBox();
        
        tabPanel.add(undo);
        tabPanel.add(clear);
        tabPanel.add(colorBox);
        tabPanel.add(shapeTypeBox);
    }
    
    //bottomPanel constructor creates a 
    public void bottomPanel()
    {
        bottomPanel = new JPanel();
        bottomPanel.setPreferredSize(new Dimension(400,25));
        bottomPanel.setLayout(new BorderLayout());
        bottomPanel.add(statLabel, BorderLayout.WEST);	
    }

    // Buttons constructor creates buttons, adds 
    // listeners and sets action commands.
    public void buttons()
    {
        undo = new JButton("Undo");
        clear = new JButton("Clear");
        undo.addActionListener(new ButtonListener());
        clear.addActionListener(new ButtonListener());
        undo.setActionCommand("U");
        clear.setActionCommand("C");
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

    // Shape type box constructor creates a box for
    // shapes changing.
    public void shapeTypeBox()
    {
    	shapeTypeBox = new JComboBox(shapesNames);
    	shapeTypeBox.setEditable(false);
    	shapeTypeBox.addActionListener(new ShapeChoice());
    }

    //Represents listener for buttons
    private class ButtonListener implements ActionListener
    {
        //actionPerformed() method uses an if-else statement
        //to determine which button generated the event           
        public void actionPerformed(ActionEvent event)
        {
        	if (event.getActionCommand().equals(undo.getActionCommand())) 
        	{
        		drawPanel.clearLastShape();
            }
        	else if (event.getActionCommand().equals(clear.getActionCommand()))
        	{
        		drawPanel.clearDrawing();
        	}
        }
    }
    
    //---------------------------------------------
    // Combo color listener performs color changing
    // of the shape.
    //---------------------------------------------    
    private class ComboColor implements ActionListener 
    {
        public void actionPerformed(ActionEvent event) 
        {
        	
            String color = colorBox.getSelectedItem().toString();
            
			//Sets the color of the shape, 
			//depends on which color was chosen
            if(color.equals("Black")) {
                drawPanel.setCurrentColor(Color.black);
            }
            else if(color.equals("Blue")) {
            	drawPanel.setCurrentColor(Color.blue);
            }
            else if(color.equals("Cyan")) {
            	drawPanel.setCurrentColor(Color.cyan);
            }
            else if(color.equals("Gray")) {
            	drawPanel.setCurrentColor(Color.gray);
            }
            else if(color.equals("Green")) {
            	drawPanel.setCurrentColor(Color.green);
            }
            else if(color.equals("Orange")) {
            	drawPanel.setCurrentColor(Color.orange);
            }
            else if(color.equals("Pink")) {
            	drawPanel.setCurrentColor(Color.pink);
            }
            else if(color.equals("Red")) {
            	drawPanel.setCurrentColor(Color.red);
            }
            else if(color.equals("Yellow")) {
            	drawPanel.setCurrentColor(Color.yellow);
            }
        }
    }

    // Listener for shape type combo box, that performs 
    // shape types changing.
    private class ShapeChoice implements ActionListener 
    {
        public void actionPerformed(ActionEvent event)
        {
        	 String choice = (String)shapeTypeBox.getSelectedItem();
        	 //checks choice and sets shape type
        	 if(choice == "Line")
        	 {
        		 drawPanel.setShapeType(0);
        	 }
        	 else if (choice == "Oval")
        	 {
        		 drawPanel.setShapeType(1);
        	 }
        	 else if (choice == "Rect")
        	 {
        		 drawPanel.setShapeType(2);
        	 } 
        }
    }
}
