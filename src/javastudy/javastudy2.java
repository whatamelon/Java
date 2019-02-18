package javastudy;

import java.util.Scanner;

public class javastudy2 {
	public static void main(String[] args) {
		String[] words = new String[1];

		System.out.println("영어 단어를 입력해 주세요.");
		Scanner scanner = new Scanner(System.in);
		words[0] = scanner.next();
		words[1] = scanner.next();
		words[2] = scanner.next();
		words[3] = scanner.next();
		words[4] = scanner.next();
		
		if (0 == 4){
			System.out.print("펠린드롬 입니다.");
		}
		else {
			System.out.print("펠린드롬이 아닙니다.");
		}
		scanner.close();
}
}