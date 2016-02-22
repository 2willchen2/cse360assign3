
package cse360assign3;

public class Calculator {

	private int total;
	private String history = "";
	private int count = 0;
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
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
	
	public String getHistory () {
		//just returns the string of operation
		return history;
	}
}