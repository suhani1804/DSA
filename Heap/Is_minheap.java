package Heap;

public class Is_minheap {
	static boolean check(int[] arr, int size)
	{
		int Lchild , Rchild, parent =0;
		for(parent=0;parent<(size/2)+1;parent++)
		{
			Lchild = 2*parent+1;
			Rchild = Lchild+1;
			if((Lchild<size && arr[parent]>=arr[Lchild]) || (Rchild<size && arr[parent]>=arr[Rchild]))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int arr[] = {7,4,5,1,3,2,0};
		System.out.println(check(arr,arr.length));
	}
}
