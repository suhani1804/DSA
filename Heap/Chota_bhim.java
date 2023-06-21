package Heap;
import java.util.PriorityQueue;

public class Chota_bhim {
	public static void ChotaBhim(int cups[], int size) {
		int time = 60;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int i = 0;
		for (i = 0; i < size; i++) {
			pq.add(cups[i]);
		}
		int total = 0;
		int value;
		while (time > 0) {
			value = pq.remove();
			total += value;
			value = (int) Math.ceil(value / 2.0);
			pq.add(value);
			time -= 1;
		}
		System.out.println("Total : " + total);
	}

	public static void main(String[] args) {
		int arr[] = {1,4,7,2,4};
		ChotaBhim(arr,arr.length);
	}

}
