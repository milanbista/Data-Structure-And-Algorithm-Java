
public class Fibonacci {

	public static void main(String[] args) {
		int number = 5;
		System.out.println("Fibonacci of " + number + " is = " + fibonacci(number));
	}
	
	public static int fibonacci(int number) {
		if(number == 1)
			return 1;
		return number + fibonacci(number-1);
	}
}
