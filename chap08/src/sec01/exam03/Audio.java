package sec01.exam03;

public class Audio implements RemoteControl {
	private int volume;

	public void turnon() {
		System.out.println("Audio on");
	}

	public void turnoff() {
		System.out.println("Audio off");
	}

	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("Audio Volume: " + this.volume);
	}

	public int getVolume() {
		return volume;
	}

}
