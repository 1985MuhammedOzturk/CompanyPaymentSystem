
package polymorphism;

/**
This class represents the employee. An employee is paid the same (particular) amount regardless of the hours (additional) the employee worked.
*/

/*	TODO: TASK 1 - DECLARE YOUR CLASS AND ANY VARIABLES HERE.
 * 
 */
	public class Employees extends Millers {
		
		private double annualPay;
		
		


	/**
	 * Constructs an employee with a given name and an annual pay.
	 * @param name the name of this employee
	 * @param annualPay 
	 * @param pay the annual pay of the employee
	 */
	public Employees(String name, double annualPay)		{
		setName(name);
		this.annualPay = annualPay;
	

	}

	/**
	 * @return the annualPay
	 */
	public double getAnnualPay() {
		return annualPay;
	}



	/**
	 * @param annualPay the annualPay to set
	 */
	public void setAnnualPay(double annualPay) {
		this.annualPay = annualPay;
	}


	/**
	 * @return the biWeeklyBonus
	 */
	
	
	
	
/*
 * 	TODO: TASK - This portion of your code computes the pay for this category of miller.
 */

// YOUR CODE GOES IN HERE.
	
	



	public double biWeeklyPay(int hoursWorked) {
		return (annualPay / 26) ;
	}

}