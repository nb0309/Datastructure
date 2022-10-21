package nbdatastructure;



class Node{
	int value;
	Node right;
	Node left;
	public Node(int v){
		this.value=v;
		this.right=null;
		this.left=null;
	}
}
public class treedatastructure {
	Node root;
	public void traversetree(Node node) {
		if(node!=null) {
			traversetree(node.left);
			System.out.println(node.value);
			traversetree(node.right);
		}
	}
	public static void main(String[] args) {
		treedatastructure td=new treedatastructure();
		td.root = new Node(5);
		td.root.left = new Node(3);
		td.root.right = new Node(7);
		td.root.left.left = new Node(2);
		td.root.left.right=new Node(4);
		td.traversetree(td.root);
	}

}
