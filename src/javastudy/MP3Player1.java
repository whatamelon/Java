package javastudy;

interface MP3Player1 {
	 void play();
	 void stop();
}

interface MP3PlayerAdvance extends MP3Player1 {
	void next();
	void prev();
}

class MP3PlayerLG implements MP3PlayerAdvance {
	public void play() {
		System.out.println("���");
	}
	public void stop() {
		System.out.println("����");
	}
	public void next() {
		System.out.println("������");
	}
	public void prev() {
		System.out.println("������");
	}
};