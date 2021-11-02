package three결혼식;
import java.util.*;
//이걸 어떠케 생각한담 ㅜㅜ
//핵심 개념은 s즉 시작 시점에서는 사람이 ++고, e즉 끝나는 시점에서는 사람--라는 점
//answer와 cnt중 최댓 값 구하는 방법 사용 하니까, e,s 같이 나올 때 즉 어떤사람의 시작과 또 다른 사람의 끝이 같을 때 e를 먼저 처리 해줘야 함 =>정렬 할 때 기준
class Time2 implements Comparable<Time2>{
    public int time;
	public char state;
    Time2(int time, char state) {
        this.time = time;
        this.state = state;
    }
    @Override
    public int compareTo(Time2 ob){
        if(this.time==ob.time) return this.state-ob.state;
		else return this.time-ob.time;
    }
}

class Solution {
	public int solution(ArrayList<Time2> arr){
		int answer=Integer.MIN_VALUE;
		Collections.sort(arr);
		int cnt=0;
		for(Time2 ob : arr){
			if(ob.state=='s') cnt++;
			else cnt--;
			answer=Math.max(answer, cnt);
		}
		return answer;
	}

	public static void main(String[] args){
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		ArrayList<Time2> arr = new ArrayList<>();
		for(int i=0; i<n; i++){
			int sT=kb.nextInt();
			int eT=kb.nextInt();
			arr.add(new Time2(sT, 's'));
			arr.add(new Time2(eT, 'e'));
		}
		System.out.println(T.solution(arr));
	}
}