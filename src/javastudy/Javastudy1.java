package javastudy;

public class Javastudy1 {
	public static void main(String[] args) {
		Handphone handphone = new Handphone("������", "�Ｚ", 6000, "��", 64);
		handphone.print();
		Product product = (Product) handphone;
		product.print();
	}
}
// ���ڸ� ������ �����ε� �� ������ ���� ���̵����� �з��ϱ�