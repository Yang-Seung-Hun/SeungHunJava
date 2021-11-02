package one계단오르기;
//경우의 수 잡아서 팩토리얼(dfs)로 풀었는데 아마 long 범위 넘어가서 배열에 못담는듯  == > 숫자 커지면 이상해짐
//BigInteger 써서 어찌어찌 풀었음 ==>연산 복잡함 
//해설 처럼 bottom up 방식으로 피보나치 이용하는게 훨씬 간단함.

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
