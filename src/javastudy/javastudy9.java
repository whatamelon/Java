package javastudy;

public class javastudy9 {
	public static void main(String[] args) {
		Student studentA = new Student("A�л�", "1820100001", 90, 80, 90, 50);
		Student studentB = new Student("B�л�", "1820100002", 80, 50, 70, 90);
		Student studentC = new Student("C�л�", "1820100003", 50, 60, 50, 100);
		Student studentD = new Student("D�л�", "1820100004", 100, 80, 20, 100);

		studentA.print();
		studentB.print();
		studentC.print();
		studentD.print();
	}
}