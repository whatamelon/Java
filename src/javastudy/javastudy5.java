package javastudy;

import java.util.Scanner;

public class javastudy5 {

	public static void main(String[] args) {
		String[] words = new String[5];
		System.out.println("���� �ܾ� 5���� �Է��� �ּ���.");
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++)
		{
			words [i] = scanner.next();
		}
		if(words[0].equals(words[4])&& words[1].equals(words[3]))
		{ 
			System.out.println("���� �� �ܾ��" + words +"�Դϴ�.");
		}
		scanner.close();
	}
}