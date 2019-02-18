package javastudy;

import java.util.Scanner;

public class javastudy4 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력해 주세요.");
		Scanner scanner = new Scanner(System.in);
		int n[] = new int[10];
		
		for (int i = 0; i < n.length; i++)
		{ 
			n[i] =scanner.nextInt();
		}
		
		int min = n[0];
		for (int i= 0; i < n.length; i++)
		{
			if(min >n[i])
				min = n[i];
		}
		System.out.println(min);
		scanner.close();
		}
}