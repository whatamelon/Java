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
		System.out.println("재생");
	}
	public void stop() {
		System.out.println("중지");
	}
	public void next() {
		System.out.println("다음곡");
	}
	public void prev() {
		System.out.println("이전곡");
	}
};