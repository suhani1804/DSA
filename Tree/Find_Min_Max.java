package Tree;

public class Find_Min_Max {
	static int findmin(Node root) {
		if (root.left == null) {
			return root.data;
		}
		return findmin(root.left);
	}

	static int findmax(Node root) {
		if (root.right == null) {
			return root.data;
		}
		return findmax(root.right);
	}
	public static void main(String[] args) {
		Node s = new Node(6);
		s.left = new Node (3);
		s.right = new Node(8);
		s.left.left = new Node (2);
		s.left.right = new Node (4);
		s.right.left = new Node (7);
		s.right.right = new Node (9);

		System.out.println("minimum " + findmin(s));
		System.out.println("maximum " + findmax(s));
	}

}
