package javastudy;

import java.util.Scanner;

public class JavaStudy {
	public static void main(String[] args) {
		String[] words = new String[5];

		System.out.println("���� �ܾ� 5���� �Է��� �ּ���.");
		Scanner scanner = new Scanner(System.in);
		words[0] = scanner.next();
		words[1] = scanner.next();
		words[2] = scanner.next();
		words[3] = scanner.next();
		words[4] = scanner.next();
		
		
		int n = words.length;
		for (int i = 0; i < words.length; i++)
		{
			words[i] = scanner.next();
		}
		for (int i = 0; i < words.length; i++) 
		{
			String word = words[i];
			System.out.println(word);
		if (words[0].equals(n-(i+1)))
		{
			System.out.println("�縰��� �Դϴ�.");
		}
		else 
		{
			System.out.println("�縰����� �ƴմϴ�.");
		}
		}
		scanner.close();
}
}