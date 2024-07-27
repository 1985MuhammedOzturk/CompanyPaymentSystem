
package polymorphism;

/**
This code should contain your Supervisor class declaration, constructor and method. 
A Supervisor is an employee who also receives a bonus. 
You must implement the bi-weekly pay for the employee according to instructions provided.
*/

// TO DO: TASK 1 - YOUR CODE FOR THE CLASS GOES HERE
// Declare the class and any variable
	public class Supervisors extends Millers {

/**
 * TODO: TASK 2 - Constructs a supervisor with a given name, annual pay and bi-weekly bonus.
 * @param name the name of this employee
 * @param pay the annual pay
 * @param bonus the bi-weekly bonus
 */
		
		private double biWeeklyBonus;
		private double annualPay;

// YOUR Constructor code goes here!!!
		
		public Supervisors(String name, double annualPay,double biWeeklyBonus) {
			super(name);
			this.annualPay = annualPay;
			this.biWeeklyBonus = biWeeklyBonus;
								
		}
		
		/**
		 * @return the bwBonus
		 */
		public double getbiWeeklyBonus() {
			return biWeeklyBonus;
		}


		/**
		 * @param bwBonus the bwBonus to set
		 * @param biWeeklyBonus 
		 */
		public void setBwBonus(double biWeeklyBonus) {
			this.biWeeklyBonus = biWeeklyBonus;
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



// Hint: Note the relationship between this class and any other class. How will you apply that to your code?




		public double biWeeklyPay(int hoursWorked ) {
			
			return (annualPay/26) + biWeeklyBonus;
		}
		
	}
	
