package day6Problem;

public class ReverseString {
	public static void main(String[] args) {
		String name = "Bridgelabz";
		int len = name.length();
		System.out.println("Length of string:" + len);
		String reverse = "";
		for (int i = len - 1; i >= 0; i--) {
			reverse += name.charAt(i);
		}
		System.out.println("Reverse string is:" + reverse);
	}

}
