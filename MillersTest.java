/**
 * Student Name: Muhammed Ozturk
 * Course: CST8284 Object Oriented Programming (Java)
 * Section:312
 *
 */


package polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * MillerTest is a driver class. Class asks user about 
 * type of miller and calculates their payment.
 */

public class MillersTest {
	
    public static void main(String[] args) {
    	
        List<Millers> millersList = new ArrayList<>();   
/**
 * This loop provides to enter millers. 
 */
        boolean moreMillers = true;
        
        while (moreMillers) {
        	
        	/**
        	 * Scanner is used for input and list to store 
        	 * data of different types of millers.
        	 */
        	 Scanner scanner = new Scanner(System.in);
        	
            System.out.println("Enter miller type (Consultant/Employee/Supervisor): ");
            String type = scanner.next().toLowerCase();
            scanner.nextLine(); 

            
            
            System.out.println("Enter the name of the miller: ");
            String name = scanner.nextLine();

            int hoursWorked = 0; 

            /**
             * Switch case; creates instances based on the miller type.
             */
            switch (type) {
            	
                case "consultant":
                    System.out.print("Please enter the hourly wage for the consultant: ");
                    double wage = scanner.nextDouble();
                    
                    
                    System.out.print("How many hours worked?: ");
                    hoursWorked = scanner.nextInt();
                    
                    Consultants consultant = new Consultants(name, wage);
                    consultant.setHoursWorked(hoursWorked);
                    
                    millersList.add(consultant);
                    
                    break;
                    
                case "employee":
                    System.out.print("Please enter the annual salary for the employee: ");
                    
                    double salary = scanner.nextDouble();
                    millersList.add(new Employees(name, salary));
                    
                    break;
                    
                case "supervisor":
                    System.out.print("Please enter the annual salary for the supervisor: ");
                    double supSalary = scanner.nextDouble();
                    
                    System.out.print("Enter the biweekly bonus for the supervisor: ");
                    double bonus = scanner.nextDouble();
                    
                    millersList.add(new Supervisors(name, supSalary, bonus));
                    break;
                    
                default:
                	
                    System.out.println("Miller type is not valid.");
            }
            /**
             * This part is for the calculation and displaying the payment for each miller.
             */
            	System.out.println("Do you want to add more millers? (Yes/No): ");
            	moreMillers = scanner.next().equalsIgnoreCase("Yes");
            	scanner.nextLine();
        }
        
        for (Millers miller : millersList) {

        int hours = ((Consultants) miller).getHoursWorked();
        System.out.println("Total Pay for " + miller.getName() + ": " + miller.biWeeklyPay(hours));
    }
        

      
    }
}
