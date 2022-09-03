public class TestNode {
	/**
	 * Parse through the tree given at Node n to see if the character c is within it
	 * 
	 * @param c character to look for in the tree
	 * @param n a node within the tree
	 * @return boolean on whether or not the character exists in the tree
	 */
	public static boolean isInTree(char c, Node n) {
		if (n == null)
			return false;
		else if (n.value == c)
			return true;
		return isInTree(c, n.leftNode) || isInTree(c, n.rightNode);
	}

	public static void main(String[] args) {
// extremely manual method of creating a tree
		Node r = new Node(19);
		r.rightNode = new Node('C', 10);
		r.leftNode = new Node(9);
		r.leftNode.leftNode = new Node(6);
		r.leftNode.leftNode.leftNode = new Node('A', 5);
		r.leftNode.leftNode.rightNode = new Node('E', 1);
		r.leftNode.rightNode = new Node('B', 3);

// testing out the tree
		System.out.println("A with root: " + isInTree('A', r));
		System.out.println("B with root: " + isInTree('B', r));
		System.out.println("C with root: " + isInTree('C', r));
		System.out.println("D with root: " + isInTree('D', r));
		System.out.println("E with root: " + isInTree('E', r));

		System.out.println("C with left of root: " + isInTree('C', r.leftNode));
		System.out.println("C with right of root: " + isInTree('C', r.rightNode)); // broken?
	}
}
