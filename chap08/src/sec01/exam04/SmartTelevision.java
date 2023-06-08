package sec01.exam04;

public class SmartTelevision implements Searchable, RemoteControl {
	private int volume;

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "Searching");
	}

	@Override
	public void turnon() {
		// TODO Auto-generated method stub
		System.out.println("SmartTV on");
	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println("SmartTV off");
	}

	@Override
	public void setVolume(int volume) {
		{
			if (volume > RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			} else if (volume < RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			} else {
				this.volume = volume;
			}
			System.out.println("SmartTv Volume: " + this.volume);
		}

	}

}
