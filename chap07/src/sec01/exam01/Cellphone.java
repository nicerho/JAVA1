package sec01.exam01;

public class Cellphone {
	//field
	String model;
	String color;
	//constructor
	public Cellphone(String model, String color) {
		this.model=model;
		this.color=color;
	}
	
	//method
	void powerOn() {System.out.println("power on");}
	void powerOff() {System.out.println("power off");}
	void bell() {System.out.println("bell ringing");}
	void sendVoice(String message) {System.out.println("자기" + message);}
	void receiveVoice(String message) {System.out.println("상대방" + message);}
	void hangup() {System.out.println("callout");}
	
	}

