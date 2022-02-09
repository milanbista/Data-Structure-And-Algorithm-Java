import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
		//find out if the given number is obtained by adding two numbers from the given array
		//example [1,4,7,9] sum = 10
		int[] array = {1,2,7,9};
		int n = 9;
		System.out.println(twoSum(array, n));
		
	}
	
	public static boolean twoSum(int array[], int sum) {
		Map<Integer, Integer> lookup = new HashMap<Integer, Integer>();
		
		for(int num: array) {
			if(lookup.containsKey(num))
				return true;
			lookup.put(sum-num, 1);
		}
		
		return false;
	}
}
