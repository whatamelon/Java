package javastudy;

import java.util.Scanner;

public class javastudy5 {

	public static void main(String[] args) {
		String[] words = new String[5];
		System.out.println("영어 단어 5개를 입력해 주세요.");
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++)
		{
			words [i] = scanner.next();
		}
		if(words[0].equals(words[4])&& words[1].equals(words[3]))
		{ 
			System.out.println("가장 긴 단어는" + words +"입니다.");
		}
		scanner.close();
	}
}