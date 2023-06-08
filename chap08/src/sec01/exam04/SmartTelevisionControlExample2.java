package sec01.exam04;

public class SmartTelevisionControlExample2 {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		tv.turnon();
		tv.setVolume(7);
		tv.turnoff();
		Searchable searchable = tv;
		searchable.search("우하하 ");
		
	}
}
