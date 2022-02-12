
public class Factorial {

	public static void main(String[] args) {
		int number = 5;
		System.out.println("Factorial of " + number + " = " + factorial(number));
	}

	static int factorial(int number) {
		if (number == 1 || number == 0) {
			return 1;
		}

		return number * factorial(number - 1);
	}
}
