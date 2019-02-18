package javastudy;

public class javastudy12 {
	public static int count = 0;
	public static void main(String[] args) {
		System.out.println(count++);
		if (count <=10)
			javastudy12.main(args);
	}
}