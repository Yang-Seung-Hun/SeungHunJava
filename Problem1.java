package problem1;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		char[] charArray = str.toCharArray();
		
		String temp = input.nextLine();
		char target = temp.charAt(0);
		
		
		int count = 0;
		for(int i =0; i<charArray.length;i++)
		{
			if(charArray[i] == target)
			{
				count++;
			}
		}
		
		System.out.println(count);

	}
}
