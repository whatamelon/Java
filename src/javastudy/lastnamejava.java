package javastudy;

import java.util.Scanner;

public class lastnamejava {
	public static void main(String[]args) {
		
		String[] students = {"���ڹ�" , "���ڹ�", "���ڹ�", "���ڹ�", "���ڹ�"};
		
		System.out.println("�л� �̸��� �Է����ּ���: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		int i;
		for (i = 0; i < students.length; i++) {
			if (students[i].equals(name))
				break;
		}
		
		System.out.println(name + "�л���" + i + "��° �迭 �����Դϴ�.");
		scanner.close();
	}
}