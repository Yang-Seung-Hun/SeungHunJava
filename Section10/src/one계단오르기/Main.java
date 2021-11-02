package one��ܿ�����;
//����� �� ��Ƽ� ���丮��(dfs)�� Ǯ���µ� �Ƹ� long ���� �Ѿ�� �迭�� ����µ�  == > ���� Ŀ���� �̻�����
//BigInteger �Ἥ ������� Ǯ���� ==>���� ������ 
//�ؼ� ó�� bottom up ������� �Ǻ���ġ �̿��ϴ°� �ξ� ������.

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Number{
	int one;
	int two;
	public Number(int one, int two){
		this.one = one;
		this.two = two;
	}
}

public class Main {
	
	static ArrayList<Number> numbers = new ArrayList<>();
	static BigInteger zero = BigInteger.ZERO;
	static BigInteger one = BigInteger.ONE;
	static BigInteger answer = BigInteger.ZERO;
	static BigInteger[] ch;
	
	public BigInteger factorial(int val) {
		if(ch[val].compareTo(zero) == -1) return ch[val];
		if(val == 0) return ch[val] = one;
		else if(val == 1) return ch[val] = one;
		else {
			return ch[val] = factorial(val-1).multiply(BigInteger.valueOf(val));
		}
	}
	
	public void solution(ArrayList<Number> numbers) {
		for(Number x:numbers) {
			answer = answer.add(factorial(x.one+x.two).divide(factorial(x.one).multiply(factorial(x.two))));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ch = new BigInteger[n+1];
		Arrays.fill(ch, zero);
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				if(1*i+2*j == n) {
					numbers.add(new Number(i,j));
				}
			}
		}
		T.solution(numbers);
		System.out.println(answer);
	}
}
