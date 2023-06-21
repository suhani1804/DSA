package Tree;

public class IsBST {
	static Node prev;

	static Boolean isBST(Node root) {
		if (root != null) {
			if (!isBST(root.left))
				return false;
			if (prev != null && root.data <= prev.data)
				return false;
			prev = root;
			return isBST(root.right);
		}
		return true;
	}
	public static void main(String[] args) {
		Node root = new Node(9);
		root.left = new Node(6);
		root.right = new Node(13);
		root.left.left = new Node(4);
		root.left.right = new Node(8);
		root.right.left = new Node(11);
		root.right.right = new Node(17);
		System.out.println(isBST(root));
	}

}
