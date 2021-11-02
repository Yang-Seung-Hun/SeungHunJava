package six�峭�ٷ���;
//���� �ǵ�: arr.clone()�� ��������
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice {
	
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		int[] arr2 = arr.clone();
		Arrays.sort(arr2);
		
		for(int i=0; i<n; i++) {
			if(arr[i] != arr2[i]) answer.add(i+1);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Practice T = new Practice();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i <n; i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x:T.solution(n, arr)) System.out.print(x+" ");
	}
}
