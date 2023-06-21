package Tree;

public class Check_key {
	static void preorder(Node n) {
		if (n == null)
			return;
		preorder(n.left);
		System.out.println(n.data + " ");
		preorder(n.right);
	}

	static int preorder1(Node n, int key) {
		if (n != null) {
			if (n.data == key)
				return n.data;
			else if (n.data > key)
				return preorder1(n.left, key);
			else
				return preorder1(n.right, key);
		}
		return 0;
	}
	public static void main(String[] args) {
		Node s = new Node(6);
		s.left = new Node (3);
		s.right = new Node(8);
		s.left.left = new Node (2);
		s.left.right = new Node (4);
		s.right.left = new Node (7);
		s.right.right = new Node (9);
		System.out.println("key is " +preorder1(s, 3));

	}

}
