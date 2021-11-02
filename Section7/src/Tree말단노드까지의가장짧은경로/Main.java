package Tree말단노드까지의가장짧은경로;

import java.util.LinkedList;
import java.util.Queue;

//      1
//   2     3
// 4   5
//이런 트리에서 1에서 말단 노드까지의 길이중 가장 짧은 길이 찾기
//에지의 개수를 길이라고 함

//DFS,BFS둘다 풀어봄
//BFS로 푸는게 더 좋은 답임
//연습이니까 DFS도 그림그리면서 풀어보기
//BFS로는 풀었는데, DFS로는 못풀었음

//class Node{
//	int data;
//	Node lt,rt;
//	public Node(int val) {
//		lt = rt = null;
//		data = val;
//	}
//}
//
//public class Main {
//	Node root;
//	public int BFS(Node root) {
//		Queue<Node> Q = new LinkedList<>();
//		Q.offer(root);
//		int L = 0;
//		while(!Q.isEmpty()) {
//			int len = Q.size();
//			for(int i=0; i<len; i++) {
//				Node q = Q.poll();
//				if(q.rt==null && q.lt==null) return L;
//				if(q.lt != null) Q.offer(q.lt);
//				if(q.rt != null) Q.offer(q.rt);
//			}
//			L++;
//		}
//		return 0;
//	}
//	
//	public int DFS(int L, Node root) {
//		if(root.lt==null && root.rt==null) return L;
//		else return Math.min(DFS(L+1,root.lt), DFS(L+1,root.rt));
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Main tree = new Main();
//		tree.root = new Node(1);
//		tree.root.lt = new Node(2);
//		tree.root.rt = new Node(3);
//		tree.root.lt.lt = new Node(4);
//		tree.root.lt.rt = new Node(5);
//		System.out.println(tree.BFS(tree.root));
//		//System.out.println(tree.DFS(0, tree.root));
//	}
//
//}
