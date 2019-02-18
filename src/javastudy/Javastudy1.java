package javastudy;

public class Javastudy1 {
	public static void main(String[] args) {
		Handphone handphone = new Handphone("갤럭시", "삼성", 6000, "블랙", 64);
		handphone.print();
		Product product = (Product) handphone;
		product.print();
	}
}
// 인자를 받으면 오버로딩 안 받으면 오버 라이딩으로 분류하기