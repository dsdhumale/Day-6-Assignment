package day6Problem;

import java.util.Scanner;

public class Stopwatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to start the stop watch :");
		double startWatch = sc.nextDouble();

		startWatch = System.currentTimeMillis();

		System.out.println("Press 0 to stop the stop watch :");
		double stopWatch = sc.nextDouble();

		stopWatch = System.currentTimeMillis();

		System.out.println("The Elacpsed time :" + ((stopWatch - startWatch) / 1000) + "seconds");
	}
}
