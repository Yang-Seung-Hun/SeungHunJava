//package four가장높은탑쌓기;
////최대부분증가수열 활용임
////강의 앞부부분 설면듣고 풀었음
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.PriorityQueue;
//import java.util.Scanner;
//
//class Brick implements Comparable<Brick>{
//	int square;
//	int weight;
//	int height;
//	
//	public Brick(int square, int weight, int height) {
//		this.square = square;
//		this.weight = weight;
//		this.height = height;
//	}
//	
//	@Override
//	public int compareTo(Brick o) {
//		// TODO Auto-generated method stub
//		return o.square - this.square;
//	}
//}
//
//public class Main {
//	static ArrayList<Brick> arr = new ArrayList<>();
//	static int[] dy;
//	static PriorityQueue<Brick> pQ = new PriorityQueue<>(); 
//	static int answer = 0;
//	
//	public void solution(int n) {
//		dy[0] = arr.get(0).height;
//		answer = arr.get(0).height;
//		
//		for(int i=1; i<n; i++) {
//			int b = 0;
//			for(int j=0; j<i; j++) {
//				if(arr.get(i).weight<arr.get(j).weight) {
//					dy[i] = Math.max(b, dy[j]+arr.get(i).height);
//					b = dy[i];
//				}
//				if(b==0) {
//					dy[i] = arr.get(i).height;
//				}
//			}
//			answer = Math.max(answer, dy[i]);
//		}	
//	}
//	
//	public static void main(String[] args) {
//		
//		Main T = new Main();
//		Scanner kb = new Scanner(System.in);
//
//		int n = kb.nextInt();
//		dy = new int[n];
//		for (int i = 0; i < n; i++) {
//			int s = kb.nextInt();
//			int h = kb.nextInt();
//			int w = kb.nextInt();
//			arr.add(new Brick(s,w,h));
//			//pQ.offer(new Brick(s,w,h));
//		}
//
//		Collections.sort(arr);
////		for (Brick x : list) {
////			System.out.println(x.square);
////		}
//		T.solution(n);
////		for(int x: dy)System.out.print(x+ " ");
//		System.out.println(answer);	
//	}
//}
