package 이진트리순회_넓이우선탐색;

//import java.util.LinkedList;
//import java.util.Queue;
//
////= BFS
//
//class Node{
//	int data;
//	Node lt, rt;
//	public Node(int val) {
//		data = val;
//		lt = rt = null;
//	}
//}
//public class Main {
//	Node root;
//	public void BFS(Node root) {
//		Queue<Node> Q = new LinkedList<>();
//		Q.offer(root);
//		int L = 0;//level
//		while(!Q.isEmpty()) {
//			int len = Q.size();
//			System.out.print(L+" : ");
//			for(int i=0; i<len; i++) {
//				Node cur = Q.poll();//현재 노드
//				System.out.print(cur.data+" ");
//				if(cur.lt!=null) Q.offer(cur.lt);
//				if(cur.rt!=null) Q.offer(cur.rt);
//			}
//			L++;//레벨 증가
//			System.out.println();
//		}
//	}
//	
//	public static void main(String args[]) {
//		Main tree = new Main();
//		tree.root = new Node(1);
//		tree.root.lt = new Node(2);
//		tree.root.rt = new Node(3);
//		tree.root.lt.lt = new Node(4);
//		tree.root.lt.rt = new Node(5);
//		tree.root.rt.lt = new Node(6);
//		tree.root.rt.rt = new Node(7);
//		tree.BFS(tree.root);
//	}
//	
//	
//
//}
