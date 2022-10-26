package day6Problem;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number :");
		long Num=scanner.nextLong();
		int Result=0;
		int i=1;
		while(i<=Num/2)
		{
			if(Num%i==0)
			{
			Result += i;
			}
			i++;
		}
		if (Num == Result)
			System.out.println(+Num+" is Perfect Number");
		else
			System.out.println(+Num+" is not Perfect Number");
		
	}
}
