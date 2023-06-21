package Heap;
import java.util.Arrays;

public class Array_to_maxheap {
	 public static void heapify(int arr[], int N, int i)
	    {
	        int largest = i;
	        int l = 2 * i + 1; 
	        int r = 2 * i + 2; 
	        if (l < N && arr[l] > arr[largest])
	            largest = l;
	        if (r < N && arr[r] > arr[largest])
	            largest = r;
	        if (largest != i) {
	            int swap = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = swap;
	            heapify(arr, N, largest);
	        }
	    }
	    public static void buildHeap(int arr[], int N)
	    {
	        int startIdx = (N / 2) - 1;
	        for (int i = startIdx; i >= 0; i--) {
	            heapify(arr, N, i);
	        }
	    }
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		buildHeap(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
