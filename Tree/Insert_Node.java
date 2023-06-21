package Tree;

public class Insert_Node {
static Node prev;
	static boolean checkbst(Node root)
	{
		if (root != null) 
		{
		    if (!checkbst(root.left))
		        return false;
		    if (prev != null && root.data <= prev.data)
		        return false;
		    prev = root;
		    return checkbst(root.right);
		}
		return true;
	}
	public static void main(String[] args) {
		Node s = new Node(6);
		s.left = new Node (3);
		s.right = new Node(8);
		s.left.left = new Node (2);
		s.left.right = new Node (4);
		s.right.left = new Node (7);
		s.right.right = new Node (9);
		System.out.println(checkbst(s));
		
	}

}
