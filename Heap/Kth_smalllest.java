package Heap;
import java.util.PriorityQueue;

public class Kth_smalllest {
static void find(int[] arr,int size,int k)
{
	PriorityQueue<Integer> p = new PriorityQueue<Integer>();
	int j=0;
	int v=0;
	for(int i=0;i<size;i++)
		p.add(arr[i]);
	while(j<size && j<k)
	{
		v=p.remove();
		j++;
	}
	System.out.println(v);
}
	public static void main(String[] args) {
		int[] arr = { 1, 9, 6, 7, 8, 0, 2, 4, 5, 3 };
		int k=10;
		find(arr,arr.length,k);
	}

}
