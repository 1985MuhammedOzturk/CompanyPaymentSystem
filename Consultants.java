
package polymorphism;

/**
 * This code in this file is for the Consultant Class. A Consultant is a miller who is paid for every hour worked.
*/
/*	TODO: TASK 1 - YOUR CODE GOES HERE TO DECLARE THE CONSULTANT CLASS AND ITS VARIABLES.
 */
	public class Consultants extends Millers {
		
		private double consultantwage;
		private int hoursWorked;

/**
 * TODO: TASK 2 - This portion of your code constructs an hourly paid consultant with a given name and biweekly wage.
 * @param name the name of this consultant
 * @param wage the consultant wage per hour 
 */
		

// YOUR CODE FOR YOUR CONSULTANT GOES HERE!!
		
		public Consultants(String name, double consultantwage) {
			super(name);
			this.consultantwage = consultantwage;
		}

		public int getHoursWorked() {
			return this.hoursWorked;
		}


	
	/**
		 * @param hoursWorked the hoursWorked to set
		 */
		public void setHoursWorked(int hoursWorked) {
			this.hoursWorked = hoursWorked;
		}
		
		

	public double biWeeklyPay(int hoursWorked)	{
		
	
		// In this part of your code, an overtime amount is added if the Consultant works for more than 76 hours bi-weekly.
		// Review this portion of code carefully to include the code to fully satisfy this condition.

		// SOME CODE GOES HERE BEFORE THE CODE BELOW:
		double pay = hoursWorked * consultantwage;
		 System.out.printf("Hours worked: %d\n", hoursWorked);
		 
		if (hoursWorked > 76) {
	      pay = pay + ((hoursWorked - 76) * 0.5) * consultantwage; 
	      System.out.printf("Total pay for consultant with bonus is: %f\n", pay);
	    } else {
	    	System.out.printf("Total pay for consultant without bonus is: %f\n", pay);
	    }
		
		return pay;
	}
	
}
	