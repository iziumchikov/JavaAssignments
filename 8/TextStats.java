/*
* Description:Class TextStats extends JFrame and represents
* program for calculating basic statistics for a segment of text.
* Creates window, scrolling text area, panel, three labels and one button.
* Program makes calculations and prints info.
* FileName: TextStats.java
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextStats extends JFrame
{
	private JTextArea txtArea;
	private JScrollPane scroll;
	private JPanel statPanel;
	private JButton statButton;
	private JLabel wordsLabel,averageLabel, totalLabel;

	// Main method
	public static void main(String[] args)
	{
		TextStats textStats = new TextStats();
		textStats.setVisible(true);
	}

	//Creates and presents the program frame. Adds 
	//scrolling text area box and statistics panel.
	public TextStats()
	{
		super("Text Statistics");
			setSize(700, 400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new FlowLayout());
			
		txtArea();
		//adding scrolling text area box
		getContentPane().add(scroll);
		statPanel();
		//adding panel
		getContentPane().add(statPanel);
	}

	// Sets up text area scrolling window.
	public void txtArea()
	{
		//Creates a new text area
		txtArea = new JTextArea(10, 50);
		//creates a new scroll box with text area
		scroll = new JScrollPane(txtArea);
	}

	// Sets up panel with two labels
	// and one button.
	public void statPanel()
	{
		statPanel = new JPanel();
		statPanel.setLayout(new GridLayout(4,1));
		statPanel.setBorder(BorderFactory.createTitledBorder("Statistics"));
		statPanel.setPreferredSize(new Dimension(400, 150));
		
		//new stat labels
		wordsLabel = new JLabel("Number of words: xxx");
		averageLabel = new JLabel("Average word length: xxx");
		totalLabel = new JLabel("Total number of letters: xxx");
		
		//new button
		statButton = new JButton("Compute Statistics");
		statButton.addActionListener(new ButtonListener());

		//adding labels and button to the panel
		statPanel.add(wordsLabel);
		statPanel.add(averageLabel);
		statPanel.add(totalLabel);
		statPanel.add(statButton);
	}

	// Represents the listener for button.
	public class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			computeStats();   // calling computeStat() method
		}
	}

	// Performs the conversion when the button is     
	// pressed. Counts number of words and average
	// number of letters. Sets labels to print info.
	public void computeStats()
	{
		int wordsNum = 0;   // to count number of words
		double average = 0.0;  // to hold average number
		
		String str = txtArea.getText(); //Getting text from text area
		
		if(str.isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Enter any text");//checks if text box is empty
		}
		else
		{
			//creates array and split text on words
			String[] words = str.split(" "); 
			int total = 0; // set accumulator to 0
			//for loop to count number of words and average word length
			for(int i = 0; i < words.length;i++){
				wordsNum++;
				total += words[i].length();
				average = ((double)total/wordsNum);
		}
				
		//set up labels text
		wordsLabel.setText("Number of words: " + wordsNum);
		averageLabel.setText("Average word length: " + average);
		totalLabel.setText("Total number of letters: " + total);
	}
	}
}