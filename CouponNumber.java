package day6Problem;

public class CouponNumber {
	public static void main(String[] args) {
		char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int max = 100000000;
		int random = (int) (Math.random() * max);
		StringBuffer stringbufffer = new StringBuffer();

		while (random > 0) {
			stringbufffer.append(chars[random % chars.length]);
			random /= chars.length;
		}

		String couponCode = stringbufffer.toString();
		System.out.println("Coupon Code: " + couponCode);
	}

}
