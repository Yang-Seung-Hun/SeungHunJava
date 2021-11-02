package 이진트리순회_넓이우선탐색;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class Prac {
	Node root;
	
	public void BFS(Node root) {
		
		int level = 0;
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			System.out.print(level+" : ");
			for(int i=0; i<len; i++) {
				Node cur = Q.poll();
				System.out.print(cur.data+" ");
				if(cur.lt!=null) Q.offer(cur.lt);
				if(cur.rt!=null) Q.offer(cur.rt);
			}
			System.out.println();
			level++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prac tree = new Prac();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.BFS(tree.root);

	}

}
