
public class ACMGonnaGetYou {
	public static void main (String[] args){
		/* This program will calculate the amout
		 * we owe the ACM
		 */
		// What information do we need to keep 
		// track of??
		
		// Keep track of total debt (floating)
		double totalDebt = 1000.0;		
		// Number of months that elapse
		int numberOfMonths = 0;
		// Current interest rate
		double currentInterestRate = 0.20;
		
		// We need a loop go through some numbers of months calculating total
		// debt each month
		TextIO.writeFile("ACM.getyou.output");
		
		while (totalDebt < 12000.0){
			// calculate total debt each month
			// newDebt = debt*(1+rate)
			// newDebt = oldDebt + rate*oldDebt
			totalDebt = totalDebt + (1.0 + currentInterestRate);
			// calculate new interest rate
			currentInterestRate = currentInterestRate + 0.05;
			// increase the time (months)
			numberOfMonths = numberOfMonths + 1;
			// output information
			System.out.println("After " + numberOfMonths + "Current debt is: " + totalDebt);
			TextIO.putln("numberOfMonths")
		}	
	}

}
