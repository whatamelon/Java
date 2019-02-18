package com.dalcomsoft.app;

import java.util.Scanner;
import com.dalcomsoft.app.A.Calculator;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String op = scanner.next();
		int b = scanner.nextInt();

		if (op.equals("+")) {
			Calculator cal = new Calculator();
			System.out.println("더하기 결과는 :" + cal.add(a, b));
		} else if (op.equals("-")) {

		} else if (op.equals("*")) {

		}
		scanner.close();
	}
}