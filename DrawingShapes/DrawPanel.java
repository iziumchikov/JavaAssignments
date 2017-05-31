/*
 * Class: CS 111B Object-Oriented Programming Methodologies in Java
 * Description: DrawPanel extends JPanel and creates an application 
 * that uses the MyShape class to create an interactive drawing 
 * application.
 * 12/04/2015
 * Name: Ilya Dubinin
 * FileName: DrawPanel.java
 * Assignment # 10
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawPanel extends JPanel 
{
	//list of variables
	private	MyShape[] shapes;
	private MyShape currentShape;
	
	private int shapeCount;
	private int shapeType;

	private Color currentColor;
	private JLabel statusLabel;
	
	//constructor for DrawPanel
	public DrawPanel(JLabel label) 
	{
		setShapeType(0);	//set default shape
		setCurrentColor(currentColor);	//set default color
		setBackground(Color.WHITE);	//background of panel
		
		shapeCount = 0;	//num of shapes
		shapes = new MyShape[100];	//array of MyShape
		currentShape = null;	//represents the current shape the user is drawing.
		statusLabel = label;	//sets status bar
		
		//listeners
		MouseActionListener mouse = new MouseActionListener();
		addMouseListener(mouse);
		addMouseMotionListener(mouse);
	}
	
	//Overridden method paintComponent that draws 
	//the shapes in the array.Provides for loop 
	//to check how many shapes to draw and if 
	//stat-t for checking if currentShape is not 
	//equal to null.
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		//for loop to check how many shapes to 
		//draw
		for (int i = 0; i < shapeCount; i++)
		{
            shapes[i].draw(g);
		}
		
		if(currentShape != null)
		{
			currentShape.draw(g);
		}
	}
	

	// Sets shape type, checks if choice of type
	// is correct.
	public void setShapeType(int n) 
	{
		if (shapeType < 0 || shapeType > 2) 
		{
			shapeType = 0;
		}
		shapeType = n;
	}
	
	//Sets current color
	public void setCurrentColor(Color color) 
	{
		currentColor = color;
	}
	
	//Clears the last shape from panel and array.
	public void clearLastShape() 
	{
		if (shapeCount >= 0)
		{
			shapeCount--;
		}
		repaint();
	}
	
	//Clears all shapes from panel and array.
	public void clearDrawing() 
	{
		shapeCount = 0;
/*		for(int i = 0; i < shapes.length; i++) {
			shapes[i] = null;
		}*/
        repaint();
	}
	
	//Inner class for mouse actions
	private class MouseActionListener implements 
								MouseListener,MouseMotionListener 
	{
		//Overridden method mousePressed. Assigns 
		//currentShape and and initializes both points
		// to the mouse position.
		public void mousePressed(MouseEvent event) 
		{
			if(shapeType == 0) 
			{
				currentShape = new MyLine(event.getX(), event.getY(),
						event.getX(), event.getY(), currentColor);
			}
			else if(shapeType == 1) 
			{
				currentShape = new MyOval(event.getX(), event.getY(),
	                    event.getX(), event.getY(), currentColor);
			}
			else if(shapeType == 2) 
			{
				currentShape = new MyRect(event.getX(), event.getY(),
	                    event.getX(), event.getY(), currentColor);
			}
				
		}
		
		//Overridden method mouseReleased. Finishes 
		//drawing and places this object to the array.
		//Sets status bar info.
		public void mouseReleased(MouseEvent event) 
		{
			currentShape.setX2(event.getX());
			currentShape.setY2(event.getY());
			
			if (shapeCount < shapes.length)
			{
				//shapeCount determines the insertion index.
				shapes[shapeCount] = currentShape;
				shapeCount++;
			}
			currentShape = null;
			repaint();
			statusLabel.setText("(" + event.getX() + ", " + event.getY() + ")");
		}
		
		//Sets status bar info.
		public void mouseMoved(MouseEvent event) 
		{
			statusLabel.setText("(" + event.getX() + ", " + event.getY() + ")");
		}
		
		//Sets the second point of the currentShape
		//to the current mouse position and calls 
		//method repaint.Sets status bar.
		public void mouseDragged(MouseEvent event) 
		{
			currentShape.setX2(event.getX());
			currentShape.setY2(event.getY());
			repaint();
			statusLabel.setText("(" + event.getX() + ", " + event.getY() + ")");
		}
		public void mouseClicked(MouseEvent event) {}
		public void mouseEntered(MouseEvent event) {}
		public void mouseExited(MouseEvent event) {}	
	}
}
