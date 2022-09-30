package datastructure;

public class binarytreepractice {
	static class Node {
		int key;
		Node left, right;

		public Node(int item) {
		key = item;
		left = right = null;
		}
		}

	 static class BinaryTree{
		Node root;

		public void traverseTree(Node node) {
			if (node != null) {
				traverseTree(node.left);
				System.out.print(" " + node.key);
				traverseTree(node.right);
			}
		}
		public void checkbst(Node node) {
			if(node!=null) {
				if(node.left!=null && node.right!=null) {
					if(node.left.key>node.key || node.right.key<node.key) {
						System.out.println();
						System.out.print("The tree is not binary search tree");
						
					}
				}
				checkbst(node.left);
				checkbst(node.right);					
				}
			}
		
		
		
	public static void main(String[] args) {
		BinaryTree tre= new BinaryTree();
		
		tre.root = new Node(3);
		tre.root.left = new Node(2);
		tre.root.right = new Node(4);
		tre.root.left.left = new Node(1);
		tre.root.right.right=new Node(5);
		

		System.out.println("Binary Tree: ");
		tre.traverseTree(tre.root);
		tre.checkbst(tre.root);
		

	}

}
}

