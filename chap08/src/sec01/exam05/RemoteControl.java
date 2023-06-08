package sec01.exam05;

public interface RemoteControl {
	// 상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추메
	void turnon();

	void turnoff();

	void setVolume(int volume);
}
