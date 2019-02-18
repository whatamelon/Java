package javastudy;

public class methodoverloading {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int sumA = calc.add(1, 2);
		int sumB = calc.add(1, 2, 3);
		System.out.println(sumA);
		System.out.println(sumB);
	}
}