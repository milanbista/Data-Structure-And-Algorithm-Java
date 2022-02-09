
public class MergeSort {

	public static void main(String[] args) {
		
		int[] array = {2,9,4,1,5};
		divide(array, 0, array.length-1);
		
	}
	
	
	public static void divide(int [] array,int low, int high) {
		if(low > high) {
			return;
		}
		int mid = (high-low)/2 - 1;
		divide(array, low, mid);
		divide(array, mid, high);
		merge(array,low, mid, high );	
	}
	
	public static void merge(int[] array, int low, int mid, int high) {
		int[] mergedArray = new int[high-low+1];
		
		int i = low;
		int j = mid + 1;
		int k = 0;
		
		while(i<=mid && j<=high) {
			if(array[i] < array[j]) {
				mergedArray[k++] = array[i++];
			}
			else {
				mergedArray[k++] = array[j++];
			}
		}
		
		while(i <=mid) {
			mergedArray[k++] = array[i++];
		}
		
		while(j <=high) {
			mergedArray[k++] = array[j++];
		}
	}
}
