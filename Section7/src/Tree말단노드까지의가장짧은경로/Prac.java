package Tree말단노드까지의가장짧은경로;
//       1
//  2          3
//4   5
//이런 트리에서 1에서 말단 노드까지의 길이중 가장 짧은 길이 찾기
//에지의 개수를 길이라고 함

//출제의도 ===> 루트노드에서 말단노드까지의 최소 길이 구하기 ===>BFS,DFS 둘다 가능 ===> BFS가 정석임

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int val) {
		this.data = val;
		this.left = null;
		this.right = null;
	}
}

public class Prac {
	static Node root;
	
	public int DFS(int L,Node root) {
		
		if(root.left == null && root.right == null) return L;
		else return Math.min(DFS(L+1,root.left),DFS(L+1,root.right));
	}
	
	
	public int BFS(Node root) {
		int L = 0;
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i=0; i<len; i++) {
				Node x = Q.poll();
				if(x.left == null && x.right == null) return L;
				if(x.left != null) Q.offer(x.left);
				if(x.right != null) Q.offer(x.right);
			}
			L++;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prac tree = new Prac();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println(tree.BFS(root));
		System.out.println(tree.DFS(0,root));
	}

}
