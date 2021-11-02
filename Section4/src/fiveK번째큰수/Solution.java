package fiveK번째큰수;
//TreeSet사용하면 엄청 편해짐(중복제거에 좋음)
//TreeSet 중요 메소드 :
//TreeSet.remove(*) : *지움
//TreeSet.size() : 원소의 개수
//TreeSet.first() : 오름차순이면 최솟값, 내림차순이면 최댓값(treeSet의 처음값)
//TreeSet.last() : TreeSet정렬의 가장 뒷값(first랑 반대)

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution {
	
	public int solution(int n, int k, int[] arr) {
		int answer = -1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());//TreeSet은 중복 없이 오름차순으로 (Collections.reverseOrder()는 내림차순)
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int l = j+1; l<n; l++) {
					Tset.add(arr[i]+arr[j]+arr[l]);//Tset에 추가해줌
				}
			}
		}
		int cnt = 0;
		for(int x:Tset) {
			cnt++;//cnt는 Tset에 몇번째인지 
			if(cnt == k) return x; //Tset의 k번째 출력
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(n,k,arr));

	}

}
