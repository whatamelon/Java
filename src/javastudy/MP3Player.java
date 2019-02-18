package javastudy;

public class MP3Player
{
	public static void main(String []args) {
		MP3PlayerAdvance player = new MP3PlayerLG();
		
		player.next();
		player.prev();
}
}
//인터페이스를 상속 받을 때는 implements 키워드 사용.