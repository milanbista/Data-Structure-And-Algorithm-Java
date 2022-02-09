
public class MergeSort {

	public static void main(String[] args) {

		int[] arr = { 1, 8, 4, 2, 9 };

		System.out.println("Before merge sort");
		printArray(arr);
		divide(arr, 0, arr.length - 1);
		System.out.println("After merge sort");
		printArray(arr);
		
	}
	
	public static void printArray(int[] array) {
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println();

	}

	public static void divide(int[] array, int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			divide(array, low, mid);
			divide(array, mid + 1, high);
			merge(array, low, mid, high);
		}
	}
	

	public static void merge(int[] array, int low, int mid, int high) {

		int[] tempArray = new int[high - low + 1];
		int i = low;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= high) {
			if (array[i] < array[j]) {
				tempArray[k++] = array[i++];
			} else {
				tempArray[k++] = array[j++];
			}
		}

		while (i <= mid) {
			tempArray[k++] = array[i++];
		}
		while (j <= high) {
			tempArray[k++] = array[j++];
		}

		for (i = low, j = 0; i <= high; i++, j++) {
			array[i] = tempArray[j];
		}
	}
}
