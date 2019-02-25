

package cse360assign2;

public class Calculator {

	private int total;
	private String history = "0";
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the total amount after calculations as an integer.
	 *  
	 * @return integer total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Updates the private variable total by adding the value of the parameter.
	 * Updates history by appending '+' sign and the parameter to the variable history
	 * 
	 * @param integer value to add to total
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/**
	 * Updates the private variable total by subtracting the value of the parameter.
	 * Updates history by appending '-' sign and the parameter to the variable history 
	 *  
	 * @param integer value to subtract from the total
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * Updates the private variable total by multiplying value of the 
	 * parameter with the total variable. Updates history by appending '*' sign 
	 * and the parameter to the variable history
	 * 
	 * @param integer value to multiply with total
	 */
	public void multiply (int value) {
		total = total*value;
		history = history + " * " + value;
	}
	
	/**
	 * Updates the private variable total by dividing the total by 
	 * the value of the parameter. Updates history by appending '/' sign 
	 * and the parameter to the variable history.
	 *  
	 * @param integer value by which the total is divided
	 */
	public void divide (int value) {
		if(value == 0)
		{
			total = 0;
		}
		else
		{
			total = total/value;
			history = history + " / " + value;
		}
	}
	
	/**
	 * Returns the history of the arithmetic done to the initial total value
	 * in the form of +, -, * or / in between the integer parameters
	 * 
	 * @return String message of all previous arithmetic
	 */
	public String getHistory () {
		return history;
	}
}


