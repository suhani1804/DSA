package Heap;
import java.util.PriorityQueue;

public class Kth_SmallestProduct {
	static int product(int [] arr,int k)
	{
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		int product =1;
		for(int i=0;i<arr.length;i++)
			p.add(arr[i]);
		for(int i=0;i<k;i++)
			product *= p.remove();
		return product;
	}
	public static void main(String[] args) {
		int[] arr = { 1, 9, 6, 7, 8, 2, 4, 5, 3 };
		int k=5;
		System.out.println(product(arr,k));
	}

}
