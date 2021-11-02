package 피보나치수열;

public class Prac {
	static int[] fibo;
	
	public int DFS(int val) {
		if(fibo[val] >0) return fibo[val];
		if(val == 1) return fibo[val] = 1;
		else if(val == 2) return fibo[val] = 1;
		else return fibo[val] = DFS(val-2)+DFS(val-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prac T = new Prac();
		int n= 45;
		fibo = new int[n+1];
		T.DFS(45);
		for(int i=1; i<=n; i++) System.out.println(fibo[i]);
	}

}
