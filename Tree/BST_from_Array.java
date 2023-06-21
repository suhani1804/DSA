package Tree;

class Node {
	int data;
	Node left;
	Node right;

	Node(int d) {
		this.data = d;
		left = right = null;
	}
}

public class BST_from_Array {
	static Node root;

	Node sort(int arr[], int start, int end) {
		if (start > end)
			return null;
		int mid = (start + end) / 2;
		Node node = new Node(arr[mid]);
		node.left = sort(arr, start, mid - 1);
		node.right = sort(arr, mid + 1, end);
		return node;
	}

	void preorder(Node n) {
		if (n == null)
			return;
		preorder(n.left);
		System.out.println(n.data + " ");
		preorder(n.right);
	}

	public static void main(String[] args) {
		BST_from_Array tree = new BST_from_Array();
		int arr[] = { 1, 2, 3, 4, 6, 7 };
		root = tree.sort(arr, 0, arr.length - 1);
		System.out.println("tree is ");
		tree.preorder(root);
	}

}
