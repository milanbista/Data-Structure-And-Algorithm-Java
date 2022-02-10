
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {2,8,9,4,1,6};
		printArray(arr);
		sort(arr);
		printArray(arr);
	}
	
	public static void printArray(int[] arr) {
		for(int a: arr) {
			System.out.print(a + " ");
		}
		System.out.println("\n");
		
	}
	
	public static void sort(int[] arr) {
		
		boolean swapped = true;
		
		while(swapped) {
			swapped = false;
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
					swapped = true;
				}
			}
		}
		
	}
}
