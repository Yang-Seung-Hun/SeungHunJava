package problem5;

import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		String answer = "";
		
		char[] cha = str.toCharArray();
		int l = 0;
		int r = cha.length-1;
		
		while(l<r) {
			if((cha[l]>=65&&cha[l]<=90)||(cha[l]>=97&&cha[l]<=122)) {
				if((cha[r]>=65&&cha[r]<=90)||(cha[r]>=97&&cha[r]<=122)) {//¿ÞÂÊ¾ËÆÄºª, ¿À¸¥ÂÊ ¾ËÆÄºª
					char temp;
					temp = cha[l];
					cha[l] = cha[r];
					cha[r] = temp;
					l++;
					r--;
				}
				
				else {//¿ÞÂÊ¾ËÆÄºª, ¿À¸¥ÂÊ ¾ËÆÄºª¾Æ´Ô
					r--;
				}
			}
			
			else {
				if((cha[r]>=65&&cha[r]<=90)||(cha[r]>=97&&cha[r]<=122)) {//¿ÞÂÊ¾ËÆÄºª¾Æ´Ô, ¿À¸¥ÂÊ ¾ËÆÄºª
					l++;
				}
				
				else {//µÑ´Ù ¾ËÆÄºª ¾Æ´Ô
					l++;
					r--;
				}
				
			}
		}
		answer = String.valueOf(cha);
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
