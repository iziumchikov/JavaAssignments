import javax.swing.JFrame;

public class RunJavaPad 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Microstuff JavaPad XP");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new JavaPad());
		frame.pack();
		frame.setVisible( true );
	}
}
