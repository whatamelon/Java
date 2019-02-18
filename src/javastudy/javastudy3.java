package javastudy;

import java.util.Scanner;

public class javastudy3 {

	public static void main(String[] args) {
			
			System.out.println("영어 단어를 입력해 주세요.");
			Scanner scanner = new Scanner(System.in);
			
			String word = scanner.next();
			
			boolean isPalindrome = true;
			int s = 0;
			int e = word.length()-1;
			for(int i = 0; i<word.length() /2; i++)
			{ 
				if (word.charAt(s) != word.charAt(e))
				{isPalindrome = false;
				break;
				}
				s++;
				e--;
			}
			if(isPalindrome) {
				System.out.println("펠린드롬입니다.");
			}
			else {
				System.out.print("펠린드롬이 아닙니다.");
			}
			scanner.close();
	}

}
