package six�������Ҽ�;
//�����ε� �Ƹ� �ð� �����ΰ�??
import java.util.Scanner;

public class Main {
	
	public int reverseInt(int n) {//���� ������ �Լ�
		int answer = 0;
		String str = "";
		while(true) {
			int mod = n%10;
			int div = n/10;
			n = div;
			str = str+mod;
			if(n<10) {
				str = str+n;
				break;
			}
		}
		answer = Integer.parseInt(str);
		return answer;
	}
	
	public String solution(int n, int[] arr) {
		String answer = "";
		int[] ch = new int[n+1];
		
		for(int i=0; i<arr.length; i++) {//���� ������
			arr[i] = reverseInt(arr[i]);
			int count = 0;
			for(int j=2; j<arr[i];j++) {
				if(arr[i]%j == 0) {
					count++;
				}
			}
			
			if(count == 0 && arr[i] !=1) {
				answer = answer+arr[i]+" ";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(n, arr));
	}
}
