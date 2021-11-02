package 이진트리순회_깊이우선탐색;

class Node{
	int val;
	Node left;
	Node right;
	
	public Node(int val) {
		this.val = val;
		left = null;
		right = null;
	}
}

public class Prac {
	static Node root;
	public void DFS(Node root) {
		if(root == null) return;
		
		else {
			
			System.out.println(root.val);
			DFS(root.left);
			//중위
			DFS(root.right);
			//후위
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prac tree = new Prac();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		
		tree.DFS(root);
	}

}
