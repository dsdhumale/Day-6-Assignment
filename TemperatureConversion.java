package day6Problem;

import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  Fahrenheit temperature :");
		double temp = scanner.nextDouble();

		System.out.println("Celsius temperature is = " + celsius(temp));
	}

	static double celsius(double f) {
		return (f - 32) * 5 / 9;
	}
}
