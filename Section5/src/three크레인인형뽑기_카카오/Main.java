package three크레인인형뽑기_카카오;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		int N = board.length;
		Stack<Integer> stack = new Stack<>();
		
		for(int x:moves) {
			for(int i=0; i<N; i++) {
				if(board[i][x-1] != 0) {
					if(stack.isEmpty()){
						stack.push(board[i][x-1]);
						board[i][x-1] = 0;
					}
					else{
						int tmp = stack.get(stack.size()-1);
						if(tmp == board[i][x-1]) {
							stack.pop();
							board[i][x-1] = 0;
							answer = answer+2;
						}
						else {
							stack.push(board[i][x-1]);
							board[i][x-1] = 0;
						}
					}		
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();
		int[][] board = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		int M = kb.nextInt();
		int[] moves = new int[M];
		for(int i=0; i<M; i++) {
			moves[i] = kb.nextInt();
		}
		System.out.println(T.solution(board, moves));
	}
}
