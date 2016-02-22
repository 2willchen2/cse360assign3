
package cse360assign3;
/** Calculator
 * @author William Chen
 * @version Feb 22, 2016
 * 
 */
public class Calculator {

	private int total;
	private String history = "";
	private int count = 0;
	/** Constructor
	 *  
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/** Return an integer of total
	 *  
	 */
	public int getTotal () {
		return total;
	}
	
	/** adds to the total 
	 *  @param value
	 */
	public void add (int value) {
		//adds on the total
		total += value;
		if(count == 0)
		{
			//check if this is the first operation calculated
			history += Integer.toString(value);
		}
		else
		{
			//if not then add the symbol and operation
			history += " + " + value;
		}
		count++;
	}
	
	/** subtracts from the total
	 *  @param value
	 */
	public void subtract (int value) {
		total -= value;
		if(count == 0)
		{
			history += Integer.toString(value);
		}
		else
		{
			history += " - " + value;
		}
		count++;
	}
	
	/** multiplies onto the total 
	 *  @param value
	 */
	public void multiply (int value) {
		total = total * value;
		if(count == 0)
		{
			history += Integer.toString(value);
		}
		else
		{
			history += " * " + value;
		}
		count++;
	}
	
	/** divides from the total
	 *  @param value
	 */
	public void divide (int value) {
		if(value == 0)
		{
			total = 0;
		}
		else
		{
			total = total/value;
		}
		if(count == 0)
		{
			history += Integer.toString(value);
		}
		else
		{
			history += " / " + value;
		}
		count++;
	}
	
	/** Returns the history
	 *  
	 */
	public String getHistory () {
		//just returns the string of operation
		return history;
	}
}