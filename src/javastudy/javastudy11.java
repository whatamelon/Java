package javastudy;

public class javastudy11 {

	public static void main(String[] args) {
		Student1 kim = new Student1();
		Student1 lee = new Student1();
		Student1 yoo = new Student1();
		
		kim.name = "김자바";
		lee.name = "이자바";
		yoo.name = "유자바";
		
		System.out.println(kim.getName());
		System.out.println(lee.getName());
		System.out.println(yoo.getName());

	}
}