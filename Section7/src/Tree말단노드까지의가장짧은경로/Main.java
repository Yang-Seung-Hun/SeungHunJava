package Tree���ܳ������ǰ���ª�����;

import java.util.LinkedList;
import java.util.Queue;

//      1
//   2     3
// 4   5
//�̷� Ʈ������ 1���� ���� �������� ������ ���� ª�� ���� ã��
//������ ������ ���̶�� ��

//DFS,BFS�Ѵ� Ǯ�
//BFS�� Ǫ�°� �� ���� ����
//�����̴ϱ� DFS�� �׸��׸��鼭 Ǯ���
//BFS�δ� Ǯ���µ�, DFS�δ� ��Ǯ����

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
