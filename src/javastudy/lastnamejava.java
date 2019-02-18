package javastudy;

import java.util.Scanner;

public class lastnamejava {
	public static void main(String[]args) {
		
		String[] students = {"김자바" , "이자바", "박자바", "최자바", "유자바"};
		
		System.out.println("학생 이름을 입력해주세요: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		int i;
		for (i = 0; i < students.length; i++) {
			if (students[i].equals(name))
				break;
		}
		
		System.out.println(name + "학생은" + i + "번째 배열 원소입니다.");
		scanner.close();
	}
}