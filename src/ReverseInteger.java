
public class ReverseInteger {

	public static void main(String[] args) {
		
		int number = 124534;
		int reversedNumber = reverse(number);
		System.out.println("Original number " + number + " \nReversed number " + reversedNumber);
	}
	
	public static int reverse(int number) {
		int result = 0;
		while(number!=0) {
			int a = number%10;
			result = result *10 + a;
			number = number /10;
		}
		return result;
	}
}
