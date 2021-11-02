package four모든아나그램찾기;
//왜 오답인지 모르겠다능 
//주석 부분 없으면 왜 또 answer가 16 출력되는지.......
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public int solution(String str, String str2) {
		int answer = 0;
		HashMap<Character,Integer> map = new HashMap<>();
		int lt = 0;
		int m = str.length();
		int n = str2.length();
		
		for(int i=0; i<n; i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		
		for(int rt=n; rt<m; rt++) {
			HashMap<Character,Integer> tmp = map;
			for(int i = lt; i<rt; i++) {
				if(tmp.containsKey(str.charAt(i))) {
					tmp.put(str.charAt(i), tmp.getOrDefault(str.charAt(i), 0)-1);
					if(tmp.get(str.charAt(i))==0) {
						tmp.remove(str.charAt(i));
					}
				}
//				else {
//					tmp.put(str.charAt(i), tmp.getOrDefault(str.charAt(i), 0)+1);
//				}
				if(tmp.size() == 0) answer++;
			}
			lt++;
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		String str2 = kb.next();
		
		System.out.println(T.solution(str,str2));

	}

}
