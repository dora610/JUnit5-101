/**
 * 
 */
package org.demo;

/**
 * @author suraj
 *
 */
public class MathUtils {

	public static void main(String[] args) {
		MathUtils mathUtils = new MathUtils();
		System.out.println(mathUtils.calculateCircleArea(10));
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int substract(int a, int b) {
		var result = a - b;
		return result;
	}

	public double multiply(int a, int b) {
		return a * b;
	}

	public float divide(int a, int b) {
		return a / b;
	}

	public double calculateCircleArea(double r) {
		return Math.PI * r * r;
	}

}
