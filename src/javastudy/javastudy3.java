package javastudy;

import java.util.Scanner;

public class javastudy3 {

	public static void main(String[] args) {
			
			System.out.println("���� �ܾ �Է��� �ּ���.");
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
				System.out.println("�縰����Դϴ�.");
			}
			else {
				System.out.print("�縰����� �ƴմϴ�.");
			}
			scanner.close();
	}

}
