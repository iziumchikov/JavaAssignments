/*
 * Description: Class CreateLoans implements LoanConstants.
 * Asks user to prompt main info and checks if this correct info.
 * FileName: CreateLoans.java
*/
import javax.swing.JOptionPane;

public class CreateLoans implements LoanConstants
{
	public static void main(String[] args)
	{	//list of variables
		String accNumber, name;	
		double rate, loan;
		int term, choice;

		Loan[] loanArray = new Loan[5]; //new loan Array
		
		rate = Double.parseDouble(JOptionPane.showInputDialog
						(null, "Welcome to " + COMPANY_NAME +
						"\nEnter the current prie interest rate "
						+ "as decimal format,\n for example .05"));
		
		//for loop to fill array
		for( int i = 0; i < loanArray.length;i++)
		{
			choice = Integer.parseInt(JOptionPane.showInputDialog("Is this a Business loan(1) or "
									+ "Personal loan(2)"));
			accNumber = JOptionPane.showInputDialog("Enter account number");
			name = JOptionPane.showInputDialog("Enter name");
		
			//checks if loan amount is correct
			loan = Double.parseDouble(JOptionPane.showInputDialog("Enter loan amount"));
			while (loan > MAX_LOAN || loan < 0)
			{
				loan = Double.parseDouble(JOptionPane.showInputDialog("Re-enter loan amount"));//checks if amount is correct
			}
			
			//checks if term correct	
			term = Integer.parseInt(JOptionPane.showInputDialog("Enter term"));
			while (term != SHORT_TERM && term != MID_TERM && term != LONG_TERM)
			{
				term = Integer.parseInt(JOptionPane.showInputDialog("Re-enter term"));
			}
			
		
			//checks if choice of loan type is correct		
			if (choice != 1 && choice != 2)
			{
				JOptionPane.showInputDialog("Is this a Business loan(1) or "
						+ "Personal loan(2)");
			}
			else if(choice == 1)
			{
				loanArray[i] = new BusinessLoan(name, accNumber, loan, rate, term);
			}
			else if(choice == 2)
			{
				loanArray[i] = new PersonalLoan(name, accNumber, loan, rate, term);
			}
		}//end for
		
		//prints loanArray info
		JOptionPane.showMessageDialog(null,loanArray, 
				COMPANY_NAME, JOptionPane.INFORMATION_MESSAGE);
	}
}