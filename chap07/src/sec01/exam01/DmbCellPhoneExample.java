package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone("자바폰","검정",10);
		System.out.println("모델"+dmb.model);
		System.out.println("색상"+dmb.color);
		System.out.println("채널+"+dmb.channel);
		
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("hello");
		dmb.receiveVoice("hey");
		dmb.sendVoice("howdy");
		dmb.hangup();
		dmb.turnOnDmb();
		dmb.changeChannelDmb(12);
		dmb.turnOffDmb();
		
	}

}
