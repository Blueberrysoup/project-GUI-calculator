/***
* Calculator class
* @author: Carina Ekström
* @version: 1.0
**/
package otherclasses;

public class Calculator {

	/**
	 * Adds two double values
	 * @param num1 Value to add
	 * @param num2 Value to add
	 * @return Sum of num1 and num2
	 */
	public double add(double num1, double num2){
		return num1 + num2;
	}
	
	/**
	 * Subtracts two double values
	 * @param num1 Value to subtract
	 * @param num2 Value to subtract
	 * @return Difference between num1 and num2
	 */
	public double subtract(double num1, double num2){
		return num1 - num2;
	}
	
	/**
	 * Multiplies two double values
	 * @param num1 Value to multiply
	 * @param num2 Value to multiply
	 * @return Product of num1 and num2
	 */
	public double multiply(double num1, double num2){
		return num1 * num2;
	}
	
	/**
	 * Divides two double values
	 * @param num1 Value to divide
	 * @param num2 Value to divide
	 * @return Quotient between num1 and num2
	 */
	public double divide(double num1, double num2){
		return num1/num2;
	}
	
}
