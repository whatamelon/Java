package javastudy;

import java.util.Scanner;

public class javastudy6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		String[] names = { "아르센 벵거", "산티 카솔라", "메수트 외질", "아론 램지", "알렉산르드 라카제트" };

		int[][] weightTable = { { 70, 72, 73, 80 }, { 60, 65, 66, 59 }, { 54, 54, 54, 54 }, { 45, 50, 60, 70 },
				{ 100, 90, 85, 100 } };

		for (int i = 0; i < weightTable.length; i++) {
			int[] weights = weightTable[i];
			if (name.equals(names[i]))
				System.out.print(names[i] + " :");
			for (int j = 0; j < weights.length; j++) {
				int weight = weights[j];
				if (name.equals(names[i]))
					System.out.print(weight + " ");
			}
			System.out.println("");
		}
		scanner.close();
	}
}